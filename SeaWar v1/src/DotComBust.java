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
  }
}
