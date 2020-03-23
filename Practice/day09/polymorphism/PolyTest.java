//ClassCastException：类指向错误

class Animal{
	void eat(){
		
	}
}

class Cat extends Animal{
	void eat(){
		
	}
	void play(){
		
	}
}

class Dog extends Animal{
	void eat(){
		
	}
	void guard(){
		
	}
}


class PolyTest{
	public static void main(String[] args){
		//内存中的实例为狗
		Animal a=new Dog();//向上转换
		a.eat();
		Dog d=(Dog)a;//可以向下转换
		
		//内存中的实例为猫
		a=new Cat();
		Dog dd=(Dog)a;//猫无法转换为狗，猫狗间无继承关系
		/* 报错如下：
		Exception in thread "main" java.lang.ClassCastException: Cat cannot be cast to Dog（猫无法被指向狗）
        at PolyTest.main(PolyTest.java:35)
		*/
		
		//更多错误演示如下
		/* 
		Dog ddd=new Animal();动物是狗，明显不对,编译报错：不兼容的类型
		Dog dddd=new Cat();猫是狗，编译报错：不兼容的类型
		
		*/
	}
}