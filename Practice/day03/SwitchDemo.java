class SwitchDemo{
	public static void main(String[] args){
		/* 
		switch ���:
		
		switch(���ʽ)
		{
			case ȡֵ1:
			ִ�����;
			break;
			case ȡֵ2:
			ִ�����;
			break;
			����
			default:
			ִ�����;
			break;
		}
		*/
		int x=3;
		switch(x){
			case 1:
			System.out.println("x="+x);
			break;
			case 2:
			System.out.println("x="+x);
			break;
			case 3:
			System.out.println("x="+x);
			break;
			default:
			System.out.println("��֪��x���ڶ���");
			break;
		}
		
		/* switch�����ص� */
		/* 1. switch���ѡ�����������ֻ�����֣�byte��short��int��char */
		int a=6,b=3;
		char opt='/';
		switch(opt){
			case '+':
			System.out.println(a+b);
			break;
			case '-':
			System.out.println(a-b);
			break;
			case '*':
			System.out.println(a*b);
			break;
			case '/':
			System.out.println(a/b);
			break;
			default:
			System.out.println("�޷�ʶ����������");
			break;
			//��Ҫ�Ѵ����1��ߵĵ㵱���˷ֺ��ұߵĵ㣬�ֺ��ұߵĵ���ǵ����š�
		}
		/* 2. ����case��default֮��û��˳���ϵ����ʹ��default������ǰ�棬Ҳ����ִ�е�һ��case��
		������caseִ����Ϻ󣬱��ʽ����������case����ʱ���Ż�ִ��default��*/
		switch(x){
			default:
			System.out.println("��֪��x���ڶ���");
			break;
			case 1:
			System.out.println("x="+x);
			break;
			case 2:
			System.out.println("x="+x);
			break;
			case 3:
			System.out.println("x="+x);
			break;			
		}
		/* 
		3. switch���ֻ������break��ִ�е��������Ż�ֹͣ�������������ţ���
		��ˣ����ƥ���case��defaultû�ж�Ӧ��break��䣬��ôswitch�������ִ�У�ֱ������break�����ߴ����š�
		*/
		int y=4;
		switch(y){
			default:
			System.out.println("a");
			//break;
			case 1:
			System.out.println("b");
			//break;
			case 2:
			System.out.println("c");
			//break;
			case 3:
			System.out.println("d");
			break;
		}
	}
}