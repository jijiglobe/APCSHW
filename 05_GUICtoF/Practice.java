import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Practice extends JFrame implements ActionListener{
    private JButton ctof;
    private JButton ftoc;
    private JTextField input;
    private Container c1;
    private JLabel output;
    private double answer;
    public Practice(){
     	this.setTitle("GOOEY");
	this.setSize(300,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	input = new JTextField(12);
	ctof = new JButton("Celsius to Fahrenheit");
	ftoc = new JButton("Fahrenheit to Celsius");

	output = new JLabel("0");
	c1 = this.getContentPane();
	c1.setLayout(new FlowLayout());
	ctof.addActionListener(this);
	ftoc.addActionListener(this);

	c1.add(input);
	c1.add(ctof);
	c1.add(ftoc);
	c1.add(output);
    }

    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
	if(action.equals("Fahrenheit to Celsius")){
	    answer = (((Double.parseDouble(input.getText()) - 32.0)*5.0)/9.0);
	    output.setText(""+answer);
	    //System.out.println("stuff");
	}
	if(action.equals("Celsius to Fahrenheit")){
	    answer = (((Double.parseDouble(input.getText())*9.0)/5.0)+32.0);
	    output.setText(""+answer);
	    
	    //System.out.println("I need to stop making typos");
	}
    }
}