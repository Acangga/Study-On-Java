
class MainDemo{
	public static void main(String[] args){
		System.out.println(args);
		/* �����[Ljava.lang.String;@15db9742
			[�������飻L��ʾ�����ܳ���
			java.lang.String����java.lang���е�String����Ҳ���������е�Ԫ��������String��
			@15db9742��ʵ��洢�ĵ�ַ�Ĺ�ϣֵ��
			���Ͻ��֤��JVM�ڵ���������ʱȷʵ��main��������һ��Ԫ�����ַ������͵�����ʵ���ȥ��
		*/
		
		//��ô��������г�����
		System.out.println(args.length);
		/* �����0 
			��˵��JVM���� new String[0] ����һ��������
			���ƺ�û�����塣
			��֮������������������һ�������б���Ϊ��������������java�����ʱ����Դ���һЩ������Ҫ�Ĳ�����
			���Ǹ�ʹ�ó���������µ���ڡ�
			��֮����ѡ����String[]���͵Ĳ���������Ϊ�ַ������Լ������֣���ĸ�����͵����ݣ����Խ��ַ���ת��Ϊ�������͵����ݣ�
			�����ַ�������ͨ�õ��������ͣ���Ϊ�������û����������ݵ���������ѡ����Ԫ������Ϊ�ַ���������String[]��
		*/
		
		/* ��ô������ô��������أ������ڿ���ֱ̨�Ӵ������ 
			����ֱ���ڿ���̨���룺java MainDemo haha hehe xixi����Ҫ����Ĳ�����
			���Ǳ���һ����������б����������Ǹոմ���Ĳ���һ�¡�
		*/
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
	}
	
	public static void main(String[] x){
		System.out.println("ooooo");
	}
	/* 
	MainDemo.java:32: ����: ������ MainDemo�ж����˷��� main(String[])
        public static void main(String[] x){
	*/
}