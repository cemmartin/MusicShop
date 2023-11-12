package Shop;

public class ItemsForSale {
    private String productName;
    private ProductType productType;
    private double priceFromVendor;
    private double priceForSale;

    public ItemsForSale(String productName, ProductType productType, double priceFromVendor, double priceForSale) {
        this.productName = productName;
        this.productType = productType;
        this.priceFromVendor = priceFromVendor;
        this.priceForSale = priceForSale;
    }

    public String getProductName() {
        return productName;
    }

    public ProductType getProductType() {
        return productType;
    }

    public double getPriceFromVendor() {
        return priceFromVendor;
    }

    public double getPriceForSale() {
        return priceForSale;
    }
}
