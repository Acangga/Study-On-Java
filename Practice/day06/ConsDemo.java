class Person{
	private String name;
	private int age;
	//����һ��Person��Ĺ��캯��
	/* 
	���캯�������졢��������ʱ���õĺ�����
	���ã����Խ������ʼ�������󲻾���ʼ���޷�ʹ�á�
	������������ͨ�����캯�������г�ʼ����
	
	һ���������û�ж��幹�캯������ô����ʱ���Զ�����һ���չ��캯����
	������Person���о���Person(){}�չ��캯����
	���������Ϊ�����˹��캯������ô�Ͳ������Զ�����չ��캯����
	
	��ôһ�㺯���͹��캯����ʲô����
	���캯����1.��������ʱ���ͻᴴ����֮��Ӧ�Ĺ��캯�����������ʼ����
				2.
	һ�㺯���������������Ҫ��������ʱ�Ŷ�����е��á�
	*/
	Person(){//������캯�����ǿղ�����,��ô����Ĭ������˳���ʱ��û�����ֵ�
		name="baby";
		age=0;
		System.out.println("Person Run");
	}
	//���е��˳���ʱ����������
	Person(String n){
		name=n;
	}
	//�е��˳���ʱ���������ֺ����䣨Ц��
	Person(String n,int a){
		name=n;
		age=a;
	}
	//�ں����У����в���˳��ͬ����������Ҳ�ǲ�ͬ��
	Person(int a,String n){
		name=n;
		age=a;
	}
	
	public void speak(){
		System.out.println(name+":"+age);
	}
	public void setName(String n){
		name=n;
	}
	public String getName(){
		return name;
	}
	public void setAge(int a){
		age=a;
	}
	public int getAge(){
		return age;
	}
}

class ConsDemo{
	public static void main(String[] args){
		Person p=new Person();
		Person p1=new Person("LiMing");
		Person p2=new Person("LiMing",12);
		Person p3=new Person(12,"LiMing");
		p.speak();
		p1.speak();
		p2.speak();
		p3.speak();
		
		
	}
}