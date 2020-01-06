class BreakContinueDemo{
	public static void main(String[] args){
		/* 
		break:跳出
		break的适用范围：switch语句和循环语句
		break语句单独存在时，在它后面的语句是执行不到的，所以即使写了也没有意义。
		break只跳出当前所在的循环。
		如果break处于嵌套的内层循环中，且并不想让break跳出当前循环，而是想要跳出外层循环，那么可以通过给循环标号来实现。
		但是，如果break在外层循环中而不在内层循环中，是无法跳出内层循环的，即break想要起作用，必须要在语句的作用范围内。
		*/
		damao:for(int x=0;x<3;x++){
			ermao:for(int y=0;y<4;y++){
				System.out.println("x="+x);
				break damao;
			}
		}
		
		System.out.println("--------我是一条分割线----------");
		
		/* 
		continue：继续，结束本次循环，继续下次循环
		continue的适用范围：循环结构
		如果continue单独存在，下面的任何语句都执行不到
		
		for(int x=0;x<11;x++){
			if(x%2==0){
				continue;
				System.out.println("x="+x);
			}
		}
		*/
		
		for(int x=0;x<11;x++){
			if(x%2==0){
				continue;
			}
			System.out.println("x="+x);
		}
		
		damao:for(int x=0;x<3;x++){
			ermao:for(int y=0;y<4;y++){
				System.out.println("x="+x+"\ty="+y);
				continue damao;//跳过了y++，直接进行了外层循环x++
			}
		}
	}
}