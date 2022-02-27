class Shape
{
	String name=" Shape Constructor is created";
	Shape()
	{
		System.out.println(name);
	}
}
class circle extends Shape
{
	public double radius;
	public circle(double r, String n)
	{
		this.radius=r;
		String m=n;
		float pi=22/7;
		double a=pi*radius*radius;
		System.out.println(m);
		System.out.println("area is "+a);
	}
}
class square extends Shape
{
	double side;
	square(double s,String n)
	{
		this.side=s;
		String m=n;
		double a=side*side;
		System.out.println("m");
		System.out.println("area is "+a);
		
	}
}
class cylinder extends circle
{
	double hieght;
	cylinder(double h,double r,String n)
	{
		super (7," circle");
		this.hieght=h;
		this.radius=r;
		String m=n;
		double g=22/7*radius*radius*hieght;
		System.out.println(m);
		System.out.println(" volume is "+g);
	}
}
class sphere extends circle
{
	sphere(double r,String n)
	{
		super (7," circle");
		this.radius=r;
		String m=n;
		double g=(3*3.14*radius*radius*radius)/4;
		System.out.println(m);
		System.out.println(" volume is "+g);	
	}
}
class cube extends square
{
	cube(double s,String n)
	{
		super (7," square");
		this.side=s;
		String m=n;
		double a=s*s*s;
		System.out.println(m);
		System.out.println(" volume is "+a);	
	}
}
public class test7 {

	public static void main(String[] args) {
		cylinder t=new cylinder(7,7,"cylinder");
		sphere d=new sphere(7,"sphere");
		cube g=new cube(7,"cube");
	}
}
