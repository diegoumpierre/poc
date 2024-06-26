package com.poc;

import com.poc.domain.Product;
import com.poc.domain.Tax;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * The proposal for the class it is show the basic structure for a test class.
 *
 * @author diegoUmpierre
 * @since Sep 12 2023
 */
class TaxTest {
    private TaxMain solution;
    @BeforeEach
    void init(){
        solution = new TaxMain();
    }

    @Test
    void createProductAndTax() {
        Product p1 = new Product();
        p1.setName("product 1");
        p1.setTaxList(TestData.gimmeListTax());



    }

}