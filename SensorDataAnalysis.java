import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SensorDataAnalysis {
    public static void main(String[] args) {
        String filePath = "capteurs.csv"; // Chemin du fichier CSV
        Map<String, SensorStats> sensorStatsMap = new HashMap<>();
        
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] line;
            boolean isHeader = true;

            while ((line = reader.readNext()) != null) {
                if (isHeader) {
                    isHeader = false; // Ignorer l'en-tête
                    continue;
                }

                String sensorName = line[0];
                double value = Double.parseDouble(line[1]);

                // Calcul des statistiques pour chaque capteur
                sensorStatsMap.putIfAbsent(sensorName, new SensorStats());
                SensorStats stats = sensorStatsMap.get(sensorName);
                stats.addValue(value);
            }

            // Afficher les résultats
            System.out.println("Statistiques des capteurs:");
            for (Map.Entry<String, SensorStats> entry : sensorStatsMap.entrySet()) {
                String sensorName = entry.getKey();
                SensorStats stats = entry.getValue();
                System.out.printf("Capteur: %s | Min: %.2f | Max: %.2f | Moyenne: %.2f%n",
                        sensorName, stats.getMin(), stats.getMax(), stats.getAverage());
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Erreur lors de la lecture du fichier ou du traitement des données : " + e.getMessage());
        }
    }
}

// Classe pour calculer les statistiques
class SensorStats {
    private double sum = 0;
    private double min = Double.MAX_VALUE;
    private double max = Double.MIN_VALUE;
    private int count = 0;

    public void addValue(double value) {
        sum += value;
        count++;
        if (value < min) min = value;
        if (value > max) max = value;
    }

    public double getAverage() {
        return count == 0 ? 0 : sum / count;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }
}
