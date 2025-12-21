import java.awt.event.*;
import javax.swing.*;
class ActionEventExample implements ActionListener{
	JButton b;
	public ActionEventExample(){
		JFrame f = new JFrame("Action Event");
		b = new JButton("Click me");
		b.addActionListener(this);
		f.add(b);
		f.setSize(200, 200);
		f.setVisible(true);
	}
    @Override
	public void actionPerformed(ActionEvent e){
		System.out.println("Button was clicked.");
	}
	public static void main(String[] args){
		new ActionEventExample();
	}
}