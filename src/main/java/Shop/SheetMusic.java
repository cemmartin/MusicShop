package Shop;

public class SheetMusic extends ItemsForSale {

    private String author;
    private String publisher;

    public SheetMusic(String productName, ProductType productType, double priceFromVendor, double priceForSale, String author, String publisher) {
        super(productName, productType, priceFromVendor, priceForSale);
        this.author = author;
        this.publisher = publisher;
    }
}
