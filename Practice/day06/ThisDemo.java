class Person{
	private String name;
	private int age;
	Person(String name){
		this.name=name;
	}
	Person(String name,int age){
		this(name);
		this.age=age;
	}
	public void speak(){
		System.out.println(name+":"+age);//此处其实有this，只是省略没写。
	}
	//判断本人与另一人是否为同龄人
	public boolean compare(Person p){
		return this.age==p.age;
	}//this.age代表调用compare成员函数的对象的age，p.age代表另一对象的age。
}

class ThisDemo{
	public static void main(String[] args){
		Person p=new Person("LiMing");
		Person p1=new Person("LiMing",12);
		Person p2=new Person("Jenny",13);
		p.speak();
		p1.speak();
		System.out.println(p1.compare(p2));
	}
}