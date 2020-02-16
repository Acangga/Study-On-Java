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
		show();
		/* StaticDemo3.java:14: 错误: 无法从静态上下文中引用非静态 方法 show()
                show();
         */
	}
}
class StaticDemo3{
	public static void main(String[] args){
		Person.method();
	}
}