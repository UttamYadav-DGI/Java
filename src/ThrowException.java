class NavinException extends Exception {
    public NavinException(String string) {
        super(string);
    }
}

public class ThrowException {

    public static void main(String[] args) {
        int i = 10;
        int j = 0;

        try {
            j = 18 / i;

            if (j == 1) {
                throw new NavinException("errorrrrr");
            }
        }
        catch (NavinException e) {
            j = 10 / i;
            System.out.println("that the default output " + e);
        }
    }
}