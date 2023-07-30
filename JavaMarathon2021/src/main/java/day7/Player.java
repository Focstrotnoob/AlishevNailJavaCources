package day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static final int MAX_PLAYERS = 6;
    private static int countPlayers;


    public Player(int stamina) {
        this.stamina = stamina;
        if(countPlayers < MAX_PLAYERS) {
            countPlayers += 1;
        }

    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run(){
        if (stamina > 1){
            stamina --;
        }else if (stamina == 1){
            countPlayers --;
            stamina--;
        }

    }

    public static void info(){
        switch (countPlayers){
            case 5 :
                System.out.println("Команды неполные. На поле еще есть " + (MAX_PLAYERS - countPlayers) +  " свободное место");
                break;
            case 4:
            case 3:
            case 2:
                System.out.println("Команды неполные. На поле еще есть " + (MAX_PLAYERS - countPlayers) +  " свободных места");
                break;
            case 1:
            case 0:
                System.out.println("Команды неполные. На поле еще есть " + (MAX_PLAYERS - countPlayers) +  " свободных мест");
                break;
            default:
                System.out.println("На поле нет свободных мест");
        }

    }
}