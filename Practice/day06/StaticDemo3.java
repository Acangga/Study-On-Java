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
		show();
		/* StaticDemo3.java:14: ����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� show()
                show();
         */
	}
}
class StaticDemo3{
	public static void main(String[] args){
		Person.method();
	}
}