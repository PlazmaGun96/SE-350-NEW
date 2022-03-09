package com.homework;

import java.util.HashMap;
import java.util.Map;

public class AirportFactory {

    private static Map<String, Airport> airportCache = new HashMap<>();

    private AirportFactory() {}

    public static Airport getAirport(String name){
        return airportCache.computeIfAbsent(name, newName -> {
            try {
                return new Airport(name);
            } catch (BadParameterException e) {
                e.printStackTrace();
            }
            return null;
        });
    }
}
