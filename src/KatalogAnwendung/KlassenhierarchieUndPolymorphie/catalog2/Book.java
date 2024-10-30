package KatalogAnwendung.KlassenhierarchieUndPolymorphie.catalog2;

import java.util.StringTokenizer;

/**
 * A book with only a few and very basic descriptive attributes.
 */
public class Book extends CatalogItem {

    /**
     * The check whether this book matches a search pattern is based on the words in the book title.
     * However, the words in the following array are skipped if they appear in the title.
     */
    private static final String[] SKIP_WORDS = new String[]{"der", "die", "das", "und", "oder"};

    /**
     * Title of this book.
     */
    private final String title;

    /**
     * Author of this book.
     */
    private final String author;

    /**
     * Year of publication of this book.
     */
    private final int yearOfPublication;

    /**
     * Creates a book with the given attributes.
     *
     * @param title             title of the book
     * @param author            author of the book
     * @param price             price of the book
     * @param yearOfPublication year of publication of the book
     */
    public Book(String title, String author, float price, int yearOfPublication) {

        super(price);
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    /**
     * Returns whether the given word appears in the field of skip words.
     *
     * @param word the word that is checked to find out if it is a skip word
     * @return {@code true} if the given word is a skip word
     */
    private static boolean isSkipWord(String word) {

        for (int i = 0; i < SKIP_WORDS.length; i++)
            if (SKIP_WORDS[i].equalsIgnoreCase(word)) {
                return true;
            }
        return false;
    }

    /**
     * Returns whether this book matches the given search pattern. This is the case if any word in the
     * title which is no skip word begins with the search pattern.
     *
     * @param searchPattern pattern which is compared to the words in the book title
     * @return {@code true} if the book matches the search pattern
     */
    @Override
    public boolean matches(String searchPattern) {

        /*
         * StringTokenizer verwenden, da die einzelnen Wörter des Titels untersucht werden müssen.
         */
        StringTokenizer st = new StringTokenizer(title);

        /*
         * Gibt an, ob ein passendes Wort aus dem Titel gefunden wurde.
         */
        boolean matchFound = false;

        /*
         * Wörter des Titels mit Suchbegriff vergleichen.
         */
        while (st.hasMoreTokens() && !matchFound) {
            String token = st.nextToken();
            if (token.startsWith(searchPattern) && !isSkipWord(token)) {
                matchFound = true;
            }
        }

        return matchFound;
    }

    /**
     * Returns a textual description of this book. The description is a concatenation of title,
     * author, year of publication, and price separated by a semicolon.
     *
     * @return a textual description of this book
     */
    @Override
    public String asText() {

        return (title + "; " + author + "; " + yearOfPublication + "; €" + getPrice());
    }
}
