package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesMatematicasGSMCTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }


    @Test
    void raizcuadradacal() {

        OperacionesMatematicasGSMC cal = new OperacionesMatematicasGSMC();
        assertEquals(4, cal.raizcuadradacal(16));



        assertEquals(0.0,cal.raizcuadradacal(0.0));



        assertThrows(IllegalArgumentException.class, () ->{
            cal.raizcuadradacal(-1.0);

        });
    }
}