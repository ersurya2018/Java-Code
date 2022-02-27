Class 1
      abstract class Shape {
		abstract void draw();
	}
extends class 1
	class Rectangle extends Shape
	{
		 void draw() 
		 {
			 System.out.println("drawing rectangle");
		 }
	}
extends class 3
		 class Circle extends Shape
		 {
			 void draw()
			 {
				 System.out.println("drawing circle");
			 }
		 }

		 class Test3
		 {
			 	public static void main(String[] args) 	
				{
			 			Shape s =new Circle();
			 			Shape s1 =new Rectangle();
			 			s.draw();
			 			s1.draw()       }    
   }
