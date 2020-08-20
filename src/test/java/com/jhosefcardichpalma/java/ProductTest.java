package com.jhosefcardichpalma.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    void testSettersAndGetters() {
        Product product = new Product();
        product.setId(11);
        product.setName("TOP");
        product.setDescription("Super comfy top");

        Assertions.assertEquals(11, product.getId());
        Assertions.assertEquals("TOP", product.getName());
        Assertions.assertEquals("Super comfy top", product.getDescription());
    }

    @Test
    void allArgsConstructor() {
        Product product = new Product(1, "TOP", "Super comfy top");
        Assertions.assertNotNull(product);
        Assertions.assertEquals(1, product.getId());
        Assertions.assertEquals("TOP", product.getName());
        Assertions.assertEquals("Super comfy top", product.getDescription());
    }

    @Test
    void noArgsConstructor() {
        Product product = new Product();
        Assertions.assertNotNull(product);
    }

    @Test
    void uninitializedValues() {
        Product product = new Product();
        Assertions.assertEquals(0, product.getId());
        Assertions.assertNull(product.getName());
        Assertions.assertNull(product.getDescription());
    }

}
