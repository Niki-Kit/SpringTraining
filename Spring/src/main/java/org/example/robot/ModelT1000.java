package org.example.robot;

import interfaces.Hand;
import interfaces.HeadRobotMy;
import interfaces.Leg;
import interfaces.MrRobot;

public class ModelT1000 implements MrRobot {

    private Hand hand;
    private HeadRobotMy head;
    private Leg leg;

    public ModelT1000() {
    }

    public ModelT1000(Hand hand, HeadRobotMy head, Leg leg) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
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
        leg.go();
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
}
