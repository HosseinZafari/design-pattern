package creational.factory_method.example1;

public class ProccessingCpuImage extends ProccessingCpu {

  @Override
  protected Proccess getProccess() {
    return new ProccessImage();
  }
}
