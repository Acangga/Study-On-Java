import java.util.Scanner;
class ScannerTestBMI{
	public static void main(String[] args){
		//����Scanner
		Scanner s=new Scanner(System.in);
		
		// ��֪�û�������ʽ����ȡ�������
		System.out.println("�����������ߣ�m��");
		float height=s.nextFloat();
		// �ж������Ƿ�Ϸ�
		if(height>0&&height<5){
			System.out.println("���:"+height+"m");
		}else{
			System.out.println("�������������ݲ��Ϸ�");
		}
		
		
		// ��֪�û�������ʽ����ȡ��������
		System.out.println("������������أ�kg��");
		float weight=s.nextFloat();
		// �ж������Ƿ�Ϸ�
		if(weight>0&&weight<500){
			System.out.println("����:"+weight+"kg");
		}else{
			System.out.println("��������������ݲ��Ϸ�");
		}
		
		
		// ����BMI
		float BMI=weight/(height*height);
		System.out.println("BMI:"+BMI);
		
		/* 
		����BMI�жϵ�ǰ����״��
		(0,18.5) ƫ��
		[18.5,24) ��׼
		[24,27) ����
		[27,30) ��ȷ���
		[30,35) �жȷ���
		[35,����� �ضȷ���		
		*/
		if(BMI<18.5&&BMI>0){
			System.out.println("����ǰ������״��Ϊ��ƫ�ݡ�");
		}else if(BMI>=18.5&&BMI<24){
			System.out.println("����ǰ������״��Ϊ����׼��");
		}else if(BMI>=24&&BMI<27){
			System.out.println("����ǰ������״��Ϊ�����ء�");
		}else if(BMI>=27&&BMI<30){
			System.out.println("����ǰ������״��Ϊ����ȷ��֡�");
		}else if(BMI>=30&&BMI<35){
			System.out.println("����ǰ������״��Ϊ���жȷ��֡�");
		}else if(BMI>=35){
			System.out.println("����ǰ������״��Ϊ���ضȷ��֡�");
		}else{
			System.out.println("����������ݲ��Ϸ�");
		}
	} 
}