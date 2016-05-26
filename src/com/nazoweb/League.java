package com.nazoweb;

import java.util.ArrayList;
import java.util.Collections;


/**
 * Created by zertekes on 11/04/2016.
 */
public class League<T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if (league.contains(team)) {
            System.out.println(team.getName() + " is already on this league");
            return false;
        } else {
            league.add(team);
            System.out.println(team.getName() + " add to league " + this.name);
            return true;
        }

    }

    public void showLeagueTable() {
        Collections.sort(league);
        System.out.println("League table: ");
        for (T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());

        }
    }

}