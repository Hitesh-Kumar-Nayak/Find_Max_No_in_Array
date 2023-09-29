package h.max;

public class Maxx {
	
	public static void main(String[] args) {
		
		int [] num = {4,6,3,9,7};
		
		int max =num[0];
		
		for(int i=0;i<num.length;i++) {
			
			if(num[i]>max) {
				max = num[i];
			}
			
		}
		System.out.println(max);
		
	}

}
