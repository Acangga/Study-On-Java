class ArrayDemo7{
	public static void main(String[] args){
		int[] arr={3,6,12,26,35,49,66};
		
		int index=halfSearch(arr,66);
		System.out.println(index);
		
		int index_2=halfSearch_2(arr,49);
		System.out.println(index_2);
	}
	
	//���鳣�����ܣ����ң�����Ԫ�ض�Ӧ��������
	public static int getIndex(int[] arr,int key){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key){
				return i;
			}
		}
		return -1;
		/*���������û��Ҫ���ҵ�Ԫ����ô�죿
		��Ϊ����ֵΪint���ͣ����Ժ���һ��Ҫ�з���ֵ�����Ե�û��Ҫ���ҵ�Ԫ��ʱ���ͷ���-1��
		��������������Ϊ������Ԫ�ص�����û�и�������˼��ܽ��û�з���ֵ�����⣬���ܽ������Ϣ�������ǡ�*/
	}
	
	//���ֲ��ҷ����������������飬��������������������Ԫ��Խ��Խ���Խ��ԽС�����顣��ʵ���Ƕ��ַ���~
	public static int halfSearch(int[] arr,int key){
		int min,max,mid;
		min=0;
		max=arr.length-1;
		mid=(min+max)>>1;
		/*��λ������ó�������Ч�ʸ���.
		��ѭ����Ͱ�mid�����������Ϊ����whileѭ�����ж�������Ҫ�õ�arr[mid]��
		*/
		while(key!=arr[mid]){
			if(key>arr[mid]){
				min=mid+1;
			}else if(key<arr[mid]){
				max=mid-1;
			}
			if(max<min){
				return -1;
			}
			/* ��Ϊ��max<minʱ����˵��������û������Ҫ�ҵ�Ԫ�ء��������жϻ����ȸ�mid��ֵ��ʵ����ν��ֻ������max<minʱ����ʡ��һ����
			mid��ֵ�Ĺ��̣�����΢���Ч�ʡ�	*/
			mid=(min+max)>>1;
		}
		return mid;
	}
	
	//���ַ�����һ��д��
	public static int halfSearch_2(int[] arr,int key){
		int min,max,mid;
		min=0;
		max=arr.length-1;
		//mid=(min+max)>>1;bug������ͣ���С���Ϊwhileѭ���е�mid���䣬һֱ����min<=max��whileѭ����������ѭ����
		while(min<=max){
			mid=(min+max)>>1;
			if(key>arr[mid]){
				min=mid+1;
			}else if(key<arr[mid]){
				max=mid-1;
			}else{
				return mid;
			}
		}
		return -1;
	}
	
	
}