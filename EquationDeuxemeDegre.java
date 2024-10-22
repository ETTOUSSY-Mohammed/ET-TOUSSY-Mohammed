// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class EquationDeuxemeDegre {
   public EquationDeuxemeDegre() {
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Entrez la valeur de a : ");
      double a = scanner.nextDouble();
      System.out.print("Entrez la valeur de b : ");
      double b = scanner.nextDouble();
      System.out.print("Entrez la valeur de c : ");
      double c = scanner.nextDouble();
      double delta = b * b - 4.0 * a * c;
      double x;
      double partieImaginaire;
      if (delta > 0.0) {
         x = (-b + Math.sqrt(delta)) / (2.0 * a);
         partieImaginaire = (-b - Math.sqrt(delta)) / (2.0 * a);
         System.out.println("Deux solutions r\u00e9elles :");
         System.out.println("x1 = " + x);
         System.out.println("x2 = " + partieImaginaire);
      } else if (delta == 0.0) {
         x = -b / (2.0 * a);
         System.out.println("Une solution r\u00e9elle double :");
         System.out.println("x = " + x);
      } else {
         x = -b / (2.0 * a);
         partieImaginaire = Math.sqrt(-delta) / (2.0 * a);
         System.out.println("Deux solutions complexes :");
         System.out.println("x1 = " + x + " + " + partieImaginaire + "i");
         System.out.println("x2 = " + x + " - " + partieImaginaire + "i");
      }

      scanner.close();
   }
}
