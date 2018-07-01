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
	
	private String function = "";
	private double temp;
	
	public cFrame() {
		bPanel = new buttonPanel();
		nPanel = new numPanel();
		iPanel = new inputPanel();
		
		add(nPanel, BorderLayout.WEST);
		add(bPanel, BorderLayout.SOUTH);
		add(iPanel, BorderLayout.NORTH);
		
		bPanel.getZeroButton().addActionListener(this);
		bPanel.getOneButton().addActionListener(this);
		bPanel.getTwoButton().addActionListener(this);
		bPanel.getThreeButton().addActionListener(this);
		bPanel.getFourButton().addActionListener(this);
		bPanel.getFiveButton().addActionListener(this);
		bPanel.getSixButton().addActionListener(this);
		bPanel.getSevenButton().addActionListener(this);
		bPanel.getEightButton().addActionListener(this);
		bPanel.getNineButton().addActionListener(this);
		
		bPanel.getAddButton().addActionListener(this);
		bPanel.getSubButton().addActionListener(this);
		bPanel.getMultButton().addActionListener(this);
		bPanel.getDivButton().addActionListener(this);
		bPanel.getEqualsButton().addActionListener(this);
		
		bPanel.getClrButton().addActionListener(this);

	}
	public void actionPerformed(ActionEvent e) {
		//Number Buttons
		if (e.getSource() == bPanel.getZeroButton())
		{
			iPanel.input("0");
		}
		if (e.getSource() == bPanel.getOneButton())
		{
			iPanel.input("1");
		}
		if (e.getSource() == bPanel.getTwoButton())
		{
			iPanel.input("2");
		}
		if (e.getSource() == bPanel.getThreeButton())
		{
			iPanel.input("3");
		}
		if (e.getSource() == bPanel.getFourButton())
		{
			iPanel.input("4");
		}
		if (e.getSource() == bPanel.getFiveButton())
		{
			iPanel.input("5");
		}
		if (e.getSource() == bPanel.getSixButton())
		{
			iPanel.input("6");
		}
		if (e.getSource() == bPanel.getSevenButton())
		{
			iPanel.input("7");
		}
		if (e.getSource() == bPanel.getEightButton())
		{
			iPanel.input("8");
		}
		if (e.getSource() == bPanel.getNineButton())
		{
			iPanel.input("9");
		}
		
		//4 Function Calc Buttons
		if (e.getSource() == bPanel.getAddButton())
		{
			temp = Double.parseDouble(iPanel.getAnswerButton().getText());
			function = "add";
			iPanel.newInput("");
		}
		if (e.getSource() == bPanel.getSubButton())
		{
			temp = Double.parseDouble(iPanel.getAnswerButton().getText());
			function = "sub";
			iPanel.newInput("");
		}
		if (e.getSource() == bPanel.getMultButton())
		{
			temp = Double.parseDouble(iPanel.getAnswerButton().getText());
			function = "mult";
			iPanel.newInput("");
		}
		if (e.getSource() == bPanel.getDivButton())
		{
			temp = Double.parseDouble(iPanel.getAnswerButton().getText());
			function = "div";
			iPanel.newInput("");
		}
		if (e.getSource() == bPanel.getEqualsButton())
		{
			if (function.equals("add"))
			{
				double temp2 = Double.parseDouble(iPanel.getAnswerButton().getText()) + temp;
				String result = String.valueOf(temp2);
				iPanel.newInput(result);
			}
			if (function.equals("sub"))
			{
				double temp2 = temp - Double.parseDouble(iPanel.getAnswerButton().getText());
				String result = String.valueOf(temp2);
				iPanel.newInput(result);
			}
			if (function.equals("mult"))
			{
				double temp2 = Double.parseDouble(iPanel.getAnswerButton().getText()) * temp;
				String result = String.valueOf(temp2);
				iPanel.newInput(result);
			}
			if (function.equals("div"))
			{
				double temp2 = temp / Double.parseDouble(iPanel.getAnswerButton().getText());
				String result = String.valueOf(temp2);
				iPanel.newInput(result);
			}
		}
		
		//Aux Buttons
		if (e.getSource() == bPanel.getClrButton()) 
		{
			iPanel.newInput("");
			temp = 0;
			function = "";
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
		inputLabel = new JLabel("", SwingConstants.RIGHT);
		Font font = new Font("TimesRoman",Font.BOLD,25);
		inputLabel.setForeground(Color.GRAY);
		inputLabel.setFont(font);
		
		//Answer label for the solution
		ansLabel = new JLabel("", SwingConstants.RIGHT);
		ansLabel.setFont(font);
		
		GridLayout iGL = new GridLayout(2,1,20,5);
		setLayout(iGL);
		
		add(inputLabel);
		add(ansLabel);
	}
	public JLabel getInputButton() {return inputLabel;}
	public JLabel getAnswerButton() {return ansLabel;}
	
	public void input(String s)
	{
		String temp = getAnswerButton().getText();
		getAnswerButton().setText(temp + s);
	}
	public void newInput(String s)
	{
		getAnswerButton().setText(s);
	}
}

