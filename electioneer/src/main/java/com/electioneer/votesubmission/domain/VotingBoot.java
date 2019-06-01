package com.electioneer.votesubmission.domain;

public class VotingBoot {
    private String id;
    private String xCoordinate;
    private String yCoordinate;

    public VotingBoot(String id, String xCoordinate, String yCoordinate) {
        this.id = id;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public String getId() {
        return id;
    }

    public String getxCoordinate() {
        return xCoordinate;
    }

    public String getyCoordinate() {
        return yCoordinate;
    }
}
