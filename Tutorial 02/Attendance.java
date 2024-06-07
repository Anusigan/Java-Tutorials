import java.util.Scanner;
public class Attendance {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of classes held: ");
        int n_class=s.nextInt();//20
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the number of class student attended: ");
        int a_class=r.nextInt();//12
        double percent= (double)a_class/n_class*100;
        if(percent>=75){
            System.out.println("Your attendance percentage is: "+percent);
            System.out.println("Allowed to sit");
        }
        else{
            Scanner g=new Scanner(System.in);
            System.out.println("If the student has medical issue [Y/N]: ");
            char answer=g.next().charAt(0);
            switch(answer){
                case 'Y':{
                    System.out.println("Your attendance percentage is: "+percent);
                    System.out.println("Allowed to sit");
                    break;

                }
                case 'N':{
                    System.out.println("Your attendance percentage is: "+percent);
                    System.out.println("Not Allowed to sit");
                    break;
                }
            }
        }


    }
    
}
