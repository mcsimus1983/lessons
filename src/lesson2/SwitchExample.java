package lesson2;

public class SwitchExample {

    public static void main(String[] args) {
        convertSeasonSwitch4(1);
    }

    public String convertSeason(int seasonNumber) {
        String season;

        if (seasonNumber == 1) {
            season = "Winter";
        } else if (seasonNumber == 2) {
            season = "Spring";
        } else if (seasonNumber == 3) {
            season = "Summer";
        } else if (seasonNumber == 4) {
            season = "Summer";
        } else {
            season = "Unknown season";
        }

        return season;
    }

    static String convertSeasonSwitch (int seasonNumber) {
        String season;


        switch (seasonNumber) {
            case 1:
                season = "Winter";
                break;
            case 2:
                season = "Spring";
                break;
            case 3:
                season = "Summer";
                break;
            case 4:
                season = "Fall";
                break;
            default:
                season = "Unknown season";
        }

        return season;
    }


    static String convertSeasonSwitch2 (int seasonNumber) {

        String season;


        switch (seasonNumber) {
            case 1:
                return "Winter";
            case 2:
                return "Spring";
            case 3:
                return "Summer";
            case 4:
                return "Fall";
            default:
                return "Unknown season";
        }

    }

    static String convertSeasonSwitch3 (int seasonNumber) {

        String season;


        return switch (seasonNumber) {
            case 1 -> "Winter";
            case 2 -> "Spring";
            case 3 -> "Summer";
            case 4 -> "Fall";
            default -> "Unknown season";
        };

    }

    static void convertSeasonSwitch4 (int seasonNumber) {

        String season;


        switch (seasonNumber) {
            case 1:
                System.out.println("Winter");
            case 2:
                System.out.println("Spring");
            case 3:
                System.out.println("Summer");
            case 4:
                System.out.println("Fall");
            default:
                System.out.println("Unknown season");
        }

    }
}
