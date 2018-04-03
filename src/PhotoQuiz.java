/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JOptionPane.showMessageDialog(null, "Welcome to Photo Quiz! Answer questions related to the picture.");
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
int score = 0;
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String URL = "https://ne1.wac.edgecastcdn.net/001FB1/images/Category%20Hero%20Images/Resized%20Heros/Coffee-Category-Hero.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component image;
		// 3. use the "createImage()" method below to initialize your Component
image = createImage(URL);
		// 4. add the image to the quiz window
quizWindow.add(image);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String answer;
answer = JOptionPane.showInputDialog("Where does this cup of coffee (java) orginate from?");
		// 7. print "CORRECT" if the user gave the right answer
if(answer.equalsIgnoreCase("java")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score += 1;
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(null, "Incorrect! The correct answer was Java.");
}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(image);
URL = "https://68.media.tumblr.com/1e0ee46247f530e547d4dfbe7bebfec3/tumblr_olfkzab2ep1tk9c2yo1_500.jpg";
		// 10. find another image and create it (might take more than one line of code)
image = createImage(URL);
		// 11. add the second image to the quiz window
quizWindow.add(image);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
answer = JOptionPane.showInputDialog("This image is often called___?");
		// 14+ check answer, say if correct or incorrect, etc.
if(answer.contains("yee")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score += 1;
}
else {
	JOptionPane.showMessageDialog(null, "Incorrect! The correct answer was yee.");
}
	JOptionPane.showMessageDialog(null, "Your score in Photo Quiz was " + score);
	
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}



	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





