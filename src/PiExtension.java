/**
 * Created by izabela on 16/12/2017.
 */
public class PiExtension {

    public static String getPi(int precision) {
        return String.format("%."+precision+"f", Math.PI);
    }
}
