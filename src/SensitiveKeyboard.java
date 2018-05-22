import javax.swing.JFrame;

public class SensitiveKeyboard {
	JFrame frame = new JFrame();
	
public static void main (String [] args) {
		speak("ouch");

}
static void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
         }
    }
void buildGUI () {
	frame.setVisible(true);
}
}


