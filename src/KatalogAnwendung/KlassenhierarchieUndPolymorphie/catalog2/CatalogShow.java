package KatalogAnwendung.KlassenhierarchieUndPolymorphie.catalog2;

/**
 * This class has no use for other classes. It only contains sample code that illustrates the use of
 * the methods of the Catalog class.
 */
public class CatalogShow {

  /**
   * Returns a catalog with three books.
   *
   * @return a catalog with three books
   */
  private static Catalog createCatalog() {

    Catalog catalog = new Catalog();

    catalog.add(new Book("Asterix bei den Goten", "Uderzo", 9.80f, 1968));
    catalog.add(new Book("Asterix in Helvetien", "Uderzo", 9.80f, 1977));
    catalog.add(new Book("Die große Überfahrt", "Uderzo", 9.80f, 1983));

    return catalog;
  }

  private static void showGetContentAsText() {

    Catalog catalog = new Catalog();

    // Leerer Katalog
    System.out.println("Content:\n" + catalog.getContentAsText());

    // Katalog mit einem Buch
    catalog.add(new Book("Asterix der Gallier", "Uderzo", 9.80f, 1965));
    System.out.println("Content:\n" + catalog.getContentAsText());

    // Katalog mit drei Büchern
    System.out.println("Content:\n" + createCatalog().getContentAsText());
  }

  /**
   * Outputs textual descriptions of catalog items to the screen.
   *
   * @param items items whose textual descriptions are printed to the screen
   */
  private static void printCatalogItems(CatalogItem[] items) {

    for (CatalogItem item : items) {
      System.out.println(item.asText());
    }
    System.out.println();
  }

  private static void showGetHits() {

    Catalog catalog = createCatalog();

    // expected: Goten und Helvetien
    printCatalogItems(catalog.getHits("Aster"));

    // expected: Goten
    printCatalogItems(catalog.getHits("d"));
  }

  /**
   * Runs sample code.
   *
   * @param args not used
   */
  public static void main(String[] args) {

    showGetContentAsText();
    showGetHits();
  }
}
