//18)Write a Java program to take the user for a distance (in meters)
// and the time taken (as three numbers: hours, minutes, seconds),
// and display the speed, in meters per second,
// kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).
// Computer programming courses
//Input distance in meters: 2500
//Input hour: 5
//Input minutes: 56
//Input seconds: 23
//Expected Output :
//Your speed in meters/second is 0.11691531
//Your speed in km/h is 0.42089513
//Your speed in miles/h is 0.26158804
public class Question18 {
    public static void main(String[] args) {
        speedInMeterPerSeconds(2500, 5);
        speedInKiloMeterPerHour(2500, 5);
        speedInMilesPerHour(2500, 5);

    }
    public static void speedInMeterPerSeconds(double distanceInMeters, double Hours) {
        double timeInSeconds = 60 * 60 * Hours;
        double speed =  (distanceInMeters / timeInSeconds);
      System.out.println(speed);
    }

    public static void speedInKiloMeterPerHour(double distanceInMeters, double Hours) {
        double kiloMeter = distanceInMeters/1000;

        double speed = kiloMeter / Hours;
        System.out.println(speed);
    }

    public static void speedInMilesPerHour(double distanceInKiloMeters, double Hours) {
        double Mile = distanceInKiloMeters/1609;
        double speed = Mile / Hours;
        System.out.println(speed);
    }


}
