/*
Ŀ�꣺ͨ��API�ĵ�ѧϰʹ��math���еķ�����������һ���������

1. �ҵ�math��
2. math������java.lang�������赼��
3. ���汾
4. ��math��Ľṹ��û���캯�������г�Ա���Ǿ�̬
5. ��method summary���ҵ���������������ķ���
6. �ҵ�random()������
7. �о�random()�����η�������ֵ���͡��Ͳ����б�
8. �ڳ����е���random()

*/
import java.util.Scanner;

class MathDemo{
	public static void main(String[] args){
		/* double a=Math.random();
		System.out.println(a);
		
		//������һ�ٸ��㵽һ�ټ�������
		for(int i=0;i<100;i++){
			int b=(int)(Math.random()*100)+1;
			System.out.println(b);
		} */
		new MathGame().game();
		
	}
}

/*
����������һ�����������С��Ϸ
������
	����һ��0-100���������a
	����һ������b
	
	�ж�b==a
	�����ȣ��������¶��ˡ�
	���b>a����������ˡ�
	���b<a�������С�ˡ�
	
	ѭ���������̣�ֱ��a==bΪtrue
	��Ϊѭ������δ֪���ж��������ӣ���������ѭ��
	
*/
class MathGame{
	public static void game(){
		int a=(int)(Math.random()*100)+1;
		for(;;){
			System.out.println("��������µ�����:");
			Scanner s=new Scanner(System.in);
			int b=s.nextInt();
			if(b==a){
				System.out.println("��¶���");
				return;
			}else if(b>a){
				System.out.println("����");
			}else{
				System.out.println("С��");
			}
		}
	}
}
