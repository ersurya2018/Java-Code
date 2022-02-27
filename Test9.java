public class Test9
 {
	public static void main(String[] args) {
		try
		{
			try
			{
				int b=39/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			try
			{
				int a[]=new int[5];
				a[5]=4;
				
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			System.out.println("outher statement");
		}
		catch (Exception e)
		{
			System.out.println(" handled");
		
		}
		System.out.println("out of try catch block");
	}
}


