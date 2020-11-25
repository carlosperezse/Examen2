package test;

import examenhash.Hash;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestHash {

    Hash pruebas = new Hash();

    @Test
    public void testHash1() {
        assertEquals(30, pruebas.sumarDigitos(49953));
        assertEquals(3, pruebas.hashSimple(49953));
        assertEquals("Reprobado", pruebas.calificacion(49953));
    }

    @Test
    public void testHash2() {
        assertEquals(26, pruebas.sumarDigitos(58751));
        assertEquals(8, pruebas.hashSimple(58751));
        assertEquals("Aprovado", pruebas.calificacion(58751));
    }
    
    @Test
    public void testHash3() {
        assertEquals(25, pruebas.sumarDigitos(58750));
        assertEquals(7, pruebas.hashSimple(58750));
        assertEquals("Aprovado", pruebas.calificacion(58750));
    }
    
    @Test
    public void testHash4() {
        assertEquals(22, pruebas.sumarDigitos(52942));
        assertEquals(4, pruebas.hashSimple(52942));
        assertEquals("Reprobado", pruebas.calificacion(52942));
    }
    
    @Test
    public void testHash5Mio() {
        assertEquals(20, pruebas.sumarDigitos(52067));
        assertEquals(2, pruebas.hashSimple(52067));
        assertEquals("Reprobado", pruebas.calificacion(52067));
    }
    
}
