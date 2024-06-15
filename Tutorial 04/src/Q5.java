import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        double[][] marks = new double[5][3];
        double [] Student=new double[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks of Student "+(i+1)+" for SD1: ");
            marks[i][0]=sc.nextDouble();
            System.out.println("Enter the marks of Student "+(i+1)+" for Web: ");
            marks[i][1]=sc.nextDouble();
            System.out.println("Enter the marks of Student "+(i+1)+" for Maths: ");
            marks[i][2]=sc.nextDouble();

            }
        for(int j=0;j<marks.length;j++){

            Student[j]=(marks[j][0]+marks[j][1]+marks[j][2])/3;
        }
        int num=1;
        for(double average:Student){
            System.out.println("The average marks of Student "+num+" is:"+average);
            num++;
        }
        }
    }

