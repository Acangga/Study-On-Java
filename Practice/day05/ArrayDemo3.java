//����Ļ�������
/* 
	�������������������Ǵ��ȡ��
	���ľ��ǶԽǱ꣨�������Ĳ���
 */
class ArrayDemo3{
	public static void main(String[] args){
		int[] arr={16,45,23,69,87};
		//���������ǰ������е�ÿ��Ԫ�ض��������д�ӡ���������Ǳ������顣
		//������Ϊʵ���Դ��������ԣ�������.length
		System.out.println("arr.length="+arr.length);
		for(int x=0;x<arr.length;x++){
			System.out.println("arr["+x+"]="+arr[x]);
		}
		
		System.out.println();
		
		//�������
		for(int x=arr.length-1;x>=0;x--){//��Ҫ������forѭ���ж������Ҫд��������
			System.out.println("arr["+x+"]="+arr[x]);
		}
		
		System.out.println();
		
		//��ӡ���нǱ�Ϊż����Ԫ��
		for(int x=0;x<arr.length;x+=2){
			System.out.println("arr["+x+"]="+arr[x]);
		}
		
	}
}