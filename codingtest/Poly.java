package codingtest;

public class Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass sup = new SubClass(); // Promotion : 자동 타입변환, Pholymorphism
		  // 동적 바인딩
		  sup.methodA(); // Runtime시에 결정된다. SubClass의 메소드 호출
		  // 정적 바인딩
		  sup.staticMethodA(); // static 메소드는 compile시에 결정, SuperClass의 메소드 호출
	}

}

class SuperClass {
	  void methodA() { System.out.println("SuperClass"); }
	  static void staticMethodA() { System.out.println("SuperClass"); }
	}

	class SubClass extends SuperClass {
	  void methodA() { System.out.println("SubClass"); }
	  static void staticMethodA() { System.out.println("SubClass"); }
	}
