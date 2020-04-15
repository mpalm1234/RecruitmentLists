import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.sql.*;

public class Generator extends JPanel implements ActionListener {

	public static final int PANELX = 300, PANELY = 740,
			MAXGROUPS = 30, MAXSISTERS = 5, MAXPNMS = 100;

	public JLabel[] grpLabels = new JLabel[MAXGROUPS];
	public JTextField[][] sisflds = new JTextField[MAXGROUPS][MAXSISTERS];
	public JTextArea pnmfld = new JTextArea();
	public JTextArea outputfld = new JTextArea();
	public JButton savGrpBtn = new JButton("SAVE");
	public JButton submitBtn = new JButton("SUBMIT");
	public Sister[][] sisters;
	public PNM[] pnms;

	//Database info
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	private static final String CONN = "jdbc:mysql://127.0.0.1:3306/lists?serverTimezone=UTC";

	public Generator() {
		super(new GridLayout(0,4));

		////////////////////////////
		// BUMB GROUPS 			  //
		////////////////////////////
		JPanel groupPanel = new JPanel(new GridLayout(0, 1));
		String name;

		try {  
			Connection con = DriverManager.getConnection(CONN, USERNAME, PASSWORD);
			Statement stmt = con.createStatement();  
			ResultSet rs = stmt.executeQuery("select * from lists.groups");
			boolean hasNext = true;
			
			if (rs.next() == false) {
				System.out.println("ResultSet is empty in Java");
				hasNext = false;
			} 

			for(int i = 0; i < MAXGROUPS; i++) {
				// Labels
				int num = i+1;
				grpLabels[i] = new JLabel("Bump Group #" + num);
				groupPanel.add(grpLabels[i]);

				// Sisters
				for(int j = 0; j < MAXSISTERS; j++) {
					if(hasNext && rs.getInt(1) == num) {
						name = rs.getString(3);
						hasNext = rs.next();
					} else {
						name = "";
					}
					sisflds[i][j] = new JTextField(name, 15);
					groupPanel.add(sisflds[i][j]);
				}
			}

			rs.close();
			stmt.close();
			con.close(); 

		} catch(SQLException e){
			System.out.println(e);
		}

		savGrpBtn.addActionListener(this);
		groupPanel.add(savGrpBtn);

		JScrollPane groupPane = new JScrollPane(groupPanel);
		groupPane.setPreferredSize(new Dimension(PANELX, PANELY));

		////////////////////////////
		// PNMS   				  //
		////////////////////////////
		JPanel pnmPanel = new JPanel(new BorderLayout());

		JLabel pnmTitle = new JLabel("PNMs");

		pnmPanel.add(pnmTitle, BorderLayout.NORTH);
		pnmPanel.add(pnmfld, BorderLayout.CENTER);

		JScrollPane pnmPane = new JScrollPane(pnmPanel);
		pnmPane.setPreferredSize(new Dimension(PANELX, PANELY));

		////////////////////////////
		// OUTPUT  			      //
		////////////////////////////
		JPanel outputPanel = new JPanel(new BorderLayout());
		submitBtn.addActionListener(this);

		outputPanel.add(submitBtn, BorderLayout.NORTH);
		outputPanel.add(outputfld, BorderLayout.CENTER);

		JScrollPane outputPane = new JScrollPane(outputPanel);
		outputPane.setPreferredSize(new Dimension(PANELX, PANELY));

		////////////////////////////
		// ADD TO SCREEN          //
		////////////////////////////
		this.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));		
		this.add(groupPane);
		this.add(pnmPane);
		this.add(outputPane);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == savGrpBtn) {
			saveGroups();
		} else if(e.getSource() == submitBtn) {
			createLists();
		}
	}

	public void saveGroups() {
		try {  
			Connection con = DriverManager.getConnection(CONN, USERNAME, PASSWORD);
			Statement stmt = con.createStatement();  
			stmt.executeUpdate("delete from lists.groups");
			boolean hasNext = true;
			String name;

			for(int i = 0; i < MAXGROUPS; i++) {
				for(int j = 0; j < MAXSISTERS; j++) {
					if(sisflds[i][j] != null) {
						name = sisflds[i][j].getText();
						stmt.executeUpdate("insert into lists.groups values (" +
				                   			(i+1) + ", " + (j+1) + ", '" + name + "')");
					}
					
				}
			}

			stmt.close();
			con.close(); 

		} catch(SQLException e){
			System.out.println(e);
		}


	}

	public void createLists() {
		int numScoopSisters, numPNMs;
		int group = 0, pos = 0, spot = 0;

		outputfld.setText("");
		sisters = new Sister[MAXGROUPS][MAXSISTERS];
		pnms  = new PNM[MAXPNMS];

		createSisters(group, pos, spot);
		numScoopSisters = spot;

		spot = 0;
		createPNMs(spot);
		numPNMs = spot;

		int doubleScoops = numPNMs - numScoopSisters;
		if(doubleScoops < 0) {
			doubleScoops = 0;
		}

		int scoop = 0, sisSpot, pnmSpot = 0;
		int remain = numPNMs;
		String legacy, line;
		for(int j = 0; j < MAXSISTERS; j++) {
			for(int i = 0; i < MAXGROUPS; i++) {
				if (sisters[i][j] != null) {

					legacy = " ";
					String sisName = sisters[i][j].getName();
					sisSpot = sisters[i][j].getSpot();

					// bump starter or no PNMs left to scoop
					if (sisSpot == 0 || remain <= 0 || pnms[pnmSpot] == null) {
						scoop = 0;

						// scoop two PNMs at beginning,
						// excluding legacies and PNMs before and after the legacy
					} else if (doubleScoops > 0) {
						int before = pnmSpot - 1;
						if (before < 0)
							before = 0;
						int after = pnmSpot + 1;

						if (pnms[pnmSpot].isLegacy()) {
							scoop = 1;
							legacy = "!!!";
						} else if (pnms[before].isLegacy() || pnms[after].isLegacy()) {
							scoop = 1;

						} else {
							scoop = 2;
							doubleScoops--;
						}

						// normal
					} else {
						scoop = 1;
					}

					line = sisName + " == Spot: " + sisSpot +
							", Scoop: " + scoop + "  " + legacy + "\n";
					outputfld.append(line);

					pnmSpot += scoop;
					remain -= scoop;
				}
			}
		}

		if (remain > 0) {
			line = "Warning! Not enough sisters to scoop all PNMs. \n";
			outputfld.append(line);
		}
	}

	private void createSisters(int group, int pos, int spot) {
		for(int sisnum = 0; sisnum < MAXSISTERS; sisnum++) {
			for(int grpnum = 0; grpnum < MAXGROUPS; grpnum++) {
				String name = sisflds[grpnum][sisnum].getText();
				if (name.length() > 0) {
					group = grpnum + 1;
					if(sisnum == 0) {
						pos = 0;
					} else {
						spot++;
						pos = spot;
					}
					sisters[grpnum][sisnum] = new Sister(name, group, pos);
				} 
			}
		}
	}

	private void createPNMs(int spot) {
		for (String line : pnmfld.getText().split("\n")) {
			pnms[spot] = new PNM(line, spot, false);
			if (line.indexOf("*") >= 0) {
				pnms[spot].setLegacy(true);
			}
			spot++;
		}		
	}

	private static void createAndShowGUI() {
		//Create and set up the window.
		JFrame frame = new JFrame("List Generator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

		//Create and set up the content pane.
		JComponent newContentPane = new Generator();
		newContentPane.setOpaque(true);
		frame.setContentPane(newContentPane);

		//Display the window.
		frame.pack();
		frame.setVisible(true);

	}

	public static void main(String[] args) {

		//Schedule a job for the event dispatch thread:
		//creating and showing this application's GUI.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				UIManager.put("swing.boldMetal", Boolean.FALSE);
				createAndShowGUI();
			}
		});
	}

}
