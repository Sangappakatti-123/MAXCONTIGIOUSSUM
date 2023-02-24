package list1;

public class Kadanesalgorithm {
  public static void main(String[] args) {
	int [] a= {-2,-3,4,-1,-2,1,5,-3};
	System.out.println(maxsubarray(a));
}
  public static int maxsubarray(int[] a) {
	   int sum=0;
	   int maximum=a[0];
	   for(int i=0;i<a.length-1;i++) {
		   sum=sum+a[i];
		   if(sum>maximum) {
			   maximum=sum;
		   }
		   if(sum<0) {
			   sum=0;
		   }
	   }
	   return maximum;
			   
  }
}
