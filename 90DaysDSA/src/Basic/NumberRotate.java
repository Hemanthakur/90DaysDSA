import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int k=scn.nextInt();
        int count=0;
        int temp=n;
        while(temp>0){
            temp/=10;
            count++;
        }
         k=k%count;
        if(k< 0){
           k+=count;
        }
        int div=1;
        int mul=1;
        for(int i=1;i<=count;i++){
            if(i<=k){
                div=div*10;
            }
            else{
                mul=mul*10;
            }
        }
        int q=n /div;
        int r=n % div;
        int rot=r*mul+q;
        System.out.println(rot);
        
    }
}
