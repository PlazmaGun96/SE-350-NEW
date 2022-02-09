package com.homework;

public class FlightFactory {

    public static Flight createFlight(String type, String air1, String origin1, String destination1) throws BadParameterException, NullParameterException {
        if (type.equals("CommercialFlight"))
            return new CommercialFlight(air1, origin1, destination1);
        else
            return new CommercialFlight(air1, origin1, destination1);

    }
}
