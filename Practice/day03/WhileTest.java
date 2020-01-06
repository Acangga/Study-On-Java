class WhileTest{
	public static void main(String[] args){
		/* 
		累加思想：
		
		练习：计算1到10之和
		*/
		int a=0;
		int b=1;
		while(b<=10){
			a=a+b;
			//a+=b也可以
			b++;
		}
		System.out.println(a);
	}
}