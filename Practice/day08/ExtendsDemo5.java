//������д

class Phone{
	void call(String name){
		System.out.println("����"+name);
	}
}

class NewPhone extends Phone{
	void call(String name){
		super.call(name);
		System.out.println("ͨ����¼�����"+name+"���˵绰");
	}
}

class ExtendsDemo5{
	public static void main(String[] args){
		NewPhone np=new NewPhone();
		np.call("LiMing");
	}
}