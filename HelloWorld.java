import java.io.*;

public class HelloWorld {
	String name;
	static String city;
	int variation = 0;
  //this is second lesson
	public static void main(String args[]) {
		
		HelloWorld hello = new HelloWorld();
		hello.name = "Sudha";
		HelloWorld.city = "Markapuram";

		HelloWorld hello1 = new HelloWorld();
		hello1.name = "Ravi";
		HelloWorld.city = "Kanigiri";

		System.out.println("Name : " + hello.name + ", City : " + HelloWorld.city);
		System.out.println("Name : " + hello1.name + ", City : " + HelloWorld.city);
	}

	public static int sub(int a, int b) {
		return a-b;
	}

	public static int sum(int a, int b) {
		return variation + a + b;
	}

}