package de.creatronix;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import de.creatronix.Event;

public class TestLombok {
    @Test
    public void testEventClass() {
        Event myEvent = new Event("Cinemax", "cinemax.de");
        assertEquals("Cinemax", myEvent.getLocation());
    }
    @Test
    public void testEventClass2() {
        Event myEvent = new Event("Cinemax", "cinemax.de");
        assertEquals("cinemax.de", myEvent.getUrl());
    }
}
