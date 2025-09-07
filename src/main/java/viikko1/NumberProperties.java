package viikko1;

public class NumberProperties {
    public static String describe(int n) {
        if (n == 0) return "nolla";
        String NumberNegative = n > 0 ? "positiivinen" : "negatiivinen";
        String NumberPaired = Math.abs(n) % 2 == 0 ? "parillinen" : "pariton";
        return NumberNegative + " " + NumberPaired;
    }
}
