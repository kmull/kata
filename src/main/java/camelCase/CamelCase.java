package camelCase;

import java.util.Objects;

public class CamelCase {

    private static String toCamelCase(String s) {
        boolean flag = false;
        String[] arr;
//        String[] arr = s.contains("-") ? (s.split("-")) : (s.split("_"));
        if (s.contains("-") || (!s.equals(s.toLowerCase()) && s.contains("_") ) ) {
//            arr = s.split("-");
            flag = true;
        }
        arr = s.contains("-") ? (s.split("-")) : (s.split("_"));
        s = "";

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i].substring(0, 1).equals(arr[i].substring(0, 1).toUpperCase())) {
                flag = true;
            }
            if (i > 0 && flag == true) {
                s += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1, arr[i].length());
            } else if (i == 0) {
                s += arr[0];
            } else {
                s += arr[i];
            }
        }
        return s;
    }


    public static void main(String[] args) {

        System.out.println(toCamelCase("the-stealth-warrior"));
        System.out.println(toCamelCase("bridge_desert_Lake_Blue"));
        System.out.println(toCamelCase("The_Stealth_Warrior"));
        System.out.println(toCamelCase("left-mountain-mountain"));
        System.out.println(toCamelCase("south_Green_mountain_Wall_up_Wall_river_right_Blue"));

        System.out.println(toCamelCase("You_have_chosen_to_translate_this_kata_For_your_" +
                "convenience_we_have_provided_the_existing_test_cases_used_for_the_language_" +
                "that_you_have_already_completed_as_well_as_all_of_the_other_related_fields"));

    }
}


//
//You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_existing_test_cases_used_for_the_language_that_you_have_already_completed_as_well_as_all_of_the_other_related_fields
