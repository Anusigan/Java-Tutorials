import java.util.Scanner;
public class Name{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the first name: ");
String fname=s.nextLine();
Scanner k=new Scanner(System.in);
System.out.println("Enter the surname: ");
String sname=k.nextLine();
fname=fname.substring(0,1);
sname=sname.substring(0,1);
System.out.println(fname+sname);
}
}

