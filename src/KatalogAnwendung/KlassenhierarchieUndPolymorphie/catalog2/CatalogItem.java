package KatalogAnwendung.KlassenhierarchieUndPolymorphie.catalog2;

/**
 * A catalog item with only a few and very basic descriptive attributes.
 */
public class CatalogItem {

  /**
   * Price of this catalog item.
   */
  private final float price;

  /**
   * Creates a catalog item with the given price.
   *
   * @param price price of the item
   */
  public CatalogItem(float price) {

    this.price = price;
  }

  /**
   * Returns whether this catalog item matches the given search pattern.
   *
   * @param searchPattern pattern which is compared to this catalog item
   * @return always {@code false}, because there are no attributes that can be meaningfully compared
   * to the search pattern
   */
  public boolean matches(String searchPattern) {

    return false;
  }

  /**
   * Returns the price of this catalog item
   *
   * @return the price of the item
   */
  protected float getPrice() {

    return price;
  }

  /**
   * Returns a textual description of this catalog item. As there are no attributes known in this
   * class, that describe the item in a meaningful way, the textual description is just a hint that
   * this method should be overridden in subclasses.
   *
   * @return a hint that this method should be overridden in subclasses
   */
  public String asText() {

    return "Please override the method asText.";
  }
}
