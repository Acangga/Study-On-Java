/* 
	������û���κηǾ�̬��Ա���������Գ�Ա���������ܵ��÷Ǿ�̬��������ֻ�г�Ա���������������ǽ�֮��Ϊ�����ࡣ
	����Ķ���Ҳ�Ͳ����װ���κ��������ݣ�ֻ��һ���ն���װ�ռ���ڴ�ռ䣬���Դ�������Ķ���û�����塣
	��ô���ǿ��Խ������еĳ�Ա��������Ϊ��̬������ֱ��ͨ������������Щ������
	
	Ϊ�˱�֤����������Ա����������󣬿��Խ����캯��˽�л�����������Ա�޷����ʸ���Ĺ��캯����Ҳ���޷����������ˡ�
 
	���Ҫ�����ĵ�����������һ��Ҫ�ǹ����ģ�������public���θ��ࡣ
	����Ϊ����public���θ��࣬����javaԴ�ļ�������һ��Ҫ������һ�¡�
	
	����һ�������࣬����Ϊ�����������ã�ֱ�ӽ�.class���ļ����͸����ˣ�������ü��ɡ�
	���ǣ����������֪��������ṩ��ʲô���ķ����أ��ָ���ε����أ���������ʲô��
	Ϊ�˽��������⣬Java�ṩ���ĵ�ע�͹��ܺ�javadoc����������˵���ĵ���	
 */
 
 /**
	������һ�����ڲ�������Ĺ����ࡣ���а�����������������������磺ȡ��������ֵ������ȡ�
	@author Acangga
	@version v1.0
 */
 
public class ArrayTool{
	
	private ArrayTool(){}
	
	/**
	ȡ���������ֵ
	@param arr ����һ��Ԫ������Ϊint������
	@return ��������ֵ����Ԫ��
	*/
		public int getMax(int[] arr){
		int maxIndex=0;
		for(int x=1;x<arr.length;x++){
			if(arr[maxIndex]<arr[x]){
				maxIndex=x;
			}
		}
		return arr[maxIndex];
	}
	
	/**
	����ĳ�����Ƿ�����������У����������ȡ��������
	@param arr ����һ��Ԫ������Ϊint������
	@param key Ҫ���ҵ�����
	@return �������д��ڸ����ݣ��򷵻ض�ӦԪ�ص��������������ڣ��򷵻�-1��
	*/
	public int getIndex(int[] arr,int key){
		for(int x=0;x<arr.length;x++){
			if(key==arr[x]){
				return x;
			}
		}
		return -1;
	}
	
	/**
	���������ѡ������
	@param arr ����һ��Ԫ������Ϊint������
	*/
	public void selectSort(int[] arr){
		for(int x=0;x<arr.length-1;x++){
			int num=arr[x];
			int index=x;
			for(int y=x+1;y<arr.length;y++){
				if(num>arr[y]){
					num=arr[y];
					index=y;
				}
			}
			swap(arr,x,index);
		}
		
	}
	/**
	��������������Ԫ�ص�λ�á�
	@param arr ����һ��Ԫ������Ϊint������
	@param x ����һ��Ԫ�ص�����
	@param y ��һ��Ԫ�ص�����
	
	javadocֻ��ʶ��public��protectedȨ�޵ĺ�����privateȨ�޵��޷���ʶ��
	���Դ˴�û��Ҫд�ĵ�ע�͡�
	*/
	private void swap(int[] arr,int x,int y){
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	
	/**
	��int[]ת����String���ͣ���ʽ��{e1,e2,...}��
	@param arr ����һ��Ԫ������Ϊint������
	@return str ���ظ�������ַ�����ʽ
	*/
	public String arrayToString(int[] arr){
		String str="{";
		for(int x=0;x<arr.length;x++){
			if(x!=arr.length-1){
			str=str+arr[x]+",";
			}else{
			str=str+arr[x]+"}";
			}
		}
		return str;
	}
}