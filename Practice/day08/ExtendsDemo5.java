//方法重写

class Phone{
	void call(String name){
		System.out.println("呼叫"+name);
	}
}

class NewPhone extends Phone{
	void call(String name){
		super.call(name);
		System.out.println("通话记录：你给"+name+"打了电话");
	}
}

class ExtendsDemo5{
	public static void main(String[] args){
		NewPhone np=new NewPhone();
		np.call("LiMing");
	}
}