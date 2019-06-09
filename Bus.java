public class Car  extends Vehicle {
    private int wheels = 6;
    private int windows = 32;
    private int fans = 6;
    private int busCapacity = 30;
    private int passengers;

    public void distanceTravelledCalculation(double time){
        distanceTravelled = ( currentSpeed() * time );
        this.distance += distanceTravlled;
        this.fuel -= distanceTravelled /15.0;
        this.temperature += (time /450 ) * 1;
        mobil(distanceTravelled);
    }

    private int vacancyBus(){
      return  busCapacity - passengers;
    }

    private int enterBus(int number){
       return  passengers += number;
    }


    public int canTravel(){
        return fuel * 25;
    }



    public int passengers() {
        System.out.print("Number of vacant spaces: " + vacancyBus);
        return this.passengers;
    }

    public int wheels() {
        System.out.println();
        System.out.print("Wheels on this bus: ");
        return this.wheels;
    }
}
