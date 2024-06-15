public class Q4{
    public static void main(String[] args) {
        int [] A = {2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Even numbers of the array");
        for(int number:A){
            if(number%2==0){
                System.out.print(number+ " ");


            }
        }
        System.out.println();
        System.out.println("Those numbers that being multiplied by 2 give a number that is also an element of A");
        for(int i=0;i<A.length;i++){
            int value=A[i]*2;
            for(int j=0;j<A.length;j++){
                if(value==A[j]){
                    System.out.print(value+" ");
                    break;
                }
            }
        }
    }
}