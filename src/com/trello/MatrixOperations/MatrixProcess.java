package com.trello.MatrixOperations;
public class MatrixProcess {

	public static void main(String[] args) {
		int [][] a={{3,-3,5},{-4,6,4},{7,8,-1}};
		int [][] b={{1,-3,5},{3,6,-2},{-4,7,-1}};
		System.out.print("sum:");
		add(a, b);
		System.out.println("\nsub:");
		sub(a,b);
		int [][]A1={{0,5},{6,1},{-3,-1}};
		int [][]B1={{0,-2,2,-4},{3,1,4,5}};
		System.out.print("multiply1:\n");
		mult(A1, B1);
		int [][]A2={{0,3,-4},{1,-1,-3}};
		int [][]B2={{4,-2,0,5},{3,6,7,-3},{8,9,1,-1}};
		System.out.print("multiply2:\n");
		mult(A2, B2);
	}
public static int[][] add(int a[][], int b[][]){
	int row=a.length;
	int column=b[0].length;

	int [][] sum=new int[row][column];
	for(int i=0;i<row;i++){
		for(int j=0;j<column;j++){
			sum[i][j]=a[i][j]+b[i][j];
		}
	}
	printArray(sum);
/*	for(int i=0;i<row;i++){
		System.out.print("\n");
		for(int j=0;j<column;j++){
			System.out.print("\t"+sum[i][j]);
		}
	}*/
	return sum;
	}
	public static int[][] sub(int k[][], int l[][]){
		int row=k.length;
		int column=l[0].length;

		int [][] sub=new int[row][column];
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				sub[i][j]=k[i][j]-l[i][j];
			}
		}
		printArray(sub);
	/*	for(int i=0;i<row;i++){
			System.out.print("\n");
			for(int j=0;j<column;j++){
				System.out.print("\t"+sub[i][j]);
			}
		}*/
		return sub;
	}
	public static int[][] mult(int m[][], int n[][]){
		int row1=m.length;
		int column1=m[0].length;
		int row2=n.length;
		int column2=n[0].length;
		int sum=0;
	
		int [][] mult=new int[row1][column2];	       
	if(column1==row2){
	         for (int c = 0 ; c < row1 ; c++ )
	         {
	            for (int d = 0 ; d < column2 ; d++ )
	            {   
	               for (int k = 0 ; k < row2 ; k++ )
	               {
	                  sum = sum + m[c][k]*n[k][d];
	               }
	 
	               mult[c][d] = sum;
	               sum = 0;
	            }
	         }
	         printArray(mult);
	 
	       /*  System.out.println("\nmultiply:");
	 
	         for ( int c = 0 ; c < row1 ; c++ )
	         {
	            for (int d = 0 ; d < column2 ; d++ )
	               System.out.print(mult[c][d]+"\t");
	 
	            System.out.print("\n");
	         }*/
	      
	} else System.out.println("matrisler çarpým için uygun deðil!!");
		
		
        return mult;

	}
	
	public static void printArray(int [][]a){
		int row=a.length;
		int column=a[0].length;
	//	int matris [][]=a [][];;
		//System.out.println(row+"column:"+column);
	//	int [][] matris=new int[row][column];
		for ( int c = 0 ; c < row ; c++ )
       {
         for (int d = 0 ; d < column ; d++ )
              System.out.print(a[c][d]+"\t");

           System.out.print("\n");
        }
	}
	
	
}