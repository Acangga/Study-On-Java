/* 
	�����Ӧ�ã�
	�������ֻ�ȡ��Ӧ������
 */
class ArrayTest3{
	public static void main(String[] args){
		System.out.println(getWeek(3));
	}
	public static String getWeek(int num){
		if(num>7||num<1){
			return "�Ƿ�����";
		}
		String[] week=new String[]{"","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		//������0��λ���Ϸ�һ����λ��Ϊ�������ֺ����ڼ���Ӧ�������Ͼ�û�������㡣
		return week[num];
		//String������ĸSҪ��д��
	}
}