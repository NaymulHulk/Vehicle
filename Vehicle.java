public class Vehicle {
    private double speed; // fields , properties
    public int fuel = 100;
    //fuel = 100; // in Litres
    private double distance; // in Km
    public int temperature = 30;
    //temperature = 30; // in degree celcius

    private int condition = 10;
    //condition = 10;

    private boolean battery = true;
    //battery = true;

    public int mobil = 5;
    //mobil = 5;



    public void start() {
        speed = 0;
        if (mobil < 1) {
            stop();
        }
        if ((distance > 3000) ||(condition < 5) ||(temperature > 45) || (mobil < 3) ){
        System.out.println("Car not working");
        battery = false;

        } else if ((distance > 1000) && (distance < 3000)) {
        System.out.println("Poor condition! Go to workshop");
        System.out.println("Starting the car");
        condition -= 1;
        } else {
            System.out.println("Starting the car");
        }
    }

    public void status(){

        System.out.println("~~~Status~~~");
        System.out.println("Fuel: "+ fuel  + ". You can travel" + canTravel() + "Km");
        System.out.println("Temperature: "+ temperature);
        System.out.println("Mobil Level (from 5): " + mobil);
        if (battery == true) {
            System.out.println("Battery Working Fine");
        }else{
            System.out.println("Batter Not Working");
        }
        System.out.println("Mileage: " + distance);

        System.out.println("Overall Condition of the car (from 10)" + condition);

    }

    public void faults(){
        if (fuel < 10){
            System.out.println("Get some fuel");
        }
        if (mobil < 2){
            System.out.println("Needs mobil");
        }
        if ((temperature < - 30)||(temperature > 45)){
            System.out.println("Temperature is outside the range of -30 to 45");
        }
        if (condition <5){
            System.out.println("Take the care to workshop for maintenance");
        }
        if (battery == false){
            System.out.println("Please booster start or change your battery");
        }
    }

    public void servicing(){
        mobil = 5;
        battery = true;
        condition = 10;
        temperature = 30;
    }

    public int mobil(int distance) {
        for (int i = 500; i < distance; i = i + 500) {
            mobil = mobil - 1;
        }
        if (mobil < 2 && mobil > 1) {
            System.out.println("Low mobil! Please refill.");
            return mobil;
        }
        if (mobil < 1) {
            stop();
        }
        return mobil;
    }

    public void accelarate(double speed) {
        this.speed += speed;
        System.out.println("Current Speed: " + this.speed + " m/s");
    }

    public void decelerate(double speed){

        this.speed -= speed;
        System.out.println("Current Speed: " + this.speed + " m/s");
    }

    public double currentSpeed() {
        return this.speed;
    }

    public void brake() {
        speed = 0;
        System.out.println("Current Speed: " + this.speed + " m/s");
    }


    public void stop() {
        speed = 0;
        temperature = 35;
        System.out.println("Current Speed: " + this.speed + " m/s");
    }

    public double totalDistanceTravelled(){
        return this.distance;
    }





}
