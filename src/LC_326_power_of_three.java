import java.util.Scanner;

public class LC_326_power_of_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(helper(num));
    }

    // recursive approach
    public static boolean helper(int n){
        if(n==1){
            return true;
        }else if(n%2 == 0 || n%3 != 0 || n<=0){
            return false;
        }else 
            return helper(n/3);
    }
}
