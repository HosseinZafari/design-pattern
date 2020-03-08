package creational.singleton.lazy;

public class StageLazy {

  public static void main(String[] arg){

    // StageSimple is thread safe
    PersonLazy personLazy = PersonLazy.getInstance();

    new Thread(new Runnable() {
      @Override
      public void run() {
        personLazy.setName("Hossein");
        personLazy.setFamily("Zafari");
        personLazy.setAge(20);
        System.out.println(personLazy.toString());
      }
    }).start();

    new Thread(new Runnable() {
      @Override
      public void run() {
        personLazy.setFamily("Imani");
        personLazy.setAge(40);
        System.out.println(personLazy.toString());
      }
    }).start();


    try {
      Thread.sleep(200);
      PersonLazy personLazy2 = PersonLazy.getInstance();
      personLazy2.setAge(30);
      System.out.println(personLazy2.toString());

    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
