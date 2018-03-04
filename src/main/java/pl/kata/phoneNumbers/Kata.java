package pl.kata.phoneNumbers;

public class Kata {
    public static boolean validPhoneNumber(String phoneNumber) {
        if (phoneNumber.matches("\\(\\d{3}\\) \\d{3}-\\d{4}")) {
            return true;
        }
        return false;
    }

    public static boolean validPhoneNumber2(String phoneNumber) {
        return phoneNumber.matches("\\(\\d{3}\\) \\d{3}-\\d{4}");
    }

    public static void main(String[] args) {
//        System.out.println(validPhoneNumber("(123) 456-7890"));
//        System.out.println(validPhoneNumber("(123) aa-7890"));
//        System.out.println(validPhoneNumber("(1111)555 2345"));
//        System.out.println(validPhoneNumber("(098) 123 4567"));

        System.out.println(validPhoneNumber2("(123) 456-7890"));
        System.out.println(validPhoneNumber2("(123) aa-7890"));
        System.out.println(validPhoneNumber2("(1111)555 2345"));
        System.out.println(validPhoneNumber2("(098) 123 4567"));
    }
}

//    validPhoneNumber("(123) 456-7890")  =>  returns true

/**
    //        Pattern pattern = Pattern.compile("\\(\\d{3}\\) \\d{3}-\\d{4}");
//        Matcher matcher = pattern.matcher((phoneNumber));
    List<String> lista = new ArrayList<>();

        if (phoneNumber.matches("\\(\\d{3}\\) \\d{3}-\\d{4}")) {
                return true;
                }

//        while (matcher.find()) {
//            System.out.println("group 0: " + matcher.group(0));
//            lista.add(matcher.group(0));
//        }
//        if (lista.size() == 3 && lista.get(0).length() == 3 &&
//                lista.get(1).length() == 3 &&
//                lista.get(2).length() == 4 &&
//                lista.get(0).equals("123")) {
//            return true;
//        }

                return false;
                }*/
