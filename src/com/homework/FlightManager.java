package com.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightManager{

    private static FlightManager ourInstance;
    private List<Flight> flights;

    public static FlightManager getInstance(){//} throws BadParameterException {
        if (ourInstance == null)
            ourInstance = new FlightManager();

        return ourInstance;
    }

    private FlightManager(){
        flights = new ArrayList<>();
    }

    public void createFlight(String type, String air1, String origin1, String destination1) throws BadParameterException, NullParameterException {
        flights.add(FlightFactory.createFlight(type, air1, origin1, destination1));
    }

    public String getFlightNumber(int i){
        if (!flights.isEmpty()){
            return flights.get(i).getFlightNumber();
        }
        return "None";
    }

    public Flight getFlightByNumber(String flightNumber) throws BadParameterException {
        if (!flights.isEmpty()) {
            for (int i = 0; i < flights.toArray().length; i++) {
                if (flightNumber == flights.get(i).getFlightNumber()) return flights.get(i);
            }
        }
        else throw new BadParameterException("Flight does not exist");

        return null;
    }


    public void printHello(){
        System.out.println("FlightManager Here\n");
        System.out.println(flights);
    }
}
