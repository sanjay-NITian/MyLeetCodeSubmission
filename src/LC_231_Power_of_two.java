import java.util.Scanner;

public class LC_231_Power_of_two {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // sc.close();
        // System.out.println(helper(num));
        System.out.println(logBase2(536870912));
    }

    // method 1
    // recursive approach
    // public static boolean helper(int n){
    //     if(n==1){
    //         return true;
    //     }else if(n%2 != 0 || n<=0){
    //         return false;
    //     }else 
    //         return helper(n/2);
    // }

    // method 2
    // best approach
    public static boolean helper(int n){
        if(n<=0){
            return false;
        }
        double temp = logBase2(n);
        if(Math.floor(temp)==Math.ceil(temp)){
            return true;
        }else{
            return false;
        }
    }

    public static double logBase2(int n){
        return Math.log(n)/Math.log(2);
    }
    
}
