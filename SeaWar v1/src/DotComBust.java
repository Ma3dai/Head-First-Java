import java.util.ArrayList;

public class DotComBust {

  //Объявляем и инициируем переменные, которые нам понадобятся
  private GameHelper helper = new GameHelper();
  private ArrayList<DotCom> dotComList = new ArrayList();
  private int numOfGuesses = 0;

  private void setUpGame(){
    //Создадить несколько сайтов и присвоим им адреса
    DotCom one = new DotCom();
    one.setName("fb.com");

    DotCom two = new DotCom();
    two.setName("twitter.com");

    DotCom three = new DotCom();
    three.setName("vk.com");

    dotComList.add(one);
    dotComList.add(two);
    dotComList.add(three);

    System.out.println("Ваша цель - потопить три \"сайта\".");
    System.out.println(one.getName() + ", " + two.getName() + ", " + three.getName());
    System.out.println("Попытайтесь потопить их за минимальное количество ходов");

    for (DotCom dotComSet : dotComList) {
      ArrayList<String> newLocation = helper.placeDotCom(3);
      dotComSet.setLocationCells(newLocation);
    }
  }

  private void startPlaying(){
    while (!dotComList.isEmpty()) {
      String userGuess = helper.getUserInput("Сделайте ход");
      checkUserGuess(userGuess);
    }
    finishGame();
  }

  private void checkUserGuess(String userGuess){
    numOfGuesses++;
    String result = "Мимо";

    for (DotCom dotComTest : dotComList) {
      result = dotComTest.checkYourself(userGuess);
      if (result.equals("Попал")) {
        break;
      }
      if (result.equals("Потопил")) {
        dotComList.remove(dotComTest);
        break;
      }
    }
    System.out.println(result);
  }

  public void finishGame() {
    System.out.println("Все \"сайты\" ушли ко дну! Ваши акции теперь ничего не стоят!");
    if (numOfGuesses <= 18) {
      System.out.println("Это заняло у вас всего " + numOfGuesses + " попыток.");
      System.out.println("Молодец!");
    } else {
      System.out.println("Это заняло у вас довольно много времени. " + numOfGuesses + " попыток");
      System.out.println("Лузер!");
    }
  }

  public static void main(String[] args) {
    DotComBust game = new DotComBust();
    game.setUpGame();
    game.startPlaying();
  }
}
