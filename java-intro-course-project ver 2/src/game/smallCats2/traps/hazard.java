package game.smallCats2.traps;
import game.smallCats2.Chance.negative;

public class hazard {
    /** negativen shans, ne sam sigurna za tova
    */
    public static boolean isPlayerTurn = true;
    public static int playerPoints;
    public static int botPoints;

    public static int hazartenBos(){
        if (isPlayerTurn){
            negative negativeChance = new negative();
        }
        if (!isPlayerTurn){
            negative negativeChance = new negative();
        }
        return 0;
    }
}
