//ClassCastException����ָ�����

class Animal{
	void eat(){
		
	}
}

class Cat extends Animal{
	void eat(){
		
	}
	void play(){
		
	}
}

class Dog extends Animal{
	void eat(){
		
	}
	void guard(){
		
	}
}


class PolyTest{
	public static void main(String[] args){
		//�ڴ��е�ʵ��Ϊ��
		Animal a=new Dog();//����ת��
		a.eat();
		Dog d=(Dog)a;//��������ת��
		
		//�ڴ��е�ʵ��Ϊè
		a=new Cat();
		Dog dd=(Dog)a;//è�޷�ת��Ϊ����è�����޼̳й�ϵ
		/* �������£�
		Exception in thread "main" java.lang.ClassCastException: Cat cannot be cast to Dog��è�޷���ָ�򹷣�
        at PolyTest.main(PolyTest.java:35)
		*/
		
		//���������ʾ����
		/* 
		Dog ddd=new Animal();�����ǹ������Բ���,���뱨�������ݵ�����
		Dog dddd=new Cat();è�ǹ������뱨�������ݵ�����
		
		*/
	}
}