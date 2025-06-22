package Week1_DesignPatterns.Factory_Method;

public class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel Document...");
    }
}
