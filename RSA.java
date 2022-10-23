import java.math.BigInteger;

public class RSA {
    public static BigInteger encrypt(BigInteger message, BigInteger n, BigInteger e) {
        return message.pow(e.intValue()).mod(n);
    }

    public static BigInteger decrypt(BigInteger cypherText, BigInteger n, BigInteger d) {
        return cypherText.pow(d.intValue()).mod(n);
    }
}
