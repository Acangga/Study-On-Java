/* 
	函数的重载（overload）：
	1.在同一个类中；
	2.函数名相同（java中的函数名只代表功能，相同功能就可以有相同函数名）；
	3.参数个数or参数类型不同。
	4.函数的重载和返回值类型无关，只要函数名和参数列表相同就无法通过编译。
	5.如果函数的调用出现不确定性，会出现编译错误。
	
	作用：
	当函数的功能相同时，给函数取相同的函数名，用参数列表的不同来区别函数，让计算机自动分别运行不同的函数，从而提高代码阅读性。
 */
class FunctionDemo3{
	public static void main(String[] args){
		add(3,4);
		printCFB();
	}
	//计算两个整数的和
	public static int add(int a,int b){
		return a+b;
	}
	//计算两个小数的和
	public static double add(double a,double b){
		return a+b;
	}
	//计算三个整数的和
	public static int add(int a,int b,int c){
		return a+b+c;
	}
	
	//打印九九乘法表
	public static void printCFB(int num){
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}
	
	public static void printCFB(){
		printCFB(9);
	}
}