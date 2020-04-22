import java.util.Scanner;

public class PrimeSieveViewer {

    private PrimeSieveModel model;

    public PrimeSieveViewer() {
        int limit = askForLimit();
        model = new PrimeSieveModel(limit);
        model.filterPrimes();
        int linelength = 0;
        for (int i = 0; i < model.getPrimes().size(); i++) {
            linelength += (model.getPrimes().get(i) + "").length()+2;
            System.out.print(model.getPrimes().get(i) + ", ");
            if (linelength > 200) {
                System.out.println();
                linelength = 0;
            }
        }
        System.out.println();
        System.out.println("Er zijn tot de " + limit + " " + model.getPrimes().size() + " priemgetallen.");
    }

    private int askForLimit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welkom bij de priemgetallenzeef. Tot hoe hoog wil je priemgetallen filteren?");
        String input = scanner.nextLine();
        boolean inputIsValid = false;
        int answer = 0;
        while(!inputIsValid) {
            try {
                answer = Integer.parseInt(input);
                if (answer <= 1) {
                    throw new NumberFormatException();
                }
                else {
                    inputIsValid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Je kunt alleen een geheel nummer invullen, boven de 1.");
            }

        }
        return answer;
    }
}
