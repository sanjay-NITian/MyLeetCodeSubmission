public class LC_70_climbing_stairs {
    public static int[] mem;
    public static void main(String[] args) {
        int n =4;
        mem = new int[5];
        // mem[0]=0;
        // mem[1]=1;
        System.out.println(helper(3));
    }
    public static int helper(int n){
        if(n==0){
            return 1;
        }else if(n<0){
            return 0;
        }
        if(mem[n]>0) return mem[n];
        int paths1 = helper(n-1);
        int paths2 = helper(n-2);
        int allPaths = paths1+paths2;
        mem[n]=allPaths;
        return allPaths;
    }
}
