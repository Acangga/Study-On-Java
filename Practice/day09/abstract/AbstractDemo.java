abstract class Animal{
	abstract void eat();
	abstract void sleep();
	void breath(){
		System.out.println("breath");
	}	
}

abstract class Cat extends Animal{
	
}

class Dog extends Animal{
	void eat(){
		System.out.println("Dogs eat meat.");
	}
	void sleep(){
		System.out.println("Dogs sleep on the ground.");
	}
}

class AbstractDemo{
	public static void main(String[] args){
		//Animal a=new Cat(); Cat是抽象的; 无法实例化
		Animal a=new Dog();
		a.eat();
		a.sleep();
		a.breath();
	}
}