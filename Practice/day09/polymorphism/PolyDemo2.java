//��̬�����Ŀ���չ��
//���ﰸ��

class Animal{
	void eat(){
		System.out.println("eat");
	}
	void sleep(){
		System.out.println("sleep");
	}
}

class Cat extends Animal{
	//�̳�+������д
	void eat(){
		System.out.println("è����");
	}
	void sleep(){
		System.out.println("è����˯");
	}
}
/*
����ÿ����һ�ֶ������Ҫ�����ࡢ�̳С�������д��
*/

class PolyDemo2{
	public static void main(String[] args){
		Cat c=new Cat();
		c.eat();
		c.sleep();
		/*
		��ô�������Ҫ��ֻè�����ֻè�ظ����гԷ���˯���Ļ����Ҫ�ظ�����Cat���еĳ�Ա�������Ƚ��鷳��
		�������ǿ����ú���������eat()��sleep()�Ĺ��ܷ�װ������������������������ĸ����ж���̫���ʣ��������Ǵ���һ����������ʵ�ָù��ܡ�
		*/
		Cat c1=new Cat();
		Tool.catFunc(c1);
		/*
		Cat����������ˡ���������������ø����Animal������඼��ʹ��Tool���أ�
		���ǿ���ÿ�δ������µ����඼��Tool��������϶�Ӧ�ķ��������������鷳��Ҳ������Ƶ���޸ģ����¹��������Ŀ����Դ�����
		�Ǹ���ô�죿
		���ǿ��ǿ������Ȱ����ж���Ķ�Ӧ��������Tool���ж���ã�����ٷ������������̫��ʵ�����ҹ�����̫���ˡ�
		�������ǿ������ö�̬�����������⡣�������ǲ���������岻ͬ����Ķ�Ӧ����������ֻ�������������ĺ���������ͬ����Ķ��ﶼ�ö�����
		�ķ�ʽ���������ɡ������AnimalTool�ࡣ
		*/
		Cat c2=new Cat();
		AnimalTool.animalFunc(c2);
		
	}
}

/* class Tool{
	public static void catFunc(Cat c){
		c.eat();
		c.sleep();
	} */
	
class AnimalTool{
	public static void animalFunc(Animal a){
			a.eat();
			a.sleep();
	}
}
/*
�ù���������ι��ɺ����ֶ�̬�ģ�

�̳У�Cat����Animal�������
������д��Cat����д��Animal���е�eat()��sleep()
��������ָ���������AnimalTool�Ĳ����б���Animal����������ͱ�������ʵ�ʴ����ȷʵAnimal���������������ͱ�����
*/
