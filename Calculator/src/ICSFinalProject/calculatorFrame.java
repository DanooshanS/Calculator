package ICSFinalProject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

public class calculatorFrame extends JFrame {
	
	private boolean second = false;
	public double num1 = 0;
	public double num2 = 0;
	public double answer = 0;
	public int count = 0;
	public int operation = 0;
	
	private String nums = "Numbers Go Here.";
	
	private JLabel output;
	private JPanel inOut;
	private JButton Btn1;
	private JButton Btn2;
	private JButton Btn3;
	private JButton Btn4;
	private JButton Btn5;
	private JButton Btn6;
	private JButton Btn7;
	private JButton Btn8;
	private JButton Btn9;
	private JButton Btn0;
	private JButton BtnAdd;
	private JButton BtnSubtract;
	private JButton BtnMultiply;
	private JButton BtnDivide;
	private JButton BtnEquals;
	private JButton BtnRESET;
	
	GridBagConstraints GridBag = new GridBagConstraints();
	
	

	public calculatorFrame(){
		super ("Calculator");
		JFrame program = new JFrame("Calculator");
		setLayout(new GridBagLayout());
		
		output = new JLabel("Hello");
		
		output.setVisible(true);
		inOut = new JPanel();
		inOut.setPreferredSize(new Dimension(300, 60));
		inOut.setBackground(Color.WHITE);
		GridBag.fill = GridBagConstraints.HORIZONTAL;
		GridBag.gridx = 0;
		GridBag.gridy = 0;
		
		program.add(inOut);
		inOut.add(output);
		program.getContentPane().add(inOut);
		program.pack();
		add(inOut, GridBag);
		
		
		Btn1 = new JButton("1");
		GridBag.gridx = 75;
		GridBag.gridy = 60;
		add(Btn1, GridBag);
		Btn1.addActionListener(new ClickListener());
		
		Btn2 = new JButton("2");
		GridBag.gridx = 150;
		GridBag.gridy = 60;
		add(Btn2, GridBag);
		Btn2.addActionListener(new ClickListener());
		
		Btn3 = new JButton("3");
		GridBag.gridx = 225;
		GridBag.gridy = 60;
		add(Btn3, GridBag);
		Btn3.addActionListener(new ClickListener());
		
		Btn4 = new JButton("4");
		GridBag.gridx = 75;
		GridBag.gridy = 120;
		add(Btn4, GridBag);
		Btn4.addActionListener(new ClickListener());
		
		Btn5 = new JButton("5");
		GridBag.gridx = 150;
		GridBag.gridy = 120;
		add(Btn5, GridBag);
		Btn5.addActionListener(new ClickListener());
		
		Btn6 = new JButton("6");
		GridBag.gridx = 225;
		GridBag.gridy = 120;
		add(Btn6, GridBag);
		Btn6.addActionListener(new ClickListener());
		
		Btn7 = new JButton("7");
		GridBag.gridx = 75;
		GridBag.gridy = 180;
		add(Btn7, GridBag);
		Btn7.addActionListener(new ClickListener());
		
		Btn8 = new JButton("8");
		GridBag.gridx = 150; 
		GridBag.gridy = 180;
		add(Btn8, GridBag);
		Btn8.addActionListener(new ClickListener());
		
		Btn9 = new JButton("9");
		GridBag.gridx = 225;
		GridBag.gridy = 180;
		add(Btn9, GridBag);
		Btn9.addActionListener(new ClickListener());
		
		Btn0 = new JButton("0");
		GridBag.gridx = 75;
		GridBag.gridy = 240;
		add(Btn0, GridBag);
		Btn0.addActionListener(new ClickListener());
		
		BtnEquals = new JButton("=");
		GridBag.gridx = 225;
		GridBag.gridy = 240;
		add(BtnEquals, GridBag);
		BtnEquals.addActionListener(new ClickListener());
		
		BtnAdd = new JButton("+");
		GridBag.gridx = 0;
		GridBag.gridy = 60;
		add(BtnAdd, GridBag);
		BtnAdd.addActionListener(new ClickListener());
		
		BtnSubtract = new JButton("-");
		GridBag.gridx = 0;
		GridBag.gridy = 120;
		add(BtnSubtract, GridBag);
		BtnSubtract.addActionListener(new ClickListener());
		
		BtnMultiply = new JButton("*");
		GridBag.gridx = 0;
		GridBag.gridy = 180;
		add(BtnMultiply, GridBag);
		BtnMultiply.addActionListener(new ClickListener());
		
		BtnDivide = new JButton("/");
		GridBag.gridx = 0;
		GridBag.gridy = 240;
		add(BtnDivide, GridBag);
		BtnDivide.addActionListener(new ClickListener());
		
		BtnRESET = new JButton("RESET");
		GridBag.gridx = 150;
		GridBag.gridy = 240;
		add(BtnRESET, GridBag);
		BtnRESET.addActionListener(new ClickListener());
		
		
	}



	private class ClickListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			if (event.getSource() == Btn1){
				System.out.println("Button Clicked : 1");
				if (second == false){
					for (int i = 0;i < count; i++){
						num1 = num1*10;
					}
					num1 = num1 + 1;
					if (count != 1){
						count++;
					}
					output.setText(String.valueOf(num1));
				}
				if (second == true){
					for (int i = 0;i < count; i++){
						num2 = num2*10;
					}
					num2 = num2 + 1;
					if (count != 1){
						count++;
					}
					output.setText(String.valueOf(num2));
				}
			}
			else if (event.getSource() == Btn2){
				System.out.println("Button Clicked : 2");
				
				if (second == false){
					for (int i = 0;i < count; i++){
						num1 = num1*10;
					}
					num1 = num1 + 2;
					if (count != 1){
						count++;
					}
					output.setText(String.valueOf(num1));
				}
				if (second == true){
					for (int i = 0;i < count; i++){
						num2 = num2*10;
					}
					num2 = num2 + 2;
					if (count != 1){
						count++;
					}
					output.setText(String.valueOf(num2));
				}
			}
			else if (event.getSource() == Btn3){
				System.out.println("Button Clicked : 3");
				if (second == false){
					for (int i = 0;i < count; i++){
						num1 = num1*10;
					}
					num1 = num1 + 3;
					if (count != 1){
						count++;
					}
					output.setText(String.valueOf(num1));
				}
				if (second == true){
					for (int i = 0;i < count; i++){
						num2 = num2*10;
					}
					num2 = num2 + 3;
					if (count != 1){
						count++;
					}
					output.setText(String.valueOf(num2));
				}
			} 
			else if (event.getSource() == Btn4){
				System.out.println("Button Clicked : 4");
				if (second == false){
					for (int i = 0;i < count; i++){
						num1 = num1*10;
					}
					num1 = num1 + 4;
					if (count != 1){
						count++;
					}
					output.setText(String.valueOf(num1));
				}
				if (second == true){
					for (int i = 0;i < count; i++){
						num2 = num2*10;
					}
					num2 = num2 + 4;
					if (count != 1){
						count++;
					}
					output.setText(String.valueOf(num2));
				}
			}
			else if (event.getSource() == Btn5){
				System.out.println("Button Clicked : 5");
				if (second == false){
					for (int i = 0;i < count; i++){
						num1 = num1*10;
					}
					num1 = num1 + 5;
					if (count != 1){
						count++;
					}
					output.setText(String.valueOf(num1));
				}
				if (second == true){
					for (int i = 0;i < count; i++){
						num2 = num2*10;
					}
					num2 = num2 + 5;
					if (count != 1){
						count++;
					}
					output.setText(String.valueOf(num2));
				}
			}
			else if (event.getSource() == Btn6){
				System.out.println("Button Clicked : 6");
				if (second == false){
					for (int i = 0;i < count; i++){
						num1 = num1*10;
					}
					num1 = num1 + 6;
					if (count != 1){
						count++;
					}
					output.setText(String.valueOf(num1));
				}
				if (second == true){
					for (int i = 0;i < count; i++){
						num2 = num2*10;
					}
					num2 = num2 + 6;
					if (count != 1){
						count++;
					}
					output.setText(String.valueOf(num2));
				}
			}
			else if (event.getSource() == Btn7){
				System.out.println("Button Clicked : 7");
				if (second == false){
					for (int i = 0;i < count; i++){
						num1 = num1*10;
					}
					num1 = num1 + 7;
					if (count != 1){
						count++;
					}
					output.setText(String.valueOf(num1));
				}
				if (second == true){
					for (int i = 0;i < count; i++){
						num2 = num2*10;
					}
					num2 = num2 + 7;
					if (count != 1){
						count++;
					}
					output.setText(String.valueOf(num2));
				}
			}
			else if (event.getSource() == Btn8){
				System.out.println("Button Clicked : 8");
				if (second == false){
					for (int i = 0;i < count; i++){
						num1 = num1*10;
					}
					num1 = num1 + 8;
					if (count != 1){
						count++;
					}
					output.setText(String.valueOf(num1));
				}
				if (second == true){
					for (int i = 0;i < count; i++){
						num2 = num2*10;
					}
					num2 = num2 + 8;
					if (count != 1){
						count++;
					}
					output.setText(String.valueOf(num2));
				}
			}
			else if (event.getSource() == Btn9){
				System.out.println("Button Clicked : 9");
				if (second == false){
					for (int i = 0;i < count; i++){
						num1 = num1*10;
					}
					num1 = num1 + 9;
					if (count != 1){
						count++;
					}
					output.setText(String.valueOf(num1));
				}
				if (second == true){
					for (int i = 0;i < count; i++){
						num2 = num2*10;
					}
					num2 = num2 + 9;
					if (count != 1){
						count++;
					}
					output.setText(String.valueOf(num2));
				}
			}
			else if (event.getSource() == Btn0){
				System.out.println("Button Clicked : 0");
				if (second == false){
					for (int i = 0;i < count; i++){
						num1 = num1*10;
					}
					num1 = num1 + 0;
					if (count != 1){
						count++;
					}
					output.setText(String.valueOf(num1));
				}
				if (second == true){
					for (int i = 0;i < count; i++){
						num2 = num2*10;
					}
					num2 = num2 + 0;
					if (count != 1){
						count++;
					}
					output.setText(String.valueOf(num2));
				}
			}
			else if (event.getSource() == BtnRESET){
				num1 = 0;
				num2 = 0;
				count = 0;
				operation = 0;
				second = false;
				output.setText("");
				System.out.println("Button Clicked : RESET");
				
			}
			else if (event.getSource() == BtnAdd){
				System.out.println("Button Clicked : +");
				if (count != 0){
					count--;
				}
				operation = 1;
				second = true;
				output.setText("");
			}
			else if (event.getSource() == BtnSubtract){
				System.out.println("Button Clicked : -");
				if (count != 0){
					count--;
				}
				operation = 2;
				second = true;
				output.setText("");
			}
			else if (event.getSource() == BtnMultiply){
				System.out.println("Button Clicked : *");
				if (count != 0){
					count--;
				}
				operation = 3;
				second = true;
				output.setText("");
			}
			else if (event.getSource() == BtnDivide){
				System.out.println("Button Clicked : /");
				if (count != 0){
					count--;
				}
				operation = 4;
				second = true;
				output.setText("");
			}
			else if (event.getSource() == BtnEquals){
				System.out.println("Button Clicked : = ");
				System.out.println("The first number entered: "+ num1);
				System.out.println("The second number entered: " + num2);
				if (operation == 1){
					System.out.println("The answer is: " + calculatorOperation.Addition(num1, num2));
					num1 = calculatorOperation.Addition(num1, num2);
					num2 = 0;
					answer = calculatorOperation.Addition(num1, num2);
					output.setText(String.valueOf(answer));
				}
				if (operation == 2){
					System.out.println("The answer is: " + calculatorOperation.Subtraction(num1, num2));
					num1 = calculatorOperation.Subtraction(num1, num2);
					num2 = 0;
					answer = calculatorOperation.Subtraction(num1, num2);
					output.setText(String.valueOf(answer));
				}
				if (operation == 3){
					System.out.println("The answer is: " + calculatorOperation.Multiplication(num1, num2));
					num1 = calculatorOperation.Multiplication(num1, num2);
					num2 = 0;
					answer = calculatorOperation.Multiplication(num1, num2);
					output.setText(String.valueOf(answer));
					
				}
				if (operation == 4){
					System.out.println("The answer is: " + calculatorOperation.Division(num1, num2));
					num1 = calculatorOperation.Division(num1, num2);
					num2 = 0;
					answer = calculatorOperation.Division(num1, num2);
					output.setText(String.valueOf(answer));
				}
				

			}
		}
		// TODO Auto-generated method stub
		
	}
	
	
}
