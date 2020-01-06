import java.util.Scanner;
class ScannerDemo{
	public static void main(String[] args){
		Scanner ins=new Scanner(System.in);
		int a=ins.nextInt();
		System.out.println("你输入的第一个整数是："+a);
		int b=ins.nextInt();
		System.out.println("你输入的第二个整数是："+b);
	}
}