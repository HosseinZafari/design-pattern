package creational.factory_method.example1;

public class Stage {

  public static void main(String[] args) {
    // An Example For Test Design Pattern Factory Method
    ProccessingCpu cpu = ProccessingFactory.getProccessingCpu(ProccessingFactory.GIF);
    cpu.proccess();
  }


}

