class Father{
	private int num=1;
    private int num1=5;
    void method(){
		int num=5;//������������ʱ����ѹջ�ģ�����Ҳ�޷����ʵ����num
	}
}
class Son extends Father{
    int num2=2;
    int num=3;
	void show(){
		//int num=4;
		System.out.println(super.num);
		System.out.println(num2);
		System.out.println(this.num1);
	}
}

class ExtendsDemo3{
	public static void main(String[] args){
		Son s=new Son();
		s.show();
	}
}