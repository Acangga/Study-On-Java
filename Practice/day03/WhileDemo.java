class WhileDemo{
	public static void main(String[] args){
		/* 
		while(条件表达式)
		{
			执行语句;
		}
		*/
		int x=1;
		while(x<3)//在此处加上；的话。就会导致计算机不断地对x<3进行判断，即反复执行条件判断语句
		{
			System.out.println("x="+x);
			x++;
		}
		
		/* 
		do
		{
			执行语句;
		}while(条件表达式);
		*/
		int y=1;
		do{
			System.out.println("y="+y);
			y++;
		}while(y<3);
		/* 
		do while与while的区别：
		do while是先执行循环体，再判断条件，所以循环体至少执行一次；
		而while是先进行条件判断，再执行循环体，所以根据条件变化可能不执行循环体。
		*/
		int a=1;
		while(a<1)
		{
			System.out.println("a="+a);
			a++;
		}
		int b=1;
		do{
			System.out.println("b="+b);
			b++;
		}while(b<1);
	}
}