package com.kodilla.good.patterns.games;

public class Mission {
    private String name;
    private String missionType;

    public Mission(String name, String missionType) {
        this.name = name;
        this.missionType = missionType;
    }

    public String getName() {
        return name;
    }

    public String getMissionType() {
        return missionType;
    }
}
