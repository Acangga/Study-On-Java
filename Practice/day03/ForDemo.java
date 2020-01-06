class ForDemo{
	public static void main(String[] args){
		/* 
		for循环语句：
		for(初始化表达式;条件判断表达式;循环后操作表达式)
		{
			执行语句（循环体）;
		}
		注：
		1.条件判断表达式既然是判断表达式，所以它的结果一定是Boolean类型，即true或者false。
		2.初始化表达式和循环后表达式并没有限制，只要是合法的表达式即可。
		
		for循环语句的执行过程：
		1.JVM读到for关键字，明白接下来要执行的是for循环语句。
		2.执行初始化表达式，初始化表达式只在第一次进入for循环时执行。
		3.执行条件判断表达式，对初始值进行判断，若结果为true，则执行循环体，若结果为false，终止for循环。
		4.循环体执行结束后，执行循环后操作表达式。
		5.重复步骤3和步骤4，直至条件判断表达式结果为false。		
		*/
		
		//常见的for循环样式
		for(int i=1;i<5;i++){
			System.out.println("i="+i);
		}
		
		//for循环也可以这样写
		int x=1;
		for(System.out.println("a");x<5;System.out.println("b")){
			System.out.println("c");
			x++;
		}
		//for循环的初始化语句、循环后执行语句可以写多个表达式，只需用逗号隔开即可。
		for(int a=1,b=2;a<3&&b<3;a++,b++){
			System.out.println("a="+a+"b="+b);
		}
		
	}
}