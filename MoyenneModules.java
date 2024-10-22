import java.util.Scanner;

public class MoyenneModules {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez le nombre de modules : ");
        int nombreModules = scanner.nextInt();

        double somme = 0;
        double noteMax = nombreModules * 20; // Si chaque module est noté sur 20

        
        for (int i = 1; i <= nombreModules; i++) {
            System.out.print("Entrez la note du module " + i + " (sur 20) : ");
            double note = scanner.nextDouble();
            somme += note;  // Ajout de chaque note à la somme
        }

        
        double moyenne = somme / nombreModules;

       
        double pourcentage = (somme / noteMax) * 100;

        
        System.out.println(nom + ", votre moyenne est : " + moyenne + " / 20");
        System.out.println("Votre pourcentage est : " + pourcentage + " %");

        scanner.close();
    }
}