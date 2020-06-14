package game.smallCats2.traps;
import java.util.Scanner;

public class trapsMenu {
    public static int PLAYER_ID = 1;
    public static int PLAYER_BOT = 2;
    public static boolean isPosEmpty = true;
    public static Scanner inputScanner = new Scanner(System.in);
    public static boolean canPlayerPlaceTrap = true;
    public static boolean canBotPlaceTrap = true;
    public static int playerPoints;
    public static int botPoints;
    public static boolean isPlayerTurn = true;

    public static int choiceMenu(int participantChoice, int currentPlayerID) {
        trapsMenuVisual.renderTrapMenu();
        /**koi igrach e na kvadrata
         */
        while (isPosEmpty) {
            if (currentPlayerID == PLAYER_ID && canPlayerPlaceTrap) {
                participantChoice = inputScanner.nextInt();
            }
            if (currentPlayerID == PLAYER_BOT && canBotPlaceTrap) {
                participantChoice = (int) (Math.random() * 6 + 1);
            }
        }
        int investition;

        /**izbot ot kapani
        */
        if(participantChoice == 1){
            if (isPlayerTurn){
                playerPoints = playerPoints -100;
            }
            botPoints = botPoints-100;
            danachnaReviziya.danachnaReviziya();
            isPosEmpty =false;
        }
        if (participantChoice == 2){
            if (isPlayerTurn){
                playerPoints = playerPoints -200;
            }
            botPoints = botPoints-200;
            razvod.razvodPoKoteshki();
            isPosEmpty =false;
        }
        if (participantChoice == 3){
            if (isPlayerTurn){
                playerPoints = playerPoints -100;
            }
            botPoints = botPoints-100;
            propaganda.propaganda();
            isPosEmpty =false;
        }
        if(participantChoice == 4){
            if (isPlayerTurn){
                playerPoints = playerPoints -50;
            }
            botPoints = botPoints-50;
            vision.proglejdane();
            isPosEmpty =false;
        }
        if (participantChoice == 5){
            if (isPlayerTurn){
                playerPoints = playerPoints -100;
            }
            botPoints = botPoints-100;
            hazard.hazartenBos();
            isPosEmpty =false;
        }
        if (participantChoice == 6){
            noTrap.noTrap();
            isPosEmpty = true;
        }
        System.out.print("Greshka! Opitai pak!");
    }
}
