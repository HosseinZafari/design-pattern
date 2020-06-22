package creational.factory_method.example2;

import util.Log;

public class PushNotification implements Notification {
  @Override
  public String send(String information) {
    Log.d("Start Push Sending...");
    return  information + "Push Notified";
  }


}
