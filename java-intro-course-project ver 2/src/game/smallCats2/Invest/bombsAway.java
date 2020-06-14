package game.smallCats2.Invest;

import java.util.Scanner;

public class bombsAway {
    /**investicia za bombs away
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
            if (investition>=400) {
                playerPoints = playerPoints - investition;
                returnValue = investition * 5;
                return returnValue;
            }
            System.out.print("Greska! Nova investicia.");
        }
        if (!isPlayerTurn) {
            investition = (int) (Math.random() * botPoints + 1);
            if (investition >= 400) {
                botPoints = botPoints - investition;
                returnValue = investition * 5;
                return returnValue;
            }
            System.out.print("Greska! Nova investicia.");
        }
        return 0;
    }
}
