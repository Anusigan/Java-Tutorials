import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
    
        int number=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a letter: ");
        String letter=sc.nextLine();
        int count=0;
        while(count<number){
           System.out.print(letter);
            count++;
        
       sc.close();
           
            
        
   }
    
}
}
