package com.example.prac03;


import java.io.Serializable;

public class Country implements Serializable {
    private String name;
    private String capital;
    private int population;
    private double area;
    private int density;
    private double worldShare;
    private int flagResource;

    public Country() {
    }

    public Country(String name, String capital, int population, int area, int density , double worldShare, int flagResource) {
        this.area = area;
        this.capital = capital;
        this.density = density;
        this.flagResource = flagResource;
        this.name = name;
        this.population = population;
        this.worldShare = worldShare;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getDensity() {
        return density;
    }

    public void setDensity(int density) {
        this.density = density;
    }

    public int getFlagResource() {
        return flagResource;
    }

    public void setFlagResource(int flagResource) {
        this.flagResource = flagResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getWorldShare() {
        return worldShare;
    }

    public void setWorldShare(double worldShare) {
        this.worldShare = worldShare;
    }
}
