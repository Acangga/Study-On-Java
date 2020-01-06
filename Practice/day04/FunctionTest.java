import java.util.Scanner;

class FunctionTest{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("请输入矩形的宽");
		int a=s.nextInt();
		System.out.println("请输入矩形的长");
		int b=s.nextInt();
		System.out.println();
		rectangle(a,b);
	}
	
	//练习1：定义一个功能，用星号在控制台打印出一个矩形点阵。
	public static void rectangle(int a,int b){		
		for(int i=1;i<=a;i++){
			for(int j=1;j<=b;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}