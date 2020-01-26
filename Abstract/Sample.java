abstract class  Sample{
	public void display(){
		System.out.println("display method");
		}
	
	abstract void test();
	//abstract void demo();
}

abstract class SampleChild extends Sample{
	void test(){
		System.out.println("test method impliment in childclass");
	}
}

class GrandSample extends SampleChild{
	void demo(){
		System.out.println("demo method implimented in child class");
	}
}