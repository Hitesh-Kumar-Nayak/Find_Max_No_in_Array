package hitesh.minnumber;

public class FindMinNumber {
	
	public static void main(String[] args) {
		
		int [] num = {4,2,8,6,7,3};
		
		int min=num[0];
		
		for(int i=1;i<num.length;i++) {
			
			if(num[i]<min) {
				min=num[i];
			}
		}
		System.out.println(min);
	}

}
