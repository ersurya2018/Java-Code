interface singing
{
	void sings();
	
}
interface dancing
{
	void dances();
}

public class test14 implements singing,dancing
{
	public void sings()
	{
		System.out.println(" artist sings..");
	}
	
	public void dances()
	{
		System.out.println(" artist  dances..");
	}
	

	public static void main(String[] args) {
		test14 s=new test14();
		s.sings();
		s.dances();

	}

	
	}
