/* 
	�ˣ�
	����
		����
		����
	��Ϊ
		˵��
 */
 
 /* 
	private:˽�У���һ��Ȩ�����η��������������еĳ�Ա��˽�е�����ֻ�ڱ�������Ч��
	ע�⣺˽���Ƿ�װ��һ�ֱ��ַ�ʽ���ѡ���ʹ��private���η�һ������ʵ�ַ�װ��ֻҪ������ʲ����ͺã����߿�������Χ��
 */
class Person{
	private String name;
	private int age;

	/* public void operate(int a){
		if(a>=0&&a<=200){
			age=a;
		}else{
			System.out.println("����������ݴ���")
		}
	} 
	Ȼ�����ַ�ʽ������׼�����������Ƕ�����б�׼����
	*/
	public void setAge(int a){//setXxx
		age=a;
	}
	public int getAge(){//getXxx
		return age;
	}
	/* �����ַ����Ѿ��γɹ淶�����е�ÿ����Ա������Ҫ�������ַ�����
	�ڸ߼��༭����ͨ����ݼ�����ֱ�����ɣ��������ظ��Ͷ���*/
	public void setName(String n){
		name=n;
	}
	public String getName(){
		return name;
	}
	public void speak(){
		System.out.println(name+":"+age);
	}
}

class PersonDemo{
	public static void main(String[] args){
		Person p=new Person();
		/*p.age=-20;������û�и�ֵ�ģ���������Ӧ�÷�ֹ�����������,����������Person�н���private���η������Ʒ���age��
		��ר�Ŷ���һ������operate����age���в���*/
		p.setName("LiMing");
		p.setAge(12);
		// System.out.println(age);�޷�ֱ�Ӵ�ӡage����Ϊ��Աage�Ѿ���private���η���װ�ˡ�
		System.out.println(p.getAge());
		p.speak();
		//������Person�����Ѿ���װ�õķ��������ʵ����Ӧ�Ĺ��ܡ�
		
	}
}