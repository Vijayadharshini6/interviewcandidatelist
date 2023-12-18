package queueinter;

import java.util.ArrayList;

public class Candidate {
	private String name;
    private int totalScore;
    public Candidate(String name) {
        this.name = name;      
    }
	public String getName() {
        return name;
    }

//    public int getTotalScore() {
//        return totalScore;
//    } this.totalScore = 0;
//    public void addScore(int score) {
//        this.totalScore += score;
//    }
}