import java.util.*;      		// For input
class assin1		//Class 
{
     public static void main(String [] args)    	//Main method
  {
    Scanner sc=new Scanner(System.in);      	// Create object for input
     int l,b;				// Variable decleration
     int area=0,peri=0;
    System.out.println( "Enter the length & width");
    l=sc.nextInt();			
    b=sc.nextInt();
    area=l*b;		// Formula
    System.out.println(" the area of  "+l+" & "+b+" is the :-"+area);
     peri=2*(l+b);		// Formula
    System.out.println("The perimeter of  "+l+" & "+b+" is the :-"+peri);
   }
}

