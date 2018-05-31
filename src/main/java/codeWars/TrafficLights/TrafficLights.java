package codeWars.TrafficLights;

public class TrafficLights {

    public static void main(String[] args) {
        System.out.println(updateLight("yellow"));
    }

    public static String updateLight(String current) {

        String[] myStringArray = {"green", "yellow", "red", "green"};

        for(int i=0; i<=myStringArray.length; i++)
        {
            if(myStringArray[i].equals(current)){
                return myStringArray[i+1];
            }
        }

        return "";
    }

}
