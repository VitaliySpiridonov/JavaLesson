package Lesson2;

public class SwitchTest {
    public static void main(String[] args) {
        final int SEASON_NUMBER = 4;
        convertSeason(SEASON_NUMBER);
        convertSeasonSwitch(SEASON_NUMBER);
//        convertSeasonSwitch2(SEASON_NUMBER);
        convertSeasonSwitchToMonth(1);
    }

    public static void convertSeason(int seasonNumber) {
        String season;
        if (seasonNumber == 1) {
            season = "Winter";
        } else if (seasonNumber == 2) {
            season = "Spring";
        } else if (seasonNumber == 3) {
            season = "Summer";
        } else if (seasonNumber == 4) {
            season = "Fall";
        } else {
            season = "Unknown season";
        }
        System.out.println(season);
    }

    public static void convertSeasonSwitch(int seasonNumber) {
        String season = switch (seasonNumber) {
            case 1 -> "Winter";
            case 2 -> "Spring";
            case 3 -> "Summer";
            case 4 -> "Fall";
            default -> "Unknown season";
        };
        System.out.println(season);
    }

/*    public static void convertSeasonSwitch2(int seasonNumber) {
        String season = null;
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
        System.out.println(season);
    }*/

    public static void convertSeasonSwitchToMonth(int monthNumber) {
        String season = switch (monthNumber) {
            case 1, 2, 12 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Fall";
            default -> "Unknown season";
        };
        System.out.println(season);
    }
}
