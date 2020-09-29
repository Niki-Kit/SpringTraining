package start;

import interfaces.Hand;
import interfaces.HeadRobotMy;
import interfaces.Leg;

public class Robot {

    private Hand hand;
    private HeadRobotMy head;
    private Leg leg;

    public Robot(Hand hand, HeadRobotMy head, Leg leg) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public void action() {
        head.thinkSomething();
        hand.catchSomething();
        leg.go();
    }
}
