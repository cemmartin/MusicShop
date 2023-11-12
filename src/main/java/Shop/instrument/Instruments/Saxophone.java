package Shop.instrument.Instruments;

import Shop.ProductType;
import Shop.instrument.Instrument;
import Shop.instrument.InstrumentFamily;

public class Saxophone extends Instrument {

    private String reed;

    public Saxophone(String productName, ProductType productType, double priceFromVendor, double priceForSale, InstrumentFamily instrumentFamily, String brand, String color, String reed) {
        super(productName, productType, priceFromVendor, priceForSale, instrumentFamily, brand, color);
        this.reed = reed;
    }
}
