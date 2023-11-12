package Shop.instrument;

import Shop.ItemsForSale;
import Shop.ProductType;

public class Instrument extends ItemsForSale {

    private InstrumentFamily instrumentFamily;
    private String brand;
    private String color;

    public Instrument(String productName, ProductType productType, double priceFromVendor, double priceForSale, InstrumentFamily instrumentFamily, String brand, String color) {
        super(productName, productType, priceFromVendor, priceForSale);
        this.instrumentFamily = instrumentFamily;
        this.brand = brand;
        this.color = color;
    }

    public InstrumentFamily getInstrumentFamily() {
        return instrumentFamily;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }
}
