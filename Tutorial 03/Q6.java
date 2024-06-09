import java.util.Scanner;
import java.util.InputMismatchException;
public class Q6 {
    public static void main(String[] args){
    int num1=0;
    int num2=0;
    char operator;
    int result=0;
    Scanner sc=new Scanner(System.in);
    while (true){
    System.out.println("Enter number 01: ");
    try{
    num1=sc.nextInt();
    break;
    }
    catch(InputMismatchException e){
        System.out.println("Enter a integer number!");
        sc.next();
    }
}
while(true){
    System.out.println("Enter number 02: ");
    try{
    num2=sc.nextInt();
    break;
    }
    catch(InputMismatchException e){
        System.out.println("Enter a integer number!");
        sc.next();
    }
}

while (true){
    System.out.println("Enter the operator: ");
    operator=sc.next().charAt(0);
    if(operator=='+'||operator=='-' || operator=='*' || operator=='/'){
        break;
    }
    else{
        System.out.println("Invalid operator");
    }
}
switch(operator){
    case '+':{
        result=num1+num2;
        break;
    }

    case ('-'):{
        result=num1-num2;
        break;
    }

    case('*'):{
        result=num1*num2;
        break;
    }

    case('/'):{
        result=num1/num2;
        break;
    }

    }
    System.out.println("The result is: "+result);
    sc.close();
}
}


    
    


    


