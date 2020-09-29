package be.abis.ExF4.test;

import be.abis.ExF4.model.Address;

public class ExF4 {
    public static void main(String[] args) {
        Address adr1 = new Address("heikantstraat",21,"Essen") ;
        System.out.println("Nieuw adres: "+adr1.getTown());
    }
}
