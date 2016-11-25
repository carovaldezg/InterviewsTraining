package ejercicios1;

import java.math.BigInteger;
import java.util.Hashtable;
import java.util.Scanner;

public class main {

	public static int sumNumbers(int a, int b)
	{
		return a+b;
	}
	
	
	public static void main(String[] args) {
		theGridSearch();
	}
	
	
	public static long makeABigSum(long[] arr, int N)
	{
		long sum = 0;
		for (int i = 0; i <N; i++)
		{
			sum = sum + arr[i];
		}
		return sum;
	}
	
	public static void aVeryBigSum()
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Ingrese N: ");
		int N = in.nextInt();
		String s = "";
		System.out.println("Ingrese los valores separados por coma: ");
		s = in.next();
		String [] arrnumbers = s.split(",");
		for (int i =0; i <arrnumbers.length; i++)
			System.out.println(arrnumbers[i]);
		long [] arr =  new long[N];
		for (int i =0; i <N; i++)
		{
			arr[i] = Long.valueOf(arrnumbers[i]);
		}
		long sum = makeABigSum(arr, N);
		System.out.println(sum);
	}
	
	public static void fractions()
	{
	Scanner sc = new Scanner (System.in);
    int N = sc.nextInt();
    int [] arr = new int[N];
     arr[0]= -4;
     arr[1]=3;
     arr[2]=-9;
     arr[3]= 0;
     arr[4]= 4;
     arr[5]= 1;                    
    int positive=0;
    int negative = 0;
    int zero = 0;
    for (int i =0;i<N;i++)
        {
           if (arr[i]>0)
               positive = positive+1;
           else
               if (arr[i]<0)
                  negative = negative +1;
               else
                   zero= zero+1;
           System.out.println(arr[i]);
        
    }
     float fractionpos = Float.valueOf(positive)/N;
    float fractionneg = Float.valueOf(negative)/N;
    float fractionz = Float.valueOf(zero)/N;
    System.out.print(fractionpos+"\n"+fractionneg+"\n"+fractionz);
        
    }

	
	public static void giveMeTheTime()
	{
		 Hashtable<String, String> time = new Hashtable <String, String>();
		    time.put ("01","13");
		    time.put("02","14");
		    time.put("03","15");
		    time.put("04","16");
		    time.put("05","17");
		    time.put("06","18");
		        time.put("07","19");
		        time.put("08","20");
		        time.put("09","21");
		        time.put("10","22");
		        time.put("11","23");
		        time.put("12","00");
		    Scanner sc = new Scanner (System.in);
		    String hour = sc.next();
	//	    System.out.println(hour);
		    String hour_out="";
		    String[] elements = hour.split(":");
		    String aux_hour = elements[0].toString();
		        if (hour.charAt(hour.length()-2) == 'P')
		            {
		              if (time.containsKey(aux_hour))
		              {
		                  hour_out = time.get(aux_hour);
		                  hour_out = hour_out+':'+elements[1]+':'+elements[2].substring(0,2);
		                  
		                  System.out.println(hour_out);
		                  
		              } 
		        }
		        else
		            System.out.println(hour);
	}
	
	
	public static void dates()
	{
		Scanner sc= new Scanner(System.in);
	    
	     int [] actual_arr = new int[3];
	     int [] expected_arr = new int [3];
	     actual_arr[0] = sc.nextInt();
	     actual_arr[1] = sc.nextInt();
	     actual_arr[2] = sc.nextInt();
	     expected_arr[0] = sc.nextInt();
	     expected_arr[1] = sc.nextInt();
	     expected_arr[2] = sc.nextInt();
	     
	  
	     
	     int sum = 0;
	     
	        if ( (Integer.valueOf(actual_arr[2])<=Integer.valueOf(expected_arr[2])) && (Integer.valueOf(actual_arr[1])<=Integer.valueOf(expected_arr[1])) && (Integer.valueOf(actual_arr[0])<=Integer.valueOf(expected_arr[0])))
	            System.out.println("0");
	        else
	            if ((Integer.valueOf(actual_arr[2])<=Integer.valueOf(expected_arr[2])) && (Integer.valueOf(actual_arr[1])==Integer.valueOf(expected_arr[1])))
	                {
	                   sum = 15*(Math.abs(Integer.valueOf(actual_arr[0]) - Integer.valueOf(expected_arr[0])));
	                   System.out.println(sum);
	               }
	            else
	                if (actual_arr[2]==expected_arr[2])
	                {
	                    sum = 500*(Math.abs(Integer.valueOf(actual_arr[1]) - Integer.valueOf(expected_arr[1])));
	                   System.out.println(sum);
	                 }
	                else 
	                     System.out.println(10000);
	           
	}
	
	
	/*
	 If the string is middle-Outz and K=2, the encoded string is okffng-Qwvb. Note that only the letters are encrypted while symbols like - are untouched.
'm' becomes 'o' when letters are rotated twice,
'i' becomes 'k',
'-' remains the same because only letters are encoded,
'z' becomes 'b' when rotated twice.

Input Format

Input consists of an integer N equal to the length of the string, followed by the string S and an integer K.
	 * */
	
	
	 public static void caesar ()
	 {
		    Scanner sc = new Scanner (System.in);
		//    Scanner sintK = new Scanner (System.in);
		//    Scanner sintLength = new Scanner (System.in);
		    int length = sc.nextInt();
		    String s = sc.next();
		    int sint = sc.nextInt();
		   
		    sint = sint %26;
		    
		    String out="";
		    char aux;
		    for (int i=0; i<s.length(); i++)
		    {
		       
		    	aux = s.charAt(i);
		        if(((int)aux >=97) && ((int)aux <=122))
		    	   if ((int)aux+sint > (int)'z')
		    	     out = out+String.valueOf( (char)( ( (int)'a'+ (((int)s.charAt(i))+sint) % (int)'z')-1) );
		              
		    	   else
		    	        out = out+String.valueOf( (char)  ( ( (int)s.charAt(i))+sint) ) ;
		        else
		        	if (((int)aux >=65) && ((int)aux <=90))
		        	  if ((int)aux+sint > (int)'Z')
		        	
			             	out = out+String.valueOf( (char)( ( (int)'A'+ (((int)s.charAt(i))+sint) % (int)'Z')-1) );
			           else
			    	        out = out+String.valueOf( (char)  ( ( (int)s.charAt(i))+sint) ) ;
		        	else
		        	    out = out + String.valueOf(aux);
		    }
		    System.out.println (out);
            sc.close();
}
	 
	 //**********************************************************************************
	 
	 //BigInteger factorial
	 public static void factorial()
	 {
		 Scanner sc = new Scanner (System.in);
	        int n = sc.nextInt();
	        BigInteger result = BigInteger.valueOf(1);
	     
	        
	       
	        while (n>0)
	        {
	            result = result.multiply(BigInteger.valueOf(n));
	            n = n-1;
	            
	        }
	        
	        System.out.println(result);
	    
		 
	 }
	 
	 //**********************************************************************************
	 //**********************************************************************************
	 public static void angryTeacher()
	 {
		 Scanner sc = new Scanner (System.in);
		 int t = sc.nextInt();
		 int ontime = 0;
		 int time=0;
		 int n;
		 int k;
		 
	     for (int i = 0; i<t; i++)
	     {
	    	 n = sc.nextInt();
	    	 k = sc.nextInt();
	    	 for (int c = 0; c<n;c++)
	    	 {
	    		 
	    		 if (sc.nextInt()<=0)
	    			 ontime=ontime+1;
	    	     	 
	    	 }
	    	 if (ontime>=k)
	    		 System.out.println("NO");
	    	 else
	    		 System.out.println("YES");
	    	 ontime = 0;
	    		 
	    	 
	     }
		 
		 
	 }
	 
	 //**********************************************************************************
	 //**********************************************************************************

	 public static void cavitySearch ()
	 {
		 Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    char [][]matrix = new char[n][n];
		    for (int i = 0; i < n; i++)
		    {
		        String lines = sc.next();
		        for (int j = 0; j<n;j++)
		        	matrix[i][j] = lines.charAt(j);
		        
		    }
		    
		    for (int i = 1; i<n-1;i++)
		        for (int j = 1; j< n-1; j++)
		           {
		               if ( (matrix[i][j]>matrix[i-1][j]) && (matrix[i][j]>matrix[i][j-1])&& (matrix[i][j]>matrix[i][j+1]) && 
		                   (matrix[i][j]>matrix[i+1][j]) )
		                         matrix[i][j] = 'X';
		               
		        
		           }
		      for (int i = 0; i<n;i++)
		       { for (int j=0;j<n;j++)
		           System.out.print(matrix[i][j]);
		         System.out.print("\n");
		       }
		 
	 }
	 
	 
	 //**********************************************************************************
	 //**********************************************************************************

	 
	 public static boolean buscarPattern(int [][] matrix, int [][] pattern, int rows, int cols, int r, int c, int auxf, int auxc)
	    {
	       int patternc = 0;
	       int patternf  = 0;
	       int firstcol = auxc;
	       boolean stop = false;
	       
	        while ((auxf < rows) && (patternf< r) )
	         {
	            while ((auxc < cols) && (patternc < c) && (matrix[auxf][auxc] == pattern[patternf][patternc]) && (!stop))
	            {
	            	if (patternc+1 ==c)
	            		stop = true;
	            	
	               auxc++;
	               patternc++;
	            }
	            if (stop)
	            {	
	            	auxc = firstcol;
	            	patternc = 0;
	            	auxf++;
	            	stop = false;
	            	patternf++;
	            	if ((auxf == rows) && (patternf <r) )
	            		return false;
	            }
	    /*        if ((auxc == cols) && (patternc < c) )// || (auxc< cols) && (patternc <c) && (matrix[auxf][auxc] != pattern[patternf][patternc]) )
	                return false;
	      */  
	            
	        }
	        if ((patternc == c) && (patternf == r))
	            return true; 
	        return false;
	    }
	    
	    
	 public static void theGridSearch()
	 {
		 Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        boolean encontro = false;
	     while (t>0)
	     { 
	        int rows = sc.nextInt();
	        int cols = sc.nextInt();
			int [][]matrix = new int[rows][cols];
			for (int i = 0; i < rows; i++)
			{
			    String lines = sc.next();
			    for (int j = 0; j<cols;j++)
			     	matrix[i][j] = (int)(lines.charAt(j));
	        }
	        int r = sc.nextInt();
	        int c = sc.nextInt();
	        int [][]pattern = new int[r][c];
			for (int i = 0; i < r; i++)
			{
			   String lines = sc.next();
			   for (int j = 0; j<c;j++)
			     pattern[i][j] = (int)(lines.charAt(j));
	        }
	        int i= 0;
	        int j=0;
	        boolean aux = true;
	        for (i = 0; i<rows && aux;i++)
	        for (j = 0 ;j <cols && aux ;j++)
	           if (matrix[i][j] == pattern[0][0])
	           {
	                encontro = buscarPattern(matrix, pattern, rows, cols, r, c, i, j);
	                if (encontro)
	                { aux = false;
	                	System.out.println("YES");
	                    break;
	                }
	            }
	        
	        if ((i==rows) && (j == cols) && (!encontro) )
	           System.out.println("NO");
	        t--;
	        
	       }
	    
	    
	 }
	 
	 
}
