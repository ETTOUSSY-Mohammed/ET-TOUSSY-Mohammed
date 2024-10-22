import java.util.Scanner;

public class Tableau {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

        double[] tableau = new double[taille];
        double somme = 0;

        System.out.println("Entrez les valeurs du tableau :");
        for (int i = 0; i < taille; i++) {
            System.out.print("Valeur " + (i + 1) + " : ");
            tableau[i] = scanner.nextDouble();
            somme += tableau[i];  // Ajouter à la somme
        }

        double max = tableau[0];
        double min = tableau[0];

        for (int i = 1; i < taille; i++) {
            if (tableau[i] > max) {
                max = tableau[i];  // Nouveau maximum trouvé
            }
            if (tableau[i] < min) {
                min = tableau[i];  // Nouveau minimum trouvé
            }
        }

        double moyenne = somme / taille;

        System.out.println("Le maximum est : " + max);
        System.out.println("Le minimum est : " + min);
        System.out.println("La moyenne est : " + moyenne);

        scanner.close();
    }
}