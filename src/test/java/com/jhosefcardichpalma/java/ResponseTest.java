package com.jhosefcardichpalma.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ResponseTest {

    @Test
    void noArgsConstructor() {
        Response response = new Response();
        Assertions.assertNotNull(response);
        Assertions.assertFalse(response.isStatus());
        Assertions.assertEquals(0, response.getIdentifier());
    }

    @Test
    void testSettersAndGetters() {
        Response response = new Response();
        response.setIdentifier(11);
        response.setStatus(true);

        Assertions.assertEquals(11, response.getIdentifier() );
        Assertions.assertTrue(response.isStatus());
    }
}
