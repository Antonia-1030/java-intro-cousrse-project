package game.smallCats2.Chance;

public class chance {
    /**opredelya kakav tip e shansa
    */

    public static void chanceDraw(){
        int drawnNumber;
        drawnNumber = (int)(Math.random() * 100 + 1);
        if (drawnNumber <= 50){
            negative.negativeChance();
        }
        positive.positiveChance();
    }
}
