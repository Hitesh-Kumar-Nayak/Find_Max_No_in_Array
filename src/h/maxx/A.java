package h.maxx;

public class A {
	
	public static void main(String[] args) {
		
		int b [] = {45,12,65,78,95};
		
		int max = b[0];
		
		for(int i=0;i<b.length;i++) {
			if(b[i]>max) {
				max =b[i];
			}
		}
		System.out.println(max);
		
		
	}

}
