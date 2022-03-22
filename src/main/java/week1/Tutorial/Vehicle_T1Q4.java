package week1.Tutorial;

/*
Write a class definition for an abstract class, Vehicle, that contains:
- a double instance variable maxSpeed
- a protected double instance variable, currentSpeed
- a constructor accepting a double to initialize maxSpeed instance variable
- an abstract method, accelerate, that accepts no parameters and returns nothing
- a method getCurrentSpeed that returns the value of currentSpeed
- a method getMaxSpeed that returns the value of maxSpeed
- a method pedalToTheMetal, that repeatedly calls accelerate until the speed of the vehicle
  is equal to maxSpeed. pedalToTheMetal returns nothing.

can you create an instance of Vehicle?
 */

public abstract class Vehicle_T1Q4 {
    private double maxSpeed;
    protected double currentSpeed;

    public Vehicle_T1Q4(double maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public abstract void accelerate();

    public double getMaxSpeed(){
        return maxSpeed;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public void pedalToTheMetal(){
        if (currentSpeed != maxSpeed){
            accelerate();
        }
        else{
            System.out.println("Max speed reached!");
        }
    }

    public static void main(String[] args) {
//        Vehicle_T1Q4 vehicle_obj ; //= new Vehicle_T1Q4() {
//            @Override
//            public void accelerate() {
//                vehicle_obj.currentSpeed++;
//            }
//        }
//        vehicle_obj = new
        // cannot create an instance of Vehicle
    }
}
