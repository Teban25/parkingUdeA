/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.controller;

import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.exception.BussinessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author davide.gomez
 */
public class VehiculoControllerTest {
    
    public VehiculoControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of registroVehiculo method, of class VehiculoController.
     * @throws co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.exception.BussinessException
     */
    @Test
    public void testRegistroVehiculo(){
        System.out.println("registroVehiculo");
        VehiculoController instance = new VehiculoController("FKX96","Jailing","Blanca","Motocicleta","1017214");
        try {
            instance.registroVehiculo();
            assert(true);
        } catch (BussinessException ex) {
            fail(ex.getMessage());
        }
    }
    
}
