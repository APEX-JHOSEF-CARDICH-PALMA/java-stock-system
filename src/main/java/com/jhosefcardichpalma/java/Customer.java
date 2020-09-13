package com.jhosefcardichpalma.java;

public class Customer implements  Person {
    private String name;
    private int age;
    private String id;
    private static int customerIdGenerator=0;
    private int customerId;

    public Customer(String name,int age, String id){
        this.name=name;
        this.id=id;
       this. customerId = Customer.customerIdGenerator++;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getId() {
        return id;
    }

    public static int getCustomerIdGenerator() {
        return customerIdGenerator;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (age != customer.age) return false;
        if (customerId != customer.customerId) return false;
        if (name != null ? !name.equals(customer.name) : customer.name != null) return false;
        return id != null ? id.equals(customer.id) : customer.id == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + customerId;
        return result;
    }



    @Override
    public String toString() {
        return "\nCustomer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", customerId=" + customerId +
                '}';
    }





}
