/* 
	���������أ�overload����
	1.��ͬһ�����У�
	2.��������ͬ��java�еĺ�����ֻ�����ܣ���ͬ���ܾͿ�������ͬ����������
	3.��������or�������Ͳ�ͬ��
	4.���������غͷ���ֵ�����޹أ�ֻҪ�������Ͳ����б���ͬ���޷�ͨ�����롣
	5.��������ĵ��ó��ֲ�ȷ���ԣ�����ֱ������
	
	���ã�
	�������Ĺ�����ͬʱ��������ȡ��ͬ�ĺ��������ò����б�Ĳ�ͬ�����������ü�����Զ��ֱ����в�ͬ�ĺ������Ӷ���ߴ����Ķ��ԡ�
 */
class FunctionDemo3{
	public static void main(String[] args){
		add(3,4);
		printCFB();
	}
	//�������������ĺ�
	public static int add(int a,int b){
		return a+b;
	}
	//��������С���ĺ�
	public static double add(double a,double b){
		return a+b;
	}
	//�������������ĺ�
	public static int add(int a,int b,int c){
		return a+b+c;
	}
	
	//��ӡ�žų˷���
	public static void printCFB(int num){
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}
	
	public static void printCFB(){
		printCFB(9);
	}
}