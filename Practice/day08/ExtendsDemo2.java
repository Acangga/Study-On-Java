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
	/* ExtendsDemo2.java:17: ����: ��Ҫ<��ʶ��>
        s.show();
	������д���������� */
	public static void main(String[] args){
		Son s=new Son();
		s.show();
		s.method();
	}	
}