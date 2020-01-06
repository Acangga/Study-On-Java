class FunctionDemo2{
/* 
	定义函数的思路：两个明确
	1.明确返回值的类型。
	2.明确参数列表，即明确形式参数的数量和类型。
	注意：返回值的类型和参数的类型没有必然联系，可以一样，可以不一样。
*/
	public static void main(String[] args){
		int sum=add(5,6);
		System.out.println(sum);
	}
	
	public static int add(int a,int b){
		int sum=a+b;
		return sum;
	}
}