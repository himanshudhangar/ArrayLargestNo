package himanshuDemo;

public class LargestInArray {
	public static int getLargest(int[]a,int total) {
		
		int temp;
		for(int i=0;i<total;i++) {
		for(int j=i+1;j<total;j++) {
			if(a[i]>a[i]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		}
		return a[0];
}
	public static void main(String args[]) {
		int a[]= {1,2,4,5,3,6};
		System.out.println("Largest:"+getLargest(a,6));
		
		
		
		
	}
}
