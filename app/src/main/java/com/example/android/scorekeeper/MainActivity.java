package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    int drawControlTeamA = 0;
    int drawControlTeamB = 0;

    int foulTeamA = 0;
    int foulTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * resets all fields to 0
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        drawControlTeamA = 0;
        drawControlTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayDCForTeamA(drawControlTeamA);
        displayDCForTeamB(drawControlTeamB);
        displayFoulsForTeamA(foulTeamA);
        displayFoulsForTeamB(foulTeamB);
    }

    /**
     * increase score by one goal
     */
    public void goalTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * increase draw control count by 1
     */
    public void drawControlTeamA(View v) {
        drawControlTeamA = drawControlTeamA + 1;
        displayDCForTeamA(drawControlTeamA);
    }

    /**
     * increase foul count by 1
     */
    public void foulTeamA(View v) {
        foulTeamA = foulTeamA + 1;
        displayFoulsForTeamA(foulTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the draw controls for Team A.
     */
    public void displayDCForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_dc);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the fouls for Team A.
     */
    public void displayFoulsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * z teamA, st teamB
     */

    /**
     * increase score by one goal
     */
    public void goalTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * increase draw control count by 1
     */
    public void drawControlTeamB(View v) {
        drawControlTeamB = drawControlTeamB + 1;
        displayDCForTeamB(drawControlTeamB);
    }

    /**
     * increase foul count by 1
     */
    public void foulTeamB(View v) {
        foulTeamB = foulTeamB + 1;
        displayFoulsForTeamB(foulTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the draw controls for Team B.
     */
    public void displayDCForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_dc);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the fouls for Team B.
     */
    public void displayFoulsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(score));
    }

}   /* z MainActivity */
