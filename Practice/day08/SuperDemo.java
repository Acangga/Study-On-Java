
class Father{
    int num=1;
    void method(){
		int num=5;
	}
}
class Son extends Father{
    int num2=2;
    int num=3;
	void show(){
		int num=4;
		System.out.println(num);//���Ϊ4��������Ǿֲ���num��
		System.out.println(num2);//2
		//��ô����һ������Son���еĳ�Ա����num�أ���this
		System.out.println(this.num);//3
		//��ô��������������Father�еĳ�Աnum�أ���super
		System.out.println(super.num);//1
	}
}

class SuperDemo{
	public static void main(String[] args){
		Son s=new Son();
		s.show();
	}
}