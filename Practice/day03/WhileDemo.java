class WhileDemo{
	public static void main(String[] args){
		/* 
		while(�������ʽ)
		{
			ִ�����;
		}
		*/
		int x=1;
		while(x<3)//�ڴ˴����ϣ��Ļ����ͻᵼ�¼�������ϵض�x<3�����жϣ�������ִ�������ж����
		{
			System.out.println("x="+x);
			x++;
		}
		
		/* 
		do
		{
			ִ�����;
		}while(�������ʽ);
		*/
		int y=1;
		do{
			System.out.println("y="+y);
			y++;
		}while(y<3);
		/* 
		do while��while������
		do while����ִ��ѭ���壬���ж�����������ѭ��������ִ��һ�Σ�
		��while���Ƚ��������жϣ���ִ��ѭ���壬���Ը��������仯���ܲ�ִ��ѭ���塣
		*/
		int a=1;
		while(a<1)
		{
			System.out.println("a="+a);
			a++;
		}
		int b=1;
		do{
			System.out.println("b="+b);
			b++;
		}while(b<1);
	}
}