package creational.factory_method.example1;

import util.Log;

class ProccessingCpuGif extends  ProccessingCpu {

  @Override
  protected Proccess getProccess() {
    Log.d("Procceing Gif is Start");
    return new ProccessGif();
  }
}
