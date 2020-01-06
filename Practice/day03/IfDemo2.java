class IfDemo2{
	public static void main(String[] args){
		/*
		if语句的第二种格式
		if(条件语句)
		{
		执行语句；
		}else//否则
		*/
		int x=1;
		if(x>1){
		System.out.println("yes");
		}else{
		System.out.println("no");
		}
		System.out.println("Hello World!");
		
		int a=3,b;
		if(a>1){
			b=100;
			System.out.println(b);
		}else{
			b=200;
			System.out.println(b);
		}
		System.out.println(b);
		/* b未被初始化时无法被打印，而在if else语句中，b必然会获得一个值，所以可以被打印输出？ */
		
		b=a>1?100:200;
		/*
		三元运算符就是if else的简写形式，作为运算符它必须有结果，然而if else语句可以没有结果。
		那么三元运算符什么时候使用？
		当if else 运算后有一个具体结果时可以使用三元运算符简化
		*/
	}
}