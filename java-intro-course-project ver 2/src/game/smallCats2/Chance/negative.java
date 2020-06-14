package game.smallCats2.Chance;

public class negative {
    /**vidove negativen shans
    */
    public static int drawnNumber;

    public static void negativeChance(){
        drawnNumber = (int)(Math.random() * 100 + 1);
        if (drawnNumber >= 1 && drawnNumber<= 39){
            System.out.print("1001 нощ");
            negativeDraw.hilyadaNoshti();
        }
        if (drawnNumber >= 40 && drawnNumber <= 65){
            System.out.print("Балът на феите");
            negativeDraw.fairyProm();
        }
        if (drawnNumber >= 66 && drawnNumber <= 79){
            System.out.print("Война и мир");
            negativeDraw.warAndPeace();
        }
        if (drawnNumber >= 80 && drawnNumber <= 94){
            System.out.print("Престъпление и наказание");
            negativeDraw.crimeAndPunishment();
        }
        if (drawnNumber >= 95 && drawnNumber <= 100){
            System.out.print("Гроздовете на гнева");
            negativeDraw.warGrapes();
        }
    }
}
