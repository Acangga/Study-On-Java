/*
Ӧ�ü̳�дһ��demo
����Teacher���Student�����̳�Person��

Person��Ĺ���
��Ա������name��age
���캯�����ղΡ�����
��Ա������getXxx��setXxx

*/
class Person{
	private String name;
	private int age;
	Person(){
		
	}
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	void setName(String name){
		this.name=name;
	}
	String getName(){
		return name;
	}
	
	void setAge(int age){
		this.age=age;
	}
	int getAge(){
		return age;
	}
}

class Student extends Person{
	Student(){
		
	}
	Student(String name,int age){
		super(name,age);
		/* 
		this.name=name;
		this.age=age;
		����д��Ļ����ù��췽����ȥ���ø�����޲ι��췽����
		��Ա����name��age��ֵ�ᱻ��ʼ��ΪĬ��ֵnull��0��
		����������super�ؼ�����ʽ���ø���Ĵ��ι��캯����
		*/
	}
}

class Teacher extends Person{
	Teacher(){
		
	}
	Teacher(String name,int age){
		super(name,age);
	}
}


class ExtendsTest{
	public static void main(String[] args){
		//ѧ����
		//���Է���һ
		Student s=new Student();
		s.setName("LiMing");		
		s.setAge(12);		
		System.out.println("ѧ����"+s.getName()+":"+s.getAge());
		//���Է�����
		Student s1=new Student("LiMing",12);
		System.out.println("ѧ����"+s1.getName()+":"+s1.getAge());
		
		//��ʦ��
		//���Է���һ
		Teacher t=new Teacher();
		t.setName("Jenny");
		t.setAge(18);
		System.out.println("��ʦ��"+t.getName()+":"+t.getAge());
		//���Է�����
		Teacher t1=new Teacher("Jenny",18);
		System.out.println("��ʦ��"+t1.getName()+":"+t1.getAge());
		
	}
}