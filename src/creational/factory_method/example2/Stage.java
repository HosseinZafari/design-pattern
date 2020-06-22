package creational.factory_method.example2;

import util.InputTerminal;
import util.Log;

import java.io.IOException;

public class Stage {

  public static String getType() throws IOException {
    Log.d("Enter Your type of Notification..");
    return InputTerminal.getInput();
  }

  public static String getMessage() throws IOException {
    Log.d("Enter Your Message..");
    return InputTerminal.getInput();
  }


  public static void main(String[] args) throws IOException {
    String type = getType();
    String message = getMessage();

    FactoryNotification factoryNotification = new FactoryNotification();
    Notification notification = factoryNotification.getNotification(type);

    Log.d("Notification is Starting...");
    try{
      Log.d(notification.send(message));
    }catch (NullPointerException exception){
      Log.d("\nNot Found Your Type");
    }

  }

}
