import java.math.BigInteger;

public class Runner {
    public static void main(String[] args) {
//        System.out.println(Euclidean.lcm(420, 245));

        BigInteger n = BigInteger.valueOf(3233), e = BigInteger.valueOf(17);
        BigInteger d = BigInteger.valueOf(413);

        BigInteger message = BigInteger.valueOf(65);

        BigInteger cypher = RSA.encrypt(message,n,e);
        System.out.println(cypher);

        BigInteger plainText = RSA.decrypt(cypher, n, d);
        System.out.println(plainText);
    }
}
