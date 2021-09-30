/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fushithemedicalaidapp;

/**
 *
 * @author Gvdme17
 */
public class FushiMedAidObject
{
    private String id, gender;
    private int age;
    private double mass, bloodPressure, height, sleep, calIntake, waterIntake, steps, goal;
    
    public FushiMedAidObject(String i, double m, double bP, double h, double slp, double cIT, double wIT, double s, double g, String gen, int a)
    {
        id = i;
        mass = m;
        bloodPressure = bP;
        height = h;
        sleep = slp;
        calIntake = cIT;
        waterIntake = wIT;
        steps = s;
        goal = g;
        gender = gen;
        age = a;
    }

    public double getMass() {
        return mass;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public double getHeight() {
        return height;
    }

    public double getSleep() {
        return sleep;
    }

    public double getCalIntake() {
        return calIntake;
    }

    public double getWaterIntake() {
        return waterIntake;
    }

    public double getSteps() {
        return steps;
    }

    public double getGoal() {
        return goal;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSleep(double sleep) {
        this.sleep = sleep;
    }

    public void setCalIntake(double calIntake) {
        this.calIntake = calIntake;
    }

    public void setWaterIntake(double waterIntake) {
        this.waterIntake = waterIntake;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }
    
    public String toString()// toString method for output display
    {
        return id + "\t" + mass + "\t" + bloodPressure + "\t" + height + "\t" + sleep + "\t" + calIntake + "\t" + waterIntake + "\t" + steps + "\t" + goal + "\t" + gender + "\t" + age;
    }  

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSteps(double steps) {
        this.steps = steps;
    }

    public void setGoal(double goal) {
        this.goal = goal;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
