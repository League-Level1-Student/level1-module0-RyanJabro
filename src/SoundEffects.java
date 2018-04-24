import java.applet.AudioClip;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements MouseListener{
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	public void createGui() {
	panel.add(button);
	panel.add(button2);
	panel.add(button3);
	frame.add(panel);
	button.setText("Sawing Wood");
	button2.setText("Yee");
	button3.setText("Boom");
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
	button.addMouseListener(this);
	button2.addMouseListener(this);
	button3.addMouseListener(this);
	
}
	public static void main(String[] args) {
		SoundEffects se = new SoundEffects();
		se.createGui();
		
	}
	
	
	
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}




	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if((JButton)e.getSource() == button) {
			playSound("sawing-wood-daniel_simon.wav");
		}
		else if((JButton)e.getSource() == button2) {
			playSound("19208__wim__p1-21-yee.wav");
		}
		else if((JButton)e.getSource() == button3) {
			playSound("86330__zgump__boom-1.wav");
		}
	}




	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
