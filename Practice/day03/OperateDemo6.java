class OperateDemo6{
	/* 三元运算符：括号里、问号前为条件，问号后冒号前为表达式1，冒号后为表达式2，若条件为true，则执行表达式1，若条件为false，则执行表达式2 */
	public static void main(String[] args){
		int x=3,y;
		y=(x>1)?100:200;
		System.out.println("y="+y);

	//获取两个整数中较大的整数
		int a=3,b=4;
		int max=a>b?a:b;
		System.out.println("max="+max);
		
	//获取三个整数中较大的整数
		int c=5,d=6,e=7;
		int temp=c>d?c:d;
		int max2=temp>e?temp:e;
		int max3=(c>d?c:d)>e?(c>d?c:d):e;//这样写的问题就是阅读性不强，容易让人看不懂
		System.out.println("max2="+max2+",max3="+max3);
		

	}
}


