import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int sp=0;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=sp;j++){
                System.out.print("  ");
            }
            sp++;
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
Output - :
* * * * * 
  * * * * 
    * * * 
      * * 
        *    
*/
