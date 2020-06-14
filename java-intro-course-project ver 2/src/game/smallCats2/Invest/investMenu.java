package game.smallCats2.Invest;

import java.util.Scanner;

public class investMenu {
    /**menu za investicii
     * ideya si nyamam kat te rabotyat i kakvi sa tiya riskovi intervali
    */
    public static boolean isMenuOpen = true;
    public static Scanner inputScanner = new Scanner(System.in);

    public static void investitionMenu(){
        while (isMenuOpen){
            System.out.print("Izberete investicia. :D");
            investMenuVisual.renderInvestitionMenu();
            int invetChoise = inputScanner.nextInt();

            if (invetChoise == 1){evelCo.investResult();}
            if (invetChoise == 2){bombsAway.investResult();}
            if (invetChoise == 3){clockWorkOrange.investResult();}
            if (invetChoise == 4){marodersUnited.investResult();}
            if (invetChoise == 5){fatCatIncorporated.investResult();}
            if (invetChoise ==6){macrosoft.investResult();}
            if (invetChoise == 7){isMenuOpen = false;}
        }
    }
}
