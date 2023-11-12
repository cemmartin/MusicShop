package Shop.instrument.Instruments;

import Shop.ProductType;
import Shop.instrument.Instrument;
import Shop.instrument.InstrumentFamily;

public class Bagpipes extends Instrument {

    private String reed;
    private String materials;

    public Bagpipes(String productName, ProductType productType, double priceFromVendor, double priceForSale, InstrumentFamily instrumentFamily, String brand, String color, String reed, String materials) {
        super(productName, productType, priceFromVendor, priceForSale, instrumentFamily, brand, color);
        this.reed = reed;
        this.materials = materials;
    }
}
