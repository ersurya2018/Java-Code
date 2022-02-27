import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		String str="this is java program";
		StringBuilder sb=new StringBuilder(str);
		System.out.println("Reversed string is :"+sb.reverse());
		System.out.println(" String in upper case is:"+str.toUpperCase());
		System.out.println("String in lower case is :"+str.toLowerCase());
		System.out.println("This is second program"+str.toLowerCase().contentEquals(sb.reverse()));

	}
}


