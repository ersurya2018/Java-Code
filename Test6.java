class Car
{
	int yom,topspeed;
	String model,color;
	void display()
	{
		System.out.println("year of manufacture is "+yom);
		System.out.println("topspeed "+topspeed);
		System.out.println("color is "+color);
		System.out.println("model is "+model);
	}
	int c=100;
	void create()
	{
		System.out.println("totel number of car are 100");
		}
		int left;
		void sold()
		{
			int sold=c-left;
			System.out.println("number of car solid:"+sold);
		}
	
}

public class Test6 {

	public static void main(String[] args) {
		
		Car alto=new Car();
		System.out.println("for alto");
		alto.yom=2010;
		alto.topspeed=150;
		alto.color="red";
		alto.model="alto_800";
		alto.left=56;
		alto.display();
		alto.create();
		alto.sold();
		
		Car xing =new Car();
		System.out.println("for xing");
		xing.yom=2014;
		xing.topspeed=160;
		xing.color="blue";
		xing.model="Santro_xing";
		xing.left=61;
		xing.display();
		xing.create();
		xing.sold();
		
		
		Car wagonr =new Car();
		System.out.println("for wagon_r");
		wagonr.yom=2019;
		wagonr.topspeed=165;
		wagonr.color="gray";
		wagonr.model="wagonr_2019";
		wagonr.left=38;
		wagonr.display();
		wagonr.create();
		wagonr.sold();
	}
}