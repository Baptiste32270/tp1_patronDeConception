package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();
        mediatheque.addItem(new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
        mediatheque.addItem(new Book("Philip K. Dick", "Le Maître du haut chateau"));
        mediatheque.addItem(new Book("J.K. Rowling", "Harry Potter à l'école des sorciers"));
        mediatheque.addItem(new Book("George Orwell", "1984"));
        mediatheque.addItem(new Book("Aldous Huxley", "Brave New World"));
        mediatheque.addItem(new Book("Ray Bradbury", "Fahrenheit 451"));
        mediatheque.addItem(new CD(12, "Sergeant Peppers"));
        mediatheque.addItem(new CD(10, "Abbey Road"));
        mediatheque.addItem(new CD(8, "Revolver"));
        mediatheque.addItem(new CD(14, "The Dark Side of the Moon"));
        mediatheque.addItem(new CD(11, "Wish You Were Here"));
        // mediatheque.printCatalog();
        // mediatheque.printOnlyBooks();
        // mediatheque.printOnlyCDs();
    }
}
