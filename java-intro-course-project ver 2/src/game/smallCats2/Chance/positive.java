package game.smallCats2.Chance;

public class positive {
    /**pozitivni shansove
    */
    public static int drawnNumber;

    public static void positiveChance(){
        drawnNumber = (int)(Math.random() * 100 + 1);
        if (drawnNumber >= 1 && drawnNumber<= 39){
            System.out.print("Големите надежди");
            positiveDraw.bigHopes();
        }
        if (drawnNumber >= 40 && drawnNumber <= 65){
            System.out.print("Лолита");
            positiveDraw.loli();
        }
        if (drawnNumber >= 66 && drawnNumber <= 79){
            System.out.print("Гордост и предразсъдъци");
            positiveDraw.prideAndPedjudice();
        }
        if (drawnNumber >= 80 && drawnNumber <= 94){
            System.out.print("Повелителя на мухите");
            positiveDraw.flyMaster();
        }
        if (drawnNumber >= 95 && drawnNumber <= 100){
            System.out.print("Хобит");
            positiveDraw.hobbit();
        }
    }
}
