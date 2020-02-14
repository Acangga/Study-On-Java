class Person{
	static String country="CN";
	String name;
	public void setName(String name){
		this.name=name;
	}
	
	public void show(){
		System.out.println(country+":"+name);//country前省略的是"Person.",name前省略的是"this."
	}
	/* 
	public static void show(){
		System.out.println(country+":"+name);
	}
	在成员函数show()中加入static关键字，编译器会报错：无法从静态上下文中引用非静态 变量 name
	因为静态成员是随着类的加载而生成并且就可以被调用了，是先于对象存在的，而成员变量name是存在于对象中的，
	所以可能会出现调用静态函数show()时，name还不存在的情况，所以java就设定了规则，让编译器不予通过，
	以杜绝这种情况的发生。
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