package game.smallCats2.Steal;
import java.util.Scanner;

public class stealMenu {
    public static boolean isPlayerTurn = true;
    public static int playerPoints;
    public static int botPoints;

    public static int stealMenu(int plaChoice){
        /**izbor na zal plan
         * ne znam kak da stane tova, improvizirah
        */
        Scanner inputScanner = new Scanner(System.in);
        stealMenuVisual.renderStealMenu();
        int stolen;
        if (isPlayerTurn){
            plaChoice = inputScanner.nextInt();
        }
        plaChoice = (int)(Math.random() * 3 + 1);

        if (plaChoice == 1){
            if (isPlayerTurn){
                stolen = botPoints/6;
                playerPoints = playerPoints + stolen;
            }
            stolen = playerPoints/6;
            botPoints = botPoints+stolen;
        }
        if (plaChoice == 2){
            if (isPlayerTurn){
                stolen = botPoints/4;
                playerPoints = playerPoints + stolen;
            }
            stolen = playerPoints/4;
            botPoints = botPoints+stolen;
        }
        if (plaChoice == 3){
            if (isPlayerTurn){
                stolen = botPoints/2;
                playerPoints = playerPoints + stolen;
            }
            stolen = playerPoints/2;
            botPoints = botPoints+stolen;
        }
        return 0;
    }
}
