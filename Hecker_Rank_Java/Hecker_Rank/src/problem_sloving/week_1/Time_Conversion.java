package problem_sloving.week_1;


class Time_Conversion {
    public static String timeConversion(String s) {
        String hour = s.substring(0, 2);
        String minutesAndSeconds = s.substring(2, 8);
        String period = s.substring(8);

        if (period.equals("AM")) {
            if (hour.equals("12")) {
                hour = "00";
            }
        } else {               // period.equals("PM")
            if (!hour.equals("12")) {
                hour = String.valueOf(Integer.parseInt(hour) + 12);
            }
        }

        return hour + minutesAndSeconds;
    }

    public static void main(String[] args) {
        //                  0123456789
        String input = "07:05:45PM";
        String output = timeConversion(input);
        System.out.println(output);
    }
}










//
//public static String timeConversion(String s) {
//    // method 1
//    // String period = s.substring(8);
//    // String portion = s.substring(0, 8);
//    // String[] times = portion.split(":");
//
//    // int hour = Integer.parseInt(times[0]);
//
//    // if (period.equals("PM") && hour != 12) {
//    //     hour += 12;
//    // } else if (period.equals("AM") && hour == 12) {
//    //     hour = 0;
//    // }
//    // return String.format("%02d:%s:%s", hour, times[1], times[2]);
//    // ---------------------------------------------------------------------------
//    // method 2
//    //  String temp = "";
//
//
//    // if (s.substring(0, 2).equals("12") && s.contains("AM")) {
//    //     temp = "00";
//    //     s = temp+s.substring(2, s.length());
//    // }
//
//
//    // if (!s.substring(0, 2).equals("12") && s.contains("PM")) {
//
//    //     temp = Integer.toString(Integer.parseInt(s.substring(0, 2)) + 12);
//    //     s = temp+s.substring(2, s.length());
//
//    // }
//
//
//    // return s.substring(0, s.length()-2);
//
//
//    //-----------------------------------------------
//    // method 3
//    String hour = s.substring(0, 2);
//    String minutesAndSeconds = s.substring(2, 8);
//    String period = s.substring(8);
//
//    if (period.equals("AM")) {
//        if (hour.equals("12")) {
//            hour = "00";
//        }
//    } else { // period.equals("PM")
//        if (!hour.equals("12")) {
//            hour = String.valueOf(Integer.parseInt(hour) + 12);
//        }
//    }
//
//    return hour + minutesAndSeconds;
//}
//
//
