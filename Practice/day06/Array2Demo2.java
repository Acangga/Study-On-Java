/* 
��ά���飺Ԫ��Ϊһά��������顣

��ʽһ��
	��������[][] ������=new ��������[m][n]
	m:��ʾ�����ά�������ж��ٸ�һά���顣
	n:��ʾÿ��һά�������ж��ٸ�Ԫ�ء�
	
ע�⣺
	A:���¸�ʽҲ���Ա�ʾ��ά���飨�����Ƽ���
		a���������� ������[][]=new ��������[m][n];
		b����������[] ������[]=new ��������[m][n];
	B:ע�����涨�������
		a��int x,y;
			��ʵ�൱��
			int x;
			int y;
		b:int[] x,y[];
			��ʵ�൱��
			int[] x; ��������һ��һά����
			int[] y[]; ��������һ����ά����
*/

class Array2Demo2{
	public static void main(String[] args){
		int[][] arr=new int[3][2];
		System.out.println(arr);//[[I@15db9742
		System.out.println(arr[1]);//[[I@15db9742
		System.out.println(arr[1][1]);//0
		
	}	
}