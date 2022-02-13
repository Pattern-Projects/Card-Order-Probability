package util;

public class Utilities {
    //Todo: Enum or store for factorial results
    public static int factorial(int n) throws Exception {
        if (n < 1) {
            throw new Exception("(n < 1) not allowed"); //TODO: Write own exception
        } else if (n > 17) {
            throw new Exception("(n > 17) not allowed for resource protection");
        }
        int result = 1;
        for (; n > 0 ; n--) {
            result *= n;
        }
        return result;
    }

}
