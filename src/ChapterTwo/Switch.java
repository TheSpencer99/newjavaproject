package ChapterTwo;

public class Switch {
    public static void main(String[] args) {
        String gender = "Male";
        if (gender.equals("FEMALE")) {

        } else if (gender.equals("MALE")) {

        } else if (gender.equals("PREFER_NOT_SAY")) {

        } else {

        }

        switch (gender) {
            case "FEMALE":
                System.out.println("I am a female");
                break;
            case "MALE":
                System.out.println("i am a male");
                break;
            case "PREFER_NOT_SAY":
                System.out.println("prefer not say");
                break;
            default:
                System.out.println("Unknown gender");
        }


    }
}