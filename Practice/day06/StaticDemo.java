class Person{
	static String country="CN";
	String name;
	public void setName(String name){
		this.name=name;
	}
	
	public void show(){
		System.out.println(country+":"+name);//countryǰʡ�Ե���"Person.",nameǰʡ�Ե���"this."
	}
	/* 
	public static void show(){
		System.out.println(country+":"+name);
	}
	�ڳ�Ա����show()�м���static�ؼ��֣��������ᱨ���޷��Ӿ�̬�����������÷Ǿ�̬ ���� name
	��Ϊ��̬��Ա��������ļ��ض����ɲ��ҾͿ��Ա������ˣ������ڶ�����ڵģ�����Ա����name�Ǵ����ڶ����еģ�
	���Կ��ܻ���ֵ��þ�̬����show()ʱ��name�������ڵ����������java���趨�˹����ñ���������ͨ����
	�Զž���������ķ�����
	*/
}
class StaticDemo{
	public static void main(String[] args){
		Person p=new Person();
		p.setName("LiMing");
		p.show();
		System.out.println(Person.country);
		System.out.println(p.country);		
	}
}