package com.homework;

public class ProxyFlightManager extends FlightManager implements FlightManagerInterface{
    private static FlightManager realObject;

    @Override
    public void createFlight(String type, String air1, String origin1, String destination1) throws BadParameterException, NullParameterException {
        System.out.println("A flight is being created.");

        if (realObject == null) {
            realObject = new FlightManager();
        }

        realObject.createFlight(type, air1, origin1, destination1);
    }
    public Flight getFlightByFlightNumber(String flightNumber) throws BadParameterException {
        System.out.println("Flight number: " + flightNumber + " is being retrieved");

        if (realObject == null) {
            realObject = new FlightManager();
        }

        return realObject.getFlightByNumber(flightNumber);
    }
}
