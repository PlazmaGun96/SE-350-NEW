package com.homework;

public class TravelManager {
    public static void main(String[] args) throws BadParameterException, NullParameterException {

        FlightManager.getInstance().createFlight("CommercialFLight", "Mongol", "ORD", "MNG");
        FlightManager.getInstance().createFlight("CommercialFLight", "America", "MNG", "ORD");

        String s0 = FlightManager.getInstance().getFlightNumber(0);
        System.out.println("s0 = " + s0);
        System.out.println(FlightManager.getInstance().getFlightByNumber(s0));
        String s1 = FlightManager.getInstance().getFlightNumber(1);
        System.out.println("s1 = " + s1);
        System.out.println(FlightManager.getInstance().getFlightByNumber(s1));

    }
}
