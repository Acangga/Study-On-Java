/* 
	������������һ����������ѡ������ת��Ϊ�����ˡ�ʮ�����Ƶ�С����
 */
import java.util.Scanner;
class TransBase{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("����������Ҫת��������");
		int num=s.nextInt();
		System.out.println("����������Ҫת�����Ľ���");
		int b=s.nextInt();
		inPut(num,b);
	}
	//
	public static void inPut(int num,int b){
		if(b==2){
			toBinary(num);
		}else if(b==8){
			toOctal(num);
		}else if(b==16){
			toHex(num);
		}else{
			System.out.println("������Ľ��Ʋ��Ϸ�");
		}
	}
	//ʮ����==��������
	public static void toBinary(int num){
		funcTrans(num,1,1);//������ô��ģ����˰ɣ���д��funcTrans(int num,1,1);�����컹������������
	}
	//ʮ����==���˽���
	public static void toOctal(int num){
		funcTrans(num,7,3);
	}
	//ʮ����==��ʮ������
	public static void toHex(int num){
		funcTrans(num,15,4);
	}
	public static void funcTrans(int num,int base,int offset){
		if(num==0){
			System.out.println('0');
			return;
		}
		char[] chs=new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] arr=new char[32];//��Ϊ��ת�������Ƶ���Ҫ�����Գ���8�������ˣ����ӵ�32.
		int index=arr.length-1;
		while(num!=0){
			int temp=num&base;
			arr[index--]=chs[temp];
			num=num>>>offset;
		}
		for(int i=index+1;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}
}
 