public class ArrayIndexOutOfBoundsEx {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        try{
            int a=arr[-1];
            System.out.println("Element at 7th index is:"+a);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("As we cannot access given index . This arises ArrayIndex out of bounds Exception");
        }
    }
}
