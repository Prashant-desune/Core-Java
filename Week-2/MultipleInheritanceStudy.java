

interface M{
	int x = 10;
	void fun();
}

interface N{
	int x = 20;
	void fun();
}
class C1 implements M,N{
	public void fun() {
		System.out.println("Hello, I'm function in C");
		System.out.println(M.x);
		System.out.println(N.x);
		System.out.println(M.super.hashCode());
		System.out.println(N.super.hashCode());
	}
}

interface O extends M,N{
	void fun();
}

class D1 implements O{
	public void fun() {
		System.out.println("Hello, I'm function in D");
	}
}


public class MultipleInheritanceStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c = new C1();
		c.fun();
		
		D1 d = new D1();
		d.fun();
	}

}
