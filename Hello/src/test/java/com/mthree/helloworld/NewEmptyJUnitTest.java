/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mthree.helloworld;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author karlm
 */
public class NewEmptyJUnitTest {
    
//    public NewEmptyJUnitTest() {
//    }
//
//    @org.junit.jupiter.api.BeforeAll
//    public static void setUpClass() throws Exception {
//    }
//
//    @org.junit.jupiter.api.AfterAll
//    public static void tearDownClass() throws Exception {
//    }

//    @org.junit.jupiter.api.BeforeEach
//    public void setUp() throws Exception {
//    }
//
//    @org.junit.jupiter.api.AfterEach
//    public void tearDown() throws Exception {
//    }
//    
    @BeforeAll
    public static void setUpClass() {
        underTest = new Hello();
    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
    
    int result = 12;
    static Hello underTest;
    
    @BeforeEach
    public void setUp() {
        result = 42;
    }
    
    @AfterEach
    public void tearDown() {
        result = 12;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
        int number = underTest.getNumber();
        assertEquals(result, number);
    }
}
