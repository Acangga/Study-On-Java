class Father{
	int num=1;
	void show(){
		System.out.println("show(Father)");
	}	
	static void method(){
		System.out.println("static method(Father)");
	}
	/*���������Ĵ���ע�͵�������ʱ�ᱨ��
	PolyDemo.java:24: ����: �Ҳ�������
                System.out.println(f.num);//result:1
                                    ^
	����:   ���� num
	λ��: ����ΪFather�ı��� f
	PolyDemo.java:25: ����: �Ҳ�������
                f.show();//result:show(Son)
                 ^
	����:   ���� show()
	λ��: ����ΪFather�ı��� f
	PolyDemo.java:26: ����: �Ҳ�������
                f.method();//result:static method(Father)
                 ^
	����:   ���� method()
	λ��: ����ΪFather�ı��� f
	
	�ɴ˿�֪��ʹ�ö�̬��ʽ���ʳ�Ա��������Ա�����;�̬����ʱ��������ȥ������Ѱ�Ҷ�Ӧ�ĳ�Ա��������Ա�����;�̬������
	����Ҳ��������޷�ͨ�����롣
	
	*/
}

class Son extends Father{
	int num=10;
	void show(){
		System.out.println("show(Son)");
	}
	static void method(){
		System.out.println("static method(Son)");
	}
}

class PolyDemo{
	public static void main(String[] args){
		Father f=new Son();
		System.out.println(f.num);//result:1
		f.show();//result:show(Son)
		f.method();//result:static method(Father)
	}
}