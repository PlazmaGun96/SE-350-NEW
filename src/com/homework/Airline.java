package com.homework;

import java.util.Objects;

public class Airline{
    private String Airline;

    public Airline(String name) throws BadParameterException {
        setAirline(name);
    }

    protected void setAirline(String name) throws BadParameterException{
        if (name.length() <= 0 || name.length() >= 8) {
            throw new BadParameterException("Value passed to setAirline is not between lengths of 0 and 8: " + getAirline());
        }
        Airline = name;
    }

    public String getAirline() {return Airline;}

    public String toString() {
        return String.format("%-20s %s%n", "Airline:", getAirline());
    }

    public boolean equals(Airline o) {
        if (o == null) return false;
        if (this == o) return true;
        char[] A1 = String.valueOf(o).toCharArray();
        char[] A2 = String.valueOf(this).toCharArray();
        for(int i=0; i < String.valueOf(o).length(); i++) {
            //if any character is not in upper case, return false
            if (A1[i] != A2[i]) return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(Airline);
    }
}

