import java.util.Scanner;
public class Bank {
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the account balance: ");
        double a_balance=sc.nextDouble();
        sc.nextLine();
        
        while(true){
    
        System.out.println("Enter the transaction type: ");
        String t_type=sc.nextLine();
        System.out.println("Enter the transaction amount: ");
        double amount=sc.nextDouble();
        sc.nextLine();


        switch(t_type){
            case "deposit":{
                a_balance+=amount;
                break;
            }

            case "withdrawal": {
                a_balance-=amount;
                break;
            }

            case "cheque": {
                if (a_balance < 100) {
                    System.out.println("Warning: Account balance is below $100.");
                } 
                else {
                    System.out.println("Account balance is sufficient.");
                }
                break;
            }

            default:{System.out.println("Invalid transaction type!!!");

            }
        }
        

        System.out.println("The account balance is: "+a_balance);
        if(a_balance<0){
            System.out.println("Account balance is low!");
        }

        System.out.println("Do you want to exit the program(Y/N): ");
        char answer=sc.next().charAt(0);
        sc.nextLine();
        if (answer=='Y'){
            System.out.println("Eniting..");
            break;
        }
        else{
            continue;
        }


    }

    }
    
}


