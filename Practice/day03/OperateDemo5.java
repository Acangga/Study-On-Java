class OperateDemo5{
	/*
	1Ϊtrue��0Ϊfalse
	&:��������λ����������
	|����������λ���л�����
	^����������λ���
	~��ȡ����
	<<:����  ���Ƽ�λ�����൱��ԭʼ���ݳ���2�ļ����ݡ���λ���ֵĿ�λ��0���롣
	>>:����  ���Ƽ�λ�����൱��ԭʼ���ݳ���2�ļ����ݣ�С����ȥ����λ���ֵĿ�λ��ԭ����ʲô����ʲô���룬��֤���Ų��䡣
	>>>���޷������ơ�������ʱ����λ���ֵĿ�λ������ԭ����λ��ʲô����λ����0���롣
	*/
	public static void main(String[] args){
		System.out.println(6&3);
		System.out.println(6|3);
		System.out.println(6^3);
		System.out.println(~6);
		
		System.out.println(3<<2);
		System.out.println(8>>2);
	}
}