public class Q2C{
public static void main(String[] args) {
    int base=5;
    for(int i=1;i<=base;i++){
        for(int space=0; space<=base-i;space++){
            System.out.print(" ");
        }
        for(int stars=1; stars<=i;stars++){
            System.out.print(" *");
        }
        System.out.println();
    }
}
}