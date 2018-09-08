package algorithms;

/**
 *
 * @author xcoder
 * Example - Euclidean algorithm
 */
public class Euklid_GCD {
    static int gcd(int a, int b){
        if (b == 0) return a;
        int res = a % b;
        return gcd(b, res);
    }
}
