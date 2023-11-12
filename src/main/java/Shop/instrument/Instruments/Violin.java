package Shop.instrument.Instruments;

import Shop.ProductType;
import Shop.instrument.Instrument;
import Shop.instrument.InstrumentFamily;

public class Violin extends Instrument {

    private String stringsStrung;
    private int numberOfStrings;

    public Violin(String productName, ProductType productType, double priceFromVendor, double priceForSale, InstrumentFamily instrumentFamily, String brand, String color, String stringsStrung, int numberOfStrings) {
        super(productName, productType, priceFromVendor, priceForSale, instrumentFamily, brand, color);
        this.stringsStrung = stringsStrung;
        this.numberOfStrings = numberOfStrings;
    }
}
