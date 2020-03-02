public class SimpleDotComGame {

  public static void main(String[] args) {
  int numOfGuesses = 0;
  GameHelper helper = new GameHelper();

  SimpleDotCom theDotCom = new SimpleDotCom();

  // Генерируем рандомную локацию
  int randomNum = (int) (Math.random() * 5);

  // Трехпалубка
  int[] locations = {randomNum, randomNum+1, randomNum+2};

  // Присваиваем локации нашему объекту
  theDotCom.setLocationCells(locations);

  boolean isActive = true;

  // Основной цикл, где мы играем в игру пока не потопим корабль

  while (isActive == true) {

    String guess = helper.getUserInput("Введите число");

    String result = theDotCom.checkYourself(guess);

    numOfGuesses++;

    if (result.equals("Потопил")) {
      isActive = false;
      System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)" );
    }
  }

  }
}
