package creational.singleton.biilpugh;

public class StageBillPugh {

  public static void main(String[] arg){

    // PersonBillPugh is thread safe
    PersonBillPugh personBillPugh = PersonBillPugh.getInstance();

    new Thread(new Runnable() {
      @Override
      public void run() {
        personBillPugh.setName("Hossein");
        personBillPugh.setFamily("Zafari");
        personBillPugh.setAge(20);
        System.out.println(personBillPugh.toString());
      }
    }).start();

    new Thread(new Runnable() {
      @Override
      public void run() {
        personBillPugh.setName("Amir");
        personBillPugh.setFamily("Imani");
        personBillPugh.setAge(40);
        System.out.println(personBillPugh.toString());
      }
    }).start();


    try {
      Thread.sleep(200);
      PersonBillPugh personBillPugh2 = PersonBillPugh.getInstance();
      personBillPugh2.setName("Ali");
      personBillPugh2.setAge(30);
      System.out.println(personBillPugh2.toString());

    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
