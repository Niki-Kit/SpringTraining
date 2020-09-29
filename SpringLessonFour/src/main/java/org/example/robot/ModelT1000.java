package org.example.robot;

import interfaces.Hand;
import interfaces.HeadRobotMy;
import interfaces.Leg;
import interfaces.MrRobot;

public class ModelT1000 implements MrRobot {

    private Hand hand;
    private HeadRobotMy head;
    private Leg leg;

    private String color;
    private int year;
    private boolean soundEnabled;

    public ModelT1000() {
    }

    public ModelT1000(Hand hand, HeadRobotMy head, Leg leg) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public ModelT1000(String color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public ModelT1000(Hand hand, HeadRobotMy head, Leg leg, String color, int year, boolean soundEnabled) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    @Override
    public void dance() {
        System.out.println("Dance");
    }

    @Override
    public void fire() {
        hand.catchSomething();
        head.thinkSomething();
        System.out.println("Piu piu piu");
        System.out.println("Color" + ": " + color + ". " + "Year: " + year);
        System.out.println("Can play music" + ": " + soundEnabled);
        leg.go();
    }

    public void initObject() {
        System.out.println("init");
    }

    public void destroyObject() {
        System.out.println("destroy");
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public HeadRobotMy getHead() {
        return head;
    }

    public void setHead(HeadRobotMy head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }
}
