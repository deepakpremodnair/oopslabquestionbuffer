public class garbage {
    public static void main(String[] args) {
        garbage obj = new garbage();
        obj = null;
        System.gc(); 
    }
    protected void finalize() throws Throwable {
        System.out.println("Object is being garbage collected.");
    }
}
