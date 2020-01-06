class OperateDemo5{
	/*
	1为true，0为false
	&:按二进制位进行与运算
	|：按二进制位进行或运算
	^：按二进制位异或
	~：取反码
	<<:左移  左移几位，就相当于原始数据乘以2的几次幂。低位出现的空位用0补齐。
	>>:右移  右移几位，就相当于原始数据乘以2的几次幂，小数舍去。高位出现的空位，原来是什么就用什么补齐，保证符号不变。
	>>>：无符号右移。即右移时，高位出现的空位，无论原来高位是什么，空位都用0补齐。
	*/
	public static void main(String[] args){
		System.out.println(6&3);
		System.out.println(6|3);
		System.out.println(6^3);
		System.out.println(~6);
		
		System.out.println(3<<2);
		System.out.println(8>>2);
	}
}