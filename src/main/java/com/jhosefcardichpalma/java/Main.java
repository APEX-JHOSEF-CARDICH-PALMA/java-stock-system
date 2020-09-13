package com.jhosefcardichpalma.java;

public class Main {

    public static void main(String args[]){
        System.out.println("Hi this is my first program to execute some functionalities of other classes");

        System.out.println("-----------------------------------------------------------------------------");
        Customer customer1 = new Customer("David",20,"90232435");
        Customer customer2 = new Customer("Maria",20,"90232435");

        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
        System.out.println("-----------------------------------------------------------------------------");

        ContactBook contactBook = new ContactBook();
        contactBook.addContact(customer1);
        contactBook.addContact(customer2);
        contactBook.addContact(new Customer("Juan",19,"wewewe"));
        contactBook.addContact(new Customer("Rordrigo",19,"wewewe"));
        contactBook.addContact(new Customer("Pablo",19,"wewewe"));
        contactBook.addContact(new Customer("Ana Maria",19,"wewewe"));

        System.out.println(contactBook.toString());


        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Ordered by Name:");
        contactBook.orderByName();
        System.out.println(contactBook.toString());

    }
}
