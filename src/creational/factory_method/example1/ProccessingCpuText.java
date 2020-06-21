package creational.factory_method.example1;

public class ProccessingCpuText extends ProccessingCpu {

  @Override
  protected Proccess getProccess() {
    return new ProccessText();
  }
}
