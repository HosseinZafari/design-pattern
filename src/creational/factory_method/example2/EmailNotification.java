package creational.factory_method.example2;

import util.Log;

public class EmailNotification implements Notification {
  @Override
  public String send(String information) {
    Log.d("Start EmailSending...");
    return  information + "\tEmail Notified";
  }


}
