/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n= sc.nextInt();
	    
	    String s="",s1="";
	    
	    for(int i=1;i*i<=n;i++){
	        System.out.println("inside loop");
	        if(n%i==0){
	            s=s+i+" ";
	            if(i!=n/i)
	            s1=(n/i)+" "+s1;
	            System.out.println("inside if"+s+""+s1);  
	        }}
	     System.out.println(s+""+s1);   
	   
	    
	    
	    
// 	    if(n<=1){
// 	        return;
// 	    }
// 	    while(n%2==0){
// 	        System.out.println(2);
// 	        n=n/2;
// 	    }
// 	    while(n%3==0){
// 	        System.out.println(3);
// 	        n=n/3;
// 	    }
// 	    for(int i=5;i*i<=n;i=i+6){
// 	        while(n%i==0){
// 	            System.out.println(i);
// 	            n=n/i;
// 	        }
// 	        while(n%(i+2)==0){
// 	            System.out.println(i);
// 	            n=n/(i+2);
// 	        }
// 	    }
// 	    if(n>1){
// 	    System.out.println(n);}
// // System.out.println(res);
	    
	}
}
