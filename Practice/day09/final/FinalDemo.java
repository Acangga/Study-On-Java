//final ������
final class Father{
	int a=1;
}

class Son extends Father{
	
}
/* ����: �޷�������Father���м̳�
class Son extends Father{  */


//��final���η���
class Mother{
	String a="String";
	final void show(){
		System.out.println(a);
	}
}

class Daughter extends Mother{
	void show(){
			System.out.println("lalalalalala");
	}
	/* ����: Daughter�е�show()�޷�����Mother�е�show()
        void show(){
             ^
  �����ǵķ���Ϊfinal */
}

class FinalDemo{
	public static void main(String[] args){
		final int x=1;
		x=10;
		/* ����: �޷�Ϊ���ձ���x����ֵ
                x=10; */
	}
}