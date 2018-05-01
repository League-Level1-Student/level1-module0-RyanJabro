import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	
public static void main(String[] args) {
	CutenessTV ctv = new CutenessTV();
	ctv.showButton();
	
}
public void showButton() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button);
	panel.add(button2);
	panel.add(button3);
	button.setText("Ducks");
	button2.setText("Frogs");
	button3.setText("Fluffy Unicorns");
	button.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == button) {
		showDucks();
	}
	else if(e.getSource() == button2) {
		showFrog();
	}
	else if(e.getSource() == button3) {
		showFluffyUnicorns();
	}
	
}

}

