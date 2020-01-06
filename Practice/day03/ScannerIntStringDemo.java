import java.util.Scanner;
class ScannerIntStringDemo{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("你输入的第一个整数是："+a);
		/* 如果在通过nextInt()读取了整数后，再接着读取字符串，
		读出来的是回车换行:"\r\n",因为nextInt仅仅读取数字信息，而不会读取回车换行"\r\n". 
		所以，如果在业务上需要读取了整数后，接着读取字符串，那么就应该连续执行两次nextLine()，
		第一次是取走回车换行，第二次才是读取真正的字符串
		*/
		String rn=s.nextLine();//如果不执行这一次nextLine()，就会读取/r/n，读取不到之后的字符串，直接跳到打印
		String b=s.nextLine();
		System.out.println("你输入的字符串是"+b);
	}
}