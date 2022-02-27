import java.io.*;

class clsroom
{
	int l;
	int b;
	clsroom(int x,int y)
	{
		l=x;
		b=y;
		
	}
	int area()
	{
		return(l*b);
	}
}
class studyroom extends clsroom
{
	int h;
	studyroom(int x,int y,int z)
	{
		super(x,y);
		h=z;
	}
		int volumn()
		{
			return(l*b*h);
		}
	}

public class test17 {

	public static void main(String[] args) {
studyroom s1=new studyroom(12,20,10);
System.out.println("Area= "+s1.area());
System.out.println("Volumn= "+s1.volumn());


	}

}
