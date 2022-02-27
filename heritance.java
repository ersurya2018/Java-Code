class a{
	int a1,a2;
	void getdata() {
		a1=45;
		a2=65;
	}
	void putdata() {
		System.out.println("\n The value of a1 is "+a1+"and a2"+" "+a2);
	}
}
class b extends a{
	
	int b1,b2;
	void indata() {
		b1=84;
		b2=83;
	}
	
	void outdata() {
		System.out.println("\n the value of b1 is "+b1+"and b2"+" "+b2);
	}
}
 class inheritence {

	public static void main(String[] args) {

		b obj=new b();
		obj.getdata();
		obj.indata();
		obj.putdata();
		obj.outdata();
		
	} 
}