/*
class 父类名称{}
class 子类名称 extends 父类名称{}
*/

class Person{
	String name;
	int age;
	/* Person(String name,int age){
		this.name=name;
		this.age=age;
	} 构造方法的使用方法见后文 
	*/
	public void eat(){
		System.out.println("eat");
	}
	public void sleep(){
		System.out.println("sleep");
	}
	public void show(){
		System.out.println(name+":"+age);
	}
}

class Student extends Person{
	
}
class Teacher extends Person{
	
}

class ExtendsDemo{
	public static void main(String[] args){
		Student s=new Student();
		s.eat();
		s.sleep();
		Teacher t=new Teacher();
		t.eat();
		t.sleep();
	}	
}
