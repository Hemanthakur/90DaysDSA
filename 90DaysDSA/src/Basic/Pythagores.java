import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        int temp=0; 
        int max=a;
        
        temp = ( b > c ) ? b : c;
        max = (max > temp) ? max: temp;
        boolean flag=false;
        if(max==a){
            flag = ((b*b+c*c)==(a*a));
        } else if(max==b){
            flag = ((a*a+c*c)==(b*b));
        }else{
            
            flag = ((a*a+b*b)==(c*c));
        }
        System.out.println(flag);
    }
}
