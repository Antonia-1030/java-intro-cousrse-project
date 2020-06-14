package game.smallCats2.traps;

public class razvod {
    public static int playerPoints;
    public static int botPoints;
    public static boolean isPlayerTurn = true;

    public static int razvodPoKoteshki(){
        int winnings;
        int diceOfDivorce = (int)(Math.random() * 10 + 1);

        if(isPlayerTurn && diceOfDivorce != 2 && diceOfDivorce !=8){
            winnings = playerPoints/2;
            playerPoints = playerPoints-winnings;
            botPoints = botPoints+winnings;
        }
        if (!isPlayerTurn && diceOfDivorce !=2 && diceOfDivorce !=8){
            winnings = botPoints/2;
            botPoints = botPoints - winnings;
            playerPoints = playerPoints + winnings;
        }
        return 0;
    }
}
