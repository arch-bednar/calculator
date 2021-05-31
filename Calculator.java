import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculator implements ActionListener{

    JButton numbers[][] = new JButton[3][3];
    
    JButton add, sub, mul, div, eq;
    JButton zero, dot, clear;

    JTextField textField;
    JFrame frame;
    Container container;
    GridBagLayout bagLayout;
    GridBagConstraints constraints;

    public void init(){
	frame = new JFrame();
	container = frame.getContentPane();

	bagLayout = new GridBagLayout();
	constraints = new GridBagConstraints();
	constraints.fill = GridBagConstraints.HORIZONTAL;
	container.setLayout(bagLayout);
	makeTextField();
	makeNumbers();
	makeEvents();
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("true");
	frame.setVisible(true);
    }

    
    public void makeNumbers(){

	int number = 1;
	int buttonWidth = 1;
	
	for(int row=0; row<numbers.length; row++){
	    for(int col=0; col<numbers.length; col++){
		numbers[row][col] = new JButton(Integer.toString(number));
		number++;
		numbers[row][col].addActionListener(this);
		numbers[row][col].setFocusable(false);

		constraints.gridx=col;
		constraints.gridy=row+1;
		constraints.gridwidth=buttonWidth;

		constraints.ipadx=0;
		constraints.ipady=0;

		constraints.insets = new Insets(5, 5, 0, 0);

		bagLayout.setConstraints(numbers[row][col], constraints);
		container.add(numbers[row][col]);
	    }
	}

	zero = new JButton(Integer.toString(0));
	zero.addActionListener(this);
	zero.setFocusable(false);
	constraints.gridx=1;
	constraints.gridy=4;
	constraints.gridwidth=buttonWidth;
	constraints.ipadx=0;
	constraints.ipady=0;
	constraints.insets = new Insets(5,5,0,0);
	bagLayout.setConstraints(zero, constraints);
	container.add(zero);
    }

    public void makeTextField(){
	textField = new JTextField(15);
	textField.addActionListener(this);
	textField.setHorizontalAlignment(JTextField.RIGHT);
	constraints.gridx=0;
	constraints.gridy=0;
	constraints.gridwidth = 5;
	constraints.ipadx=0;
	constraints.ipady=5;
	constraints.insets = new Insets(5, 5, 0, 5);
	bagLayout.setConstraints(textField, constraints);
	container.add(textField);
    }


    public void makeEvents(){
	add = new JButton("+");
	add.addActionListener(this);
	add.setFocusable(false);
	constraints.gridx=3;
	constraints.gridy=1;
	constraints.gridwidth=1;
	constraints.ipadx=0;
	constraints.ipady=0;
	constraints.insets = new Insets(5,5,0,5);
	bagLayout.setConstraints(add, constraints);
	container.add(add);

	sub = new JButton("-");
	sub.addActionListener(this);
	sub.setFocusable(false);
	constraints.gridx=3;
	constraints.gridy=2;
	constraints.gridwidth=1;
	constraints.ipadx=0;
	constraints.ipady=0;
	constraints.insets = new Insets(5,5,0,5);
	bagLayout.setConstraints(sub, constraints);
	container.add(sub);

	mul = new JButton("*");
	mul.addActionListener(this);
	mul.setFocusable(false);
	constraints.gridx=3;
	constraints.gridy=3;
	constraints.gridwidth=1;
	constraints.ipadx=0;
	constraints.ipady=0;
	constraints.insets = new Insets(5,5,0,5);
	bagLayout.setConstraints(mul, constraints);
	container.add(mul);


	dot = new JButton(".");
	dot.addActionListener(this);
	dot.setFocusable(false);
	constraints.gridx=0;
	constraints.gridy=4;
	constraints.gridwidth=1;
	constraints.ipadx=0;
	constraints.ipady=0;
	constraints.insets = new Insets(5,5,0,0);
	bagLayout.setConstraints(dot, constraints);
	container.add(dot);

	div = new JButton("/");
	div.addActionListener(this);
	div.setFocusable(false);
	constraints.gridx=2;
	constraints.gridy=4;
	constraints.gridwidth=2;
	constraints.ipadx=0;
	constraints.ipady=0;
	constraints.insets = new Insets(5,5,0,5);
	bagLayout.setConstraints(div, constraints);
	container.add(div);

	eq = new JButton("=");
	eq.addActionListener(this);
	constraints.gridx=0;
	constraints.gridy=5;
	constraints.gridwidth=3;
	constraints.ipadx=0;
	constraints.ipady=0;
	constraints.insets = new Insets(5,5,5,0);
	bagLayout.setConstraints(eq, constraints);
	container.add(eq);
	
	clear = new JButton("clear");
	clear.addActionListener(this);
	clear.setFocusable(false);
	constraints.gridx=3;
	constraints.gridy=5;
	constraints.gridwidth=1;
	constraints.ipadx=0;
	constraints.ipady=0;
	constraints.insets = new Insets(5,5,5,5);
	bagLayout.setConstraints(clear, constraints);
	container.add(clear);
	
    }

    public void actionPerformed(ActionEvent e){

    }

    public static void main(String[] args){
	SwingUtilities.invokeLater(new Runnable(){
		public void run(){
		    new Calculator().init();
		}
	    });
    }
}
