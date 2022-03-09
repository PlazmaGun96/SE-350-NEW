package com.homework;

import java.util.Date;
import java.util.Objects;
import java.util.Random;

public class PassengerFlight implements Flight{
    private Airline airline;
    private Airport origin;
    private Airport destination;
    private String flightNumber;
    private Date departureTime;
    private int passengerCapacity;

    public PassengerFlight(String air1, String origin1, String destination1) throws NullParameterException{
        setAirline(air1);
        setOrigin(origin1);
        setDestination(destination1);
        setFlightNumber();
        setDepartureTime();
        setPassengerCapacity();
    }

    private void setAirline(String name) throws NullParameterException{
        if (name == null) {
            throw new NullParameterException("Null value passed in for setName");
        }
        airline = AirlineFactory.getAirline(name);
    }

    private void setOrigin(String name) throws NullParameterException{
        if (name == null) {
            throw new NullParameterException("Null value passed in for setName");
        }
        origin = AirportFactory.getAirport(name);
    }
    private void setDestination(String name) throws NullParameterException{
        if (name == null) {
            throw new NullParameterException("Null value passed in for setName");
        }
        destination = AirportFactory.getAirport(name);
    }

    private void setFlightNumber(){
        Random ran = new Random();
        int x = ran.nextInt(100000) + 500000;
        flightNumber = String.valueOf(x);
    }

    private void setDepartureTime(){
        departureTime = new Date();
    }

    private void setPassengerCapacity(){ passengerCapacity = 100; }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append(String.format("%s%n", getAirline()));
        sb.append(String.format("%s%n", getOrigin()));
        sb.append(String.format("%s%n", getDestination()));
        sb.append(String.format("%-20s %s%n", "flightNumber:", getFlightNumber()));
        sb.append(String.format("%-20s %s%n", "departureTime:", getDepartureTime()));
        sb.append(String.format("%-20s %s%n", "passengerCapacity:", getPassengerCapacity()));
        return sb.toString();
    }

    public Airline getAirline() {return airline;}

    public Airport getOrigin() {return origin;}

    public Airport getDestination() {return destination;}

    public String getFlightNumber() {return flightNumber;}

    public Date getDepartureTime() {return departureTime;}

    public int getPassengerCapacity() {return passengerCapacity;}

    public boolean equals(PassengerFlight o) {
        if (o == null) return false;
        if ((this.getFlightNumber().equals(o.getFlightNumber())) && this.getDepartureTime() == o.getDepartureTime())
            return true;
        return false;
    }
    public int hashCode() {
        return Objects.hash(flightNumber, departureTime);
    }
}
