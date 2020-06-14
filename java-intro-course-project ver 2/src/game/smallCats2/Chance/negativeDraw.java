package game.smallCats2.Chance;

public class negativeDraw {
    /**efekti na negativni shansove
    */
    public static int playerPoints;
    public static int botPoints;
    public static boolean isPlayerTurn =true;

    public static int hilyadaNoshti(){
        if (isPlayerTurn) {
            playerPoints = playerPoints - 50;
            return playerPoints;
        }
        botPoints = botPoints - 50;
        return botPoints;
    }

    public static int fairyProm(){
        if (isPlayerTurn) {
            playerPoints = playerPoints - 100;
            return playerPoints;
        }
        botPoints = botPoints - 100;
        return botPoints;

    }

    public static int warAndPeace(){
        if (isPlayerTurn) {
            playerPoints = playerPoints - 150;
            return playerPoints;
        }
        botPoints = botPoints - 150;
        return botPoints;

    }

    public static int crimeAndPunishment(){
        if (isPlayerTurn) {
            playerPoints = playerPoints - 200;
            return playerPoints;
        }
        botPoints = botPoints - 200;
        return botPoints;

    }

    public static int warGrapes(){
        if (isPlayerTurn) {
            playerPoints = playerPoints - 250;
            return playerPoints;
        }
        botPoints = botPoints - 250;
        return botPoints;
    }
}
