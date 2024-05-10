package task2ArraysAndStrings;

class Array
{
	public void initializeArray()
	{
		
	  int [][] a=new int[3][3];
	  a[0][0]=1;
	  a[0][1]=11;
	  a[0][2]=111;
	  
	  a[1][0]=2;
	  a[1][1]=22;
	  a[1][2]=222;
	  
	  a[2][0]=3;
	  a[2][1]=33;
	  a[2][2]=33;
	  
	  System.out.println("2-D array with int data type");
	  for(int i=0;i<a.length;i++)
	  { 
		  for(int j=0;j<a[i].length;j++)
		  {
			  System.out.println(a[i][j]);  
		  }
		  System.out.println();
		  
	  }
	  
	  
	  float [][] b=new float[3][3];
	  b[0][0]=1.1f;
	  b[0][1]=11.11f;
	  b[0][2]=111.111f;
	  
	  b[1][0]=2.2f;
	  b[1][1]=22.22f;
	  b[1][2]=222.222f;
	  
	  b[2][0]=3.3f;
	  b[2][1]=33.33f;
	  b[2][2]=33.333f;
	  
	  System.out.println("2-D array with float data type");
	  for(int i=0;i<b.length;i++)
	  { 
		  for(int j=0;j<b[i].length;j++)
		  {
			  System.out.println(b[i][j]);  
		  }
		  System.out.println();
		  
	  }
	  
	  long [][] c=new long[3][3];
	  c[0][0]=1234567890l;
	  c[0][1]=2345678901l;
	  c[0][2]=3456789012l;
	  
	  c[1][0]=4567890123l;
	  c[1][1]=5678901234l;
	  c[1][2]=6789012345l;
	  
	  c[2][0]=7890123456l;
	  c[2][1]=8901234567l;
	  c[2][2]=9012345678l;
	  
	  System.out.println("2-D array with long data type");
	  for(int i=0;i<c.length;i++)
	  { 
		  for(int j=0;j<c[i].length;j++)
		  {
			  System.out.println(c[i][j]);  
		  }
		  System.out.println();
		  
	  }
	  
	  double [][] d=new double[3][3];
	  d[0][0]=12345;
	  d[0][1]=23456;
	  d[0][2]=34567;
	  
	  d[1][0]=45678;
	  d[1][1]=56789;
	  d[1][2]=67890;
	  
	  d[2][0]=78901;
	  d[2][1]=89012;
	  d[2][2]=90123;
	  
	  System.out.println("2-D array with double data type");
	  for(int i=0;i<d.length;i++)
	  { 
		  for(int j=0;j<d[i].length;j++)
		  {
			  System.out.println(d[i][j]);  
		  }
		  System.out.println();
		  
	  }
	  
	  short [][] e=new short[3][3];
	  e[0][0]=1234;
	  e[0][1]=2345;
	  e[0][2]=3456;
	  
	  e[1][0]=4567;
	  e[1][1]=5678;
	  e[1][2]=6789;
	  
	  e[2][0]=7890;
	  e[2][1]=8901;
	  e[2][2]=9012;
	  
	  System.out.println("2-D array with short data type");
	  for(int i=0;i<e.length;i++)
	  { 
		  for(int j=0;j<e[i].length;j++)
		  {
			  System.out.println(e[i][j]);  
		  }
		  System.out.println();
		  
	  }
	  
	}
}

public class ArrayInizialization 
{

	public static void main(String[] args) 
	{
		Array aa =new Array();
		aa.initializeArray();

	}

}
