package Week1_DesignPatterns.Factory_Method;

public class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF Document...");
    }
}
