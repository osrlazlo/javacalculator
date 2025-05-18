package personal_Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class CalculatorButton extends JButton implements ActionListener {

	public String buttonLabel;
	public String value;
	
	public CalculatorButton(String button) {
		super(button);
		buttonLabel = button;
		this.addActionListener(this);
	}
	
	public CalculatorButton(String button, String value) {
		super(button);
		buttonLabel = value;
		this.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		buttonPress();
		
	}
	
	/*
	 * must use other method to send label when button pressed
	 * bc string return type incompatible with action listener
	 */
	private void buttonPress() {
		//System.out.println(buttonLabel);
		CalculatorDriver.buttonPress(buttonLabel);
	}
}
