package Shop.instrument.Instruments;

import Shop.ProductType;
import Shop.instrument.Instrument;
import Shop.instrument.InstrumentFamily;

public class Flute extends Instrument {

    private String typeOfFlute;
    private String material;

    public Flute(String productName, ProductType productType, double priceFromVendor, double priceForSale, InstrumentFamily instrumentFamily, String brand, String color, String typeOfFlute, String material) {
        super(productName, productType, priceFromVendor, priceForSale, instrumentFamily, brand, color);
        this.typeOfFlute = typeOfFlute;
        this.material = material;
    }
}
