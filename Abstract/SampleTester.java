class SampleTester{
	public static void main(String[] args){
	
	 // Sample s1=new Sample(); // error bcz object will not creat for abstract class
	 // Sample.display(); // error 
	// SampleChild sc=new SampleChild();  // error
	
	GrandSample gc=new GrandSample();

	gc.test();
	gc.demo();
	gc.display();
	}
}  