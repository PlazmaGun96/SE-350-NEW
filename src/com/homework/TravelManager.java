package com.homework;

public class TravelManager {
    public static void main(String[] args) throws BadParameterException, NullParameterException {

        FlightManager flightManager = new ProxyFlightManager();
        flightManager.createFlight("CommercialFlight", "Mongol", "ORD", "MNG");
        flightManager.createFlight("PassengerFlight", "America", "MNG", "ORD");

        String s0 = flightManager.getFlightNumber(0);
        System.out.println("s0 = " + s0);
        System.out.println(((ProxyFlightManager) flightManager).getFlightByFlightNumber(s0));
        String s1 = flightManager.getFlightNumber(1);
        System.out.println("s1 = " + s1);
        System.out.println(((ProxyFlightManager) flightManager).getFlightByFlightNumber(s1));

    }
}
