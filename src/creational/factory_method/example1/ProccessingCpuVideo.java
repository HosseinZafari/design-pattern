package creational.factory_method.example1;

public class ProccessingCpuVideo extends ProccessingCpu {

  @Override
  protected Proccess getProccess() {
    return new ProccessVideo();
  }
}
