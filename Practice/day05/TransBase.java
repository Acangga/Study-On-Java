/* 
	现在我们来做一个可以随意选择将数据转换为二、八、十六进制的小程序
 */
import java.util.Scanner;
class TransBase{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("请输入您想要转换的数据");
		int num=s.nextInt();
		System.out.println("请输入您想要转换到的进制");
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
			System.out.println("您输入的进制不合法");
		}
	}
	//十进制==》二进制
	public static void toBinary(int num){
		funcTrans(num,1,1);//你是怎么想的，懵了吧，能写成funcTrans(int num,1,1);看半天还不看不出来。
	}
	//十进制==》八进制
	public static void toOctal(int num){
		funcTrans(num,7,3);
	}
	//十进制==》十六进制
	public static void toHex(int num){
		funcTrans(num,15,4);
	}
	public static void funcTrans(int num,int base,int offset){
		if(num==0){
			System.out.println('0');
			return;
		}
		char[] chs=new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] arr=new char[32];//因为有转换二进制的需要，所以长度8不够用了，增加到32.
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
 