package com.homework;


import java.util.Date;
import java.util.Objects;
import java.util.Random;

public class CommercialFlight implements Flight{
    private Airline airline;
    private Airport origin;
    private Airport destination;
    private String flightNumber;
    private Date departureTime;

    public CommercialFlight(String air1, String origin1, String destination1) throws NullParameterException, BadParameterException {
        setAirline(air1);
        setOrigin(origin1);
        setDestination(destination1);
        setFlightNumber();
        setDepartureTime();
    }

    private void setAirline(String name) throws NullParameterException, BadParameterException {
        if (name == null) {
            throw new NullParameterException("Null value passed in for setName");
        }
        airline = new Airline(name);
    }

    private void setOrigin(String name) throws NullParameterException, BadParameterException {
        if (name == null) {
            throw new NullParameterException("Null value passed in for setName");
        }
        origin = new Airport(name);
    }
    private void setDestination(String name) throws NullParameterException, BadParameterException {
        if (name == null) {
            throw new NullParameterException("Null value passed in for setName");
        }
        destination = new Airport(name);
    }

    private void setFlightNumber(){
        Random ran = new Random();
        int x = ran.nextInt(100000) + 500000;
        flightNumber = String.valueOf(x);
    }

    private void setDepartureTime(){
        departureTime = new Date();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append(String.format("%s%n", getAirline()));
        sb.append(String.format("%s%n", getOrigin()));
        sb.append(String.format("%s%n", getDestination()));
        sb.append(String.format("%-20s %s%n", "flightNumber:", getFlightNumber()));
        sb.append(String.format("%-20s %s%n", "departureTime:", getDepartureTime()));
        return sb.toString();
    }

    public Airline getAirline() {return airline;}

    public Airport getOrigin() {return origin;}

    public Airport getDestination() {return destination;}

    public String getFlightNumber() {return flightNumber;}

    public Date getDepartureTime() {return departureTime;}

    public boolean equals(CommercialFlight o) {
        if (o == null) return false;
        if ((this.getFlightNumber() == o.getFlightNumber()) && this.getDepartureTime() == o.getDepartureTime())
        return true;
        return false;
    }
    public int hashCode() {
        return Objects.hash(flightNumber, departureTime);
    }
}

