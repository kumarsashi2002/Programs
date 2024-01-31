
class PairsOfArray{
	public static void main(String args[]){
		int nums[]={1,2,3};
		PairsOfArray obj=new PairsOfArray();
		obj.pairs(nums);
		
		// // // == WithOut Using any Method to print pairs ====
		// for(int i=0;i<nums.length;i++){
		// 	for(int j=0;j<nums.length;j++){
		// 		System.out.println(nums[i]+""+nums[j]);
		// 	}
		// }
	}
	void pairs(int arr[]){
		System.out.println("Pairs of the Array elements are:");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				System.out.println(arr[i]+","+arr[j]);
			}
		}
	}
}