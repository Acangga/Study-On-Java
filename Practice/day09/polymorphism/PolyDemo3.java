class Father{
	void show(){
		System.out.println("show(Father)");
	}
}

class Son extends Father{
	void show(){
		System.out.println("show(Son)");
	}
	void method(){
		System.out.println("only method(Son)");
	}
}

class PolyDemo3{
	public static void main(String[] args){
		//����ת�ͣ��൱�ڶ��Ӵ����׵��·�����ױΪ����
		Father f=new Son();
		f.show();
		//f.method();
		/*
		PolyDemo3.java:20: ����: �Ҳ�������
                f.method();
                 ^
		����:   ���� method()
		λ��: ����ΪFather�ı��� f
		1 ������
		*/
		
		//����ת��
		Son s=(Son)f;
		s.method();
		/* 
		��Ϊfʵ������Son���ʵ�������ñ��������Կ�������ת�͡�
		*/
	}
	
}