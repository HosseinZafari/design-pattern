package util;

public class Log {

  public static void d(Object object){
    System.out.println("Debug: ThreadId: #" + Thread.currentThread().getId() + "\t| " + object.toString());
  }

}
