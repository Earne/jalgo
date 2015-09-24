import java.util.Scanner;

/**
 * Created by earne on 9/24/15.
 */
public class Youdao_B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m = cin.nextInt();
        int n = cin.nextInt();
        if (m < n)
            throw new IllegalArgumentException();
        System.out.println(foo(n) - foo(m));
    }
    public static int foo(int n) {
        int count=0;
        while(n>0){
            //String str=String.valueOf(n);
            char [] chars=String.valueOf(n).toCharArray();
            for(int i=0;i<chars.length;i++){
                if(chars[i]=='1')
                    count++;
            }
            n--;
        }
        return count;
    }
}
