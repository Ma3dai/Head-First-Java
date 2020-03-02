import java.util.ArrayList;

public class SimpleDotCom {
    //int[] locationCells;
    private ArrayList<String> locationCells;
    //int numOfHits = 0;


    // Проверяем попал или промазал
    String checkYourself(String userInput) {
        //  int guess = Integer.parseInt(stringGuess);

        String result = "Мимо";
        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);


        if (locationCells.isEmpty()) {
            result = "Потопил";
        } else result = "Попал";
        }

        return result;
    }
       /* for (int cell : locationCells) {
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }


        if (numOfHits == locationCells.length) {
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    } */


    // Присваиваем значения расположения в массив
    public  void setLocationCells(ArrayList<String> locs){
        locationCells = locs;
    }

}
