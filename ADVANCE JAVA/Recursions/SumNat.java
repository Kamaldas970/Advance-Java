package Recursions;
public class SumNat{

   public static int SumNat(int n){
     if(n==1){
        return 1;
    }
    int snm=n-1;
    int sn=n+SumNat(n-1);
    return sn;
   }
    public static void main(String args[]){
        int n=5;
        System.out.println(SumNat(n));
    }
}