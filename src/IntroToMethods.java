
public class IntroToMethods {
public static void main(String [] args) {
	weRock();
	rocker("Ryan");
	truth("Ryan");
}
public static void weRock() {
	System.out.println("The League rocks");
	
}
public static void rocker(String name) {
	System.out.println(name + " rocks");
}
public static void truth(String name) {
	if(name.equalsIgnoreCase("Ryan")) {
		System.out.println(name + " is awesome");
	}
	else {
		System.out.println(name + " is annoying");
	}
}
}
