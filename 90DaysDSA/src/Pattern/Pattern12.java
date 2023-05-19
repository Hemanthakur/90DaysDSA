import java.util.*;

public class Main {
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int a = 0, b = 1; // First two Fibonacci numbers
    for (int i = 1; i <= n; i++)
    {
      for (int j = 1; j <= i; j++)
      {
        System.out.print(a + "	");
        int c = a + b; //Since next fibonacci number is sum of
        a = b; //previous two fibonacci numbers  
        b = c;
      }
      System.out.println();
    }
  }
}
/* 2nd Method
import java.util.*;

public class Main {
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    int b=1,a=0,ans=0;
    
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(ans+" ");
            ans=a+b;
            if(j>1 || i>1){
            ans=a+b;
            a=b;
            b=ans;}
            
        }
        System.out.println();
    }
}
} 

Output-:
0 
1 1 
2 3 5 
8 13 21 34 
55 89 144 233 377 
*/
