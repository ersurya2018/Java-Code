import java.util.*;
class assin2
{
  public static void main(String[] args)
 {   
    Scanner sc=new Scanner(System.in);
      int nodays;
     System.out.println("Enter the number of days");
     nodays=sc.nextInt();
     int year=0,days=0,week=0;
      int yearor=0;
   
	year=nodays/365;
	System.out.println("year:-"+year);
	yearor=nodays%365;
	week=yearor/7;
	System.out.println("week:-"+week);
	days=yearor%7;
	System.out.println("days:-"+days);
	System.out.println("In "+nodays+" no of days me "+year+" year "+week+" week & "+days+" days ");
 }
}