package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}

	// Méthode générique parcourant la collection
	public void applyVisitor(Visitor v) {
		for (Item i : items) {
			i.accept(v);
		}
	}

	public void printCatalog() {
		applyVisitor(new PrintCatalogVisitor());
	}

	public void printOnlyBooks() {
		applyVisitor(new PrintOnlyBooksVisitor());
	}

	public void printOnlyCDs() {
		applyVisitor(new PrintOnlyCDsVisitor());
	}
}