/* 
	���ݿ��Գɼ���ȡѧ��������Ӧ�ĵȼ�
	90~100		A
	80~89		B
	70~79		C
	60~69		D
	60������	F
 */
 import java.util.Scanner;
class FunctionTest5{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("���������ķ���");
		int score=s.nextInt();
		char level=getLevel(score);
		System.out.println(level);
		
	}
	public static char getLevel(int score){
		char level;
		if(score>=90&&score<=100){
			level='A';
		}else if(score>=80&&score<=89){
			level='B';
		}else if(score>=70&&score<=79){
			level='C';
		}else if(score>=60&&score<=69){
			level='D';
		}else{
			level='F';
		}
		return level;
	}
}