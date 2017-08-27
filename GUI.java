import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI{
	JFrame frame;
	JPanel c1Pane,c2Pane,c3Pane,c4aPane,c4bPane,c5Pane, c6Pane ,gradePane , mainMain, rightPane,paneL;
	JLabel C1,C2,C3,C4A,C4B,C5,C6,hc,logo;
	TextField c1,c2,c3,c4a,c4b,c5,c6;
	JButton cal,reset;
	JTextArea console;
	JRadioButton check1,AP1,check2,AP2,check3,AP3,check4a,AP4a,check4b,AP4b,check5,AP5,check6,AP6;

	public GUI(){
		frame = new JFrame("GPA Grade Calculator");
		frame.setPreferredSize(new Dimension(800, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);


		paneL = new JPanel();
		paneL.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		gradePane = new JPanel();
		gradePane.setLayout(new GridLayout(5, 2, 0, 0));

		mainMain = new JPanel();
		mainMain.setLayout(new GridLayout(1, 1, 0, 0));

		c1Pane = new JPanel();
		c1Pane.setLayout(new BoxLayout(c1Pane, BoxLayout.Y_AXIS));

		c2Pane = new JPanel();
		c2Pane.setLayout(new BoxLayout(c2Pane, BoxLayout.Y_AXIS));

		c3Pane = new JPanel();
		c3Pane.setLayout(new BoxLayout(c3Pane, BoxLayout.Y_AXIS));

		c4aPane = new JPanel();
		c4aPane.setLayout(new BoxLayout(c4aPane, BoxLayout.Y_AXIS));

		c4bPane = new JPanel();
		c4bPane.setLayout(new BoxLayout(c4bPane, BoxLayout.Y_AXIS));

		c5Pane = new JPanel();
		c5Pane.setLayout(new BoxLayout(c5Pane, BoxLayout.Y_AXIS));

		c6Pane = new JPanel();
		c6Pane.setLayout(new BoxLayout(c6Pane, BoxLayout.Y_AXIS));

		C1 = new JLabel("Period 1");
		C1.setPreferredSize(new Dimension(55,55));
		c1 = new TextField();
		c1.setPreferredSize(new Dimension(25,25));
		check1 = new JRadioButton("Honors Class?");
		AP1 = new JRadioButton("GT or AP Class?");
		c1Pane.add(C1);
		c1Pane.add(c1);
		ButtonGroup b1 = new ButtonGroup();
		b1.add(check1);
		b1.add(AP1);
		c1Pane.add(check1);
		c1Pane.add(AP1);

		C2 = new JLabel("Period 2");
		C2.setPreferredSize(new Dimension(55,55));
		c2 = new TextField();
		c2.setPreferredSize(new Dimension(25,25));
		check2 = new JRadioButton("Honors Class?");
		AP2 = new JRadioButton("GT or AP Class?");
		c2Pane.add(C2);
		c2Pane.add(c2);
		ButtonGroup b2 = new ButtonGroup();
		b2.add(check2);
		b2.add(AP2);
		c2Pane.add(check2);
		c2Pane.add(AP2);


		C3 = new JLabel("Period 3");
		C3.setPreferredSize(new Dimension(55,55));
		c3 = new TextField();
		c3.setPreferredSize(new Dimension(25,25));
		check3 = new JRadioButton("Honors Class?");
		AP3 = new JRadioButton("GT or AP Class?");
		c3Pane.add(C3);
		c3Pane.add(c3);
		ButtonGroup b3 = new ButtonGroup();
		b3.add(check3);
		b3.add(AP3);
		c3Pane.add(check3);
		c3Pane.add(AP3);


		C4A = new JLabel("Period 4A");
		C4A.setPreferredSize(new Dimension(55,55));
		c4a = new TextField();
		c4a.setPreferredSize(new Dimension(25,25));
		check4a = new JRadioButton("Honors Class?");
		AP4a = new JRadioButton("GT or AP Class?");
		c4aPane.add(C4A);
		c4aPane.add(c4a);
		ButtonGroup b4a = new ButtonGroup();
		b4a.add(check4a);
		b4a.add(AP4a);
		c4aPane.add(check4a);
		c4aPane.add(AP4a);

		C4B = new JLabel("Period 4B");
		C4B.setPreferredSize(new Dimension(55,55));
		c4b = new TextField();
		c4b.setPreferredSize(new Dimension(25,25));
		check4b = new JRadioButton("Honors Class?");
		AP4b = new JRadioButton("GT or AP Class?");
		c4bPane.add(C4B);
		c4bPane.add(c4b);
		ButtonGroup b4b = new ButtonGroup();
		b4b.add(check4b);
		b4b.add(AP4b);
		c4bPane.add(check4b);
		c4bPane.add(AP4b);

		C5 = new JLabel("Period 5");
		C5.setPreferredSize(new Dimension(55,55));
		c5 = new TextField();
		c5.setPreferredSize(new Dimension(25,25));
		check5 = new JRadioButton("Honors Class?");
		AP5 = new JRadioButton("GT or AP Class?");
		c5Pane.add(C5);
		c5Pane.add(c5);
		ButtonGroup b5 = new ButtonGroup();
		b5.add(check5);
		b5.add(AP5);
		c5Pane.add(check5);
		c5Pane.add(AP5);

		C6 = new JLabel("Period 6");
		C6.setPreferredSize(new Dimension(55,55));
		c6 = new TextField();
		c6.setPreferredSize(new Dimension(25,25));
		check6 = new JRadioButton("Honors Class?");
		AP6 = new JRadioButton("GT or AP Class?");
		c6Pane.add(C6);
		c6Pane.add(c6);
		ButtonGroup b6 = new ButtonGroup();
		b6.add(check6);
		b6.add(AP6);
		c6Pane.add(check6);
		c6Pane.add(AP6);

		console = new JTextArea(10,10);
		console.setEditable(false);
		console.append("REMEMBER TO USE CAPITAL \nLETTERS FOR YOUR LETTER GRADES!");
		console.setPreferredSize(new Dimension(50, 100));
		c.fill = GridBagConstraints.BOTH;
		c.ipady = 40;    
		c.weighty = 5.0;
		c.gridwidth = 3;
		c.gridx = 1;
		c.gridy = 0;
		paneL.add(console, c);

		cal = new JButton("Calculate");
		reset = new JButton("Reset");

		hc = new JLabel();
		logo = new JLabel(new ImageIcon(getClass().getResource("img/rsz_1hoco.png")));
		Dimension b = new Dimension(400,100);
		logo.setPreferredSize(b);
		c.fill = GridBagConstraints.BOTH;
		c.weighty = 0.0;
		c.gridwidth = 2;
		c.gridx = 0;
		c.gridy = 1;
		paneL.add(logo, c);

		gradePane.add(c1Pane);
		gradePane.add(c2Pane);
		gradePane.add(c3Pane);
		gradePane.add(c4aPane);
		gradePane.add(c4bPane);
		gradePane.add(c5Pane);
		gradePane.add(c6Pane);
		gradePane.add(hc);
		gradePane.add(cal);
		gradePane.add(reset);
		mainMain.add(gradePane);
		mainMain.add(paneL);

		cal.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				GPA g = new GPA();
				double sum = 0;
				double check = 0;
				double ap = 0;

				int one = g.pointQt(c1.getText());
				int two = g.pointQt(c2.getText());
				int three = g.pointQt(c3.getText());
				int four = g.pointQt(c4a.getText());
				int five = g.pointQt(c4b.getText());
				int six = g.pointQt(c5.getText());
				int seven = g.pointQt(c6.getText());

				if(check1.isSelected() == true && g.rekt!= true){//check if class is merit if so adds one to check
					check += 0.5;
				}
				if(check2.isSelected() == true && g.rekt!= true){
					check += 0.5;
				}
				if(check3.isSelected() == true  && g.rekt!= true){
					check += 0.5;
				}
				if(check4a.isSelected() == true && g.rekt!= true){
					check += 0.5;
				}
				if(check4b.isSelected() == true && g.rekt!= true){
					check += 0.5;
				}
				if(check5.isSelected() == true && g.rekt!= true){
					check += 0.5;
				}
				if(check6.isSelected() == true && g.rekt!= true){
					check += 0.5;
				}

				if(AP1.isSelected() == true && g.rekt!= true){//check if class is merit if so adds one to check
					ap += 1;
				}
				if(AP2.isSelected() == true && g.rekt!= true){
					ap += 1;
				}
				if(AP3.isSelected() == true && g.rekt!= true){
					ap += 1;
				}
				if(AP4a.isSelected() == true && g.rekt!= true){
					ap += 1;
				}
				if(AP4b.isSelected() == true && g.rekt!= true){
					ap += 1;
				}
				if(AP5.isSelected() == true && g.rekt!= true ){
					ap += 1;
				}
				if(AP6.isSelected() == true && g.rekt!= true){
					ap += 1;
				}

				double unSum = one + two + three + four + five + six + seven;
				sum = one + two + three + four + five + six + seven + check + ap; //adds the extra point for merit
				
				if(sum == unSum){
					console.append("\n" + "Your Weighted GPA is: " + g.regGPA(sum));
				} else{
					console.append("\n" + "Your Weighted GPA is: " + g.regGPA(sum));
					console.append("\n" + "Your Unweighted GPA is: " + g.regGPA(unSum));
				}

			}
		});

		reset.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				console.setText(null);
				console.append("REMEMBER TO USE CAPITAL \nLETTERS FOR YOUR LETTER GRADES!");
				c1.setText(null);
				c2.setText(null);
				c3.setText(null);
				c4a.setText(null);
				c4b.setText(null);
				c5.setText(null);
				c6.setText(null);
				b1.clearSelection();
				b2.clearSelection();
				b3.clearSelection();
				b4a.clearSelection();
				b4b.clearSelection();
				b5.clearSelection();
				b6.clearSelection();
			}
		});


		frame.setContentPane(mainMain);
		frame.pack();
		frame.setVisible(true);

	frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("img/256.png")));//changes icon of program

	}


	private static void runGUI(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		GUI greeting = new GUI();
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				runGUI();
			}

		});

	}

}


