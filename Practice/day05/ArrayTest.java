/* 
������ϰ�⣺
��֪һ���������飬������Ҫ�������е�ĳ��Ԫ�ص�λ���ϴ洢һ���µ�Ԫ�أ�����֤������Ȼ������ģ���ô���Ԫ��Ӧ�ô洢���������ĸ�Ԫ�ص�λ���ϣ�
 */
 import java.util.*;
class ArrayTest{
	public static void main(String[] args){
		int[] arr=new int[]{3,16,28,36,59,88};
		int index=halfSearch(arr,30);
		System.out.println(index);
		
		//java�������˶��ַ��ķ���
		int index_1=Arrays.binarySearch(arr,30);
		/* ����������൱������д���ַ��У����Ҳ�����ӦԪ�ص�����£���return -1��Ҳ��return min������return -mini-1
		����һ������Ҫ���ҵ�Ԫ�ش�����������ʱ�����ص��Ǹ�Ԫ�ص���������������ʱ������һ�������������㲻��������ҵ�Ԫ�أ�
		������������ľ���ֵ��һ������ϰ��Ҫ���λ��������
		ȡ��ֵ��Ϊ�˱���Ԫ�ز����ڣ�����ֵ���ֿ���-1��Ϊ�˱��ⷵ��ֵΪ0ʱ�޷����������������
		������arr�в�������2��������2������������arr�����Է���ֵΪ��������2<3������Ӧ��Ϊ0.��0û������֮�֣���ô�ڲ���ȷ����������
		Ԫ�ص�ǰ���£����Ǿ��޷�֪���������Ƿ���2���Ԫ�ء��������Ƿ���-min-1������������2ʱ������ֵΪ-1�����ǾͿ�����ȷ֪��2��������
		�����У���������������������ұ�������������������Ӧ����0��
		*/
		System.out.println(index_1);
	}
	//��д���ַ�
	public static int halfSearch(int[] arr,int key){
		int min=0;
		int max=arr.length-1;
		while(min<=max){
			int mid=(min+max)>>1;
			if(key>arr[mid]){
				min=mid+1;
			}else if(key<arr[mid]){
				max=mid-1;
			}else{
				return mid;
			}
		}
		return min;
	}	
}