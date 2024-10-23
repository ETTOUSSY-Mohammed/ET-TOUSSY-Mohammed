public class Ingenieur extends Person implements Mesurable {
    private String domaine;
    private String level;

    // Constructeur
    public Ingenieur(String name, char sex, int age, String domaine, String level) {
        super(name, sex, age);
        this.domaine = domaine;
        this.level = level;
    }

    // Getters et setters
    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    // Implémentation de la méthode getSalary() de l'interface Mesurable
    @Override
    public double getSalary() {
        // Exemple simple : calcul du salaire basé sur le niveau
        if (level.equals("junior")) {
            return 3000.0;
        } else if (level.equals("senior")) {
            return 6000.0;
        } else {
            return 4500.0;  // Niveau intermédiaire
        }
    }
}
