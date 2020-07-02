package builderPattern;

//Driver class 
public class BuilderDemo { 
 public static void main(String args[]) throws InterruptedException 
 {
	 
	 for(int i=0; i<10;i++)
	 {
		 StudentReceiver sr = new StudentReceiver();
		 Thread.sleep(100);
		 System.out.println(sr.getStudent());
	 }
 } 
}