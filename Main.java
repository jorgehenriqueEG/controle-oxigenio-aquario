import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Double> niveis = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            double valor = 3.0 + rand.nextDouble() * 4.0;
            niveis.add(valor);
        }
        double menor = niveis.get(0);
        int posMenor = 0;
        for (int i = 0; i < niveis.size(); i++) {
            if (niveis.get(i) < 4.5) {
                System.out.println("AVISO: Aquario " + (i + 1) + " (" + niveis.get(i) + " mg/L)");
            }
            if (niveis.get(i) < menor) {
                menor = niveis.get(i);
                posMenor = i;
            }
        }
        System.out.println("Menor nivel: Aquario " + (posMenor + 1) + " com " + menor + " mg/L");
    }
}