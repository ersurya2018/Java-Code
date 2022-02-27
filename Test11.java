interface study
{
		void theory();
		void practical();
	
}
abstract class Room implements study
{
		public void theory()
		{
			System.out.println("Theory Work in class Room");
		}           
  	  }
class Lab extends Room
{
		public void practical()
		{
			System.out.println("practical work in lab");
		}             
}
public class Test11
 {
		public static void main(String[] args)
 {
			Lab L=new Lab();
			L.theory();
L.practical();
}
}
