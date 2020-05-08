package de.creatronix;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class TestLombokJU5 {
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
