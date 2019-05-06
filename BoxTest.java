/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vasili
 */
public class BoxTest {

    public BoxTest() {
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
     * Test of addProduct method, of class Box.
     */
    @Test
    public void testAddProduct_Product() {
        System.out.println("addProduct");
        Product product = new Product("Grinder", 5, false, false);
        Manifest instance = new Manifest();
        instance.addProduct(product);
    }

    /**
     * Test of addProduct method, of class Box.
     */
    @Test
    public void testAddProduct_Product_int() {
        System.out.println("addProduct");
        Product product = new Product("Grinder", 5, false, false);
        int quantity = 0;
        Manifest instance = new Manifest();
        instance.addProduct(product, quantity);
    }

    /**
     * Test of getLabel method, of class Box.
     */
    @Test
    public void testGetLabel() {
        System.out.println("getLabel");
        Box instance = null;
        String expResult = "";
        String result = instance.getLabel();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Box.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Manifest instance = new Manifest();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getWeight method, of class Box.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
         Coordinates testCoordinates1 = new Coordinates(0,0);
        Address testAddress1 = new Address("1 First St", "Aplace", "Citadel City", "A111", testCoordinates1);
        Customer   testCustomer = new Customer("Test Customer", testAddress1);
        Depot testDepot0 = new Depot("Test Depot", testAddress1);
        
        Box b = new Box(testCustomer,testDepot0);
        
        assertEquals(0.0, b.getWeight(),0);
    }

    /**
     * Test of canFit method, of class Box.
     */
    @Test
    public void testCanFit_Product() {
        System.out.println("canFit");
        Product p = new Product("Hammers", 41, true, true);
        Coordinates testCoordinates3 = new Coordinates(1000, 2000);
        Address testAddress3 = new Address("321 Back St", "Christly", "Holly Oaks", "C333", testCoordinates3);
        Customer   testCustomer = new Customer("Test Customer", testAddress3);
        Depot testDepot0 = new Depot("Test Depot", testAddress3);
        
        Box b = new Box(testCustomer,testDepot0);
        
        assertEquals(false, b.canFit(p));
    }

    /**
     * Test of canFit method, of class Box.
     */
    @Test
    public void testCanFit_Product_int() {
        System.out.println("canFit");
        Product p = new Product("Glue", 5, true, true);
        Coordinates testCoordinates2 = new Coordinates(30,40);
        Address testAddress1 = new Address("123 Count St", "Brooklyn", "Welling Town", "B222", testCoordinates2);
        Customer   testCustomer = new Customer("Test Customer", testAddress1);
        Depot testDepot0 = new Depot("Test Depot", testAddress1);
        
        Box b = new Box(testCustomer,testDepot0);
        
        assertEquals(true, b.canFit(p));
    }

    /**
     * Test of remainingCapacity method, of class Box.
     */
    @Test
    public void testRemainingCapacity() {
        System.out.println("remainingCapacity");
        Box instance = null;
        double expResult = 0.0;
        double result = instance.remainingCapacity();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of isFragile method, of class Box.
     */
    @Test
    public void testIsFragile() {
        System.out.println("isFragile");
        Coordinates testCoordinates1 = new Coordinates(0,0);
        Address testAddress1 = new Address("1 First St", "Aplace", "Citadel City", "A111", testCoordinates1);
        Customer   testCustomer = new Customer("Test Customer", testAddress1);
        Depot testDepot0 = new Depot("Test Depot", testAddress1);
        
        Box b = new Box(testCustomer,testDepot0);
        
        assertEquals(false, b.isFragile());
    }

    /**
     * Test of isHazardous method, of class Box.
     */
    @Test
    public void testIsHazardous() {
        System.out.println("isHazardous");
        Coordinates testCoordinates1 = new Coordinates(3,4);
        Address testAddress1 = new Address("1 First St", "Aplace", "Citadel City", "A111", testCoordinates1);
        Customer   testCustomer = new Customer("Test Customer", testAddress1);
        Depot testDepot0 = new Depot("Test Depot", testAddress1);
        
        Box b = new Box(testCustomer,testDepot0);
        
 
        assertEquals(false, b.isHazardous());
    }

}
