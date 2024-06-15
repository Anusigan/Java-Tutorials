import java.util.Arrays;
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] myNamesArray=new int[10];
        for(int i=0;i< myNamesArray.length;i++){
            System.out.println("Enter the number: ");
            myNamesArray[i]=sc.nextInt();
        }
        int [] myNamesArray2=myNamesArray.clone();
        int bottom = myNamesArray.length-2;
        int temp;
        boolean exchanged = true;
        while (exchanged) {
            exchanged = false;
            for (int i= 0; i<= bottom; i++) {
                if (myNamesArray[i] > myNamesArray[i+ 1]) {
                    temp = myNamesArray[i];
                    myNamesArray[i] = myNamesArray[i+ 1];
                    myNamesArray[i+ 1] = temp;
                    exchanged = true;
                }
            }
            bottom--;
        }
        System.out.println(Arrays.toString(myNamesArray2));
        System.out.println(Arrays.toString(myNamesArray));


    }
}
