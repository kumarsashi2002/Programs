=========== Sorting in Ascending order==================
		for(i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(marks[i]>marks[j]){
					int temp=marks[i];
					marks[i]=marks[j];
					marks[j]=temp;
				}
				
			}
		}
		System.out.println("After sorting in Ascending order:");
		for(i=0;i<size;i++){
			
			System.out.println("Elements of sorted array are: "+marks[i]);
		}