/*
��ʽ����
	��������[][] ������=new ��������[m][];
	m:��ʾ��ά�����е�һά���������
	û��n����������Ҳ����˵���Զ�̬�ظ����������������ɱ䡣
*/

class Array2Demo3{
	public static void main(String[] args){
		
		int[][] arr=new int[3][];
		
		System.out.println(arr);//[[I@15db9742
		System.out.println(arr[0]);//null
		System.out.println(arr[1]);//null
		System.out.println(arr[2]);//null
		//System.out.println(arr[1][1]);//java.lang.NullPointerException
		
		//��̬��Ϊһά�����Ƿ���ռ�
		arr[0]=new int[2];
		arr[1]=new int[3];
		arr[2]=new int[1];
		
		System.out.println(arr[0]);//[I@6d06d69c
		System.out.println(arr[1]);//[I@7852e922
		System.out.println(arr[2]);//[I@4e25154f
		
		System.out.println(arr[1][0]);//0
		System.out.println(arr[1][1]);//0
		System.out.println(arr[1][2]);//0
		
		arr[1][0]=100;
		arr[1][2]=200;
		
	}
}