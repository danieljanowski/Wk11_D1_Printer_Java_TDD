import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 200);
    }

    @Test
    public void hasNumPages(){
        assertEquals(100, printer.getNumPages());
    }

    @Test
    public void canPrint(){
        assertEquals(30, printer.print(10,3));
    }

    @Test
    public void notEnoughPaper(){
        printer.print(20, 10);
                assertEquals(100,printer.getNumPages() );
    }

    @Test
    public void hasTonerVolume(){
        assertEquals(200, printer.getTonerVolume());
    }

    @Test
    public void checkTonerVolume(){
        printer.print(5,10);
        assertEquals(150, printer.getTonerVolume());
    }

}
