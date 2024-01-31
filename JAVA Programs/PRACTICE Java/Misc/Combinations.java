// To print Unique Combinations of 3 Numbers 
class Combinations{
	public static void main(String args[]){
		int arr[]={1,2,3};
		int i,j,k;
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				for(k=0;k<3;k++){
					if(i!=j && j!=k && k!=i){
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
				}
			}
		}
	}
}


// This program can be used only when the three numbers are continuous. Ex-1,2,3
/*class Combinations{
	public static void main(String args[]){
		int i,j,k;
		for(i=3;i<=5;i++){
			for(j=3;j<=5;j++){
				for(k=3;k<=5;k++){
					if(i!=j && j!=k && k!=i){
						System.out.println(i+" "+j+" "+k);
					}
				}
			}
		}
	}
}*/


