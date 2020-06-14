package game.smallCats2.traps;

import java.util.Scanner;

public class danachnaReviziya {
    /**trap danachna reviziya
    */
    public static boolean isPlayerTurn = true;
    public static int playerPoints;
    public static int botPoints;

    public static int danachnaReviziya(){
        int tax;
        if (isPlayerTurn){
            tax = (playerPoints/100)*10;
            playerPoints = playerPoints -tax;
            return playerPoints;
        }
        if (!isPlayerTurn){
            tax = (botPoints/100)*10;
            botPoints = botPoints - tax;
            return botPoints;
        }
        return 0;
    }
}
