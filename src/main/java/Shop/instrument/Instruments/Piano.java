package Shop.instrument.Instruments;

import Shop.ProductType;
import Shop.instrument.Instrument;
import Shop.instrument.InstrumentFamily;

public class Piano extends Instrument {

    private String typeOfPiano;
    private int numberOfKeys;

    public Piano(String productName, ProductType productType, double priceFromVendor, double priceForSale, InstrumentFamily instrumentFamily, String brand, String color, String typeOfPiano, int numberOfKeys) {
        super(productName, productType, priceFromVendor, priceForSale, instrumentFamily, brand, color);
        this.typeOfPiano = typeOfPiano;
        this.numberOfKeys = numberOfKeys;
    }
}
