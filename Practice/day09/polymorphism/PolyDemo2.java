//多态带来的可扩展性
//动物案例

class Animal{
	void eat(){
		System.out.println("eat");
	}
	void sleep(){
		System.out.println("sleep");
	}
}

class Cat extends Animal{
	//继承+方法重写
	void eat(){
		System.out.println("猫吃鱼");
	}
	void sleep(){
		System.out.println("猫蜷着睡");
	}
}
/*
我们每定义一种动物，就需要创建类、继承、方法重写。
*/

class PolyDemo2{
	public static void main(String[] args){
		Cat c=new Cat();
		c.eat();
		c.sleep();
		/*
		那么如果我们要这只猫或许多只猫重复进行吃饭、睡觉的活动，就要重复调用Cat类中的成员函数，比较麻烦。
		所以我们考虑用函数将调用eat()和sleep()的功能封装起来，但把这个函数定义在哪个类中都不太合适，所以我们创建一个工具类来实现该功能。
		*/
		Cat c1=new Cat();
		Tool.catFunc(c1);
		/*
		Cat类的问题解决了。但是如果我们想让更多的Animal类的子类都能使用Tool类呢？
		我们可以每次创建了新的子类都在Tool类中添加上对应的方法，但这样既麻烦，也会由于频繁修改，导致工具类出错的可能性大增。
		那该怎么办？
		我们考虑可以事先把所有动物的对应方法都在Tool类中定义好，即穷举法。但是这好像不太现实，而且工作量太大了。
		所以我们考虑运用多态来解决这个问题。即，我们不再逐个定义不同动物的对应函数，而是只定义操作动物类的函数，将不同种类的动物都用动物类
		的方式来操作即可。代码见AnimalTool类。
		*/
		Cat c2=new Cat();
		AnimalTool.animalFunc(c2);
		
	}
}

/* class Tool{
	public static void catFunc(Cat c){
		c.eat();
		c.sleep();
	} */
	
class AnimalTool{
	public static void animalFunc(Animal a){
			a.eat();
			a.sleep();
	}
}
/*
该工具类是如何构成和体现多态的？

继承：Cat类是Animal类的子类
方法重写：Cat类重写了Animal类中的eat()和sleep()
父类引用指向子类对象：AnimalTool的参数列表是Animal类的引用类型变量，但实际传入的确实Animal类的子类的引用类型变量。
*/
