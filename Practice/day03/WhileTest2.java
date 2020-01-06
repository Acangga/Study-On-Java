class WhileTest2{
	public static void main(String[] args){
		/* 
		
		计数器思想
		
		练习：计算100以内6的倍数的个数
		
		思路：
		1.定义一个变量来计算一个数是否是6的倍数；
		2.定义一个变量来记录6的倍数的个数；
		3.循环计算所有100以内的整数并记录6的倍数的个数；
		3.输出6的倍数的个数；
		*/
		/*
		方法一
		int cal=0;
		int sum=0;
		 do{
			cal++;
			if(cal%6==0){
				sum++;
			}
		}while(cal<=100); 
		System.out.println(sum);
		*/
		
		// 方法二
		int x=1;
		int count=0;
		while(x<=100){
			if(x%6==0){
				count++;
			}
			x++;
		}
		System.out.println(count);
	}
}