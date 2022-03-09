package com.homework;

public interface FlightManagerInterface {
    void createFlight(String type, String air1, String origin1, String destination1) throws BadParameterException, NullParameterException;

    Flight getFlightByFlightNumber(String flight) throws BadParameterException;
}
