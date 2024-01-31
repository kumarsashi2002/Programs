public class Publisap2 {
    public static void main(String args[]){
        int top,rear,front;
        int arr[]={1,5,6,2,9,3};
        Publisap2 ob2=new Publisap2();
    }

    Publisap2(){
        int top=-1;
        int front=-1;
        int rear=-1;
    }

    boolean isEmptySt(){
        if(top==-1){
            return true;
        }
        return false;;
    }
    boolean isEmptyQ(){
        if(rear==-1 && front ==-1){
            return true;
        }
        return false;
    }

    void pushSt(int value){
		if(top==size-1){
		}
		else{
			top++;
			arr[top]=value;
		}
	}
    void popSt(){
		if(top==-1){
		}
		else{
			top--;
		}
	}


    void pushQ(int value){
		if(rear==size-1 && front==0){
		}
		else{
			front=0;
			rear++;
			arr[rear]=value;
		}
	}
    void popQ(){
		if(front==-1){
		}
		else{
			if(front>=rear){
				front=rear=-1;
			}
			front++;
		}
	}


    public static int[] applyOperations(int arr[]){
        Publisap2 ob=new Publisap2();
        for (int i: arr){
            while (!ob.isEmptySt()){
                ob.pushQ(ob.popSt());
            }
            ob.pushQ(i);
            while (!ob.isEmptyQ()){
                ob.pushSt(ob.popQ());
            }
        }

        
        return arr;
    }
    
}
