/*
  Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column is set to 0.
*/
/*Algorithm : we are using two seperate arrays
if we use a single all the matrix elements will be zero so two matrices*/

import java.util.*;
import java.io.*;

class solution
{



  static void zeros(int matrix[][])
  {
    int[] row = new int[matrix.length];
    int[] column = new int[matrix[0].length]; //it will get the matrix length
    //store row and colum index with value
    for (int i=0;i<matrix.length;i++)
    {
        for (int j=0;j<matrix[0].length;j++)
        {
            if(matrix[i][j]==0)
            {
              row[i]=1;
              column[j]=1;
            }
        }
    }
    //then making zero ->both row and column were 1 present
    for(int i=0;i<matrix.length;i++)
    {
      for (int j=0;j<matrix[0].length;j++)
      {
          if ((row[i]==1)||(column[j]==1))
          {
              matrix[i][j]=0;
          }
          System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args)
  {

      Scanner scan = new Scanner(System.in);
      int n=scan.nextInt();
      solution sol = new solution();
      int[][] a= new int[n][n];
      for (int i=0;i<n ;i++ )
      {
          for (int j=0;j<n ;j++ )
          {
              a[i][j]=scan.nextInt();
          }
      }
    zeros(a);
  }
}
