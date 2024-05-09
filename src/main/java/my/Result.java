//package my;
//class Result {
//
//    /*
//     * Complete the 'timeConversion' function below.
//     *
//     * The function is expected to return a STRING.
//     * The function accepts STRING s as parameter.
//     */
//
//    public static String timeConversion(String s) {
//        // Write your code here
//
//        int hours = Integer.parseInt(s.substring(0, 2));
//        int hoursConverted;
//
//        if (s.endsWith("AM")) {
//            if (hours == 12) {
//                hoursConverted = 0;
//            } else {
//                hoursConverted = hours;
//            }
//        } else {
//            if (hours == 12) {
//                hoursConverted = hours;
//            } else {
//                hoursConverted = hours + 12;
//            }
//        }
//
//        return String.format("%02d%s", hoursConverted, s.substring(2, s.length() - 2));
//
//    }
//
//}
