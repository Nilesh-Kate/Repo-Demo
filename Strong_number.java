package pattern2;
import java.util.Scanner;
public class Strong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("program started");
     System.out.println("pls enter the no.: ");
     Scanner sc1 = new Scanner(System.in);
      int n = sc1.nextInt(); 
      int temp =n;
      int r=0;
      int fact=1;
      int sum=0;
      while(temp>0)
      {
    	  r=temp%10;
    	  fact=1;
    	  for(int i=r; i>=1; i--)
    	  {
    		  fact=fact*i; 		  
    	  }
    	  sum=sum+fact;
    	  temp = temp/10;
    	  }
     if(n==sum)
     {
    	 System.out.println(n+ "strong number!!");
     }
     else
     {
    	 System.out.println(n+"is not strong number!!");
     }
     System.out.println("program ended");
     }
	}


