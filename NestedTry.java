package labfile;

public class NestedTry {

	public static void main(String[] args) 
	{
      try 
      {
		try
		{
			int b=39/0;
		}
		catch(ArithmeticExecption e)
		{
			System.out.println(e);
		}
		try 
		{
		 int a[]=new int[5];
		 a[5]=4;
		}
		catch(ArrayIndexOutOfBoundsExecption e)
		{
			System.out.println(e);
		}
		System.out.println("outher statement");
		
      }
      
      catch(Execption e)
      {
    	  System.out.println("handled");
    	  
      }
      System.out.println("out of array catch block");
      
	}

}
