import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by izabela on 16/12/2017.
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            int prec = ThreadLocalRandom.current().nextInt(0, 10);

            String pi = PiExtension.getPi(prec);
            System.out.println("precision " + prec + ": " + pi);
        }
    }
}
