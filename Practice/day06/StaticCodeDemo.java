/* 
	��̬����飺
	static{}
	������ļ��ض�ִ�У����ڸ�������ڼ�ִֻ��һ�Ρ�
	
	�ô���
	���ڶ�����г�ʼ����һ���������г�Ա��Ϊ��̬���ࡣ
	��Ϊ�������г�Ա��Ϊ��̬���࣬û�б�Ҫȥ����������ôҲ���޷����ù��캯����ʼ�������еĳ�Ա��
	�������ǿ����þ�̬������������еĳ�Ա���г�ʼ�����ҿ��Խ��жಽ��ĸ��Ӳ�����
	
	
	�������飺
	class Demo{
		{}���ǹ�������
		
		public void func(){
			{}���Ǿֲ������
		}
	}
	�����������Ŷ���Ĵ�����ִ�У�ÿ����һ�����󣬾ͻ�ִ��һ�Σ������ڹ��캯��ִ�С�
	
	���ã�������������г�ʼ����
	���캯����ʼ���ĳ�Աһ���Ǹ�����������еĳ�Ա�������캯������ʼ���ĳ�Ա���ض���ĳЩ�����������Ӧ�ĳ�Ա��

	
 */
class StaticCode{
	static int num;
	static{
		num=10;
		num+=10;
		System.out.println(num);
	}
	static void show(){
		System.out.println("hello");
	}
}

class Person{
	private String name;
	
	{
		cry();//���б�����������ޡ�
	}
	public void cry(){
		System.out.println("�޵����۵ã�");
	}//��ʱname��ֵ����null������˵�����캯����ûѹջִ�С�
	
	//�еı�������û���֣����ض��Ķ���ĳ�Ա���г�ʼ����
	Person(){
		this.name="baby";
	}
	
	//�еı������������֣����ض��Ķ���ĳ�Ա���г�ʼ����
	Person(String name){
		this.name=name;
	}
	public void loud(){
		System.out.println(name);
	}
}

class StaticCodeDemo{
	public static void main(String[] args){
		StaticCode.show();
		StaticCode.show();//�ظ�����show()�������ظ����ظ��࣬���Ծ�̬�����Ҳֻ��ִ��һ�Ρ�
		Person p=new Person();
		p.loud();
		Person p1=new Person("LiMing");
		p1.loud();
	}
}