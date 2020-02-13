/* 
	描述小汽车
	
	分析：
	1.属性
		轮胎数
		颜色
	2.行为
		运行
		
	定义类就是定义成员，成员可以分为：
	成员变量（对应类的属性）；
	成员函数（对应类的行为）。
 */
 class Car{
	int num;
	//int num=4; 显示初始化过程，学过继承之后会了解具体过程
	String color;
	void run(){
		System.out.println(num+"...dududududududududu..."+color);
	}
 }
 
 class CarDemo{
	public static void main(String[] args){
		//用new关键字在计算机中创建一个car类的实例
		Car c=new Car();
		/* 
		我们先用new关键字创建了一个car类的实例，小括号里是要参与运算的数据和内容，因为car类不需要数据参与运算，所以为空；
		然后我们需要给这个新创建出来的实例取个名字，用来将它与其他同类的实例区分开。
		最终，我们得到了一个class类型的引用变量 c ，并指向了该class的对象。
		*/
		
		//我们可以修改对象中的内容
		c.num=4;
		c.color="black";
		
		//创建了实例之后，我们还得让它运行起来
		c.run();//要使用对象中的内容，可以通过  对象.成员  的方式来调用。
		
		Car c1=new Car();
		Car c2=new Car();
		show(c1);
		show(c2);
		c1.run();
		c2.run();
	}
	
	//为了提高代码复用性，我们可以定义一个函数来操作对象,就好比一家汽车改装厂
	public static void show(Car c)//括号里是类类型参数，类类型的变量一定指向对象，或者null
	{
		c.num=4;
		c.color="white";

	}
	
	/* 
		匿名对象：没有名字的对象
		Car c=new Car();
		c.run();
		可以简写成：
		new Car().run();
		当对象对 方法（run） 仅进行 一次 调用时，可以用匿名对象进行简化。
	*/
 }
 