class FunctionDemo{
	public static void main(String[] args){
		HelloWorld();
		HelloWorld();
		int x=Demo1(4,5);
		System.out.println(x);
		Demo2(5,5);
	}
	/* 
	���庯���ĸ�ʽ
	���η� ����ֵ ������(�������� ��ʽ����1,�������� ��ʽ����2,����)
	{
		ִ�����;
		return ����ֵ;
	}
	
	���������
	
	�÷���û�о��巵��ֵ
	��ʱ��return��ֱ���÷ֺŽ�����
	��Ϊû�о���ķ���ֵ��Ҳ��û�з���ֵ���ͣ���java��ֻ����һ���ؼ�������ʾ���������
	����ؼ�����void��
	��û�о��巵��ֵʱ����void����ʾ����ֵ���͡�
	�������ֵ����Ϊvoid�������е�return������ʡ�Բ�д��
	
	ʹ�ú���ʱ��ע�����
	���庯�����Խ����ܴ�����з�װ���Ա��ڶԸù��ܽ��и��ã��Ӷ�����˴���ĸ����ԣ�
	����ֻ�б����òŻᱻ�����ִ�У�
	��һ�������У�ֻ�ܵ�����һ�����������ܶ�����һ��������
	���庯��ʱ�������Ľ��Ӧ�÷��ظ������ߣ����������ߴ�������Ҫ�ڶ��庯��ʱ�ͽ�������Ȳ����������·�Demo��
	*/
	public static void HelloWorld(){
		System.out.println("Hello World!");
	}
	public static int Demo1(int a,int b){
		return a+b;
	}//������ʹ��������ʽ�������ý���������ȥ��
	public static void Demo2(int a,int b){
		System.out.println(a+b);
		return;
	}
}