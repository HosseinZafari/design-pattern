package creational.factory_method.example2;

public class FactoryNotification {

  public Notification getNotification(String type){
      if(type == null){
        return null;
      }

      if(type.equalsIgnoreCase("email")){
        return new EmailNotification();
      } else if(type.equalsIgnoreCase("sms")){
        return new SMSNotification();
      } else if (type.equalsIgnoreCase("push")){
        return new PushNotification();
      }
      return null;
  }

}
