import java.util.Random;
 class Q7 {
     public static void main(String[] args) {
         Random rand = new Random();
         for (int i = 0; i < 1000; i++) {
             int dice1 = rand.nextInt(1, 7);
             int dice2 = rand.nextInt(1, 7);
             if (dice1 == dice2) {
                 System.out.println("Dice matched "+(dice1)+" "+(dice2));
             }
         }
     }
 }