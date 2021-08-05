public class LC_344_Reverse_String {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i < j){
            swap(s,i,j);
            i++;
            j--;
        }
    }
    public static void swap(char[] s,int i,int j){
        char temp = s[i];
        s[i]=s[j];
        s[j]=temp;
    }
}
