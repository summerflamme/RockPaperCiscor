import java.util.Random;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Random random = new Random();
        int scorePlayer = 0;
        int scoreIA = 0;

        while (scorePlayer != 3 && scoreIA != 3) {

            switch (gameRound(ChoixPlayer(), random.nextInt(2)+0)){

                case 1:
                    scorePlayer++;
                    break;
                case 2:
                    break;
                case 3:
                    scoreIA++;
                    break;
            }
            System.out.println("Player Score:" +scorePlayer + " IA score:" +scoreIA);

        }
    }
    public static int ChoixPlayer(){
        Scanner input = new Scanner(System.in);
        int choix;
        do{
            System.out.println("0 Pierre");
            System.out.println("1 Feuille");
            System.out.println("2 Ciseaux");
            System.out.print("choise");
            choix = input.nextInt();
        }
        while (choix>2||choix<0);
        return choix ;
    }

    public static String playerSelection(int selection) {
        String object = "";
        switch (selection) {
            case 0:
                object = "Pierre ";
                break;
            case 1:
                object = "Feuille";
                break;
            case 2:
                object = "Ciseaux";
                break;
            default:

        }
        return object;
    }
    public static int gameRound(int Playerchoix , int choixIA){
        int result ;

        System.out.println("ton choix est " + playerSelection(Playerchoix) + "Le choix de l'IA est" + playerSelection(choixIA));
        if ( Playerchoix == 0 && choixIA == 2|| Playerchoix == 1 && choixIA == 0 || Playerchoix == 2 && choixIA == 1) {
            System.out.println("Win");
            result = 1;
        }else  if (Playerchoix == choixIA){
            result = 2 ;
            System.out.println("Egual");
        } else {    
            System.out.println("Perdu ");
            result =3;
        }
        return result;
    }
}