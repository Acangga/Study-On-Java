class Person{
	private String name;
	private int age;
	static String country="CN";
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void show(){
		System.out.println(Person.country+":"+this.name+":"+this.age);
		//�˴�������Աǰ��Person. this. ����ʡ�ԣ���д�Ͽ�����ߴ���Ŀɶ��ԡ�
	}
	public static void method(){
		System.out.println(country);
	}
}
class StaticDemo2{
	public static void main(String[] args){
		/* method�������������У�����Ϊ�Ǿ�̬��Ҫ���ñ���ͨ������
		����Ϊ��̬����Ҫ���ÿ���ͨ�������Ͷ��� */
		Person p=new Person("java",20);
		p.show();
		Person.method();//��̬�������Ա��������á�
		p.method();//��̬����Ҳ���Ա�������á�
	}
}