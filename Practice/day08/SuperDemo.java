
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
		System.out.println(num);//结果为4，输出的是局部的num。
		System.out.println(num2);//2
		//那么如果我还想输出Son类中的成员变量num呢？用this
		System.out.println(this.num);//3
		//那么如果我想输出父类Father中的成员num呢？用super
		System.out.println(super.num);//1
	}
}

class SuperDemo{
	public static void main(String[] args){
		Son s=new Son();
		s.show();
	}
}