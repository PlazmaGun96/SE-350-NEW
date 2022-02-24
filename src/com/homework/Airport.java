package com.homework;

import java.util.Objects;

public class Airport{
    private String Airport;

    public Airport(String name) throws BadParameterException {
        setAirport(name);

    }

    protected void setAirport(String name) throws BadParameterException {
        if (name.length() != 3) {
            throw new BadParameterException("Value passed to setAirport is not length of 3: " + getAirport());
        }
        char[] charArray = name.toCharArray();
        for(int i=0; i < name.length(); i++){

            //if any character is not in upper case, return false
            if( !Character.isUpperCase( charArray[i] ))
                throw new BadParameterException("Value passed to setAirport is not all Capital letters: " + getAirport());
        }
        Airport = name;
    }

    public String getAirport(){return Airport;
    }

    public String toString() {
        return String.format("%-20s %s%n", "Airport:", getAirport());
    }


    public boolean equals(Airport o) {
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
        return Objects.hash(Airport);
    }
}

