package com.driver;

public class F1 extends Car {


    public F1(String name, boolean isManual) {

        //Use arbitrary values for parameters which are not mentioned
        super(name, 4, 4, 1, isManual, "4-Wheeler", 5);
    }



    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed() + rate; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            super.changeGear(1);
        }
        else if(newSpeed > 0 && newSpeed <51) {
            super.changeGear(1);
        }
        else if(newSpeed > 50 && newSpeed < 101) {
            super.changeGear(1);
        }
        else if(newSpeed > 100 && newSpeed < 151) {
            super.changeGear(1);
        }
        else if(newSpeed > 150 && newSpeed < 201) {
            super.changeGear(4);
        }
        else if(newSpeed > 200 && newSpeed < 251) {
            super.changeGear(5);
        }
        else if(newSpeed < 250) {
            super.changeGear(6);
        }
        //for all other cases, change the gear accordingly
        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }

    }
}