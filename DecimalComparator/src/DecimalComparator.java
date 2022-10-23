public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {

        int checkFirst = (int) (first * 1000);
        int checkSecond = (int) (second * 1000);

        if (checkFirst - checkSecond == 0) {
            return true;
        }

        return false;
    }
}
