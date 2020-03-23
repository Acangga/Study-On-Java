class Father{
	void show(){
		System.out.println("父类show方法");
	}
}
class Son{
	void method(){
		System.out.println("子类method方法");
	}
	void show(){
		System.out.println("子类show方法");
	}
}

class ExtendsDemo4{
	public static void main(String[] args){
		Son s=new Son();
		s.method();
		s.show();
	/*
	结果：
	子类method方法
	父类show方法
	*/
	}
}
