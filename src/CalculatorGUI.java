package personal_Calculator;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class CalculatorGUI extends JFrame {
	
	public static Label inputDisplay = new Label(CalculatorDriver.input);
	public static Label outputDisplay = new Label(CalculatorDriver.output);
	
	CalculatorGUI() {
		
		//create frame and panel
		JFrame frame = new JFrame();
		JPanel buttonPanel = new JPanel();
		JPanel displayPanel = new JPanel();
			frame.setSize(500, 700);
			buttonPanel.setSize(500, 400); //for buttons
			displayPanel.setSize(500,300); //display text entries
		
			
			
		//Text entry
			displayPanel.setLayout(new GridLayout(2,1));
			
			displayPanel.add(outputDisplay);
			
			displayPanel.add(inputDisplay);
			
			
		//buttons
		buttonPanel.setLayout(new GridLayout(6,4));	
			CalculatorButton buttonZero = new CalculatorButton("0");
			CalculatorButton buttonOne = new CalculatorButton("1");
			CalculatorButton buttonTwo = new CalculatorButton("2");
			CalculatorButton buttonThree = new CalculatorButton("3");
			CalculatorButton buttonFour = new CalculatorButton("4");
			CalculatorButton buttonFive = new CalculatorButton("5");
			CalculatorButton buttonSix = new CalculatorButton("6");
			CalculatorButton buttonSeven = new CalculatorButton("7");
			CalculatorButton buttonEight = new CalculatorButton("8");
			CalculatorButton buttonNine = new CalculatorButton("9");
			CalculatorButton buttonDot = new CalculatorButton(".");
			CalculatorButton buttonSign = new CalculatorButton("+/-", "sign");
			
			CalculatorButton buttonPlus = new CalculatorButton("+");
			CalculatorButton buttonMinus = new CalculatorButton("-");
			CalculatorButton buttonMultiply = new CalculatorButton("x");
			CalculatorButton buttonDivide = new CalculatorButton("÷");
			CalculatorButton buttonEqual = new CalculatorButton("=");
			
			CalculatorButton buttonC = new CalculatorButton("C");
			CalculatorButton buttonDEL = new CalculatorButton("DEL");
			CalculatorButton buttonExp = new CalculatorButton("x^y", "^");
			
			CalculatorButton buttonBracketOpen = new CalculatorButton("(");
			CalculatorButton buttonBracketClose = new CalculatorButton(")");
			CalculatorButton buttonFrac = new CalculatorButton("x/y", "/");
			//CalculatorButton buttonPi = new CalculatorButton("\u03C0");
			CalculatorButton buttonPi = new CalculatorButton("");
			
			/*
			 * c c / pi
			 * ( ) 2 /
			 * 7 8 9 x
			 * 4 5 6 -
			 * 1 2 3 +
			 * s 0 . =
			 */
			 buttonPanel.add(buttonC);  
			 buttonPanel.add(buttonDEL);
			 buttonPanel.add(buttonFrac);
			 buttonPanel.add(buttonPi);
			 
			 buttonPanel.add(buttonBracketOpen);
			 buttonPanel.add(buttonBracketClose);
			 buttonPanel.add(buttonExp);
			 buttonPanel.add(buttonDivide);
			
			 buttonPanel.add(buttonSeven);
			 buttonPanel.add(buttonEight);
			 buttonPanel.add(buttonNine);
			 buttonPanel.add(buttonMultiply);
			 
			 buttonPanel.add(buttonFour);
			 buttonPanel.add(buttonFive);
			 buttonPanel.add(buttonSix);
			 buttonPanel.add(buttonMinus);
			 			
			 buttonPanel.add(buttonOne);
			 buttonPanel.add(buttonTwo);
			 buttonPanel.add(buttonThree);
			 buttonPanel.add(buttonPlus);
			 			
			 buttonPanel.add(buttonSign); 
			 buttonPanel.add(buttonZero);
			 buttonPanel.add(buttonDot);
			 buttonPanel.add(buttonEqual);
			 
			 
			
		
		frame.add(displayPanel, BorderLayout.NORTH); //want screen on top
		frame.add(buttonPanel, BorderLayout.CENTER); //want button below screen
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Calculator");
		frame.pack();
		frame.setVisible(true);
		
		
	}

}
