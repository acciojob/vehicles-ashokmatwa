package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        // can be called same super
        super(name, 0, 0, 0, isManual, null, 0);
        // can be make new super of two parameters only

    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate

//        add rate to the current speed and change the gear accordingly

        newSpeed = getCurrentSpeed() + rate;

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
            stop();
            setCurrentGear(1);
//            changeGear(1);
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {

            setCurrentSpeed(newSpeed);

            if(newSpeed<=50){
                setCurrentGear(1);
                //changeGear(1);
            }
            if(newSpeed>=51 && newSpeed<=100){
                setCurrentGear(2);
//                changeGear(2);
            }
            if(newSpeed>=101 && newSpeed<=150){
                setCurrentGear(3);
//                changeGear(3);
            }
            if(newSpeed>=151 && newSpeed<=200){
                setCurrentGear(4);
//                changeGear(4);
            }
            if(newSpeed>=201 && newSpeed<=250){
                setCurrentGear(5);
//                changeGear(5);
            }
            if(newSpeed>250){
                setCurrentGear(6);
//                changeGear(6);
            }

            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
// method isManual()
// method getCurrentGear()