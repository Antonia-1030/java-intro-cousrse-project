package game.smallCats2;
import java.util.Scanner;
import game.smallCats2.traps.trapsMenu;
import game.smallCats2.Invest.investMenu;
import game.smallCats2.Chance.chance;
import game.smallCats2.Party.partyHard;
import game.smallCats2.Steal.stealMenu;

public class main {
    public static final String START = " |Start| ";
    public static String TRAP = " | T | ";
    public static String INVEST = " | I | ";
    public static String PARTY_HARD = " | P | ";
    public static String CHANCE = " | C | ";
    public static String STEAL = " | S | ";
    public static String Tile = " | X | ";
    public static char Start_Label = 'S';
    public static final String UNAVAILABLE_POSITION = "   ";
    public static int PLAYER_ID = 1;
    public static int PLAYER_BOT = 2;
    public static boolean isGameOn = true;
    public static boolean isPlayerTurn = true;
    public static int playerPoints;
    public static int botPoints;
    public static int movesCounter = 0;
    public static Scanner inputScanner = new Scanner(System.in);
    public static int dice = (int)(Math.random() * 6 + 1);

    public static void main(String[] args){
        System.out.print("Welcome to the game!");
        /**igralna daska
         * how tha game board is looking
         * */
        String[][] gameBoard = {
                {START, TRAP, TRAP, TRAP, INVEST, PARTY_HARD, TRAP, CHANCE},
                {STEAL, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, STEAL},
                {INVEST, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, TRAP},
                {CHANCE, PARTY_HARD, TRAP, STEAL, PARTY_HARD, TRAP, INVEST, CHANCE}};

        while (isGameOn){
            renderGameBoard();
            int initialPoints = 1000;
            playerPoints = initialPoints;
            botPoints = initialPoints;

            getPlayerPiece();
            if (isPlayerTurn) {
                movesCounter++;
            }
            int[] moveCoordinates = readValidCoordinates(gameBoard, isPlayerTurn);
            moveFigure(gameBoard, moveCoordinates);
            isPlayerTurn = !isPlayerTurn;

            isGameOver();
        }
    }

    public static int[] readValidCoordinates(String[][] gameBoard, boolean isPlayerTurn){
        int[] coords = {};
        boolean validMove = false;

        while (!validMove){
            coords = readCoordinates();
            validMove = isMoveValid();

            if (!validMove) {
                System.out.print("Ходът не е валиден. Опитайте отново.");
            }
        }

        return coords;
    }

    public static String getPlayerPiece(){
        String PLAYER_FIGURE = " P ";
        String BOT_FIGURE = " B ";
        if (isPlayerTurn) return PLAYER_FIGURE;
        return BOT_FIGURE;
    }

    public static int activePlayerID(int currentPlayer){
        return (currentPlayer == PLAYER_ID)
                ?PLAYER_BOT :PLAYER_ID;
    }

    public static int[] readCoordinates() {
        String stringCoordinates;
        int[] coordinates = new int[4];

        do {
            System.out.print("Въведете координати на хода: ");
            stringCoordinates = inputScanner.nextLine();
        } while (stringCoordinates.length() != 4);

        int[] fromCoordinates = transformCoordinates(stringCoordinates.substring(0, 2));
        int[] toCoordinates   = transformCoordinates(stringCoordinates.substring(2, 4));

        coordinates[0] = fromCoordinates[0];
        coordinates[1] = fromCoordinates[1];
        coordinates[2] = toCoordinates[0];
        coordinates[3] = toCoordinates[1];

        return coordinates;
    }

    public static int[] transformCoordinates(String stringCoordinates) {
        int[] coordinates = new int[2];

        coordinates[0] = stringCoordinates.charAt(0) - Start_Label;
        coordinates[1] = stringCoordinates.charAt(1) - Start_Label;

        return coordinates;
    }

    public static void moveFigure(String[][] gameBoard, int[] coords) {
        String figure = gameBoard[coords[1]][coords[0]];
        String target = gameBoard[coords[3]][coords[2]];

        gameBoard[coords[3]][coords[2]] = figure;
        gameBoard[coords[1]][coords[0]] = Tile;

        if (isStart(target)){
            pointCounter();
        }
        if (isTrap(target)){
            trapsMenu trapsMenu = new trapsMenu();
        }
        if (isInvest(target)){
            investMenu investMenu = new investMenu();
        }
        if (isParty(target)){
            partyHard partyHard = new partyHard();
        }
        if (isChance(target)){
            chance chance = new chance();
        }
        if (isSteal(target)){
            stealMenu stealMenu = new stealMenu();
        }
    }

    public static boolean isStart(String tile) {
        String tileType = tile.substring();

        return tileType.equals(START);
    }
    public static boolean isTrap(String tile) {
        String tileType = tile.substring();

        return tileType.equals(TRAP);
    }
    public static boolean isInvest(String tile) {
        String tileType = tile.substring();

        return tileType.equals(INVEST);
    }
    public static boolean isSteal(String tile) {
        String tileType = tile.substring();

        return tileType.equals(STEAL);
    }
    public static boolean isParty(String tile) {
        String tileType = tile.substring();

        return tileType.equals(PARTY_HARD);
    }
    public static boolean isChance(String tile) {
        String tileType = tile.substring();

        return tileType.equals(CHANCE);
    }

    public static boolean isMoveValid(){
        if (!isPositionWithinBoard()){
            return false;
        }
        return true;
    }

    public static boolean isPositionWithinBoard(String[][] gameBoard, int hCoord, int vCoord) {
        if (hCoord < 0 || hCoord >= gameBoard[0].length || vCoord < 0 || vCoord >= gameBoard.length) {
            return false;
        }
        return true;
    }

    public static int pointCounter(){
        int currentPoints;
            currentPoints = playerPoints;
            System.out.println("Tekushti tochki na igracha: " + currentPoints);

            currentPoints = botPoints;
            System.out.println("Tekushti tochki na protivnika: " + currentPoints);
            return currentPoints;
    }

    public static void winMessage(){
        if (playerPoints>botPoints){
            System.out.print("Congrats! You win!!");
        }
        if (botPoints>playerPoints){
            System.out.print("You lose! Try again.");
        }
        System.out.print("What the- It's a tie?!");
    }
    
    public static boolean isGameOver(){
        if (playerPoints != 0 || botPoints != 0){
        isGameOn = true;
        }
        winMessage();
        return isGameOn = false;
    }

    public static void renderGameBoard(){
        String[][] gameBoard = {
                {START, Tile, Tile, Tile, Tile, Tile, Tile, Tile},
                {Tile, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, Tile},
                {Tile, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, UNAVAILABLE_POSITION, Tile},
                {Tile, Tile, Tile, Tile, Tile, Tile, Tile, Tile}};
    }
}
