//final 修饰类
final class Father{
	int a=1;
}

class Son extends Father{
	
}
/* 错误: 无法从最终Father进行继承
class Son extends Father{  */


//用final修饰方法
class Mother{
	String a="String";
	final void show(){
		System.out.println(a);
	}
}

class Daughter extends Mother{
	void show(){
			System.out.println("lalalalalala");
	}
	/* 错误: Daughter中的show()无法覆盖Mother中的show()
        void show(){
             ^
  被覆盖的方法为final */
}

class FinalDemo{
	public static void main(String[] args){
		final int x=1;
		x=10;
		/* 错误: 无法为最终变量x分配值
                x=10; */
	}
}