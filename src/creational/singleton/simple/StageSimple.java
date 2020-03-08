package creational.singleton.simple;

public class StageSimple {

  public static void main(String[] arg){

    // PersonSimple class is thread safe
    PersonSimple personSimple = PersonSimple.getInstance();

    new Thread(new Runnable() {
      @Override
      public void run() {
        personSimple.setName("Hossein");
        personSimple.setFamily("Zafari");
        personSimple.setAge(20);
        System.out.println(personSimple.toString());
      }
    }).start();

    new Thread(new Runnable() {
      @Override
      public void run() {
        personSimple.setFamily("Imani");
        personSimple.setAge(40);
        System.out.println(personSimple.toString());
      }
    }).start();


    try {
      Thread.sleep(200);
      PersonSimple personLazy2 = PersonSimple.getInstance();
      personLazy2.setAge(30);
      System.out.println(personLazy2.toString());

    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
