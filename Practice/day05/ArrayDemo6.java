/* 
	ð������
	����ı��ʾ��ǰ�һ���������������߼����㣬��ѧ���㣩ѭ�����ٴΣ��Ӷ�ʵ��ĳЩ���ܵĽṹ�塣�ٰ�ʵ�ּ򵥹��ܵĽṹ�����������
	��ɸ��Ӹ��ӵĹ��ܣ��γɸ��Ӹ��Ӿ������Ӵ�Ľṹ�塣
	ð�������ѡ������Ҳû�б����ϵ�����ֻ�����õ�˼·��ͬ�������ֻ��ʵ��˼·�Ĺ��̶��ѡ�
	������Ҫ����Ļ�������Ҳ����ѭ����������ο��ƣ��Լ���ηֽ���ڲ�ѭ�����е�Ԫ���㡣
	
	ע�⣺
	����: �Ƿ��ı��ʽ��ʼ
	�������һ������{}�����Ų�������ɵģ�����ϸ���ÿ�Դ������Ƿ��������Լ��Ƿ��з�����Ƕ�׷����������
 */

class ArrayDemo6{
	public static void main(String[] args){
		int[] arr={112,456,3,54,69,-8};
		printArray(arr);
		//bubbleSort(arr);
		bubbleSort_2(arr);
		printArray(arr);
		
	}
	
	public static void bubbleSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					/* int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp; */ 
					swap(arr,j,j+1);
					swap(arr,j,j+i);//�������ֺ���ĸ����ɫ����ͬ����1д��i�ˣ������쿴����������ɳ��
				}				
			}
		}
	}
	
	public static void bubbleSort_2(int[] arr){
		for(int i=arr.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(arr[j]>arr[j+1]){
					/* int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp; */
					swap(arr,j,j+1);
				}
			}
		}
	}
	
	//����������Ԫ�ؽ���λ��
	public static void swap(int[] arr,int a,int b){
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	//��ӡ����������Ԫ�صĹ���
	public static void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
				System.out.print("arr["+i+"]="+arr[i]+"\t");			
		}
		System.out.println();
	}
}