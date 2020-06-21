package creational.factory_method.example1;

import util.Log;

public class ProccessText implements Proccess {
  @Override
  public byte[] result(byte[] bytes) {
    Log.d("Proccessing Text is Start.");

    return new byte[5];
  }
}
