class OperateDemo2{
	public static void main(String[] args){
	//��ֵ����� = ��+=��-=��+=��/=��%=
	//int a=b=c=4;
	int a=1;
	a+=2;//a=a+2
	
	short s=3;
	s+=4;
	/*�����д��붼�����ڸ�ֵ����һ�����㣬�������͸�ֵ��short���ǣ�java�����ֵ���м�飬�Ƿ����װ���Ӧ�����������У�������ԣ���ô������Զ���������,
	���Ա��벻�ᱨ��*/
	System.out.println("s="+s);
	//s=(short)(s+4);
	s=s+4;
	/* �޷�ͨ�����룬��ΪsΪshort�ͣ��ڽ���s+4����ʱ���Ѿ������Զ����������������int�ͣ��޷��ٸ�ֵ��short�͵�s�����Ա��뱨��	*/
	System.out.println("s="+s);
	
	
	}
}