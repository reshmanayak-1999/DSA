public class CountDigit {
    public static void main(String[] args) {
        int a =34526;
        int countDigit=0;
        while(a>0){
          a=a/10;
          countDigit++;
        }
        System.out.println(countDigit);
    }
}
