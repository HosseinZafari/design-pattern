package creational.factory_method.example1;

class ProccessingFactory {

  public static final short TEXT  = 1;
  public static final short IMAGE = 2;
  public static final short VIDEO = 3;
  public static final short GIF   = 4;

  public static ProccessingCpu getProccessingCpu(short typeProccess){
    if (typeProccess == TEXT){
      return new ProccessingCpuText();
    } else if(typeProccess == IMAGE){
      return new ProccessingCpuImage();
    } else if (typeProccess == VIDEO){
      return new ProccessingCpuVideo();
    } else if (typeProccess == GIF){
      return new ProccessingCpuGif();
    }

    return null;
  }

}
