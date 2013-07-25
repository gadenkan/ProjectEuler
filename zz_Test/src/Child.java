
class Parent {

	static int x;
	public static void show(){
		System.out.println("Show in Parent");
	}
	
	public void onlyInTest1(){
		System.out.println("onlyInTest1");
	}

}

public class Child extends Parent{
	
	public static void main(String[] args) {

		System.out.println(Parent.x);
		Parent.show();
		Parent t = new Child();
		Parent.show();
		Child.show();
		
		Child c = new Child();
	}
	public static void show(){
		System.out.println("Show in Child");
	}
	public void onlyInChild(){
		this.toUseThis();
		System.out.println("onlyInChild");
	}
	
	public  void toUseThis(){
		
	}
	
}