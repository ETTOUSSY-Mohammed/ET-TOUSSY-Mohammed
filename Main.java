public class Main {
    public static void main(String[] args) {
        // Création d'un ingénieur
        Ingenieur eng = new Ingenieur("Alice", 'F', 30, "Informatique", "senior");
        System.out.println("Ingénieur: " + eng.getName());
        System.out.println("Salaire: " + eng.getSalary());

        // Création d'un technicien
        Technicien tech = new Technicien("Bob", 'M', 25, "maintenance");
        System.out.println("\nTechnicien: " + tech.getName());
        System.out.println("Salaire: " + tech.getSalary());
    }
}

