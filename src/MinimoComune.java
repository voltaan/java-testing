public class MinimoComune {
    public static int mcm(int x, int y) {
        return (x * y)/mcd(x,y);
    }

    public static int mcd(int x, int y) {
        int resto;
        while (y != 0) {
            resto = x % y;
            x = y;
            y = resto;
        }
        return x;
    }
}
