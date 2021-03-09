public class BadClone {
    private volatile int count = 0;
    private volatile boolean boo = false;

    public BadClone() {
        // volatile variables should not use non-atomic operations
        count++;
        boo = true;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // non-compliant clone()
        return null;
    }
}
