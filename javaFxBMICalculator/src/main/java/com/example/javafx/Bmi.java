package com.example.javafx;

public class Bmi {
    private int age;
    private double weight;
    private double height;

    private double bmi;

    public Bmi(int age, double weight, double height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.bmi = 0;
    }

    public double getBmi() {
        bmi = 10000 * weight / (height * height);
        return bmi;
    }

    public String getStatus() {
        return bmi < 18.5 ? "Underweight"
                : bmi < 25 ? "Healthy"
                : bmi < 30 ? "Overweight"
                : "Obese";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
