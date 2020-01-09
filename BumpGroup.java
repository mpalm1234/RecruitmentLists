

public class BumpGroup {
	
	int number;
	Sister[] sisters;

	// Constructor:
	public BumpGroup(int n, Sister[] s) {
		this.number = n;
		this.sisters = s;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Sister[] getSisters() {
		return sisters;
	}

	public void setSisters(Sister[] sisters) {
		this.sisters = sisters;
	}

}
