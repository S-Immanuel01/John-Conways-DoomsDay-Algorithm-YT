# John-Conways-DoomsDay-Algorithm-YT
The John Conways Doomsday Algorithm is a simple method which can be used to predict what day of the week any day would be... All it requires is the Day, Month and Year You want to predict.

## How it works?
The Algorithm follows a simple formula 
### date = (day + specialString + yy + yy/4 -1) % 7

SpecialStrings: 
- january -> 1;
- february -> 4;
- march -> 4;
- april -> 0;
- may -> 2;
- june -> 5;
- july -> 0;
- august -> 3;
- september -> 6;
- october -> 1;
- november -> 4;
- december -> 6;

For leap year (year % 4 == 0) january and february would be decreased by 1
- january -> 0;
- february -> 3;
- march -> 4;
- april -> 0;
- may -> 2;
- june -> 5;
- july -> 0;
- august -> 3;
- september -> 6;
- october -> 1;
- november -> 4;
- december -> 6;

## Final result
  ![gitpic](https://github.com/S-Immanuel01/John-Conways-DoomsDay-Algorithm-YT/assets/142397823/00c3d202-1900-4ee2-9e77-023ea316ed42)

To learn more on this Visit my YouTube channel
