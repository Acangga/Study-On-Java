class Person{
	static String country="CN";
	String name;
	public void setName(String name){
		this.name=name;
	}
	public void show(){
		System.out.println(country+":"+name);
	}
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