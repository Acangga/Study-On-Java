/* 
	������ά����ĸ�ʽ
 */

class Array2Demo{
	public static void main(String[] args){
		//��̬��ʼ��������һ����ά���飬�������к�������һά���飬ÿ��һά�����к�������Ԫ�ء�
		int[][] arr=new int[3][2];
		
		System.out.println(arr);//[[I@15db9742 ���������ţ������ά���飬I��������Ԫ��Ϊint����
		System.out.println(arr[0]);//[I@6d06d69c һ�������Ŵ���һά���飬I��������Ԫ��Ϊint����
		System.out.println(arr[0][1]);//0int[][] arr=new int[3][2];//��̬��ʼ��������һ����ά���飬�������к�������һά���飬ÿ��һά�����к�������Ԫ�ء�
		
		int[][] arr1=new int[3][];//��̬��ʼ��������һ����ά���飬�������к�������һά���飬ÿ��һά���鶼Ϊ�ա�
		System.out.println(arr1);//[[I@7852e922 ���������ţ������ά���飬I��������Ԫ��Ϊint����
		System.out.println(arr1[0]);//null �ö�ά����������һά����Ϊ��
		//System.out.println(arr1[0][1]);//NullPointerException ��Ϊһά����Ϊ�գ�����ָ��û����
		
		//��ӡ��ά���鳤��
		int[][] arr2=new int[3][2];
		System.out.println(arr.length);//��ӡ��ά����ĳ��ȣ�����ά������һά����ĸ���
		System.out.println(arr[0].length);//��ӡ��λ�����нǱ�Ϊ0��һά���鳤�ȣ���һά������Ԫ�صĸ���
		
		//��̬��ʼ��
		int[][] arr3={{1,6,3},{7,56,13},{9,4,66}};
		
		//������ά����
		for(int i=0;i<arr3.length;i++){
			for(int j=0;j<arr3[i].length;j++){
				System.out.print(arr3[i][j]+",");
			}
		}
		System.out.println();
		
		Add(arr3);
	}
	//���ά����������Ԫ�صĺ�
	public static void Add(int[][] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				sum+=arr[i][j];
			}
		}
		System.out.println(sum);
	}
}