/* 
	人：
	属性
		姓名
		年龄
	行为
		说话
 */
 
 /* 
	private:私有，是一个权限修饰符，用于修饰类中的成员。私有的内容只在本类中有效。
	注意：私有是封装的一种表现方式而已。不使用private修饰符一样可以实现封装。只要让你访问不到就好，或者可以扩大范围。
 */
class Person{
	private String name;
	private int age;

	/* public void operate(int a){
		if(a>=0&&a<=200){
			age=a;
		}else{
			System.out.println("您输入的数据错误")
		}
	} 
	然而这种方式不够标准化，所以我们对其进行标准化。
	*/
	public void setAge(int a){//setXxx
		age=a;
	}
	public int getAge(){//getXxx
		return age;
	}
	/* 这两种方法已经形成规范，类中的每个成员变量都要有这两种方法。
	在高级编辑器中通过快捷键可以直接生成，避免了重复劳动。*/
	public void setName(String n){
		name=n;
	}
	public String getName(){
		return name;
	}
	public void speak(){
		System.out.println(name+":"+age);
	}
}

class PersonDemo{
	public static void main(String[] args){
		Person p=new Person();
		/*p.age=-20;年龄是没有负值的，所以我们应该防止出现这种情况,于是我们在Person中将用private修饰符来限制访问age，
		并专门定义一个函数operate来对age进行操作*/
		p.setName("LiMing");
		p.setAge(12);
		// System.out.println(age);无法直接打印age，因为成员age已经被private修饰符封装了。
		System.out.println(p.getAge());
		p.speak();
		//而调用Person类中已经封装好的方法则可以实现相应的功能。
		
	}
}