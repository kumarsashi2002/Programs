public class Practice1 {
    public static void main(String args[]){
        int arr[]={3,30,34,5,9};
        for(int i=0;i<5;i++){
			for(int j=i+1;j<5;j++){
				if(arr[i]<arr[j]){
					int temp2=arr[i];
					arr[i]=arr[j];
					arr[j]=temp2;
				}
			}
		}

        for(int k=0;k<5;k++){
			System.out.println("Elements of Sorted(Desc) array are: "+arr[k]);
		}

        String st=new String();
        
    }
}
