
public class IntroToMethods {
	static int oddOrNot = 2;

	public static void main(String[] args) {

		int sum = add(21, 21);
		System.out.println(sum);
		String theBest = getTheBestCoder();
		System.out.println(theBest);
		weRock();
		rocker("Ryan");
		truth("Ryan");
		echo("hello");
		mayday("mayday");
		oddOrNot(3);
	}

	public static void weRock() {
		System.out.println("The League rocks");

	}

	public static void rocker(String name) {
		System.out.println(name + " rocks");
	}

	public static void truth(String name) {
		if (name.equalsIgnoreCase("Ryan")) {
			System.out.println(name + " is awesome");
		} else {
			System.out.println(name + " is annoying");
		}
	}

	public static void echo(String answer) {
		System.out.println(answer + " " + answer);
	}

	public static void mayday(String answer2) {
		for (int i = 0; i < 4; i++) {
			System.out.println(answer2);
		}
	}

	public static String getTheBestCoder() {
		return "Ryan";
	}

	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static void oddOrNot(int oddOrNot) {
		if (oddOrNot % 2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}
}