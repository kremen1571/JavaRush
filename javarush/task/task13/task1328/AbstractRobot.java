package com.javarush.task.task13.task1328;

public  abstract class  AbstractRobot implements Defensable, Attackable {

    private static int hitCount = 0;
    private static int hitCountdef = 0;
//    private String name;

    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;
//        System.out.println(hitCount);

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        }
        else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        }
        else if (hitCount == 3) {
//            hitCount = 0;
            attackedBodyPart = BodyPart.LEG;
        }
         else if (hitCount == 4) {
            hitCount = 0;
            attackedBodyPart = BodyPart.CHEST;
        }
        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defendedBodyPart = null;
        hitCountdef = hitCountdef + 2;

        if (hitCountdef == 1) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCountdef == 2) {
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCountdef == 3) {
//            hitCount = 0;
            defendedBodyPart = BodyPart.ARM;
        }
        else if (hitCountdef == 4) {
            hitCountdef = 0;
            defendedBodyPart = BodyPart.CHEST;
        }
        return defendedBodyPart;
    }
}
