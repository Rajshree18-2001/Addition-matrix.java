public class MatrixAddition{  
public static void main(String args[]){  
//creating two matrices    
int a[][]={{1,2,1},{2,1,3},{3,2,1}};    
int b[][]={{2,1,2},{3,2,1},{1,3,2}};    
    
//creating another matrix to store the sum of two matrices    
int c[][]=new int[3][3];  //3 rows and 3 columns  
    
//adding and printing addition of 2 matrices    
for(int i=0;i<3;i++){    

for(int j=0;j<3;j++){    
c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
System.out.print(c[i][j]+" ");    
}    
System.out.println();//new line    
}    
}}  