/*
抽象分析：
1. 我们往往是先观察具体的事物，观察他们的属性和行为；
2. 将事物抽象为类，将属性和行为抽象为成员变量和成员方法（可能还有静态变量和方法），
	其实在这里该事物的类就已经可以定义出来了，不过我们要使用继承，所以要分别定义父类和子类；
3. 从变量和方法中寻找共性，用共性定义父类。
4. 共性以外即为特性，子类继承父类，再加上特性就可以定义出继承中的子类了。
5. 具体代码实现中还要定义出各类的构造函数。

案例分析：
1. 观察猫和狗的属性和行为
猫
属性：名字、年龄、品种
行为：吃饭、玩

狗
属性：名字、年龄、品种
行为：吃饭、看家

2. 抽象为类

Cat
field:name,age,breed
function:eat();play();setXxx();getXxx

Dog
field:name,age,breed
function:eat();guard();setXxx();getXxx

3. 定义父类

Animal
field:name,age,breed
constructor:param,non-param
function:eat();setXxx();getXxx

4.定义子类（继承+特性）

Cat extends Animal
field:nothing
constructor:param,non-param
function:play()

Dog extends Animal
field:nothing
constructor:param,non-param
function:guard()

*/

class Animal{
	private String name;
	private int age;
	private String breed;
	Animal(){
		
	}
	Animal(String name,int age,String breed){
		this.name=name;
		this.age=age;
		this.breed=breed;
	}
	void eat(){
		System.out.println(getName()+"：我吃我吃我吃吃吃！");
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
	void setBreed(String breed){
		this.breed=breed;
	}
	String getBreed(){
		return breed;
	}
}

class Cat extends Animal{
	/* 
	 错误: 无法将类 Object中的构造器 Object应用到给定类型;
                super(name,age,breed);
                ^
	需要: 没有参数
	找到: String,int,String
	原因: 实际参数列表和形式参数列表长度不同
	
	不要忘记写extends */
	Cat(){
		
	}
	Cat(String name,int age,String breed){
		super(name,age,breed);
	}
	
	void play(){
		System.out.println(this.getName()+"：我玩我玩我玩玩玩！");
		/* System.out.println(super.getName()+"：我玩我玩我玩玩玩！");
		这里用this和super都一样，它们指向的都是同一块内存空间，同一个对象。
		
		void play(Cat c){
		System.out.println(c.getName()+"：我玩我玩我玩玩玩！");
	} 
		所以没有必要再像上面那样写，把当前对象传递进来。
		*/
		
	}
	/* 
	直接调用getName()即可。getName()其实是省略写法，这里其实是super.getName()。
	所以当对象调用到play()时，执行输出语句，调用super.getName()，去父类中寻找
	*/
}
class Dog extends Animal{//不要忘记写extends
	Dog(){
		
	}
	Dog(String name,int age,String breed){
		super(name,age,breed);
	}
	void guard(){
		System.out.println(getName()+"：我守我守我守守守！");
	}
}

class ExtendsTest2{
	public static void main(String[] args){
		//Cat
		//方法一
		Cat c0=new Cat();
		c0.setName("Tom");
		c0.setAge(3);
		c0.setBreed("American Shorthair");
		c0.eat();
		c0.play();
		/*System.out.println(name+":"+age+":"+breed);
		这几个成员变量在Animal类中都是私有的，要访问需要通过调用setXxx()和getXxx()方法。
		*/
		System.out.println(c0.getName()+":"+c0.getAge()+":"+c0.getBreed());
		//方法二
		Cat c1=new Cat("DD",3,"British Shorthair");
		c1.play();
		System.out.println(c1.getName()+":"+c1.getAge()+":"+c1.getBreed());
		
		//Dog
		//方法一
		Dog d0=new Dog();
		d0.setName("Bruce");
		d0.setAge(2);
		d0.setBreed("Cokey");
		d0.guard();
		System.out.println(d0.getName()+":"+d0.getAge()+":"+d0.getBreed());
		//方法二
		Dog d1=new Dog("PP",1,"Border collie");
		d1.guard();
		System.out.println(d1.getName()+":"+d1.getAge()+":"+d1.getBreed());
	}
}