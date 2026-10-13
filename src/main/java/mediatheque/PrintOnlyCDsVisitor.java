package mediatheque;

public class PrintOnlyCDsVisitor implements Visitor {
    @Override
    public void visit(Book b) {
        // Ne rien faire pour les livres
    }

    @Override
    public void visit(CD c) {
        System.out.println(c);
    }
}