import java.io.*;
class marksheet
{
	int m1,m2,m3,m4,m5,tot;
	float avg;
	void getdata() throws IOException
	{
		m1=54;
		m2=84;
		m3=71;
		m4=55;
		m5=63;
		tot=m1+m2+m3+m4+m5;
		avg=tot/5;
	}

void putdata() throws IOException
{
  System.out.println("Name:RAM");	
  System.out.println(" Subject 1 marks : " +m1);
  System.out.println(" Subject 2 marks : " +m2);
  System.out.println(" Subject 3 marks : " +m3);
  System.out.println(" Subject 4 marks : " +m4);
  System.out.println(" Subject 5 marks : " +m5);
  System.out.println(" Total="+tot);
  System.out.println("Average= "+avg);
  if((m1>=40)&&(m2>=40)&&(m3>=40)&&(m4>=40)&&(m5>=40))
  {
	 System.out.println("Result=Pass...."); 
  }
  else
  {
	  System.out.println("Sorry Try again.........");
  }
  
  if(avg>=60)
  {
	  System.out.println("Class=First");
  }
  else
  if(avg>=50)
  {
	  System.out.println("Class=Second");
  }
  else
  if(avg>=40)
  {
	  System.out.println("Class=Third");
  }
  else
  {
	  System.out.println("Class=Fail");
  }
 }
}

public class test18 {

	public static void main(String[] args) throws IOException {
		marksheet r1=new marksheet();
		r1.getdata();
		r1.putdata();
	}
}
