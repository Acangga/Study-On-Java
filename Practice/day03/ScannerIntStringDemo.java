import java.util.Scanner;
class ScannerIntStringDemo{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("������ĵ�һ�������ǣ�"+a);
		/* �����ͨ��nextInt()��ȡ���������ٽ��Ŷ�ȡ�ַ�����
		���������ǻس�����:"\r\n",��ΪnextInt������ȡ������Ϣ���������ȡ�س�����"\r\n". 
		���ԣ������ҵ������Ҫ��ȡ�������󣬽��Ŷ�ȡ�ַ�������ô��Ӧ������ִ������nextLine()��
		��һ����ȡ�߻س����У��ڶ��β��Ƕ�ȡ�������ַ���
		*/
		String rn=s.nextLine();//�����ִ����һ��nextLine()���ͻ��ȡ/r/n����ȡ����֮����ַ�����ֱ��������ӡ
		String b=s.nextLine();
		System.out.println("��������ַ�����"+b);
	}
}