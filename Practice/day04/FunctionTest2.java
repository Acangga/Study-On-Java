//����һ�����ܣ��Ƚ������Ƿ���ȡ�
import java.util.Scanner;
class FunctionTest2{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		boolean x=compare(a,b);
		System.out.println(x);
	}
	public static boolean compare(int a,int b){
		/* if(a==b){
			return true;
		}else{
			return false;
		} 
		̫������
		����Ԫ������أ�
		return (a==b)?true:false;
		ͬ����Щ�鷳��������������д��������һ�����⣺
		if��true��{
			true
		}
		��������棬�����棬�൱��д�ϻ�����
		*/
		return a==b;
	}
}