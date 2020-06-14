package game.smallCats2.traps;

public class propaganda {
  /**premahvane pravo za kapani, ne sam sigurna za tova
*/
  public static boolean isPlayerTurn = true;
  public static boolean canPlayerPlaceTrap = true;
  public static boolean canBotPlaceTrap = true;

    public static boolean propaganda(){
      if (isPlayerTurn){
        canPlayerPlaceTrap = false;
      }
      if(!isPlayerTurn){
        canBotPlaceTrap = false;
      }
      return true;
    }
}
