import Shop.ItemsForSale;
import Shop.ProductType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemsForSaleTest {

    ItemsForSale itemsForSale;

    @Before
    public void setUp() throws Exception {
        itemsForSale = new ItemsForSale("Flute", ProductType.INSTRUMENT, 200,250);
    }

    @Test
    public void productHasName(){
        assertEquals("Flute", itemsForSale.getProductName());
    }

    @Test
    public void productHasType(){
        assertEquals(ProductType.INSTRUMENT, itemsForSale.getProductType());
    }

    @Test
    public void productHasVendorPrice(){
        assertEquals(200, itemsForSale.getPriceFromVendor(), 0.0);
    }

    @Test
    public void productHasSalePrice(){
        assertEquals(250, itemsForSale.getPriceForSale(), 0.0);
    }



}
