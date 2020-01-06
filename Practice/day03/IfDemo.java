class IfDemo{
	public static void main(String[] args){
		//if语句的三种格式
		/*
		if语句的第一种格式
		if(条件表达式)
		{
		执行语句；
		}
		*/
		int x=3;
		if(x>1){
			System.out.println("yes");
		}
		System.out.println("over");
		/* 
		当条件语句为单条语句时大括号可以省略
		如：
		if(x>1){
		System.out.println("x="+x);	
		}
		（单条语句不是单行语句，一个if判断语句可以被视为单条语句，因为它是一个整体）
		 */
		
	}
}