import java.util.*;
public class stucreate{
    public static void main(String args[]){
        int marks[]=new int[5];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.println("The student no...." + i);
            marks[i]=sc.nextInt();

        }
        for(int i=0;i<5;i++){
            System.out.println("Student marks are:" + marks[i]);
             if(marks[i]>60){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        }
        
        System.out.println();

       
    }
}