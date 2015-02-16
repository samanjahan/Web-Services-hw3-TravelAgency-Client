/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.web.services.hw3.client;

import services.Travel;

/**
 *
 * @author syst3m
 */
public class Client {
    public static void main(String[] args) {
        Travel travel = new Travel();
        System.out.println("Loggin " +  travel.loggedIn("saman", "12345"));
        System.out.println("FindTrip" + travel.findtrip("saman", "stockholm", "gothenburg"));
        System.out.println("Reserve "  + travel.reserve("1"));
        System.out.println("Pay " + travel.pay("saman", "12345", "200"));
    }
    
}
