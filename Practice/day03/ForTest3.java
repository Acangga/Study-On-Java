class ForTest3{
	public static void main(String[] args){
		/* 
		��ӡ�žų˷���
		1*1=1
		1*2=2 2*2=4
		1*3=3 2*3=6 3*3=9
		...
		1*9=9 ......9*9=81
		*/
		for(int x=1;x<=9;x++){
			for(int y=1;y<=x;y++){
				System.out.print(y+"*"+x+"="+y*x+"\t");
				/* \tΪ�Ʊ���������԰������ߵ��ַ����ֱ�ŵ���������excel�еĵ�Ԫ��һ���ĸ����У�
				������롣���Լ����������ַ�����aaaaa�������Ʊ�������ڲ�ͬλ�÷ֿ�����aa\taaa������aaaa\ta��,
				���������Ļ�����ʱ���Ʊ��\t����ġ�aaa���͡�a��Ҳ�Ƕ�����ͬһ���ϵġ� */
			}
			System.out.println();
		}
		/* 
		\t:ת���ַ�table���Ʊ��
		\b:ת���ַ�backspace���˸�
		\n:ת���ַ�enter���س�
		\r:ת���ַ����»س���
		
		\r��\n������ʲô��ϵ��
		��windowsϵͳ�лس�������ʵ����\r\n������������ɵ�
		linux�лس�������\n
		*/
		System.out.println("Hello\nWorld");
		System.out.println("Hello\r\nWorld");
		System.out.println("Hello\bWorld");
		System.out.println("\"HelloWorld\"");//���ӡ�������ַ�",��Ҫ��\�������Ϊת���ַ�����ʾΪ\"
		System.out.println("\\HelloWorld\\");//���ӡ�������ַ�\����Ҫ��\�������Ϊת���ַ�����ʾΪ\\
		
		
	}
}
