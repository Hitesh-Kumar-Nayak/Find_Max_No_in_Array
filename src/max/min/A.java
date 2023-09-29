package max.min;

public class A {
	
	public static void main(String[] args) {
		
		int [] a = {45,25,65,75,16,23};
		
		int max = a[0];
		
		for(int i =0;i<a.length;i++) {
			
			if(a[i]>max) {
				max = a[i];
			}
		}
		
		System.out.println(max);
		
	}
	
	

}
