package application;

public class App {

	public static void main(String[] args) {
		double fahrenheit = 91;
		double celsius = (fahrenheit - 32) * 5.0 / 9.0;
		System.out.println(fahrenheit +"degrees Fahrenheit is " + celsius + "degrees celsius");
		
		double value = 32.777777777777;
		System.out.printf("Hello %.2f\n", value);
		System.out.printf("Hello\n", 123);
		System.out.printf("%s %d\n", "Hello", 123);
		

	}

}
