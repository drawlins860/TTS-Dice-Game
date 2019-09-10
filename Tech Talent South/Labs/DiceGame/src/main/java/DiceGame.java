import java.sql.SQLOutput;

public class DiceGame {
//Roll the dice

    //for (int score = 7, int score = 11) {
//    System.out.println("You Win!")
//        }
//for (int score = 2, int score = 3, int score = 12) {
//    System.out.println("You Lose!")
//        }
    public static void main(String[] args) {


        int point1 = 0;
        while (true) {
           int dice1 = 1 + (int) (Math.random() * 6);
           int dice2 = 1 + (int) (Math.random() * 6);
           int sum = dice1 + dice2;

            System.out.println("You Rolled a " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Sorry, You Lose!");
                break;
            } else if (sum == 7 || sum == 11) {
                System.out.println("Congratulations, You Win!");
                break;
            } else {
                point1 = dice1 + dice2;
                System.out.println("Your Point is " + point1 + " ");
                break;
            }



        }

        while (true) {
            int dice1 = 1 + (int) (Math.random() * 6);
            int dice2 = 1 + (int) (Math.random() * 6);
            int sum = dice1 + dice2;
            System.out.println("You rolled a " + sum);

            if (sum==7) {
                System.out.println("Sorry, You Lose!");
                break;
            }
            else if (sum == point1) {
                System.out.println("Congratulations, You Win!");
                break;
            } else {
                System.out.println("Your Point is " + point1 + " ");
            }

        }


    }
}


//    {
//        while (sum2 != 7) {
//            if (sum == point1) ;
//            {
//                System.out.println("You Win!");
//                break;
//            }else{
//            }
//        }
//    }
//}
