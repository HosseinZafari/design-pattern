package creational.factory_method.example2;

import util.Log;

public class SMSNotification implements Notification {
  @Override
  public String send(String information) {
    Log.d("Start SMS Sending...");
    return information + "SMS Notified";
  }


}
