/* 
	静态代码块：
	static{}
	随着类的加载而执行，且在该类存续期间只执行一次。
	
	用处：
	用于对类进行初始化。一般用于所有成员均为静态的类。
	因为对于所有成员均为静态的类，没有必要去创建对象，那么也就无法调用构造函数初始化对象中的成员。
	所以我们可以用静态代码块来对类中的成员进行初始化，且可以进行多步骤的复杂操作。
	
	
	构造代码块：
	class Demo{
		{}这是构造代码块
		
		public void func(){
			{}这是局部代码块
		}
	}
	构造代码块随着对象的创建而执行，每创建一个对象，就会执行一次，且先于构造函数执行。
	
	作用：用来给对象进行初始化。
	构造函数初始化的成员一般是该类对象所共有的成员，而构造函数所初始化的成员是特定的某些该类对象所对应的成员。

	
 */
class StaticCode{
	static int num;
	static{
		num=10;
		num+=10;
		System.out.println(num);
	}
	static void show(){
		System.out.println("hello");
	}
}

class Person{
	private String name;
	
	{
		cry();//所有宝宝出生都会哭。
	}
	public void cry(){
		System.out.println("哭得哇哇得！");
	}//此时name的值还是null，所以说明构造函数还没压栈执行。
	
	//有的宝宝出生没名字（对特定的对象的成员进行初始化）
	Person(){
		this.name="baby";
	}
	
	//有的宝宝出生有名字（对特定的对象的成员进行初始化）
	Person(String name){
		this.name=name;
	}
	public void loud(){
		System.out.println(name);
	}
}

class StaticCodeDemo{
	public static void main(String[] args){
		StaticCode.show();
		StaticCode.show();//重复调用show()并不会重复加载该类，所以静态代码块也只会执行一次。
		Person p=new Person();
		p.loud();
		Person p1=new Person("LiMing");
		p1.loud();
	}
}