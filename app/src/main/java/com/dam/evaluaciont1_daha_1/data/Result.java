package com.dam.evaluaciont1_daha_1.data;

public class Result {
    private final String phase;
    private final String date;
    private final String team1;
    private final String team2;
    private final int goals1;
    private final int goals2;

    public Result(String phase, String date, String team1, int goals1, String team2, int goals2) {
        this.phase = phase;
        this.date = date;
        this.team1 = team1;
        this.goals1 = goals1;
        this.team2 = team2;
        this.goals2 = goals2;
    }

    public String getPhase() {
        return phase;
    }

    public String getDate() {
        return date;
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public int getGoals1() {
        return goals1;
    }

    public int getGoals2() {
        return goals2;
    }

    @Override
    public String toString() {
        return "Result{" +
                "phase='" + phase + '\'' +
                ", date='" + date + '\'' +
                ", team1='" + team1 + '\'' +
                ", team2='" + team2 + '\'' +
                ", goals1=" + goals1 +
                ", goals2=" + goals2 +
                '}';
    }
}
