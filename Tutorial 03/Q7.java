import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        int chances=4;
        String passcode="486251";
        String user=" ";
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<chances;i++){
            System.out.println("Enter the passcode: ");
            user=sc.nextLine();
        
            if(user.equals(passcode)){
                System.out.println("Correct code!!");
                break;
            }
            else{
                System.out.println("Wrong passcode try again! You have "+(3-i)+" chances left");
            }
            sc.close();
            

        }
    }
    
}
