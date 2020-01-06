//定义一个功能，获取两个整数中较大的那个
import java.util.Scanner;
class FunctionTest3{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int x=getMax(a,b);
		System.out.println(x);
	}
	
	public static int getMax(int a,int b){
		int x;
		if(a>b){
			x=a;
		}else if(a<b){
			x=b;
		}else{
			x=0;
		}
		return x;
	}
	
}