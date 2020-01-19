import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by annailinyh on 12/01/2020.
 */
public enum Players {
    COMPUTER("Компьютер") {
        @Override
        int playerMove(int amountMatches) {
            return (amountMatches - 1) %4;
            }

    },

    HUMAN("Человек") {
        @Override
        int playerMove(int amountMatches) {
//            Scanner scanerInputHuman = new Scanner(System.in);
//            if(!scanerInputHuman.hasNextInt()){
//                return 0;
//            }
//            return  scanerInputHuman.nextInt();

//через регулярные выражения и рекурсию
            Scanner scanerInputHuman = new Scanner(System.in);
            String inputHuman = scanerInputHuman.next();
            if (!(Pattern.matches("[1-3]",inputHuman))){
                Message.messageErrorInputHuman();
                Message.messageAmountMatches(amountMatches);
                Message.messageMovePlayer(this ,0);
                inputHuman =String.valueOf(playerMove(amountMatches));
            }

            return Integer.parseInt(inputHuman);
        }
    };
    private String nameFoMessage;
    Players(String nameFoMessage){
        this.nameFoMessage = nameFoMessage;
    }

    public String getNameFoMessage() {
        return nameFoMessage;
    }

    public void setNameFoMessage(String nameFoMessage) {
        this.nameFoMessage = nameFoMessage;
    }

    abstract int playerMove(int amountMatches);
}
