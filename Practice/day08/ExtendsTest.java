/*
应用继承写一个demo
就用Teacher类和Student类来继承Person类

Person类的构成
成员变量：name、age
构造函数：空参、带参
成员函数：getXxx、setXxx

*/
class Person{
	private String name;
	private int age;
	Person(){
		
	}
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	void setName(String name){
		this.name=name;
	}
	String getName(){
		return name;
	}
	
	void setAge(int age){
		this.age=age;
	}
	int getAge(){
		return age;
	}
}

class Student extends Person{
	Student(){
		
	}
	Student(String name,int age){
		super(name,age);
		/* 
		this.name=name;
		this.age=age;
		这样写会的话，该构造方法会去调用父类的无参构造方法，
		成员变量name和age的值会被初始化为默认值null和0。
		所以我们用super关键字显式调用父类的带参构造函数。
		*/
	}
}

class Teacher extends Person{
	Teacher(){
		
	}
	Teacher(String name,int age){
		super(name,age);
	}
}


class ExtendsTest{
	public static void main(String[] args){
		//学生类
		//测试方法一
		Student s=new Student();
		s.setName("LiMing");		
		s.setAge(12);		
		System.out.println("学生："+s.getName()+":"+s.getAge());
		//测试方法二
		Student s1=new Student("LiMing",12);
		System.out.println("学生："+s1.getName()+":"+s1.getAge());
		
		//老师类
		//测试方法一
		Teacher t=new Teacher();
		t.setName("Jenny");
		t.setAge(18);
		System.out.println("老师："+t.getName()+":"+t.getAge());
		//测试方法二
		Teacher t1=new Teacher("Jenny",18);
		System.out.println("老师："+t1.getName()+":"+t1.getAge());
		
	}
}