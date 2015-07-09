import javax.xml.ws.Dispatch;


public class java20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.m1();
		//B b =new B();
		B b = new C();
		b.m1();
		b.m2();
		
		//B c =new E();
		E c =new E();
		c.m1();
		c.m2();
		c.m3();
	}
}
class A{
	A(){}
	void m1(){}
}
abstract class B{//抽象類別
	B(){}
	void m1(){}
	abstract void m2();
}

class C extends B {
	void m2(){}
}

abstract class D extends B{
	void m3(){}
}

class E extends D{
	void m2(){}
}