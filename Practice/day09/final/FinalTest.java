class Father{
	int age=50;
}

class FinalTest{
	public static void main(String[] args){
		//�������͵ı����������Ա����¸�ֵ
		
		final int x=1;
		
		//x=10;
		/* 
		����: �޷�Ϊ���ձ���x����ֵ
                x=10;
		*/
		
		//�������͵ı�����������ָ���ʵ���еĶ�������ĳ�Ա�������Ա����¸�ֵ���������ñ������׵�ֵַ���ܱ����¸��衣
		final Father f=new Father();
		System.out.println(f.age);
		f.age=500;
		System.out.println(f.age);
		//��Ա����age���Ա����¸�ֵ
		
		f=new Father();
		/* ����: �޷�Ϊ���ձ���f����ֵ
                f=new Father(); 
		
		����Ҫ�ø����ñ���ָ����һ��ʵ���������¸�������һ���׵�ֵַ�����ǲ����Ե�
				*/
		
	}
}