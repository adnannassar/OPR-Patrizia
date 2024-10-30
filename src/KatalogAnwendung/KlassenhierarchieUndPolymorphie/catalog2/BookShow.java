package KatalogAnwendung.KlassenhierarchieUndPolymorphie.catalog2;

/**
 * This class has no use for other classes. It only contains sample code that illustrates the use of
 * the methods of the Book class.
 */
public class BookShow {

  private static void showMatches() {

    Book book = new Book("Asterix der Gallier", "Uderzo", 9.80f, 1965);

    // expected: true
    System.out.println(book.matches("Gall"));

    // expected: false, denn "der" ist skip word
    System.out.println(book.matches("der"));

    // expected: false, denn kein Wort des Titels beginnt mit "Galle"
    System.out.println(book.matches("Galle"));
  }

  /**
   * Runs sample code.
   *
   * @param args not used
   */
  public static void main(String[] args) {

    showMatches();
  }
}
