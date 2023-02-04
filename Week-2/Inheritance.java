class A{
	int a,b;
	
	public void show() {
		System.out.println("Hello!");
	}
}

//class B extends A{
//	public void speak() {
//		System.out.println("Writing!");
//	}
//}

interface B{
	public void eat();
}

interface D extends B{
	public void sleep();
}
class C implements B,D{
	int e,f;
	public void speak() {
		System.out.println("Speaking");
	}
	
	@Override
	public void eat() {
		
	}
	
	@Override
	public void sleep() {
		
	}
}

public class Inheritance {
	
	public static void main(String[] args) {
//		B b = new B();
//		C c = new C();
		
	}
}