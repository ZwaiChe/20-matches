import java.util.Scanner;

/**
 * Created by annailinyh on 12/01/2020.
 */
public class Main {
    public static void main(String[] args) {
        Matches matches = new Matches();
        int stepOfGame = 1;
        int moveOfComputer = 0;
        int moveOfHuman = 0;
        Message.messageStart();
        System.out.println("Введи своё имя: ");
        Players.HUMAN.setNameFoMessage(new Scanner(System.in).next());

        while (matches.getAmountMatches() > 1) {

            // если сделать переменную для хранения кол-ва оставшихся спичек статической,
            //то обращаться можно из класса месадж. Стоит ли так сделать?
            if(stepOfGame % 2 !=0 ){
                Message.messageAmountMatches(matches.getAmountMatches());
                moveOfComputer = Players.COMPUTER.playerMove(matches.getAmountMatches());
                matches.minusMaches(moveOfComputer);
                Message.messageMovePlayer(Players.COMPUTER , moveOfComputer );
            }
            else{
                do
                    {
                    Message.messageAmountMatches(matches.getAmountMatches());
                    Message.messageMovePlayer(Players.HUMAN, 0);
                    moveOfHuman = Players.HUMAN.playerMove(matches.getAmountMatches());
                    if(!(moveOfHuman >= 1 && moveOfHuman <= 3)){Message.messageErrorInputHuman();}
                }
                while (!(moveOfHuman >= 1 && moveOfHuman <= 3));
                matches.minusMaches(moveOfHuman);
            }

            stepOfGame++;
        }
        Message.messageAmountMatches(matches.getAmountMatches());
        Message.messageGameOver(stepOfGame % 2 == 0 ? Players.HUMAN : Players.COMPUTER );
    }
}
