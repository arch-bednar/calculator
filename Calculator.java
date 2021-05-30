import java.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculator implements ActionListener{

    JButton numbers[][] = new JButton[3][3];
    
    JButton add, sub, mul, div, eq;
    JButton clear;

    JTextField textField;
    JFrame scene;
    Container stage;
    GridBagLayout bagLayout;
    GridBagConstraints constraints;

    public void init(){
	scene = new JFrame();
	stage = f.getContentPane();

	bagLayout = new GridBagLayout();
	constraints = new GridBagConstraints();
	constraints.fill = GridBagConstraints.HORIZONTAL;
	constraints.setLayout(bagLayout);

	makeNumbers();
    }

    
    public void makeNumbers(){

	int number = 1;
	int buttonWidth = 1;
	
	for(int row=0; row<numbers.size; row++){
	    for(int col=0; col<numbers.size; row++){
		numbers[row][col] = new JButton(Integer.toString(number));
		number++;
		numbers[row][col].addActionListener(this);
		numbers[row][col].setFocusable(false);

		constraints.gridx=col;
		constraints.gridy=row;
		constraints.gridwidth=buttonWidth;

		constraints.ipadx=0;
		constraints.ipady=0;

		constraints.insets = new Insets(5, 5, 0, 0);

		bagLayout.setConstraints(numbers[row][col], constraints);
	    }
	}
    }


    public void makeEvents(){

    }
    
}
