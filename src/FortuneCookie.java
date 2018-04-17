import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {
	 JFrame frame = new JFrame();
	 JPanel panel = new JPanel();
	 JLabel label = new JLabel();
	 JButton button = new JButton();

	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
	
	}

	public void showButton() {
		System.out.println("Button");
		frame.setVisible(true);
		frame.add(button);
		button.setText("Click here for a fortune");
		button.addActionListener(this);
		frame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	JOptionPane.showMessageDialog(null, "Woohoo!");
	 int random = new Random().nextInt(5);
	 if(random == 0) {
		 JOptionPane.showMessageDialog(null, "You will inherit a large amount of money.");
	 }
	 else if(random == 1) {
		 JOptionPane.showMessageDialog(null, "You will find a new friend soon.");
	 }
	 else if(random == 2) {
		 JOptionPane.showMessageDialog(null, "You will hear life changing advice soon.");
	 }
	 else if(random == 3) {
		 JOptionPane.showMessageDialog(null, "You will learn a brand new skill soon.");
	 }
	 else if(random == 4) {
		 JOptionPane.showMessageDialog(null, "You will understand the true meaning of life.");
	 }
	}
}
