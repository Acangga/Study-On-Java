class OperateDemo4{
	public static void main(String[] args){
		/*�߼��������ʲô�ã�
		������������boolean���͵ı��ʽ
		
		&:��
		true&true=true
		true&false=false
		false&true=flase
		false&false=false
		��ֻ���������ʽ�Ľ����Ϊtrueʱ������ʽ�Ľ����Ϊtrue�����κ�һ������Ϊfalse�������Ϊfalse��
		
		|:��
		true|true=true
		true|false=true
		false|true=true
		false|false=false
		�������ʽ����һ�����ʽ�Ľ��Ϊtrue�������Ϊtrue��
		
		^:���
		true^true=false
		true^false=true
		false^true=true
		false^false=false
		�������ʽ��������ͬ�����Ϊfalse���������ʽ��������ͬ�����Ϊtrue��
		
		!:��
		�ж��������һ��
		!true=false
		!false=true
		!!true=true
		
		&&:˫�루��·��
		��&����Ľ����һ���ģ�ֻ�����������һ������
		&������&��ߵı��ʽ���Ϊ�Σ����������ұߵı��ʽ��
		&&����ߵı��ʽΪfalseʱ���ұߵı��ʽ���������㡣��Ϊ��ߵı��ʽ�Ѿ�Ϊfalse�������ұߵı��ʽ���Ϊʲô��������Ӱ��������Ľ����
		
		||��˫�򣨶�·��
		��|����Ľ����һ���ģ�ֻ�����������һ������
		|������|��ߵı��ʽ���Ϊ�Σ����������ұߵı��ʽ��
		||����ߵı��ʽΪtrueʱ���ұߵı��ʽ���������㡣��Ϊ��ߵı��ʽ�Ѿ�Ϊtrue�������ұߵı��ʽ���Ϊʲô��������Ӱ��������Ľ����
		
		
		*/
		int x=6;
		//��
		System.out.println(x>2&x<5);//false
		//��
		System.out.println(x>2|x<5);//true
		//���
		System.out.println(x>2^x<5);//true
		//��
		System.out.println(!true);//false
		System.out.println(!(x>3));//false
	}
}