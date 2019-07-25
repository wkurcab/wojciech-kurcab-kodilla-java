package com.kodilla.good.patterns.games;

public class GamerMissionService {
    private static final String BATTLE_MISSION = "Battle";
    private Mission mission;

    public GamerMissionService(Mission mission) {
        this.mission = mission;
    }

    public SpecificMission prepareMission() {
        if (mission.getMissionType().equals(BATTLE_MISSION)) {
            return new BattleMission();
        }
        return new AdventureMission();
    }
}
