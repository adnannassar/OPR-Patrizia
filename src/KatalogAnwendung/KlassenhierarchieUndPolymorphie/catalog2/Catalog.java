package KatalogAnwendung.KlassenhierarchieUndPolymorphie.catalog2;

/**
 * A catalog of items which are objects of subclasses of the CatalogItem class. It provides basic
 * operations for adding items, searching for items and outputting the content of the catalog.
 */
public class Catalog {

  /**
   * Initial capacity of the array in which the items of the catalog are stored.
   */
  private static final int INITIAL_CAPACITY = 5;

  /**
   * Additional capacity when the array where catalog items are stored needs to be increased.
   */
  private static final int ADDITIONAL_CAPACITY = 10;

  /**
   * Items of this catalog.
   */
  private CatalogItem[] items;

  /**
   * Number of items in this catalog.
   */
  private int numberItems;

  /**
   * Creates an empty catalog.
   */
  public Catalog() {

    items = new CatalogItem[INITIAL_CAPACITY];
    numberItems = 0;
  }

  /**
   * Adds the given item to this catalog.
   *
   * @param item the item which is added to this catalog
   */
  public void add(CatalogItem item) {

    if (numberItems == items.length) {
      this.enlargeArray();
    }

    items[numberItems] = item;
    numberItems++;
  }

  /**
   * Enlarges the array where the items of the catalog are stored by {@link #ADDITIONAL_CAPACITY}
   * components.
   */
  private void enlargeArray() {

    CatalogItem[] moreItems = new CatalogItem[items.length + ADDITIONAL_CAPACITY];
    System.arraycopy(items, 0, moreItems, 0, items.length);
    items = moreItems;
  }

  /**
   * Returns a multiline text with the content of this catalog. Each line contains a catalog item.
   * The items are ordered as they were added to the catalog.
   *
   * @return the content of this catalog as multiline text
   */
  public String getContentAsText() {

    String text = "";

    /*
     * Concatenate the text descriptions of all items.
     */
    for (int i = 0; i < numberItems; i++) {
      text = text + items[i].asText() + "\n";
    }

    return text;
  }

  /**
   * Returns the number of catalog items that match the given search pattern.
   *
   * @param searchPattern pattern for which matching items are searched for
   * @return the number of matching items
   */
  private int getNumHits(String searchPattern) {

    int numHits = 0;

    for (int i = 0; i < numberItems; i++) {
      if (items[i].matches(searchPattern)) {
        numHits++;
      }
    }

    return numHits;
  }

  /**
   * Returns the catalog items that match the given search pattern.
   *
   * @param searchPattern pattern for which matching items are searched for
   * @return the matching items
   */
  public CatalogItem[] getHits(String searchPattern) {

    /*
     * Create array for matching catalog items.
     */
    CatalogItem[] hits = new CatalogItem[this.getNumHits(searchPattern)];

    int hitIndex = 0;

    /*
     * Iterate through the array of catalog items and copy matching items in array of hits.
     */
    for (int i = 0; i < numberItems; i++) {
      if (items[i].matches(searchPattern)) { //
        hits[hitIndex] = items[i];
        hitIndex++;
      }
    }

    return hits;
  }
}
