public class Test12
 {
public void run()
 {
			System.out.println(" thred is implemented through runnable interface");
 }
public static void main(String[] args)
 {
	Test12 L=new Test12();
	Thread t=new Thread();
	t.run();
	L.run();
 }
 }
