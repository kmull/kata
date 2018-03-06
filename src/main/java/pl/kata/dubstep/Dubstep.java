package pl.kata.dubstep;

public class Dubstep {

    public static String songDecoder(String song) {
        String[] arr = song.split("WUB");
        String result = "";

        for (String tmp : arr) {
            if (!tmp.equals("")) {
                result = result + tmp + " ";
            }
        }
        return result.trim();
    }

    public static String songDecoder2(String song) {
        song = song.replaceAll("WUB", " ");
        return song.replaceAll("\\s+", " ").trim();

    }

    public static void main(String[] args) {
        System.out.println(songDecoder("WUBWUBABCWUB"));
        System.out.println(songDecoder("RWUBWUBWUBLWUB"));

        System.out.println(songDecoder2("WUBWUBABCWUB"));
        System.out.println(songDecoder2("RWUBWUBWUBLWUB"));
    }
}
