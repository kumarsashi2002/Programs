import java.io.*;
class Manjeet1 {
static int MAX = 100;

static void middleProduct(int mat[][], int n)
{


	int row_prod = 1, col_prod = 1;
	for (int i = 0; i < n; i++) {
		row_prod *= mat[n / 2][i];
		col_prod *= mat[i][n / 2];
	}


	System.out.print("Product of middle row = "
		+ row_prod);

	System.out.print( "Product of middle column = "
		+ col_prod);
    System.out.println("Answer is :"+ (row_prod+col_prod);
}


	public static void main (String[] args) {
			int mat[][] = { { 1,2,3 },
					{ 6,5,11},
					{ 7,8,4 } };

	middleProduct(mat, 3);
	}
}

