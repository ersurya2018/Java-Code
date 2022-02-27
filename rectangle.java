
//WAP to create simple class to find out the area the area perimeter of rectangle and box using super keyword. 


public class rectangle {
		int a=10;
		int b=20;
	}
	class Area extends rectangle
	{
		void Darea()
		{
			System.out.println("Area = "+ super.a*super.b);
		}
	}
	class perimeter extends rectangle
	{
		void Dperimeter()
		{
			System.out.println("perimeter = "+ 2*(super.a+super.b));
		}
	}
	 class test
	{
		public static void main(String args[])
		{
			Area a=new Area();
			a.Darea();
			perimeter p=new perimeter();
			p.Dperimeter();
		}
	}