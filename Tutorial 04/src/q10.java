public class q10 {


        static int ff = 1, hh = 2;



        public static void main(String[] args) {

            someCode(ff, hh);

            System.out.println(" result " + ff + " " + hh);

        }

        private static void someCode(int ff, int hh) {

            ff = ff + 1;

            hh = hh + 1;

            System.out.println(" result " + ff + " " + hh);

        }

    }