package com.jhosefcardichpalma.java;

import java.util.HashMap;

/**
 *
 */
public interface StockSystem {

    /**
     * This method returns all the products available in the clothes store
     * @return  a HasMap that contains all the elements available in the clothes inventory system
     * @see Product
     * */
    public HashMap<Integer,Product> listProducts();

    /**
     * This method receives a product to be stored in the System.
     * Generates a unique identifier and adds it to the product  before tobe stored.
     * After storing the product the method returns
     * @param product the element to be stored
     * @return Response is an object with the information of the operation
     * @see Response
     * */
    public Response addProduct(Product product);

    /**
     * This method receives a product to be removed from the store stock.
     * Generates a unique identifier and adds it to the product  before tobe stored.
     * @param product is the element to be removed from the stock
     * @return Response is an object with the information of the operation
     * @see Response
     */
    public Response removeProduct(Product product);

    /**
     * This method receives a ID Product to find  the product in the stock. If the product exists
     * the method returns a true, but the product doesn't exist instead returns false .
     * @param product is the item to be purchased
     * @return boolean
     * @see Response
     * */
    public boolean buyClothes(Product product);



}
