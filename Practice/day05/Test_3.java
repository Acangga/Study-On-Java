class Test_3{
	public static void main(String[] args){
		//verse1
		int i=0;
		i++;
		System.out.println(i);//1
		//verse2
		int k=0;
		k=k++;
		System.out.println(k);//0
		//verse3
		int j=0;
		++j;
		System.out.println(j);//1
		//verse4
		int l=0;
		l=++l;
		System.out.println(l);//1
		
		System.out.println("------------------------------");
		
		test();
		
	}
	
	/* 
		�������������ǿ��Կ�����i++�����븳ֵ�����ʱ��������ʱ������Ľ���ֱ�Ϊ1,0,�ǲ�һ���ġ�
		��++j�������������1��
		���֮ǰ��ѧ���з�����֪������������й������£�
		
		verse1:
		��������ڴ��п���1�Ŵ洢��Ԫ�����洢����i����������0����ֵ��1�Ŵ洢��Ԫ����ʱi=0����1�Ŵ洢��Ԫ��ֵ+1����ʱi=1������ӡi��ֵΪ1��
		verse2:
		��������ڴ��п���1�Ŵ洢��Ԫ�����洢����k����������0����ֵ��1�Ŵ洢��Ԫ����ʱk=0������1�Ŵ洢��Ԫ��ֵ��0�����ص�����ջ��
		1�Ŵ洢��Ԫ��ֵ+1����ʱk=1����������ջջ����ֵ��0��ȡ������ֵ��1�Ŵ洢��Ԫ����ʱk=0������ӡk��ֵΪ0��
		
		verse3:
		��������ڴ��п���1�Ŵ洢��Ԫ�����洢����l����������0����ֵ��2�Ŵ洢��Ԫ����ʱl=0����2�Ŵ洢��Ԫ��ֵ+1����ʱl=1������ӡl��ֵΪ1��
		verse4:
		��������ڴ��п���2�Ŵ洢��Ԫ�����洢����j����������0����ֵ��2�Ŵ洢��Ԫ����ʱj=0����2�Ŵ洢��Ԫ��ֵ+1����ʱj=1����
		��2�Ŵ洢��Ԫ��ֵ��1�����ص�����ջ��������ջջ����ֵ��1��ȡ������ֵ��2�Ŵ洢��Ԫ����ʱj=1��,��ӡj��ֵΪ1��
		
		���ۣ��������ǿ��Կ�����i++��++i��������1������ִ��ʱû�����𣬵��漰����ֵ����ʱ��i++���Ƚ�����i��ֵ���ص�����ջ��������
		++i���������ٰ��Ѿ��仯�˵�i��ֵ���ص�����ջ�����Ը�ֵ����󣬵Ⱥ���ߵı�����ֵ��ͬ����ˣ����漰��ֵ����ʱ������Ӧ��
		ע������i++��++i��Ȼ������ִ�ж����漰��ֵʱ�����߲�������������һ�����ǿ��Դ��·��Ĵ������н����ȫһ����֪��
		
	*/
	
	public static void test(){
		for(int i=0;i<3;i++){
			System.out.println(i);
		}
		
		for(int j=0;j<3;++j){
			System.out.println(j);
		}
	}
}//��ӡ����i��j��ֵ��ȫһ��