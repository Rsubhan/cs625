class MinMax2 {
  public static void main(String args[]) {
	int nums[] = {5, 6, -2, 10, 25} ;
	int min , max ;
	int i ;
	min = max = nums[0] ;
	for(i=1;i<5;i++) {
	  if(nums[0] < min) min = nums[0] ;
	  if(nums[0] > max) max = nums[0] ;
	}
	System.out.println("min and max is : " + min + " " + max ) ;
     }
}