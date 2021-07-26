import java.util.Scanner;

public class LC_342_Power_of_four {
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
        }else if(n%4 != 0 || n<=0){
            return false;
        }else 
            return helper(n/4);
    }
}
