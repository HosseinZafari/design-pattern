package creational.factory_method.example1;

public class Stage {

  public static void main(String[] args) {
      ProccessingCpu cpu = ProccessingFactory.getProccessingCpu(ProccessingFactory.GIF);
      cpu.proccess();
  }


}

