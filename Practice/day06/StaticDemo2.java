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
		//此处各个成员前的Person. this. 可以省略，但写上可以提高代码的可读性。
	}
	public static void method(){
		System.out.println(country);
	}
}
class StaticDemo2{
	public static void main(String[] args){
		/* method方法在其他类中，若其为非静态则要调用必须通过对象；
		若其为静态，则要调用可以通过类名和对象。 */
		Person p=new Person("java",20);
		p.show();
		Person.method();//静态方法可以被类名调用。
		p.method();//静态方法也可以被对象调用。
	}
}