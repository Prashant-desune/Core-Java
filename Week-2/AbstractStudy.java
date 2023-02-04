
abstract class Carc{
	int maxSpeed;
	abstract void accelerate();
}
class BMW extends Carc{
	void accelerate() {
		System.out.println("BMW is accelerating");
	}
}
class BMW2 extends BMW{
	void braker() {
		System.out.println("BMW is applying Brakes");
	}
}
abstract class A{
	int x =10;
	void fun() {
		System.out.println("Hello, I'm A");
	}
}
public class AbstractStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW beemer = new BMW();
		beemer.accelerate();
		
		BMW2 b = new BMW2();
		b.braker();
	}

}
