/*
���������
1. �����������ȹ۲���������۲����ǵ����Ժ���Ϊ��
2. ���������Ϊ�࣬�����Ժ���Ϊ����Ϊ��Ա�����ͳ�Ա���������ܻ��о�̬�����ͷ�������
	��ʵ����������������Ѿ����Զ�������ˣ���������Ҫʹ�ü̳У�����Ҫ�ֱ��常������ࣻ
3. �ӱ����ͷ�����Ѱ�ҹ��ԣ��ù��Զ��常�ࡣ
4. �������⼴Ϊ���ԣ�����̳и��࣬�ټ������ԾͿ��Զ�����̳��е������ˡ�
5. �������ʵ���л�Ҫ���������Ĺ��캯����

����������
1. �۲�è�͹������Ժ���Ϊ
è
���ԣ����֡����䡢Ʒ��
��Ϊ���Է�����

��
���ԣ����֡����䡢Ʒ��
��Ϊ���Է�������

2. ����Ϊ��

Cat
field:name,age,breed
function:eat();play();setXxx();getXxx

Dog
field:name,age,breed
function:eat();guard();setXxx();getXxx

3. ���常��

Animal
field:name,age,breed
constructor:param,non-param
function:eat();setXxx();getXxx

4.�������ࣨ�̳�+���ԣ�

Cat extends Animal
field:nothing
constructor:param,non-param
function:play()

Dog extends Animal
field:nothing
constructor:param,non-param
function:guard()

*/

class Animal{
	private String name;
	private int age;
	private String breed;
	Animal(){
		
	}
	Animal(String name,int age,String breed){
		this.name=name;
		this.age=age;
		this.breed=breed;
	}
	void eat(){
		System.out.println(getName()+"���ҳ��ҳ��ҳԳԳԣ�");
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
	void setBreed(String breed){
		this.breed=breed;
	}
	String getBreed(){
		return breed;
	}
}

class Cat extends Animal{
	/* 
	 ����: �޷����� Object�еĹ����� ObjectӦ�õ���������;
                super(name,age,breed);
                ^
	��Ҫ: û�в���
	�ҵ�: String,int,String
	ԭ��: ʵ�ʲ����б����ʽ�����б��Ȳ�ͬ
	
	��Ҫ����дextends */
	Cat(){
		
	}
	Cat(String name,int age,String breed){
		super(name,age,breed);
	}
	
	void play(){
		System.out.println(this.getName()+"�����������������棡");
		/* System.out.println(super.getName()+"�����������������棡");
		������this��super��һ��������ָ��Ķ���ͬһ���ڴ�ռ䣬ͬһ������
		
		void play(Cat c){
		System.out.println(c.getName()+"�����������������棡");
	} 
		����û�б�Ҫ������������д���ѵ�ǰ���󴫵ݽ�����
		*/
		
	}
	/* 
	ֱ�ӵ���getName()���ɡ�getName()��ʵ��ʡ��д����������ʵ��super.getName()��
	���Ե�������õ�play()ʱ��ִ�������䣬����super.getName()��ȥ������Ѱ��
	*/
}
class Dog extends Animal{//��Ҫ����дextends
	Dog(){
		
	}
	Dog(String name,int age,String breed){
		super(name,age,breed);
	}
	void guard(){
		System.out.println(getName()+"�����������������أ�");
	}
}

class ExtendsTest2{
	public static void main(String[] args){
		//Cat
		//����һ
		Cat c0=new Cat();
		c0.setName("Tom");
		c0.setAge(3);
		c0.setBreed("American Shorthair");
		c0.eat();
		c0.play();
		/*System.out.println(name+":"+age+":"+breed);
		�⼸����Ա������Animal���ж���˽�еģ�Ҫ������Ҫͨ������setXxx()��getXxx()������
		*/
		System.out.println(c0.getName()+":"+c0.getAge()+":"+c0.getBreed());
		//������
		Cat c1=new Cat("DD",3,"British Shorthair");
		c1.play();
		System.out.println(c1.getName()+":"+c1.getAge()+":"+c1.getBreed());
		
		//Dog
		//����һ
		Dog d0=new Dog();
		d0.setName("Bruce");
		d0.setAge(2);
		d0.setBreed("Cokey");
		d0.guard();
		System.out.println(d0.getName()+":"+d0.getAge()+":"+d0.getBreed());
		//������
		Dog d1=new Dog("PP",1,"Border collie");
		d1.guard();
		System.out.println(d1.getName()+":"+d1.getAge()+":"+d1.getBreed());
	}
}