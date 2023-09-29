package hitesh.maxnumber;

public class FindMaxNumber {
	
	public static void main(String[] args) {
		
		int [] a = {1,5,8,4,3,6};
		
		int max = a[0];//assume max is a[0]=1
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]>max) {
				max=a[i];
			}
			}
		System.out.println(max);
	}

}
