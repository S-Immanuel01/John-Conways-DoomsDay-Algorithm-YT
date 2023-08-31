import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // doomsday = day date + month string + yy + yy/4  -1 all % 7
        System.out.println("Enter the month in string: ");
        String month = new Scanner(System.in).nextLine();
        System.out.println("Enter the day: ");
        int day = new Scanner(System.in).nextInt();
        System.out.println("Enter the year in the format yy: ");
        int year = new Scanner(System.in).nextInt();
        int specialString = (year %4 != 0) ?
            switch (month) {
            case "january" -> 1;
            case "february" -> 4;
            case "march" -> 4;
            case "april" -> 0;
            case "may" -> 2;
            case "june" -> 5;
            case "july" -> 0;
            case "august" -> 3;
            case "september" -> 6;
            case "october" -> 1;
            case "november" -> 4;
            case "december" -> 6;
            default -> 0;
        } : switch (month) {
            case "january" -> 0;
            case "february" -> 3;
            case "march" -> 4;
            case "april" -> 0;
            case "may" -> 2;
            case "june" -> 5;
            case "july" -> 0;
            case "august" -> 3;
            case "september" -> 6;
            case "october" -> 1;
            case "november" -> 4;
            case "december" -> 6;
            default -> 0;

    };

        int doomsDayAlgorithm = (year + specialString + year/4 + day -1) % 7;
//        System.out.println(doomsDayAlgorithm);

        String dayOfTheWeek = switch (doomsDayAlgorithm){
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "unknown date";
        };

        System.out.printf("%s %dth would be a %s",month, day, dayOfTheWeek);
}}