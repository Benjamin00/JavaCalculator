import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator{

	public static void main(String[] args) {
		
		cFrame mainFrame = new cFrame();
		mainFrame.setVisible(true);
		mainFrame.setSize(400,400);
		mainFrame.setTitle("Programming Calculator");
		mainFrame.setDefaultLookAndFeelDecorated(true);
		mainFrame.setResizable(false);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
class cFrame extends JFrame implements ActionListener {
	private buttonPanel bPanel;
	private numPanel nPanel;
	private inputPanel iPanel;
	
	public cFrame() {
		bPanel = new buttonPanel();
		nPanel = new numPanel();
		iPanel = new inputPanel();
		
		add(nPanel, BorderLayout.WEST);
		add(bPanel, BorderLayout.SOUTH);
		add(iPanel, BorderLayout.NORTH);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==bPanel.getAddButton()) {
			
		}
	}
	
}
class buttonPanel extends JPanel{
	private JButton addBut, subBut, multBut, divBut, equalsBut, dotBut;//6
	private JButton oneBut, twoBut, threeBut, fourBut, fiveBut, sixBut, sevenBut, eightBut, nineBut, zeroBut;//10
	private JButton lshBut, rshBut, orBut, xorBut, norBut, andBut, modBut, upBut, ceBut, clrBut, delBut;//11
	private JButton aBut, bBut, cBut, dBut, eBut, fBut, leftPBut, rightPBut, negBut;//9
	//array of all the buttons to iterate through
	
	public buttonPanel() {
		GridLayout buttonGL = new GridLayout(6,6,5,5);
		setLayout(buttonGL);
		//Symbols
		addBut = new JButton("+");
		subBut = new JButton("-");
		multBut = new JButton("x");
		divBut = new JButton("÷");
		equalsBut = new JButton("=");
		dotBut = new JButton(".");
		//Numbers
		oneBut = new JButton("1");
		twoBut = new JButton("2");
		threeBut = new JButton("3");
		fourBut = new JButton("4");
		fiveBut = new JButton("5");
		sixBut = new JButton("6");
		sevenBut = new JButton("7");
		eightBut = new JButton("8");
		nineBut = new JButton("9");
		zeroBut = new JButton("0");
		//Function Buttons
		lshBut = new JButton("Lsh");
		rshBut = new JButton("Rsh");
		orBut = new JButton("Or");
		xorBut = new JButton("Xor");
		norBut = new JButton("Nor");
		andBut = new JButton("And");
		modBut = new JButton("Mod");
		upBut = new JButton("↑");
		ceBut = new JButton("Ce");
		clrBut = new JButton("C");
		delBut = new JButton("<-");
		//Characters
		aBut = new JButton("A");
		bBut = new JButton("B");
		cBut = new JButton("C");
		dBut = new JButton("D");
		eBut = new JButton("E");
		fBut = new JButton("F");
		leftPBut = new JButton("(");
		rightPBut = new JButton(")");
		negBut = new JButton("±");
		JButton[] buttons = new JButton[] {	lshBut, rshBut, orBut, xorBut, norBut, andBut,
											upBut, modBut, ceBut, clrBut, delBut, divBut, 
											aBut, bBut, sevenBut, eightBut, nineBut, multBut, 
											cBut, dBut, fourBut, fiveBut, sixBut, subBut, 
											eBut, fBut, oneBut, twoBut, threeBut, addBut, 
											leftPBut, rightPBut, negBut, zeroBut, dotBut, equalsBut};
		
		
		//add all the buttons to the panel
		for(JButton i:buttons) {
			add(i);			
		}
	}
	//Symbols
	public JButton getAddButton() {return addBut;}
	public JButton getSubButton() {return subBut;}
	public JButton getMultButton() {return multBut;}
	public JButton getDivButton() {return divBut;}
	public JButton getEqualsButton() {return equalsBut;}
	public JButton getDotButton() {return dotBut;}
	//Numbers
	public JButton getZeroButton() {return zeroBut;}
	public JButton getOneButton() {return oneBut;}
	public JButton getTwoButton() {return twoBut;}
	public JButton getThreeButton() {return threeBut;}
	public JButton getFourButton() {return fourBut;}
	public JButton getFiveButton() {return fiveBut;}
	public JButton getSixButton() {return sixBut;}
	public JButton getSevenButton() {return sevenBut;}
	public JButton getEightButton() {return eightBut;}
	public JButton getNineButton() {return nineBut;}
	//Functions
	public JButton getLshButton() {return lshBut;}
	public JButton getRshButton() {return rshBut;}
	public JButton getOrButton() {return orBut;}
	public JButton getXorButton() {return xorBut;}
	public JButton getNorButton() {return norBut;}
	public JButton getAndButton() {return andBut;}
	public JButton getModButton() {return modBut;}
	public JButton getUpButton() {return upBut;}
	public JButton getCeButton() {return ceBut;}
	public JButton getClrButton() {return clrBut;}
	public JButton getDelButton() {return delBut;}
	//Characters
	public JButton getAButton() {return aBut;}
	public JButton getBButton() {return bBut;}
	public JButton getCButton() {return cBut;}
	public JButton getDButton() {return dBut;}
	public JButton getEButton() {return eBut;}
	public JButton getFButton() {return fBut;}
	public JButton getLeftPButton() {return leftPBut;}
	public JButton getRightPButton() {return rightPBut;}
	public JButton getNegButton() {return negBut;}
	
}
class numPanel extends JPanel{
	public JLabel hexLabel, decLabel, octLabel, binLabel;
	public JLabel hexValue, decValue, octValue, binValue;
	
	public numPanel() {
		hexLabel = new JLabel("HEX");
		hexValue = new JLabel("0");
		decLabel = new JLabel("DEC");
		decValue = new JLabel("0");
		octLabel = new JLabel("OCT");
		octValue = new JLabel("0");
		binLabel = new JLabel("BIN");
		binValue = new JLabel("0");
		
		GridLayout numGL = new GridLayout(6,2,5,5);
		setLayout(numGL);
		
		add(hexLabel);
		add(hexValue);
		add(decLabel);
		add(decValue);
		add(octLabel);
		add(octValue);
		add(binLabel);
		add(binValue);
	}
}
class inputPanel extends JPanel{
	public JLabel inputLabel;
	public JLabel ansLabel;
	
	public inputPanel() {
		//Input label for the raw input
		inputLabel = new JLabel("1 * (2 * 3)", SwingConstants.RIGHT);
		Font font = new Font("TimesRoman",Font.BOLD,25);
		inputLabel.setForeground(Color.GRAY);
		inputLabel.setFont(font);
		
		//Answer label for the solution
		ansLabel = new JLabel("6", SwingConstants.RIGHT);
		ansLabel.setFont(font);
		
		GridLayout iGL = new GridLayout(2,1,20,5);
		setLayout(iGL);
		
		add(inputLabel);
		add(ansLabel);
	}
	public JLabel getInputButton() {return inputLabel;}
	public JLabel getAnswerButton() {return ansLabel;}

}

