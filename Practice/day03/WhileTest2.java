class WhileTest2{
	public static void main(String[] args){
		/* 
		
		������˼��
		
		��ϰ������100����6�ı����ĸ���
		
		˼·��
		1.����һ������������һ�����Ƿ���6�ı�����
		2.����һ����������¼6�ı����ĸ�����
		3.ѭ����������100���ڵ���������¼6�ı����ĸ�����
		3.���6�ı����ĸ�����
		*/
		/*
		����һ
		int cal=0;
		int sum=0;
		 do{
			cal++;
			if(cal%6==0){
				sum++;
			}
		}while(cal<=100); 
		System.out.println(sum);
		*/
		
		// ������
		int x=1;
		int count=0;
		while(x<=100){
			if(x%6==0){
				count++;
			}
			x++;
		}
		System.out.println(count);
	}
}