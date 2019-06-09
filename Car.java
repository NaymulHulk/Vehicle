public class Car  extends Vehicle {
    private int wheels = 4;
    private int windows = 4;
    private int carCapacity = 5;

    public void distanceTravelledCalculation(double time){
        distance_travelled = ( currentSpeed() * time )/1000.0;
        this.distance += distance_travlled;
        this.fuel -= distanceTravelled /25.0;
        this.temperature += (time /600 ) * 1;
        mobil(distanceTravelled);
    }

    private int vacancyCar(){
        return  busCapacity - passengers;
    }

    private int enterCar(int number){
        return  passengers += number;
    }


    public int canTravel(){
        return fuel * 15;
    }



}