package game.smallCats2.Chance;

public class positiveDraw {
    /**efekti na pozitivni shansove
    */
    public static int playerPoints;
    public static int botPoints;
    public static boolean isPlayerTurn =true;

    public static int bigHopes(){
        if (isPlayerTurn) {
            playerPoints = playerPoints + 50;
            return playerPoints;

        }
        botPoints = botPoints + 50;
        return botPoints;
    }

    public static int loli(){
        if (isPlayerTurn) {
            playerPoints = playerPoints + 100;
            return playerPoints;
        }
        botPoints = botPoints + 100;
        return botPoints;
    }

    public static int prideAndPedjudice(){
        if (isPlayerTurn) {
            playerPoints = playerPoints + 150;
            return playerPoints;
        }
        botPoints = botPoints + 150;
        return botPoints;
    }

    public static int flyMaster(){
        if (isPlayerTurn) {
            playerPoints = playerPoints + 200;
            return playerPoints;

        }
        botPoints = botPoints + 200;
        return botPoints;
    }

    public static int hobbit(){
        if (isPlayerTurn) {
            playerPoints = playerPoints + 250;
            return playerPoints;
        }
        botPoints = botPoints + 250;
        return botPoints;
    }
}
