package Recursions;
public class tiles{
    public static int tiles(int n){
        if(n==0 || n==1){
            return 1;
        }

        int fnm1=tiles(n-1);
        int fnm2=tiles(n-2);

        int totalWays=fnm1+fnm2;
        return totalWays;
    }
    public static void main(String args[]){
        System.out.println(tiles(3));
    }
}