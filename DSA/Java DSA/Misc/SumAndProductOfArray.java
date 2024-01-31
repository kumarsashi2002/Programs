
class SumAndProductOfArray{
	public static void main(String args[]){
		
		int nums[]={1,2,3,4,9};
		SumAndProductOfArray obj=new SumAndProductOfArray();
		obj.spArray(nums);

		// // == Without using any method to find sum and product of array ======
		// int sum=0,product=1;
		// for(int i=0;i<arr.length;i++){
		// 	sum=sum+arr[i];
		// 	product=product*arr[i];
		// }
		// System.out.println("Sum of the array elements is:" +sum);
		// System.out.println("Product of the array Elements is:"+product);
		
	}
	void spArray(int arr[]){
		int sum=0;
		int product=1;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
			product=product*arr[i];
		}
		System.out.println("Sum of the array elements is :"+sum);
		System.out.println("Product of the array Elements is :"+product);
	}
}