class OperateDemo6{
	/* ��Ԫ�������������ʺ�ǰΪ�������ʺź�ð��ǰΪ���ʽ1��ð�ź�Ϊ���ʽ2��������Ϊtrue����ִ�б��ʽ1��������Ϊfalse����ִ�б��ʽ2 */
	public static void main(String[] args){
		int x=3,y;
		y=(x>1)?100:200;
		System.out.println("y="+y);

	//��ȡ���������нϴ������
		int a=3,b=4;
		int max=a>b?a:b;
		System.out.println("max="+max);
		
	//��ȡ���������нϴ������
		int c=5,d=6,e=7;
		int temp=c>d?c:d;
		int max2=temp>e?temp:e;
		int max3=(c>d?c:d)>e?(c>d?c:d):e;//����д����������Ķ��Բ�ǿ���������˿�����
		System.out.println("max2="+max2+",max3="+max3);
		

	}
}


