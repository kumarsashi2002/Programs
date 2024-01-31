def insertionsort(arr):
    for i in range(1,len(arr)):
        key = arr[i]
        
        j=i-1
        while j>=0 and key < arr[j]:
            arr[j+1]= arr[j]
            j-=1

        arr[j+1]=key    

arr = [55,12,77,8,2,105]
print("Unsorted array is :",arr)
insertionsort(arr)
print("Sorted array is :")
for i in range(len(arr)):
    print("%d"%arr[i])


