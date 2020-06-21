package creational.factory_method.example1;

import util.Log;

public class ProccessVideo implements  Proccess {
  @Override
  public byte[] result(byte[] bytes) {
    Log.d("Proccessing Video is Start.");
    return new byte[100];
  }
}
