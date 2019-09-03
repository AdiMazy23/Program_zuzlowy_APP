package com.example.comarch_speedway;

import java.util.List;

public class Teams {
    private List<String> teamName;

    public Teams() {
    }

    public Teams(List<String> teamName) {
        this.teamName = teamName;
    }

    public List<String> getTeamName() {
        return teamName;
    }

    public void setTeamName(List<String> teamName) {
        this.teamName = teamName;
    }


}
