class ForTest2{
	public static void main(String[] args){
		//打印矩形
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//打印正直角三角形
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//打印倒直角三角形
		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--){
				System.out.print("*");//为了让打印次数随着行数增加越来越少，所以让变量j从一个较大数字递减，并控制其始终比行数大
			}
			System.out.println();
		}
		System.out.println();
		
		//打印等腰三角形
		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){//这里2跟之间一定要有乘号*
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//用while循环打印正直角三角形
		int i=1;
		int j=1;
		while(i<=5){
			j=1;
				/* 因为j的作用域是while循环所处的大括号，所以当while循环体中的j自增之后，
				在j的作用域中j的值永久增大了，所以需要重新将其初始化为1。
				
				如果没有j=0给j重新赋值，那么第一次循环时的情况如下：
				进入while外层循环，此时i=1，j=1，判断语句判断i<=5为true，进入循环体，开始执行内部while循环，
				判断j<=i的结果为true，进入内部while循环的循环体，打印一个星号“*”，然后j++，此时i=1，j=2，
				进入循环判断表达式,表达式判断j<=i结果为false，内部while循环结束，执行System.out.println();
				执行i++，执行外层while循环的条件判断语句，此时i=2，j=2，判断i<=5结果为true，进入内层while循环，
				执行内层while循环的条件判断语句，判断j=2<=i=2的结果为true，进入循环体，打印一个星号……
				外层循环执行5次，内层循环也只执行了5次，整个while循环结束，因为j始终随着i增大而增大，所以只打印了五个星号，
				而没有打印出三角形。
				
				使用嵌套for循环时，每次外层循环运行一次，重新进入内层for循环时，初始化语句都会对j进行初始化，所以在打印三角形时，
				更加简便。
				*/
			while(j<=i){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			
		}
		
		System.out.println();
		
		//打印倒等腰三角形
		for(int x=1;x<=5;x++){
			for(int y=1;y<=x;y++){
				System.out.print(" ");
			}
			for(int y=9;y>=2*x-1;y--){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		for(int x=1;x<=5;x++){
			for(int y=1;y<=x;y++){
				System.out.print(" ");
			}
			for(int y=2*x-1;y<=9;y++){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		/*
		
		* * * * * 
		-* * * *
		--* * * 
		---* * 
		----*

		*/
		for(int x=1; x<=5; x++)
		{
			for(int y=1; y<x; y++)
			{
				System.out.print(" ");
			}
			
			for(int z=x; z<=5; z++)
			{
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}