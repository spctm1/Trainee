import java.math.BigInteger;
public class Third {
    public static void  bla(){
        int max = 100;
        BigInteger sum = BigInteger.valueOf(0); //Creating sum and assignment 0 to it
        BigInteger result = BigInteger.valueOf(1);// Creating result and assignment 1 to it

        //result will be facrotial of 100
        for(int i = 1; i<=max; i++){
            result  = result.multiply(BigInteger.valueOf(i));

        }
        //seeking for sum of digits factorial 100
        while (!result.equals(BigInteger.ZERO)) {
            sum = sum.add(result.mod(BigInteger.valueOf(10)));
            result = result.divide(BigInteger.valueOf(10));

        }
        System.out.println(sum);//print out value of sum
    }

    public static void main(String[] args) {
        Third u = new Third();//creating class reference
        u.bla();//Method call
    }
}
