class Person{
	private String name;
	private int age;
	//定义一个Person类的构造函数
	/* 
	构造函数：构造、创建对象时调用的函数。
	作用：可以将对象初始化。对象不经初始化无法使用。
	创建函数必须通过构造函数来进行初始化。
	
	一个类中如果没有定义构造函数，那么编译时会自动构建一个空构造函数，
	比如在Person类中就是Person(){}空构造函数。
	如果类中人为定义了构造函数，那么就不会再自动定义空构造函数。
	
	那么一般函数和构造函数有什么区别？
	构造函数：1.创建对象时，就会创建与之对应的构造函数，将对象初始化；
				2.
	一般函数：创建对象后，需要函数功能时才对其进行调用。
	*/
	Person(){//这个构造函数还是空参数的,那么我们默认这个人出生时是没有名字的
		name="baby";
		age=0;
		System.out.println("Person Run");
	}
	//但有的人出生时就有了名字
	Person(String n){
		name=n;
	}
	//有的人出生时就有了名字和年龄（笑）
	Person(String n,int a){
		name=n;
		age=a;
	}
	//在函数中，仅有参数顺序不同的两个函数也是不同的
	Person(int a,String n){
		name=n;
		age=a;
	}
	
	public void speak(){
		System.out.println(name+":"+age);
	}
	public void setName(String n){
		name=n;
	}
	public String getName(){
		return name;
	}
	public void setAge(int a){
		age=a;
	}
	public int getAge(){
		return age;
	}
}

class ConsDemo{
	public static void main(String[] args){
		Person p=new Person();
		Person p1=new Person("LiMing");
		Person p2=new Person("LiMing",12);
		Person p3=new Person(12,"LiMing");
		p.speak();
		p1.speak();
		p2.speak();
		p3.speak();
		
		
	}
}