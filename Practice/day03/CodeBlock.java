class CodeBlock{
	public static void main(String[] args){
		if(false){
			System.out.println("false");
		}else{
			System.out.println("ture");
		}//此时输出为true
		
		if(false);
		{
			System.out.println("false");
		}//此时输出为false，因为我们在if(false)后面加了个分号，分号和大括号是标志语句结束的符号，所以if(false)和后面大括号里的代码块就没有了任何关系。
		
		int x=3;
		System.out.println(x);
		System.out.println(x);
		//正常输出两个3
		
		{
		int y=4;
		System.out.println(y);
		}
		System.out.println(y);
		//22行报错，找不到变量y，是因为此打印语句已超出了局部变量y的作用范围
		/* 
			主函数里的任何变量都是局部变量，都只在他们自己的大括号范围（作用域）中存在，
			离开自己的作用域后，该变量原本占用的内存就会被释放，该变量也不复存在。
			这也就是用大括号包括一些代码块，制造局部代码块的作用之一，即释放一些在后面已经用不到的内存空间。
		*/
	}
}