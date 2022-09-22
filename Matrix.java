
public class Matrix {

		void Multiply()
	 {
		//two matrix
	 	int a[][]={{5,10,15},{1,2,3}};  
		int b[][]={{4,5,6},{20,40,60}};  
		
		//3rd matrix to store result
		int c[][]=new int[a.length][a[0].length]; //No. of row &columns 
		  

		   for(int i=0;i<a.length;i++)
		{  
		  for(int j=0;j<a[i].length;j++)
		   {  
		     c[i][j]=a[i][j] * b[i][j]; //multiplication of matrix a&b 
		     System.out.print(c[i][j]+" ");  
		   }  
		    System.out.println(); 
		}
	 }
		
	 public static void main(String[] args) 
		{
			Matrix ma=new Matrix();
				ma.Multiply();
		}
		}
		

	

