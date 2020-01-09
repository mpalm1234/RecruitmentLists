import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ListGen {

	public static void main(String[] args) {

		final int MAXGROUPS = 30;						// max 30 bump groups
		final int MAXSISTERS = 5;						// max 5 sisters per bump group
		int numgroups = 0;
		int numsisters = 0;
		int groupspot = 1;
		String[][] groups = new String[MAXGROUPS][MAXSISTERS];
		int[] legacies = new int[10];

		Scanner infoin = new Scanner(System.in);

		System.out.print("Bump group filename: ");
		String filename = infoin.next();

		System.out.print("Number of PNMs: ");
		int numpnms = infoin.nextInt();

		System.out.print("Number of legacies: ");
		int numlegs = infoin.nextInt();

		for(int i = 1; i <= numlegs; i++){
			System.out.print("Position of legacy " + i + ": ");
			legacies[i-1] = infoin.nextInt();
		}

		File file = new File(filename);
		try {
			Scanner sc = new Scanner(file);

			while (sc.hasNextLine()) {
				String name = sc.nextLine();
				if (name.startsWith("group")) {
					numgroups++;
					groupspot = 1;
				} else {
					groups[numgroups - 1][groupspot - 1] = name;
					numsisters++;
					groupspot++;
				}
			}
			sc.close();

			int doublescoops = numpnms - numsisters;
			int spot = 1;
			int pnmspot = 1;
			int y = 0;
			int lstleg = 10000;

			for(int i = 1; i <= MAXSISTERS; i++) {
				for(int j = 1; j <= numgroups; j++) {
					if(groups[j-1][i-1] == null) {
						// do nothing
					} else if(i == 1) {
						System.out.print(groups[j-1][i-1]);
						System.out.print(" == Spot: 0");
						System.out.println(", Scoop: 0");
						doublescoops++;
					} else {
						System.out.print(groups[j-1][i-1]);
						System.out.print(" == Spot: " + spot);
						if(numpnms == 0) {
							System.out.println(", Scoop: 0");
						} else if(doublescoops > 0) {
							if(pnmspot == legacies[y]){
								System.out.println(", Scoop: 1 *****");
								pnmspot++;
								numpnms--;
								lstleg = legacies[y];
								y++;
							} else if((pnmspot == (legacies[y] - 1)) ||
									((pnmspot + 2) == legacies[y])) {
								System.out.println(", Scoop: 1");
								pnmspot++;
								numpnms--;
							} else if(pnmspot == (lstleg + 1)) {
								System.out.println(", Scoop: 1");
								pnmspot++;
								numpnms--;
							} else {
								System.out.println(", Scoop: 2");
								doublescoops--;
								pnmspot = pnmspot + 2;
								numpnms = numpnms - 2;
							}
						} else {
							if(pnmspot == legacies[y]) {
								System.out.println(", Scoop: 1 *****");
								pnmspot++;
								numpnms--;
								y++;
							} else {
								System.out.println(", Scoop: 1");
								pnmspot++;
								numpnms--;
							}
						}
						spot++;
					}
				}
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		infoin.close();

	}

}
