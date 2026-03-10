import java.util.*;
public class TDStucreate{
    public static void main(String args[]){
        int marks[][]=new int[3][4];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<marks.length;i++){
            System.out.println("Student class is " + i);
            for(int j=0;j<marks[i].length;j++){
                System.out.println("student no... " + j);
                marks[i][j]=sc.nextInt();

             }
             
        }
        for(int i=0;i<marks.length;i++){
            System.out.println("student class is " +i);
            for(int j=0;j<marks[i].length;j++){
                System.out.println("student marks.. " + marks[i][j]);
             }
             System.out.println();
        }
        

    }
}