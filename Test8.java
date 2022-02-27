public class Test8
{
public static void main(String[] args) 
{
			try
		{
			int a[]=new int[7];
			a[4]=30/0;
			System.out.println("First print statement in try block");
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticExecption");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIidexOutOfBoundsExecption");
		}
		catch(Exception e)
		{
			System.out.println("Some outher exception");
		}
		System.out.println("out f try block...");
	}
}
