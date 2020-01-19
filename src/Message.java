/**
 * Created by annailinyh on 12/01/2020.
 */
public class Message {

    static void messageStart(){
        System.out.println("Игра начинается!!!");
    }
    static void messageAmountMatches(int amountMatches)
    {
        System.out.printf("На столе осталось %d спичек.\n" , amountMatches);
    }

    static void messageMovePlayer(Players player , int matchesForMinus){

        switch (player)
        {
            case COMPUTER: System.out.printf("   -Количество выбраных компьютером спичек = %d. \n" , matchesForMinus);
                break;


            case HUMAN: System.out.printf("  -Ход игрока %s. Введите количество спичек :", player.getNameFoMessage());
                break;

            default:
                System.out.println("Error!");

        }
    }

    static void messageGameOver(Players player)
    {
        System.out.printf(" -Для игрока %s осталась последняя спичка. %s проиграл!\n", player.getNameFoMessage(), player.getNameFoMessage() );
    }

    static void messageErrorInputHuman(){
        System.out.println("Некорректный ввод! Введите число от 1 до 3.");
    }
}
