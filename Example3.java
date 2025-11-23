
interface Printable {
    void print();
}


interface Showable {
    void show();
}


class Document implements Printable, Showable {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }
    @Override
    public void show() {
        System.out.println("Displaying document...");
    }
}


public class Example3 {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
        doc.show();
    }
}