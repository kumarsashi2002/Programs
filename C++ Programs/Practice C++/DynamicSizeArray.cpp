//C++ program to create dynamic size array using pointers

#include<iostream>
using namespace std;

int main(){
	int size;
	cout << "Enter the size of the Array: " << endl;
	cin >> size;
	
	int A[size]; //Creating in stack
	int *p = new int[size]; //Creating in heap
	
	cout << "Initially:\nSize of Stack Array = "<<sizeof(A)<<endl;
	cout << "Size of Heap Array = "<<sizeof(p) << endl;
	
	cout << "Enter the new Size of Array: "<< endl;
	cin >> size;
	
	//A[size] //It is not possible to change the size of array created in stack
	cout << "Finally,\nIt is not possible to change the Stack Array Size, Size = "<<sizeof(A)<<endl;
	
	//Changing the size of heap Array
	//Before changing we must delete the initial heap array to avoid memory leak
	delete []p; //Deleting initial heap array
	p = new int[size]; //Changing the size of heap array
	cout << "Size of Heap Array = "<<sizeof(p) << endl;
	
	return 0;
}