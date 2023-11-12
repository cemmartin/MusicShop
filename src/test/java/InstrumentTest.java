import Shop.ProductType;
import Shop.instrument.Instrument;
import Shop.instrument.InstrumentFamily;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Instrument instrument1;
    Instrument instrument2;

    @Before
    public void setUp() throws Exception{
        instrument1 = new Instrument("Flute", ProductType.INSTRUMENT, 200,250, InstrumentFamily.WOODWIND, "Gemeinhardt","Silver");
        instrument2 = new Instrument("Violin", ProductType.INSTRUMENT, 12345678, 23456789, InstrumentFamily.STRING, "Stradivarius", "Brown");
    }

    @Test
    public void productHasName(){
        assertEquals("Violin", instrument2.getProductName());
    }
    @Test
    public void productHasType(){
        assertEquals(ProductType.INSTRUMENT, instrument1.getProductType());
    }

    @Test
    public void productHasPriceFromVendor(){
        assertEquals(12345678, instrument2.getPriceFromVendor(), 0.0);
    }

    @Test
    public void productHasPriceForSale(){
        assertEquals(23456789, instrument2.getPriceForSale(), 0.0);
    }

    @Test
    public void productHasBrand(){
        assertEquals("Stradivarius", instrument2.getBrand());
    }

    @Test
    public void productHasColor(){
        assertEquals("Silver", instrument1.getColor());
    }


}
