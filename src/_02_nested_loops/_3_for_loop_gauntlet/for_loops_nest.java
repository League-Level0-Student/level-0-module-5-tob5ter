package _02_nested_loops._3_for_loop_gauntlet;

public class for_loops_nest {
	public static void main(String[] args) {
		
		for(int i =0;i<101;i++) {
			System.out.println(i);
		}
		for(int a=101;a>0;a--) {
			System.out.println(a);
		}
		for(int b=0;b<101;b+=2) {
			System.out.println(b);
		}
		for(int c=0;c<100;c+=2) {
			System.out.println(c);
		}
		for(int d=0;d<501;d++) {
			System.out.print(d);
			if(d%2==0) {
				System.out.println(" even");
			}
			else {
				System.out.println(" odd");
			}
}	
		for(int e=0;e<708;e+=7) {
			System.out.println(e);
		
		}
		for(int j=0;j<3;j++) {
		for(int i =0;i<3;i++) {
			System.out.println(j+" "+i);
			
		}
		}
		for(int k=0;k<9;k++){
			System.out.print(k);
			if(k%3==0){
				System.out.println(k);
			}
		}
		for(int l=0;l<100;l++){
			System.out.print(l);
			if(l%10==0){
				System.our.println(l);
			}
		}
		
	}
}