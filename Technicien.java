public class Technicien extends Person implements Mesurable {
    private String metier;

    // Constructeur
    public Technicien(String name, char sex, int age, String metier) {
        super(name, sex, age);
        this.metier = metier;
    }

    // Getter et setter pour métier
    public String getMetier() {
        return metier;
    }

    public void setMetier(String metier) {
        this.metier = metier;
    }

    // Implémentation de la méthode getSalary() de l'interface Mesurable
    @Override
    public double getSalary() {
        // Exemple simple : salaire basé sur le métier
        if (metier.equals("maintenance")) {
            return 2500.0;
        } else if (metier.equals("production")) {
            return 2700.0;
        } else {
            return 2300.0;  // Métier par défaut
        }
    }
}

