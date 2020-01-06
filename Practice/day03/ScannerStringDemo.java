import java.util.Scanner;
class ScannerStringDemo{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		System.out.println("你输入的字符串是"+a);
		String b=s.nextLine();
		System.out.println("你输入的字符串是"+b);
	}
}