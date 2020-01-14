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
	public static final int MAXGROUPS = 30, MAXSISTERS = 5, MAXPNMS = 100;
	
	JLabel[] grpLabels = new JLabel[MAXGROUPS];
	JTextField[][] sisflds = new JTextField[MAXGROUPS][MAXSISTERS];
	JTextArea pnmfld = new JTextArea();
	
	Sister[][] sisters = new Sister[MAXGROUPS][MAXSISTERS];
	PNM[] pnms = new PNM[MAXPNMS];
	
	public Generator() {
		super(new BorderLayout());
		
		////////////////////////////
		// NORTH PANE: TITLES     //
		////////////////////////////
		JLabel groupsTitle = new JLabel("Bump Groups");
		JLabel pnmsTitle = new JLabel("PNMs");
		
		JPanel titlePanel = new JPanel(new GridLayout(0, 2));
		titlePanel.add(groupsTitle);
		titlePanel.add(pnmsTitle);

		////////////////////////////
		// WEST PANE: BUMB GROUPS //
		////////////////////////////
		JPanel groupPanel = new JPanel(new GridLayout(0, 1));

		for(int i = 0; i < MAXGROUPS; i++) {
			// Labels
			int num = i+1;
			grpLabels[i] = new JLabel("Bump Group #" + num);
			groupPanel.add(grpLabels[i]);
			
			// Sisters
			for(int j = 0; j < MAXSISTERS; j++) {
				sisflds[i][j] = new JTextField(" ", 15);
				groupPanel.add(sisflds[i][j]);
			}
		}
		
		JScrollPane groupPane = new JScrollPane(groupPanel);
		groupPane.setPreferredSize(new Dimension(PANELX, SCREENY));
        
		////////////////////////////
		// EAST PANE:  PNMS       //
		////////////////////////////
		JPanel pnmPanel = new JPanel(new GridLayout(0, 1));
		pnmPanel.add(pnmfld);
		
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
		
		// Create Sisters
		int group = 0, spot = 0;
		for(int j = 0; j < MAXSISTERS; j++) {
			for(int i = 0; i < MAXGROUPS; i++) {
				group = i + 1;
				spot++;
				String name = sisflds[i][j].getText();
				sisters[i][j] = new Sister(name, group, spot);
			}
		}
		
		// Create PNMs
		int numPNMs = pnmfld.getRows();
		int i = 0;
		for (String line : pnmfld.getText().split("\n")) {
			pnms[i] = new PNM(line, i, false);
			if (line.indexOf('*') >= 0) {
				pnms[i].setLegacy(true);
			}
			i++;
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
				//Turn off metal's use of bold fonts
				UIManager.put("swing.boldMetal", Boolean.FALSE);
				createAndShowGUI();
			}
		});
	}

}
