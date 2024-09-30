public class ExerciseL2T1 {
    public static void main(String[] args) {
        // Step 1: Define and initialize the miles variable
        double miles = 100;

        // Step 2: Define the KilometersPerMile constant
        final double KilometersPerMile = 1609.0 / 1000.0; // 1 mile = 1609 meters, so 1 mile = 1.609 kilometers

        // Step 3: Calculate the kilometers and store it in the kilometers variable
        double kilometers = miles * KilometersPerMile;

        // Step 4: Print the result to the console
        System.out.println("The number of kilometers in " + miles + " miles is: " + kilometers);
    }
}
