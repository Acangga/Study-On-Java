import java.util.Scanner;

class FunctionTest{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("��������εĿ�");
		int a=s.nextInt();
		System.out.println("��������εĳ�");
		int b=s.nextInt();
		System.out.println();
		rectangle(a,b);
	}
	
	//��ϰ1������һ�����ܣ����Ǻ��ڿ���̨��ӡ��һ�����ε���
	public static void rectangle(int a,int b){		
		for(int i=1;i<=a;i++){
			for(int j=1;j<=b;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}