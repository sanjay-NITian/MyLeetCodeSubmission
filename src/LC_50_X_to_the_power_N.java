import java.util.Scanner;

public class LC_50_X_to_the_power_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        sc.close();
        double res = myPow(x, n);
        System.out.println(res);
    }

    public static double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        if(n==-1){
            return 1/x;
        }
        if(n>0){    // for the positive power
            double res = myPow(x,n/2);
            if(n%2==0){ // even number
                return res*res;
            }else{  // odd number
                return x*res*res;
            }
        }else{  // for the negative power
            double res = myPow(x,n/2);
            if(n%2==0){ // even number
                return res*res;
            }else{  // odd number
                return (1/x)*res*res;
            }
        }
    }
}
