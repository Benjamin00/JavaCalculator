import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.script.*;

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
	private int temp;
	private String result = "";
	private int isFirstInt = 1;
	private String datatype = "DEC";
	
	public cFrame() {
		bPanel = new buttonPanel();
		nPanel = new numPanel();
		iPanel = new inputPanel();
		
		add(nPanel, BorderLayout.WEST);
		add(bPanel, BorderLayout.SOUTH);
		add(iPanel, BorderLayout.NORTH);
		
		//Numbers
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
		bPanel.getAButton().addActionListener(this);
		bPanel.getBButton().addActionListener(this);
		bPanel.getCButton().addActionListener(this);
		bPanel.getDButton().addActionListener(this);
		bPanel.getEButton().addActionListener(this);
		bPanel.getFButton().addActionListener(this);
		
		//4 Function
		bPanel.getAddButton().addActionListener(this);
		bPanel.getSubButton().addActionListener(this);
		bPanel.getMultButton().addActionListener(this);
		bPanel.getDivButton().addActionListener(this);
		bPanel.getEqualsButton().addActionListener(this);
		
		//Utility
		bPanel.getClrButton().addActionListener(this);
		bPanel.getCeButton().addActionListener(this);
		bPanel.getNegButton().addActionListener(this);
		bPanel.getModButton().addActionListener(this);
		bPanel.getLeftPButton().addActionListener(this);
		bPanel.getRightPButton().addActionListener(this);
		
		//Conversion
		nPanel.getHexButton().addActionListener(this);
		nPanel.getDecButton().addActionListener(this);
		nPanel.getOctButton().addActionListener(this);
		nPanel.getBinButton().addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		//Number Buttons
		if (e.getSource() == bPanel.getZeroButton())
		{
			if (isFirstInt == 1)
			{
				iPanel.newInput("");
				isFirstInt = 0;
			}
			iPanel.input("0");
		}
		if (e.getSource() == bPanel.getOneButton())
		{
			if (isFirstInt == 1)
			{
				iPanel.newInput("");
				isFirstInt = 0;
			}
			iPanel.input("1");
		}
		if (e.getSource() == bPanel.getTwoButton())
		{
			if (isFirstInt == 1)
			{
				iPanel.newInput("");
				isFirstInt = 0;
			}
			iPanel.input("2");
		}
		if (e.getSource() == bPanel.getThreeButton())
		{
			if (isFirstInt == 1)
			{
				iPanel.newInput("");
				isFirstInt = 0;
			}
			iPanel.input("3");
		}
		if (e.getSource() == bPanel.getFourButton())
		{
			if (isFirstInt == 1)
			{
				iPanel.newInput("");
				isFirstInt = 0;
			}
			iPanel.input("4");
		}
		if (e.getSource() == bPanel.getFiveButton())
		{
			if (isFirstInt == 1)
			{
				iPanel.newInput("");
				isFirstInt = 0;
			}
			iPanel.input("5");
		}
		if (e.getSource() == bPanel.getSixButton())
		{
			if (isFirstInt == 1)
			{
				iPanel.newInput("");
				isFirstInt = 0;
			}
			iPanel.input("6");
		}
		if (e.getSource() == bPanel.getSevenButton())
		{
			if (isFirstInt == 1)
			{
				iPanel.newInput("");
				isFirstInt = 0;
			}
			iPanel.input("7");
		}
		if (e.getSource() == bPanel.getEightButton())
		{
			if (isFirstInt == 1)
			{
				iPanel.newInput("");
				isFirstInt = 0;
			}
			iPanel.input("8");
		}
		if (e.getSource() == bPanel.getNineButton())
		{
			if (isFirstInt == 1)
			{
				iPanel.newInput("");
				isFirstInt = 0;
			}
			iPanel.input("9");
		}
		if (e.getSource() == bPanel.getAButton())
		{
			if (isFirstInt == 1)
			{
				iPanel.newInput("");
				isFirstInt = 0;
			}
			iPanel.input("A");
		}
		if (e.getSource() == bPanel.getBButton())
		{
			if (isFirstInt == 1)
			{
				iPanel.newInput("");
				isFirstInt = 0;
			}
			iPanel.input("B");
		}
		if (e.getSource() == bPanel.getCButton())
		{
			if (isFirstInt == 1)
			{
				iPanel.newInput("");
				isFirstInt = 0;
			}
			iPanel.input("C");
		}
		if (e.getSource() == bPanel.getDButton())
		{
			if (isFirstInt == 1)
			{
				iPanel.newInput("");
				isFirstInt = 0;
			}
			iPanel.input("D");
		}
		if (e.getSource() == bPanel.getEButton())
		{
			if (isFirstInt == 1)
			{
				iPanel.newInput("");
				isFirstInt = 0;
			}
			iPanel.input("E");
		}
		if (e.getSource() == bPanel.getFButton())
		{
			if (isFirstInt == 1)
			{
				iPanel.newInput("");
				isFirstInt = 0;
			}
			iPanel.input("F");
		}
		
		//4 Function Calc Buttons
		if (e.getSource() == bPanel.getAddButton())
		{
			if(datatype == "HEX") {
				calculate("add",16);
			}
			if(datatype == "DEC") {
				calculate("add",10);
			}
			if(datatype == "OCT") {
				calculate("add",8);
			}
			if(datatype == "BIN") {
				calculate("add",2);
			}
		}
		if (e.getSource() == bPanel.getSubButton())
		{
			if(datatype == "HEX") {
				calculate("sub",16);
			}
			if(datatype == "DEC") {
				calculate("sub",10);
			}
			if(datatype == "OCT") {
				calculate("sub",8);
			}
			if(datatype == "BIN") {
				calculate("sub",2);
			}
		}
		if (e.getSource() == bPanel.getMultButton())
		{
			if(datatype == "HEX") {
				calculate("mult",16);
			}
			if(datatype == "DEC") {
				calculate("mult",10);
			}
			if(datatype == "OCT") {
				calculate("mult",8);
			}
			if(datatype == "BIN") {
				calculate("mult",2);
			}
			
		}
		if (e.getSource() == bPanel.getDivButton())
		{
			if(datatype == "HEX") {
				calculate("div",16);
			}
			if(datatype == "DEC") {
				calculate("div",10);
			}
			if(datatype == "OCT") {
				calculate("div",8);
			}
			if(datatype == "BIN") {
				calculate("div",2);
			}
		}
		if (e.getSource() == bPanel.getEqualsButton())
		{
			calcEquals(datatype);
			function = "";
			iPanel.newTotalInput(" ");
			isFirstInt = 1;
		}
		
		//Aux Buttons
		if (e.getSource() == bPanel.getClrButton()) 
		{
			iPanel.newInput("0");
			temp = 0;
			function = "";
			iPanel.newTotalInput(" ");
			result = "";
			isFirstInt = 1;
		}
		if (e.getSource() == bPanel.getCeButton())
		{
			iPanel.newInput("0");
			isFirstInt = 1;
		}
		if (e.getSource() == bPanel.getNegButton())
		{
			String temp2 = iPanel.getAnswerButton().getText();
			if (temp2.charAt(0) == '-')
			{
				iPanel.newInput(temp2.substring(1));
			}
			else {
				System.out.print("First char: " + String.valueOf(temp2.charAt(0)));
				iPanel.newInput("-" + temp2);
			}
		}
		if (e.getSource() == bPanel.getModButton())
		{
			int temp2 = Integer.parseInt(iPanel.getAnswerButton().getText());
			if (!function.equals(""))
			{
				calcEquals(datatype);
			}
			temp = Integer.parseInt(iPanel.getAnswerButton().getText());
			function = "mod";
			iPanel.newInput(result);
			iPanel.totalInput(temp2 + " mod ");
			isFirstInt = 1;
		}
		if (e.getSource() == bPanel.getLeftPButton()){
			if (isFirstInt == 1)
			{
				iPanel.newInput("");
				isFirstInt = 0;
			}
			iPanel.totalInput("(");
		}
		if (e.getSource() == bPanel.getRightPButton()){
			iPanel.totalInput(iPanel.getAnswerButton().getText());
			isFirstInt = 0;
			iPanel.newInput(result);
			iPanel.totalInput(")");
		}
		
		//Conversion Buttons
		if (e.getSource() == nPanel.getHexButton()) {
			nPanel.setHexActive();
			String newVal = "";
			if(iPanel.getAnswerButton().getText() == "") {
				
			}
			else if(datatype == "DEC") {
				newVal = Integer.toHexString(Integer.parseInt(iPanel.getAnswerButton().getText()));
			}
			else if(datatype == "OCT") {
				int decnum = Integer.parseInt(iPanel.getAnswerButton().getText(), 8);
				newVal = Integer.toHexString(decnum);
			}
			else if(datatype == "BIN") {
				int binnum = Integer.parseInt(iPanel.getAnswerButton().getText(), 2);
				newVal = Integer.toHexString(binnum);
			}
			else if(datatype == "HEX") {
				newVal = iPanel.getAnswerButton().getText();
			}
			else {
				System.out.print("Something went wrong in the getHexButton function");
			}
			//hex = hex.substring(2);
			//nPanel.
			bPanel.setHexButtons();
			newVal = newVal.toUpperCase();
			System.out.print("Datatype before: " + datatype);
			setDataType("HEX");
			System.out.print("Datatype after: " + datatype);
			iPanel.newInput(newVal);
		}
		if (e.getSource() == nPanel.getDecButton()) {
			nPanel.setDecActive();
			String newVal = "";
			if(iPanel.getAnswerButton().getText() == "") {
				
			}
			else if(datatype == "DEC") {
				newVal = iPanel.getAnswerButton().getText();
			}
			else if(datatype == "OCT") {
				int decnum = Integer.parseInt(iPanel.getAnswerButton().getText(), 8);
				newVal = Integer.toString(decnum);
			}
			else if(datatype == "BIN") {
				int binnum = Integer.parseInt(iPanel.getAnswerButton().getText(), 2);
				newVal = Integer.toString(binnum);
			}
			else if(datatype == "HEX") {
				System.out.println("Datatype in hex: " + datatype);
				int hexnum = (int)Long.parseLong(iPanel.getAnswerButton().getText(), 16);
				newVal = Integer.toString(hexnum);
			}
			else {
				System.out.println("Something went wrong in the getHexButton function");
			}
			bPanel.setDecButtons();
			System.out.println("Datatype before: " + datatype);
			setDataType("DEC");
			System.out.println("Datatype after: " + datatype);
			iPanel.newInput(newVal);
		}
		if (e.getSource() == nPanel.getOctButton()) {
			nPanel.setOctActive();
			nPanel.getOctLabel().setBackground(Color.BLUE);
			String newVal = "";
			if(iPanel.getAnswerButton().getText() == "") {
				
			}
			else if(datatype == "DEC") {
				newVal = Integer.toOctalString(Integer.parseInt(iPanel.getAnswerButton().getText()));
			}
			else if(datatype == "OCT") {
				newVal = iPanel.getAnswerButton().getText();
			}
			else if(datatype == "BIN") {
				int binnum = Integer.parseInt(iPanel.getAnswerButton().getText(), 2);
				newVal = Integer.toOctalString(binnum);
			}
			else if(datatype == "HEX") {
				int hexnum = Integer.parseInt(iPanel.getAnswerButton().getText(), 16);
				newVal = Integer.toOctalString(hexnum);
			}
			else {
				System.out.print("Something went wrong in the getHexButton function");
			}
			
			//hex = hex.substring(2);
			//nPanel.
			bPanel.setOctButtons();
			System.out.print("Datatype before: " + datatype);
			newVal.toUpperCase();
			setDataType("OCT");
			System.out.print("Datatype after: " + datatype);
			iPanel.newInput(newVal);
			
		}
		if (e.getSource() == nPanel.getBinButton()) {
			nPanel.setBinActive();
			String newVal = "";
			
			if(iPanel.getAnswerButton().getText() == "") {
				
			}
			else if(datatype == "DEC") {
				newVal = Integer.toBinaryString(Integer.parseInt(iPanel.getAnswerButton().getText()));
			}
			else if(datatype == "OCT") {
				int decnum = Integer.parseInt(iPanel.getAnswerButton().getText(), 8);
				newVal = Integer.toBinaryString(decnum);
			}
			else if(datatype == "BIN") {
				newVal = iPanel.getAnswerButton().getText();
			}
			else if(datatype == "HEX") {
				int hexnum = Integer.parseInt(iPanel.getAnswerButton().getText(), 16);
				newVal = Integer.toBinaryString(hexnum);
			}
			else {
				System.out.print("Something went wrong in the getHexButton function");
			}
			
			//hex = hex.substring(2);
			//nPanel.
			bPanel.setBinaryButtons();
			
			setDataType("BIN");
			
			iPanel.newInput(newVal);
		}
		updateLabels();
		System.out.println("Evaluation so far" + iPanel.getInputButton().getText()+iPanel.getAnswerButton().getText());
		
	}
	public int parseString(String input) {
		System.out.print("Inside Parse String");
		input.replace('x', '*');
		input.trim();
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		Object result = "";
		try {
			result = engine.eval(input);
		} catch (ScriptException e) {
			e.printStackTrace();
		}
		return (int) result;
	}
	public void updateLabels() {
		Boolean neg = false;
		if (iPanel.getAnswerButton().getText().length() < 0)
			if (iPanel.getAnswerButton().getText().charAt(0) == '-')
			{
				neg = true;
				if (iPanel.getAnswerButton().getText().length() < 1)
					iPanel.getAnswerButton().setText(iPanel.getAnswerButton().getText().substring(1));
			}
		if(datatype == "HEX") {
			if(iPanel.getAnswerButton().getText() == "") {
				nPanel.hexValue.setText("0");
				nPanel.decValue.setText("0");
				nPanel.octValue.setText("0");
				nPanel.binValue.setText("0");
			}
			else {
			int hexnum = Integer.parseInt(iPanel.getAnswerButton().getText(), 16);
			nPanel.hexValue.setText(Integer.toHexString(hexnum));
			nPanel.decValue.setText(Integer.toString(hexnum));
			nPanel.octValue.setText(Integer.toOctalString(hexnum));
			nPanel.binValue.setText(Integer.toBinaryString(hexnum));
			}
		}
		if(datatype == "DEC") {
			if(iPanel.getAnswerButton().getText() == "") {
				nPanel.hexValue.setText("0");
				nPanel.decValue.setText("0");
				nPanel.octValue.setText("0");
				nPanel.binValue.setText("0");
			}
			else {
			int decnum = Integer.parseInt(iPanel.getAnswerButton().getText(), 10);
			nPanel.hexValue.setText(Integer.toHexString(decnum));
			nPanel.decValue.setText(Integer.toString(decnum));
			nPanel.octValue.setText(Integer.toOctalString(decnum));
			nPanel.binValue.setText(Integer.toBinaryString(decnum));
			}
		}
		if(datatype == "OCT") {
			if(iPanel.getAnswerButton().getText() == "") {
				nPanel.hexValue.setText("0");
				nPanel.decValue.setText("0");
				nPanel.octValue.setText("0");
				nPanel.binValue.setText("0");
			}
			else {
			int octnum = Integer.parseInt(iPanel.getAnswerButton().getText(), 8);
			nPanel.hexValue.setText(Integer.toHexString(octnum));
			nPanel.decValue.setText(Integer.toString(octnum));
			nPanel.octValue.setText(Integer.toOctalString(octnum));
			nPanel.binValue.setText(Integer.toBinaryString(octnum));
			}
		}
		if(datatype == "BIN") {
			if(iPanel.getAnswerButton().getText() == "") {
				nPanel.hexValue.setText("0");
				nPanel.decValue.setText("0");
				nPanel.octValue.setText("0");
				nPanel.binValue.setText("0");
			}
			else {
			int binnum = Integer.parseInt(iPanel.getAnswerButton().getText(), 2);
			nPanel.hexValue.setText(Integer.toHexString(binnum));
			nPanel.decValue.setText(Integer.toString(binnum));
			nPanel.octValue.setText(Integer.toOctalString(binnum));
			nPanel.binValue.setText(Integer.toBinaryString(binnum));
			}
		}
		if (neg == true)
		{
			nPanel.hexValue.setText("-" + nPanel.hexValue.getText());
			nPanel.decValue.setText("-" + nPanel.decValue.getText());
			nPanel.octValue.setText("-" + nPanel.octValue.getText());
			nPanel.binValue.setText("-" + nPanel.binValue.getText());
			iPanel.getAnswerButton().setText(iPanel.getAnswerButton().getText());
		}
	}
	public void setDataType(String type) {
		datatype = type;
	}
	public void calculate(String func, int base) {
		int temp2 = 0;
		if(func == "add") {
			if (!iPanel.getAnswerButton().getText().equals(""))
				temp2 = Integer.parseInt(iPanel.getAnswerButton().getText(),base);
			if (!function.equals(""))
			{
				calcEquals(datatype);
			}
			if (!iPanel.getAnswerButton().getText().equals(""))
				temp = Integer.parseInt(iPanel.getAnswerButton().getText(),base);
			function = "add";
			iPanel.newInput(result);
			if (temp2 == 0)
			{
				iPanel.totalInput(" + ");
			}
			else
			{
				iPanel.totalInput(temp2 + " + ");
			}
			isFirstInt = 1;
		}
		else if(func == "div") {
			if (!iPanel.getAnswerButton().getText().equals(""))
				temp2 = Integer.parseInt(iPanel.getAnswerButton().getText(),base);
			if (!function.equals(""))
			{
				calcEquals(datatype);
			}
			if (!iPanel.getAnswerButton().getText().equals(""))
				temp = Integer.parseInt(iPanel.getAnswerButton().getText(),base);
			function = "div";
			iPanel.newInput(result);
			System.out.println("THIS IS " + iPanel.getInputButton().getText().charAt(iPanel.getInputButton().getText().length() - 1));
			if (temp2 == 0 || iPanel.getInputButton().getText().charAt(iPanel.getInputButton().getText().length() - 1) == ')')
			{
				iPanel.totalInput(" ÷ ");
			}
			else
			{
				iPanel.totalInput(temp2 + " ÷ ");
			}
			isFirstInt = 1;
		}
		else if(func == "sub") {
			if (!iPanel.getAnswerButton().getText().equals(""))
				temp2 = Integer.parseInt(iPanel.getAnswerButton().getText(),base);
			if (!function.equals(""))
			{
				calcEquals(datatype);
			}
			if (!iPanel.getAnswerButton().getText().equals(""))
				temp = Integer.parseInt(iPanel.getAnswerButton().getText(),base);
			function = "sub";
			iPanel.newInput(result);
			if (temp2 == 0)
			{
				iPanel.totalInput(" - ");
			}
			else
			{
				iPanel.totalInput(temp2 + " - ");
			}
			isFirstInt = 1;
		}
		else if(func == "mult") {
			if (!iPanel.getAnswerButton().getText().equals(""))
				temp2 = Integer.parseInt(iPanel.getAnswerButton().getText(),base);
			if (!function.equals(""))
			{
				calcEquals(datatype);
			}
			if (!iPanel.getAnswerButton().getText().equals(""))
				temp = Integer.parseInt(iPanel.getAnswerButton().getText(),base);
			function = "mult";
			iPanel.newInput(result);
			if (temp2 == 0)
			{
				iPanel.totalInput(" x ");
			}
			else
			{
				iPanel.totalInput(temp2 + " x ");
			}
			isFirstInt = 1;
		}
	}
	
	public void calcEquals(String type)
	{
		int temp2 = 0;
		if(type == "HEX") {
			if (function.equals("add"))
			{
				if (!iPanel.getAnswerButton().getText().equals(""))
					temp2 = Integer.parseInt(iPanel.getAnswerButton().getText(),16) + temp;
				result = Integer.toHexString(temp2);
				iPanel.newInput(result);
			}
			if (function.equals("sub"))
			{
				if (!iPanel.getAnswerButton().getText().equals(""))
					temp2 = temp - Integer.parseInt(iPanel.getAnswerButton().getText(),16);
				result = Integer.toHexString(temp2);
				iPanel.newInput(result);
			}
			if (function.equals("mult"))
			{
				if (!iPanel.getAnswerButton().getText().equals(""))
					temp2 = Integer.parseInt(iPanel.getAnswerButton().getText(),16) * temp;
				result = Integer.toHexString(temp2);
				iPanel.newInput(result);
			}
			if (function.equals("div"))
			{
				if (!iPanel.getAnswerButton().getText().equals(""))
					temp2 = temp / Integer.parseInt(iPanel.getAnswerButton().getText(),16);
				result = Integer.toHexString(temp2);
				iPanel.newInput(result);
			}
			if (function.equals("mod"))
			{
				if (!iPanel.getAnswerButton().getText().equals(""))
					temp2 = temp % Integer.parseInt(iPanel.getAnswerButton().getText(),16);
				result = Integer.toHexString(temp2);
				iPanel.newInput(result);
			}
		}
		if(type == "DEC") {
			if (function.equals("add"))
			{
				if (!iPanel.getAnswerButton().getText().equals(""))
					temp2 = Integer.parseInt(iPanel.getAnswerButton().getText()) + temp;
				result = Integer.toString(temp2);
				iPanel.newInput(result);
			}
			if (function.equals("sub"))
			{
				if (!iPanel.getAnswerButton().getText().equals(""))
					temp2 = temp - Integer.parseInt(iPanel.getAnswerButton().getText());
				result = Integer.toString(temp2);
				iPanel.newInput(result);
			}
			if (function.equals("mult"))
			{
				if (!iPanel.getAnswerButton().getText().equals(""))
					temp2 = Integer.parseInt(iPanel.getAnswerButton().getText()) * temp;
				result = Integer.toString(temp2);
				iPanel.newInput(result);
			}
			if (function.equals("div"))
			{
				if (!iPanel.getAnswerButton().getText().equals(""))
					temp2 = temp / Integer.parseInt(iPanel.getAnswerButton().getText());
				result = Integer.toString(temp2);
				iPanel.newInput(result);
			}
			if (function.equals("mod"))
			{
				if (!iPanel.getAnswerButton().getText().equals(""))
					temp2 = temp % Integer.parseInt(iPanel.getAnswerButton().getText());
				result = Integer.toHexString(temp2);
				iPanel.newInput(result);
			}
		}
		if(type == "OCT") {
			if (function.equals("add"))
			{
				if (!iPanel.getAnswerButton().getText().equals(""))
					temp2 = Integer.parseInt(iPanel.getAnswerButton().getText(),8) + temp;
				result = Integer.toOctalString(temp2);
				iPanel.newInput(result);
			}
			if (function.equals("sub"))
			{
				if (!iPanel.getAnswerButton().getText().equals(""))
					temp2 = temp - Integer.parseInt(iPanel.getAnswerButton().getText(),8);
				result = Integer.toOctalString(temp2);
				iPanel.newInput(result);
			}
			if (function.equals("mult"))
			{
				if (!iPanel.getAnswerButton().getText().equals(""))
					temp2 = Integer.parseInt(iPanel.getAnswerButton().getText(),8) * temp;
				result = Integer.toOctalString(temp2);
				iPanel.newInput(result);
			}
			if (function.equals("div"))
			{
				if (!iPanel.getAnswerButton().getText().equals(""))
					temp2 = temp / Integer.parseInt(iPanel.getAnswerButton().getText(),8);
				result = Integer.toOctalString(temp2);
				iPanel.newInput(result);
			}
			if (function.equals("mod"))
			{
				if (!iPanel.getAnswerButton().getText().equals(""))
					temp2 = temp % Integer.parseInt(iPanel.getAnswerButton().getText(),8);
				result = Integer.toHexString(temp2);
				iPanel.newInput(result);
			}
		}
		if(type == "BIN") {
			if (function.equals("add"))
			{
				if (!iPanel.getAnswerButton().getText().equals(""))
					temp2 = Integer.parseInt(iPanel.getAnswerButton().getText(),2) + temp;
				result = Integer.toBinaryString(temp2);
				iPanel.newInput(result);
			}
			if (function.equals("sub"))
			{
				if (!iPanel.getAnswerButton().getText().equals(""))
					temp2 = temp - Integer.parseInt(iPanel.getAnswerButton().getText(),2);
				result = Integer.toBinaryString(temp2);
				iPanel.newInput(result);
			}
			if (function.equals("mult"))
			{
				if (!iPanel.getAnswerButton().getText().equals(""))
					temp2 = Integer.parseInt(iPanel.getAnswerButton().getText(),2) * temp;
				result = Integer.toBinaryString(temp2);
				iPanel.newInput(result);
			}
			if (function.equals("div"))
			{
				if (!iPanel.getAnswerButton().getText().equals(""))
					temp2 = temp / Integer.parseInt(iPanel.getAnswerButton().getText(),2);
				result = Integer.toBinaryString(temp2);
				iPanel.newInput(result);
			}
			if (function.equals("mod"))
			{
				if (!iPanel.getAnswerButton().getText().equals(""))
					temp2 = temp % Integer.parseInt(iPanel.getAnswerButton().getText(),2);
				result = Integer.toHexString(temp2);
				iPanel.newInput(result);
			}
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
		delBut = new JButton("<");
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
		for(int i = 0; i<7;i++) {
			buttons[i].setEnabled(false);
		}
		setDecButtons();
		dotBut.setEnabled(false);
		for(JButton i:buttons) {
			add(i);			
		}
	}
	public void disableAllNumButtons() {
		JButton[] dbuttons = new JButton[] {
				aBut, bBut, sevenBut, eightBut, nineBut,
				cBut, dBut, fourBut, fiveBut, sixBut, 
				eBut, fBut, oneBut, twoBut, threeBut, 
				zeroBut};
		for(JButton i:dbuttons) {
			i.setEnabled(false);
		}
	}
	public void setBinaryButtons() {
		disableAllNumButtons();
		oneBut.setEnabled(true);
		zeroBut.setEnabled(true);
	}
	public void setHexButtons() {
		disableAllNumButtons();
		JButton[] hexbuttons = new JButton[] {
				aBut, bBut, sevenBut, eightBut, nineBut, 
				cBut, dBut, fourBut, fiveBut, sixBut,
				eBut, fBut, oneBut, twoBut, threeBut, 
				zeroBut};
		for(JButton i:hexbuttons) {
			i.setEnabled(true);
		}
	}
	public void setOctButtons() {
		disableAllNumButtons();
		JButton[] octbuttons = new JButton[] {
				sevenBut,  
				fourBut, fiveBut, sixBut, 
				oneBut, twoBut, threeBut, 
				zeroBut};
		for(JButton i:octbuttons) {
			i.setEnabled(true);
		}
	}
	public void setDecButtons() {
		disableAllNumButtons();
		JButton[] hexbuttons = new JButton[] {
				sevenBut, eightBut, nineBut, 
				fourBut, fiveBut, sixBut,
				oneBut, twoBut, threeBut, 
				zeroBut};
		for(JButton i:hexbuttons) {
			i.setEnabled(true);
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
	public JButton hexButton, decButton, octButton, binButton;
	public JLabel hexValue, decValue, octValue, binValue;
	
	public numPanel() {
		hexButton = new JButton("HEX");
		hexValue = new JLabel("0");
		decButton = new JButton("DEC");
		decValue = new JLabel("0");
		octButton = new JButton("OCT");
		octValue = new JLabel("0");
		binButton = new JButton("BIN");
		binValue = new JLabel("0");
		
		GridLayout numGL = new GridLayout(6,2,5,5);
		setLayout(numGL);
		
		add(hexButton);
		add(hexValue);
		add(decButton);
		add(decValue);
		add(octButton);
		add(octValue);
		add(binButton);
		add(binValue);
	}
	public void setHexLabel(String s) {
		getHexButton().setText(s);
	}
	public void setDecLabel(String s) {
		getDecButton().setText(s);
	}
	public void setOctLabel(String s) {
		getOctButton().setText(s);
	}
	public void setBinLabel(String s) {
		getBinButton().setText(s);
	}
	public void setAllLabels(String value, String type) {
		if(type == "HEX") {
			setHexLabel(value);
		}
		else if(type == "DEC") {
			
		}
		else if(type == "OCT") {
		
		}
		else if(type == "BIN") {
			
		}
		else {
			System.out.println("Invalid type for label setting");
		}
	}
	public JLabel getHexLabel() {return hexValue;}
	public JLabel getDecLabel() {return decValue;}
	public JLabel getOctLabel() {return octValue;}
	public JLabel getBinLabel() {return binValue;}
	public JButton getHexButton() {return hexButton;}
	public JButton getDecButton() {return decButton;}
	public JButton getOctButton() {return octButton;}
	public JButton getBinButton() {return binButton;}
	public void setHexActive() {
		hexValue.setForeground(Color.BLUE);
		decValue.setForeground(null);
		octValue.setForeground(null);
		binValue.setForeground(null);
	}
	public void setDecActive() {
		hexValue.setForeground(null);
		decValue.setForeground(Color.BLUE);
		octValue.setForeground(null);
		binValue.setForeground(null);
	}
	public void setOctActive() {
		hexValue.setForeground(null);
		decValue.setForeground(null);
		octValue.setForeground(Color.BLUE);
		binValue.setForeground(null);
	}
	public void setBinActive() {
		hexValue.setForeground(null);
		decValue.setForeground(null);
		octValue.setForeground(null);
		binValue.setForeground(Color.BLUE);
	}
}
class inputPanel extends JPanel{
	public JLabel inputLabel;
	public JLabel ansLabel;
	
 	public inputPanel() {
		//Input label for the raw input
		inputLabel = new JLabel("  ", SwingConstants.RIGHT);
		Font font = new Font("TimesRoman",Font.BOLD,25);
		inputLabel.setForeground(Color.GRAY);
		inputLabel.setFont(font);
		
		//Answer label for the solution
		ansLabel = new JLabel("0", SwingConstants.RIGHT);
		ansLabel.setFont(font);
		
		GridLayout iGL = new GridLayout(2,1,20,5);
		setLayout(iGL);
		
		add(inputLabel);
		add(ansLabel);
	}
	public JLabel getInputButton() {return inputLabel;}
	public JLabel getAnswerButton() {return ansLabel;}
	
	public void input(String s)								//Adds to the answerLabel
	{
		String temp = getAnswerButton().getText();
		getAnswerButton().setText(temp + s);
	}
	public void newInput(String s)							//Replaces the answerLabel
	{
		getAnswerButton().setText(s);
	}
	public void totalInput(String s)						//Adds to the inputLabel
	{
		String temp = getInputButton().getText();
		getInputButton().setText(temp + s);
	}
	public void newTotalInput(String s)						//Replaces inputLabel
	{
		getInputButton().setText(s);
	}
}
