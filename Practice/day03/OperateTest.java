class OperateTest{
	public static void main(String[] args){
		//用最有效的方式算出2*8等于几？
		//直接进行位运算更高效
		System.out.println(2<<3);
		
		//对两个整数变量的值进行互换(不需要第三方变量)
		
		//用第三方变量的方式：开发时用，阅读性强
		int a=3,b=5;
		System.out.println("a="+a+",b="+b);
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("a="+a+","+"b="+b+","+"c="+c);
		
		//不用第三方变量的方式
		//不要用这种方式，因为如果a，b两个数的值过大，可能会超出int数据类型的范围，从而发生强制转换，导致数据变化。
		a=3;
		b=5;
		a=a+b;//a=3+5=8
		b=a-b;//b=8-5=3
		a=a-b;//a=8-3=5
		System.out.println("a="+a+",b="+b);
		
		//位运算的方式:面试时候用，考察异或位运算的规律，高效但阅读性差
		a=3;
		b=5;
		a=a^b;//a=3^5
		b=a^b;//b=(3^5)^5=3
		a=a^b;//a=(3^5)^3=5
		System.out.println("a="+a+",b="+b);
	}
}