/* 
	��ȡ������ֵ����Ԫ��
	
	˼·��
	1.����һ��������¼ֵ����Ԫ�ػ���������
	2.���ñ���һ����ʼֵ�������������е���һԪ�ػ���������
	3.���������飬�������е�ÿ��Ԫ��ȥ���Ѿ���ɳ�ʼ���ĸñ������бȽϣ������ϴ��ֵ�����ñ�����
	4.������ɺ󣬸ñ���ֵ��������Ԫ���е����ֵ��
	
	ע�⣺
	1.ΪʲôҪ��������ʼ��Ϊ�����е�Ԫ�ػ�����������������Ϊ����������ݣ���Ϊ������δ֪������£�
	����������ȡֵ�����ֵ���ܱ�����������Ԫ�ص�ֵ��Ҫ�󣬻���С���������޷�ȡ�������е����ֵ����Сֵ��
	2.��ȡ��Сֵͬ��
	
	
	���巽����������ȷ��
	���������ֵ�����ͣ����ֵ int
	δ֪���ݣ����������ͣ����� int[]  ��ΪҪ�����ֵ��������ʲô����֪��
 */
class ArrayDemo4{
	public static void main(String[] args){
		int[] arr={115,56,49,26,85,16,97,123};
		
		int max=getMaxElement(arr);
		int max_2=getMaxIndex(arr);	
		System.out.println(max);
		System.out.println(max_2);
	}
	
	//����һ��������¼���Ԫ��ֵ
	public static int getMaxElement(int[] arr){
		int maxElement=arr[0];
		for(int i=1;i<arr.length;i++){
			if(maxElement<arr[i]){
				maxElement=arr[i];
			}
		}
		return maxElement;	
	}
	/* 
		��ʼ��i=1����Ϊ�Ѿ���ʼ��maxElement=arr[0]����maxElement�ٺ�arr[0]�Ƚ�û�����壬���Դ�arr[1]��ʼ�Ƚϣ�
		��ȻҲ���Գ�ʼ��maxElementΪ����������һ��Ԫ�أ�Ȼ���arr[0]��ʼ�Ƚ�,���������Ͷ�Ƚ���һ�Ρ�
	*/
	
	//��������������¼���Ԫ������
	public static int getMaxIndex(int[] arr){
		int maxIndex=0;
		for(int i=0;i<arr.length;i++){
			if(arr[maxIndex]<arr[i]){
				arr[maxIndex]=arr[i];
			}
		}
		return arr[maxIndex];
	}
}
