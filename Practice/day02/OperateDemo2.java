class OperateDemo2{
	public static void main(String[] args){
	//赋值运算符 = ，+=，-=，+=，/=，%=
	//int a=b=c=4;
	int a=1;
	a+=2;//a=a+2
	
	short s=3;
	s+=4;
	/*上两行代码都是属于赋值，是一次运算，当把整型赋值给short型是，java都会对值进行检查，是否可以装入对应的数据类型中，如果可以，那么会进行自动类型提升,
	所以编译不会报错*/
	System.out.println("s="+s);
	//s=(short)(s+4);
	s=s+4;
	/* 无法通过编译，因为s为short型，在进行s+4运算时，已经做了自动类型提升，变成了int型，无法再赋值给short型的s，所以编译报错	*/
	System.out.println("s="+s);
	
	
	}
}