package JalaPractiocal;

import java.io.*;
import JalaPractiocal.*;

public class Test11 {

	public static void main(String[] args) //throw IOException
	{
		
		int a,b;
		a=20;
		b=10;
		Calu r=new Calu();
		System.out.println(a + " + " + b + " = " +r.add(a,b) );
		System.out.println(a + " - " + b + " = " +r.sub(a,b) );
		System.out.println(a + " * " + b + " = " +r.mul(a,b) );
		System.out.println(a + " / " + b + " = " +r.divi(a,b) );
	}
}
