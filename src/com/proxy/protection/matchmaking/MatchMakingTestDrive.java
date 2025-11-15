package com.proxy.protection.matchmaking;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    private void drive() {

        // ===== Create two Persons =====
        Person kavya = new PersonImpl();
        kavya.setName("Kavya");
        kavya.setGender("Female");
        kavya.setInterest("Java & Travel");

        Person abhiram = new PersonImpl();
        abhiram.setName("Abhiram");
        abhiram.setGender("Male");
        abhiram.setInterest("AI & Gym");

        // ===== Owner Proxies =====
        Person kavyaOwnerProxy = getOwnerProxy(kavya);
        Person abhiramOwnerProxy = getOwnerProxy(abhiram);

        // ===== Non-Owner Proxies =====
        Person kavyaNonOwnerProxy = getNonOwnerProxy(kavya);
        Person abhiramNonOwnerProxy = getNonOwnerProxy(abhiram);

        //
        // ===== TESTING =====
        //

        System.out.println("\n===== OWNER PROXY TEST FOR KAVYA =====");
        System.out.println("Name: " + kavyaOwnerProxy.getName());

        kavyaOwnerProxy.setInterest("Cooking & Dance");
        System.out.println("Updated interest by owner: " + kavyaOwnerProxy.getInterest());

        try {
            kavyaOwnerProxy.setGeekRating(10);   // should FAIL
        } catch (Exception e) {
            System.out.println("Owner (Kavya) CANNOT set rating → Access Denied");
        }


        System.out.println("\n===== NON-OWNER PROXY TEST: ABHIRAM RATING KAVYA =====");
        System.out.println("Kavya's current rating: " + kavyaNonOwnerProxy.getGeekRating());

        kavyaNonOwnerProxy.setGeekRating(8);   // allowed
        System.out.println("Abhiram rated Kavya → New rating: " + kavyaNonOwnerProxy.getGeekRating());

        try {
            kavyaNonOwnerProxy.setInterest("Photography");   // should FAIL
        } catch (Exception e) {
            System.out.println("Non-owner cannot change Kavya's interest → Access Denied");
        }


        System.out.println("\n===== OWNER PROXY TEST FOR ABHIRAM =====");
        abhiramOwnerProxy.setInterest("Coding & Fitness");
        System.out.println("Updated interest (owner): " + abhiramOwnerProxy.getInterest());

        try {
            abhiramOwnerProxy.setGeekRating(9);   // should FAIL
        } catch (Exception e) {
            System.out.println("Owner (Abhiram) CANNOT set his own rating → Access Denied");
        }

        System.out.println("\n===== NON-OWNER PROXY TEST: KAVYA RATING ABHIRAM =====");
        abhiramNonOwnerProxy.setGeekRating(7);    // allowed
        System.out.println("Kavya rated Abhiram → New rating: " + abhiramNonOwnerProxy.getGeekRating());
    }


    // ===== HELPER METHODS FOR PROXIES =====

    Person getOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }

    Person getNonOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }
}
