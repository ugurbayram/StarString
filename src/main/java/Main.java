/**
 * created by @ubayram
 * 17 June 2019
 */

public class Main {

    /**
     * Method to build stars with for loop
     */
    public static StringBuilder starStingLoop(int power) {
        StringBuilder stars = new StringBuilder("*");
        for (; power > 0; power--) {
            stars.append(stars);
        }

        return stars;
    }

    /**
     * Method to build stars with recursion
     */
    public static StringBuilder starStringRecursive(int power) {
        if (power <= 0) {
            return new StringBuilder("*");
        }
        StringBuilder stars = starStringRecursive(power - 1);
        return stars.append(stars);
    }

    public static void main(String[] args) {
        System.out.println(starStingLoop(10));
        System.out.println(starStringRecursive(10));
    }
}
