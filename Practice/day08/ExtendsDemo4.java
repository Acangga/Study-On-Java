class Father{
	void show(){
		System.out.println("����show����");
	}
}
class Son{
	void method(){
		System.out.println("����method����");
	}
	void show(){
		System.out.println("����show����");
	}
}

class ExtendsDemo4{
	public static void main(String[] args){
		Son s=new Son();
		s.method();
		s.show();
	/*
	�����
	����method����
	����show����
	*/
	}
}
