class CodeBlock{
	public static void main(String[] args){
		if(false){
			System.out.println("false");
		}else{
			System.out.println("ture");
		}//��ʱ���Ϊtrue
		
		if(false);
		{
			System.out.println("false");
		}//��ʱ���Ϊfalse����Ϊ������if(false)������˸��ֺţ��ֺźʹ������Ǳ�־�������ķ��ţ�����if(false)�ͺ����������Ĵ�����û�����κι�ϵ��
		
		int x=3;
		System.out.println(x);
		System.out.println(x);
		//�����������3
		
		{
		int y=4;
		System.out.println(y);
		}
		System.out.println(y);
		//22�б����Ҳ�������y������Ϊ�˴�ӡ����ѳ����˾ֲ�����y�����÷�Χ
		/* 
			����������κα������Ǿֲ���������ֻ�������Լ��Ĵ����ŷ�Χ���������д��ڣ�
			�뿪�Լ���������󣬸ñ���ԭ��ռ�õ��ڴ�ͻᱻ�ͷţ��ñ���Ҳ�������ڡ�
			��Ҳ�����ô����Ű���һЩ����飬����ֲ�����������֮һ�����ͷ�һЩ�ں����Ѿ��ò������ڴ�ռ䡣
		*/
	}
}