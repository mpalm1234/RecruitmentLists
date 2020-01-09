import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Generator extends JPanel implements ActionListener {
	
	public static final int SCREENY = 750, PANELX = 300;
	
	public Generator() {
		super(new BorderLayout());
		
		////////////////////////////
		// NORTH PANE: TITLES     //
		////////////////////////////
		JLabel groupsTitle = new JLabel("Bump Groups");
		JLabel pnmsTitle = new JLabel("PNMs");
		
		// panel
		JPanel titlePanel = new JPanel(new GridLayout(0, 2));
		titlePanel.add(groupsTitle);
		titlePanel.add(pnmsTitle);

		////////////////////////////
		// WEST PANE: BUMB GROUPS //
		////////////////////////////

		// labels
		JLabel group1 = new JLabel("Bump Group #1");
		JLabel group2 = new JLabel("Bump Group #2");
		JLabel group3 = new JLabel("Bump Group #3");
		JLabel group4 = new JLabel("Bump Group #4");
		JLabel group5 = new JLabel("Bump Group #5");
		JLabel group6 = new JLabel("Bump Group #6");
		JLabel group7 = new JLabel("Bump Group #7");
		JLabel group8 = new JLabel("Bump Group #8");
		JLabel group9 = new JLabel("Bump Group #9");
		JLabel group10 = new JLabel("Bump Group #10");
		JLabel group11 = new JLabel("Bump Group #11");
		JLabel group12 = new JLabel("Bump Group #12");
		JLabel group13 = new JLabel("Bump Group #13");
		JLabel group14 = new JLabel("Bump Group #14");
		JLabel group15 = new JLabel("Bump Group #15");
		JLabel group16 = new JLabel("Bump Group #16");
		JLabel group17 = new JLabel("Bump Group #17");
		JLabel group18 = new JLabel("Bump Group #18");
		JLabel group19 = new JLabel("Bump Group #19");
		JLabel group20 = new JLabel("Bump Group #20");
		JLabel group21 = new JLabel("Bump Group #21");
		JLabel group22 = new JLabel("Bump Group #22");
		JLabel group23 = new JLabel("Bump Group #23");
		JLabel group24 = new JLabel("Bump Group #24");
		JLabel group25 = new JLabel("Bump Group #25");
		JLabel group26 = new JLabel("Bump Group #26");
		JLabel group27 = new JLabel("Bump Group #27");
		JLabel group28 = new JLabel("Bump Group #28");
		JLabel group29 = new JLabel("Bump Group #29");
		JLabel group30 = new JLabel("Bump Group #30");
		
		// sisters
		JTextField sis1_1 = new JTextField(" ",15);
		JTextField sis1_2 = new JTextField(" ",15);
		JTextField sis1_3 = new JTextField(" ",15);
		JTextField sis1_4 = new JTextField(" ",15);
		JTextField sis1_5 = new JTextField(" ",15);
		
		JTextField sis2_1 = new JTextField(" ",15);
		JTextField sis2_2 = new JTextField(" ",15);
		JTextField sis2_3 = new JTextField(" ",15);
		JTextField sis2_4 = new JTextField(" ",15);
		JTextField sis2_5 = new JTextField(" ",15);
		
		JTextField sis3_1 = new JTextField(" ",15);
		JTextField sis3_2 = new JTextField(" ",15);
		JTextField sis3_3 = new JTextField(" ",15);
		JTextField sis3_4 = new JTextField(" ",15);
		JTextField sis3_5 = new JTextField(" ",15);
		
		JTextField sis4_1 = new JTextField(" ",15);
		JTextField sis4_2 = new JTextField(" ",15);
		JTextField sis4_3 = new JTextField(" ",15);
		JTextField sis4_4 = new JTextField(" ",15);
		JTextField sis4_5 = new JTextField(" ",15);
		
		JTextField sis5_1 = new JTextField(" ",15);
		JTextField sis5_2 = new JTextField(" ",15);
		JTextField sis5_3 = new JTextField(" ",15);
		JTextField sis5_4 = new JTextField(" ",15);
		JTextField sis5_5 = new JTextField(" ",15);
		
		JTextField sis6_1 = new JTextField(" ",15);
		JTextField sis6_2 = new JTextField(" ",15);
		JTextField sis6_3 = new JTextField(" ",15);
		JTextField sis6_4 = new JTextField(" ",15);
		JTextField sis6_5 = new JTextField(" ",15);
		
		JTextField sis7_1 = new JTextField(" ",15);
		JTextField sis7_2 = new JTextField(" ",15);
		JTextField sis7_3 = new JTextField(" ",15);
		JTextField sis7_4 = new JTextField(" ",15);
		JTextField sis7_5 = new JTextField(" ",15);
		
		JTextField sis8_1 = new JTextField(" ",15);
		JTextField sis8_2 = new JTextField(" ",15);
		JTextField sis8_3 = new JTextField(" ",15);
		JTextField sis8_4 = new JTextField(" ",15);
		JTextField sis8_5 = new JTextField(" ",15);
		
		JTextField sis9_1 = new JTextField(" ",15);
		JTextField sis9_2 = new JTextField(" ",15);
		JTextField sis9_3 = new JTextField(" ",15);
		JTextField sis9_4 = new JTextField(" ",15);
		JTextField sis9_5 = new JTextField(" ",15);
		
		JTextField sis10_1 = new JTextField(" ",15);
		JTextField sis10_2 = new JTextField(" ",15);
		JTextField sis10_3 = new JTextField(" ",15);
		JTextField sis10_4 = new JTextField(" ",15);
		JTextField sis10_5 = new JTextField(" ",15);
		
		JTextField sis11_1 = new JTextField(" ",15);
		JTextField sis11_2 = new JTextField(" ",15);
		JTextField sis11_3 = new JTextField(" ",15);
		JTextField sis11_4 = new JTextField(" ",15);
		JTextField sis11_5 = new JTextField(" ",15);
		
		JTextField sis12_1 = new JTextField(" ",15);
		JTextField sis12_2 = new JTextField(" ",15);
		JTextField sis12_3 = new JTextField(" ",15);
		JTextField sis12_4 = new JTextField(" ",15);
		JTextField sis12_5 = new JTextField(" ",15);
		
		JTextField sis13_1 = new JTextField(" ",15);
		JTextField sis13_2 = new JTextField(" ",15);
		JTextField sis13_3 = new JTextField(" ",15);
		JTextField sis13_4 = new JTextField(" ",15);
		JTextField sis13_5 = new JTextField(" ",15);
		
		JTextField sis14_1 = new JTextField(" ",15);
		JTextField sis14_2 = new JTextField(" ",15);
		JTextField sis14_3 = new JTextField(" ",15);
		JTextField sis14_4 = new JTextField(" ",15);
		JTextField sis14_5 = new JTextField(" ",15);
		
		JTextField sis15_1 = new JTextField(" ",15);
		JTextField sis15_2 = new JTextField(" ",15);
		JTextField sis15_3 = new JTextField(" ",15);
		JTextField sis15_4 = new JTextField(" ",15);
		JTextField sis15_5 = new JTextField(" ",15);
		
		JTextField sis16_1 = new JTextField(" ",15);
		JTextField sis16_2 = new JTextField(" ",15);
		JTextField sis16_3 = new JTextField(" ",15);
		JTextField sis16_4 = new JTextField(" ",15);
		JTextField sis16_5 = new JTextField(" ",15);
		
		JTextField sis17_1 = new JTextField(" ",15);
		JTextField sis17_2 = new JTextField(" ",15);
		JTextField sis17_3 = new JTextField(" ",15);
		JTextField sis17_4 = new JTextField(" ",15);
		JTextField sis17_5 = new JTextField(" ",15);
		
		JTextField sis18_1 = new JTextField(" ",15);
		JTextField sis18_2 = new JTextField(" ",15);
		JTextField sis18_3 = new JTextField(" ",15);
		JTextField sis18_4 = new JTextField(" ",15);
		JTextField sis18_5 = new JTextField(" ",15);
		
		JTextField sis19_1 = new JTextField(" ",15);
		JTextField sis19_2 = new JTextField(" ",15);
		JTextField sis19_3 = new JTextField(" ",15);
		JTextField sis19_4 = new JTextField(" ",15);
		JTextField sis19_5 = new JTextField(" ",15);
		
		JTextField sis20_1 = new JTextField(" ",15);
		JTextField sis20_2 = new JTextField(" ",15);
		JTextField sis20_3 = new JTextField(" ",15);
		JTextField sis20_4 = new JTextField(" ",15);
		JTextField sis20_5 = new JTextField(" ",15);
		
		JTextField sis21_1 = new JTextField(" ",15);
		JTextField sis21_2 = new JTextField(" ",15);
		JTextField sis21_3 = new JTextField(" ",15);
		JTextField sis21_4 = new JTextField(" ",15);
		JTextField sis21_5 = new JTextField(" ",15);
		
		JTextField sis22_1 = new JTextField(" ",15);
		JTextField sis22_2 = new JTextField(" ",15);
		JTextField sis22_3 = new JTextField(" ",15);
		JTextField sis22_4 = new JTextField(" ",15);
		JTextField sis22_5 = new JTextField(" ",15);
		
		JTextField sis23_1 = new JTextField(" ",15);
		JTextField sis23_2 = new JTextField(" ",15);
		JTextField sis23_3 = new JTextField(" ",15);
		JTextField sis23_4 = new JTextField(" ",15);
		JTextField sis23_5 = new JTextField(" ",15);
		
		JTextField sis24_1 = new JTextField(" ",15);
		JTextField sis24_2 = new JTextField(" ",15);
		JTextField sis24_3 = new JTextField(" ",15);
		JTextField sis24_4 = new JTextField(" ",15);
		JTextField sis24_5 = new JTextField(" ",15);
		
		JTextField sis25_1 = new JTextField(" ",15);
		JTextField sis25_2 = new JTextField(" ",15);
		JTextField sis25_3 = new JTextField(" ",15);
		JTextField sis25_4 = new JTextField(" ",15);
		JTextField sis25_5 = new JTextField(" ",15);
		
		JTextField sis26_1 = new JTextField(" ",15);
		JTextField sis26_2 = new JTextField(" ",15);
		JTextField sis26_3 = new JTextField(" ",15);
		JTextField sis26_4 = new JTextField(" ",15);
		JTextField sis26_5 = new JTextField(" ",15);
		
		JTextField sis27_1 = new JTextField(" ",15);
		JTextField sis27_2 = new JTextField(" ",15);
		JTextField sis27_3 = new JTextField(" ",15);
		JTextField sis27_4 = new JTextField(" ",15);
		JTextField sis27_5 = new JTextField(" ",15);
		
		JTextField sis28_1 = new JTextField(" ",15);
		JTextField sis28_2 = new JTextField(" ",15);
		JTextField sis28_3 = new JTextField(" ",15);
		JTextField sis28_4 = new JTextField(" ",15);
		JTextField sis28_5 = new JTextField(" ",15);
		
		JTextField sis29_1 = new JTextField(" ",15);
		JTextField sis29_2 = new JTextField(" ",15);
		JTextField sis29_3 = new JTextField(" ",15);
		JTextField sis29_4 = new JTextField(" ",15);
		JTextField sis29_5 = new JTextField(" ",15);
		
		JTextField sis30_1 = new JTextField(" ",15);
		JTextField sis30_2 = new JTextField(" ",15);
		JTextField sis30_3 = new JTextField(" ",15);
		JTextField sis30_4 = new JTextField(" ",15);
		JTextField sis30_5 = new JTextField(" ",15);

		// Panel
		JPanel groupPanel = new JPanel(new GridLayout(0, 1));
		groupPanel.add(group1);
		groupPanel.add(sis1_1);
		groupPanel.add(sis1_2);
		groupPanel.add(sis1_3);
		groupPanel.add(sis1_4);
		groupPanel.add(sis1_5);
		
		groupPanel.add(group2);
		groupPanel.add(sis2_1);
		groupPanel.add(sis2_2);
		groupPanel.add(sis2_3);
		groupPanel.add(sis2_4);
		groupPanel.add(sis2_5);
		
		groupPanel.add(group3);
		groupPanel.add(sis3_1);
		groupPanel.add(sis3_2);
		groupPanel.add(sis3_3);
		groupPanel.add(sis3_4);
		groupPanel.add(sis3_5);
		
		groupPanel.add(group4);
		groupPanel.add(sis4_1);
		groupPanel.add(sis4_2);
		groupPanel.add(sis4_3);
		groupPanel.add(sis4_4);
		groupPanel.add(sis4_5);
		
		groupPanel.add(group5);
		groupPanel.add(sis5_1);
		groupPanel.add(sis5_2);
		groupPanel.add(sis5_3);
		groupPanel.add(sis5_4);
		groupPanel.add(sis5_5);
		
		groupPanel.add(group6);
		groupPanel.add(sis6_1);
		groupPanel.add(sis6_2);
		groupPanel.add(sis6_3);
		groupPanel.add(sis6_4);
		groupPanel.add(sis6_5);
		
		groupPanel.add(group7);
		groupPanel.add(sis7_1);
		groupPanel.add(sis7_2);
		groupPanel.add(sis7_3);
		groupPanel.add(sis7_4);
		groupPanel.add(sis7_5);
		
		groupPanel.add(group8);
		groupPanel.add(sis8_1);
		groupPanel.add(sis8_2);
		groupPanel.add(sis8_3);
		groupPanel.add(sis8_4);
		groupPanel.add(sis8_5);
		
		groupPanel.add(group9);
		groupPanel.add(sis9_1);
		groupPanel.add(sis9_2);
		groupPanel.add(sis9_3);
		groupPanel.add(sis9_4);
		groupPanel.add(sis9_5);
		
		groupPanel.add(group10);
		groupPanel.add(sis10_1);
		groupPanel.add(sis10_2);
		groupPanel.add(sis10_3);
		groupPanel.add(sis10_4);
		groupPanel.add(sis10_5);
		
		groupPanel.add(group11);
		groupPanel.add(sis11_1);
		groupPanel.add(sis11_2);
		groupPanel.add(sis11_3);
		groupPanel.add(sis11_4);
		groupPanel.add(sis11_5);
		
		groupPanel.add(group12);
		groupPanel.add(sis12_1);
		groupPanel.add(sis12_2);
		groupPanel.add(sis12_3);
		groupPanel.add(sis12_4);
		groupPanel.add(sis12_5);
		
		groupPanel.add(group13);
		groupPanel.add(sis13_1);
		groupPanel.add(sis13_2);
		groupPanel.add(sis13_3);
		groupPanel.add(sis13_4);
		groupPanel.add(sis13_5);
		
		groupPanel.add(group14);
		groupPanel.add(sis14_1);
		groupPanel.add(sis14_2);
		groupPanel.add(sis14_3);
		groupPanel.add(sis14_4);
		groupPanel.add(sis14_5);
		
		groupPanel.add(group15);
		groupPanel.add(sis15_1);
		groupPanel.add(sis15_2);
		groupPanel.add(sis15_3);
		groupPanel.add(sis15_4);
		groupPanel.add(sis15_5);
		
		groupPanel.add(group16);
		groupPanel.add(sis16_1);
		groupPanel.add(sis16_2);
		groupPanel.add(sis16_3);
		groupPanel.add(sis16_4);
		groupPanel.add(sis16_5);
		
		groupPanel.add(group17);
		groupPanel.add(sis17_1);
		groupPanel.add(sis17_2);
		groupPanel.add(sis17_3);
		groupPanel.add(sis17_4);
		groupPanel.add(sis17_5);
		
		groupPanel.add(group18);
		groupPanel.add(sis18_1);
		groupPanel.add(sis18_2);
		groupPanel.add(sis18_3);
		groupPanel.add(sis18_4);
		groupPanel.add(sis18_5);
		
		groupPanel.add(group19);
		groupPanel.add(sis19_1);
		groupPanel.add(sis19_2);
		groupPanel.add(sis19_3);
		groupPanel.add(sis19_4);
		groupPanel.add(sis19_5);
		
		groupPanel.add(group20);
		groupPanel.add(sis20_1);
		groupPanel.add(sis20_2);
		groupPanel.add(sis20_3);
		groupPanel.add(sis20_4);
		groupPanel.add(sis20_5);
		
		groupPanel.add(group21);
		groupPanel.add(sis21_1);
		groupPanel.add(sis21_2);
		groupPanel.add(sis21_3);
		groupPanel.add(sis21_4);
		groupPanel.add(sis21_5);
		
		groupPanel.add(group22);
		groupPanel.add(sis22_1);
		groupPanel.add(sis22_2);
		groupPanel.add(sis22_3);
		groupPanel.add(sis22_4);
		groupPanel.add(sis22_5);
		
		groupPanel.add(group23);
		groupPanel.add(sis23_1);
		groupPanel.add(sis23_2);
		groupPanel.add(sis23_3);
		groupPanel.add(sis23_4);
		groupPanel.add(sis23_5);
		
		groupPanel.add(group24);
		groupPanel.add(sis24_1);
		groupPanel.add(sis24_2);
		groupPanel.add(sis24_3);
		groupPanel.add(sis24_4);
		groupPanel.add(sis24_5);
		
		groupPanel.add(group25);
		groupPanel.add(sis25_1);
		groupPanel.add(sis25_2);
		groupPanel.add(sis25_3);
		groupPanel.add(sis25_4);
		groupPanel.add(sis25_5);
		
		groupPanel.add(group26);
		groupPanel.add(sis26_1);
		groupPanel.add(sis26_2);
		groupPanel.add(sis26_3);
		groupPanel.add(sis26_4);
		groupPanel.add(sis26_5);
		
		groupPanel.add(group27);
		groupPanel.add(sis27_1);
		groupPanel.add(sis27_2);
		groupPanel.add(sis27_3);
		groupPanel.add(sis27_4);
		groupPanel.add(sis27_5);
		
		groupPanel.add(group28);
		groupPanel.add(sis28_1);
		groupPanel.add(sis28_2);
		groupPanel.add(sis28_3);
		groupPanel.add(sis28_4);
		groupPanel.add(sis28_5);
		
		groupPanel.add(group29);
		groupPanel.add(sis29_1);
		groupPanel.add(sis29_2);
		groupPanel.add(sis29_3);
		groupPanel.add(sis29_4);
		groupPanel.add(sis29_5);
		
		groupPanel.add(group30);
		groupPanel.add(sis30_1);
		groupPanel.add(sis30_2);
		groupPanel.add(sis30_3);
		groupPanel.add(sis30_4);
		groupPanel.add(sis30_5);
		
		// Scrollable Panel
		JScrollPane groupPane = new JScrollPane(groupPanel);
		groupPane.setPreferredSize(new Dimension(PANELX, SCREENY));
        
		////////////////////////////
		// EAST PANE:  PNMS       //
		////////////////////////////
	
		// pnms
		JTextArea pnmfld = new JTextArea(PANELX,1);

		// panel
		JPanel pnmPanel = new JPanel(new GridLayout(0, 1));
		pnmPanel.add(pnmfld);
		
		// Scrollable Panel
		JScrollPane pnmPane = new JScrollPane(pnmPanel);
		pnmPane.setPreferredSize(new Dimension(PANELX, SCREENY));
		        
		////////////////////////////
		// ADD TO SCREEN          //
		////////////////////////////
		
		this.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		this.add(titlePanel, BorderLayout.NORTH);
		this.add(groupPane, BorderLayout.WEST);
		this.add(pnmPane, BorderLayout.EAST);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

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
				//Turn off metal's use of bold fonts
				UIManager.put("swing.boldMetal", Boolean.FALSE);
				createAndShowGUI();
			}
		});
	}

}
