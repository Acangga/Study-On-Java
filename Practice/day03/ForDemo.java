class ForDemo{
	public static void main(String[] args){
		/* 
		forѭ����䣺
		for(��ʼ������ʽ;�����жϱ���ʽ;ѭ�����������ʽ)
		{
			ִ����䣨ѭ���壩;
		}
		ע��
		1.�����жϱ���ʽ��Ȼ���жϱ���ʽ���������Ľ��һ����Boolean���ͣ���true����false��
		2.��ʼ������ʽ��ѭ�������ʽ��û�����ƣ�ֻҪ�ǺϷ��ı���ʽ���ɡ�
		
		forѭ������ִ�й��̣�
		1.JVM����for�ؼ��֣����׽�����Ҫִ�е���forѭ����䡣
		2.ִ�г�ʼ������ʽ����ʼ������ʽֻ�ڵ�һ�ν���forѭ��ʱִ�С�
		3.ִ�������жϱ���ʽ���Գ�ʼֵ�����жϣ������Ϊtrue����ִ��ѭ���壬�����Ϊfalse����ֹforѭ����
		4.ѭ����ִ�н�����ִ��ѭ�����������ʽ��
		5.�ظ�����3�Ͳ���4��ֱ�������жϱ���ʽ���Ϊfalse��		
		*/
		
		//������forѭ����ʽ
		for(int i=1;i<5;i++){
			System.out.println("i="+i);
		}
		
		//forѭ��Ҳ��������д
		int x=1;
		for(System.out.println("a");x<5;System.out.println("b")){
			System.out.println("c");
			x++;
		}
		//forѭ���ĳ�ʼ����䡢ѭ����ִ��������д�������ʽ��ֻ���ö��Ÿ������ɡ�
		for(int a=1,b=2;a<3&&b<3;a++,b++){
			System.out.println("a="+a+"b="+b);
		}
		
	}
}