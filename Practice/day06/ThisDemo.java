class Person{
	private String name;
	private int age;
	Person(String name){
		this.name=name;
	}
	Person(String name,int age){
		this(name);
		this.age=age;
	}
	public void speak(){
		System.out.println(name+":"+age);//�˴���ʵ��this��ֻ��ʡ��ûд��
	}
	//�жϱ�������һ���Ƿ�Ϊͬ����
	public boolean compare(Person p){
		return this.age==p.age;
	}//this.age�������compare��Ա�����Ķ����age��p.age������һ�����age��
}

class ThisDemo{
	public static void main(String[] args){
		Person p=new Person("LiMing");
		Person p1=new Person("LiMing",12);
		Person p2=new Person("Jenny",13);
		p.speak();
		p1.speak();
		System.out.println(p1.compare(p2));
	}
}