class IfDemo2{
	public static void main(String[] args){
		/*
		if���ĵڶ��ָ�ʽ
		if(�������)
		{
		ִ����䣻
		}else//����
		*/
		int x=1;
		if(x>1){
		System.out.println("yes");
		}else{
		System.out.println("no");
		}
		System.out.println("Hello World!");
		
		int a=3,b;
		if(a>1){
			b=100;
			System.out.println(b);
		}else{
			b=200;
			System.out.println(b);
		}
		System.out.println(b);
		/* bδ����ʼ��ʱ�޷�����ӡ������if else����У�b��Ȼ����һ��ֵ�����Կ��Ա���ӡ����� */
		
		b=a>1?100:200;
		/*
		��Ԫ���������if else�ļ�д��ʽ����Ϊ������������н����Ȼ��if else������û�н����
		��ô��Ԫ�����ʲôʱ��ʹ�ã�
		��if else �������һ��������ʱ����ʹ����Ԫ�������
		*/
	}
}