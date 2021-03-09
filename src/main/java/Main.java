public class Main {
    public static void main(String[] args) throws Exception {
        // null pointer exception
        String myNullString = null;
        if(myNullString.equals("bad")) {
            throw new Exception();
        }

        // infinite loop
        int k = 0;
        boolean b = true;
        while (b) {
            k++;
        }

        // zero is a possible denominator
        int d = 0;
        int x = k/d;


        // string equals
        String a = "asdf";
        String f = "1234";
        if(a == f) {
            System.out.println("yes");
        }

        // don't throw exceptions in finally block
        try {
            throw new IllegalArgumentException();
        } finally {
            throw new RuntimeException();
        }

    }
}
