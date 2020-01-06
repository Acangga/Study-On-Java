class FunctionDemo{
	public static void main(String[] args){
		HelloWorld();
		HelloWorld();
		int x=Demo1(4,5);
		System.out.println(x);
		Demo2(5,5);
	}
	/* 
	定义函数的格式
	修饰符 返回值 函数名(参数类型 形式参数1,参数类型 形式参数2,……)
	{
		执行语句;
		return 返回值;
	}
	
	特殊情况：
	
	该方法没有具体返回值
	这时在return后直接用分号结束。
	因为没有具体的返回值，也就没有返回值类型，在java中只能用一个关键字来表示这种情况。
	这个关键字是void。
	即没有具体返回值时，用void来表示返回值类型。
	如果返回值类型为void，函数中的return语句可以省略不写。
	
	使用函数时的注意事项：
	定义函数可以将功能代码进行封装，以便于对该功能进行复用，从而提高了代码的复用性；
	函数只有被调用才会被计算机执行；
	在一个函数中，只能调用另一个函数，不能定义另一个函数；
	定义函数时，函数的结果应该返回给调用者，交给调用者处理，而不要在定义函数时就进行输出等操作。（见下方Demo）
	*/
	public static void HelloWorld(){
		System.out.println("Hello World!");
	}
	public static int Demo1(int a,int b){
		return a+b;
	}//开发中使用这种形式，将调用交给主函数去做
	public static void Demo2(int a,int b){
		System.out.println(a+b);
		return;
	}
}