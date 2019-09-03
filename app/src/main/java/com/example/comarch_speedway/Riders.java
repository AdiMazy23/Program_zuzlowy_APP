package com.example.comarch_speedway;

import java.util.List;

public class Riders {

    private List<String> riderNames;

    public Riders() {
    }

    public Riders(List<String> riderNames) {
        this.riderNames = riderNames;
    }

    public List<String> getRiderNames() {
        return riderNames;
    }

    public void setRiderNames(List<String> riderNames) {
        this.riderNames = riderNames;
    }
}
