import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
        int [] marks  = new int[6];
        Scanner sc=new Scanner(System.in);
        int count=0;
        double average =0;
        int f_marks=0;
        for(int i=0;i<marks.length;i++){
            System.out.println("Enter the marks "+(i+1)+":");
            marks[i]=sc.nextInt();
        }
        for(int results:marks){
            System.out.println(results);
            f_marks+=results;
        }
        for(int j=0;j<marks.length;j++){
            if(marks[j]<40){
                count+=1;

            }
            average=(double)f_marks/6;

        }
        System.out.println("The number of students failed is: "+count);
        System.out.println("The average marks is: "+average);

    }
}