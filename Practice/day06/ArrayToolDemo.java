/* 
	���ǰ�֮ǰѧ������˳һ�·�չ˼·
 */
class ArrayToolDemo{
	public static void main(String[] args){
		//��ȡ������ֵ����Ԫ��
		int[] arr=new int[]{3,6,9,4,2,3,454};
		/* int maxIndex=0;
		for(int i=1;i<arr.length;i++){
			if(arr[i]>arr[maxIndex]){
				maxIndex=i;
			}
		} 
		System.out.println("max="+arr[maxIndex]);
		
		*/
		
		int max=getMax(arr);
		System.out.println("max="+max);
		
		ArrayTool tool=new ArrayTool();
		String str=tool.arrayToString(arr);
		System.out.println("arr="+str);
		
		tool.selectSort(arr);
		String str1=tool.arrayToString(arr);
		System.out.println("arr="+str1);
		
	}
	
	/*�������ַ�ʽ�����Բ�����������������÷����ģ�������������д�����ġ�
		��������ѧ�˺������ú�������װ���룬�����������ú�����
	*/
	public static int getMax(int[] arr){
		int maxIndex=0;
		for(int i=1;i<arr.length;i++){
			if(arr[maxIndex]<arr[i]){
				maxIndex=i;
			}
		}
		return arr[maxIndex];
	}
	/* 
		���������ڱ����н�����������л�ȡ��ֵ�����⣬����������ڱ������Ҳ��Ҫ���ֹ�����ô���أ�
		���������Ҫ����Ķ�������в����Ĺ����أ�
		���������뵽��ѧ�����������˼�롣���ǰѲ�������ĸ��ֹ��ܷ�װ��һ�����У���ô������Ҫ��Щ���ܵ�ʱ��
		ֻ��Ҫ����������ͼֽ������һ̨������Щ���ܵĻ��������󣩣�Ȼ��ʹ����̨���������󣩼��ɡ�
		�������Ǵ���һ���µ����ļ���
		
	*/
}