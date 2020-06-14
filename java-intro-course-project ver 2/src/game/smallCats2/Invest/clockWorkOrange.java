package game.smallCats2.Invest;

import java.util.Scanner;

public class clockWorkOrange {
    /**investicia za clock work orange
     */
    public static boolean isPlayerTurn = true;
    public static int playerPoints;
    public static int botPoints;
    public static Scanner inputScanner = new Scanner(System.in);

    public static int investResult(){
        int investition;
        int returnValue;

        if (isPlayerTurn){
            investition = inputScanner.nextInt();
            if (investition >= 300) {
                playerPoints = playerPoints - investition;
                returnValue = investition * 2;
                return returnValue;
            }
            System.out.print("Greska! Nova investicia.");
        }
        if (!isPlayerTurn) {
            investition = (int) (Math.random() * botPoints + 1);
            if (investition >= 300) {
                botPoints = botPoints - investition;
                returnValue = investition * 2;
                return returnValue;
            }
            System.out.print("Greska! Nova investicia.");
        }
        return 0;
    }
}
