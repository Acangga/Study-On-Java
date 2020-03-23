class GrandFather{
	void show(){
		System.out.println("I'm your grandfahter.");
	}
}
class Father extends GrandFather{
	void method(){
		System.out.println("I'm your fahter.");
	}
}
class Son extends Father{
	
}

class ExtendsDemo2{
	/* ExtendsDemo2.java:17: 错误: 需要<标识符>
        s.show();
	总忘记写主函数…… */
	public static void main(String[] args){
		Son s=new Son();
		s.show();
		s.method();
	}	
}