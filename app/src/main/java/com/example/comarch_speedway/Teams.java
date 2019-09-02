package com.example.comarch_speedway;

public class Teams {
    private String teamName;
    private String riderName;

    public Teams() {
    }

    public Teams(String teamName, String riderName) {
        this.teamName = teamName;
        this.riderName = riderName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getRiderName() {
        return riderName;
    }

    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }
}
