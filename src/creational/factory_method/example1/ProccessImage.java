package creational.factory_method.example1;

import util.Log;

public class ProccessImage implements  Proccess {
  @Override
  public byte[] result(byte[] bytes) {
    Log.d("Proccessing Image is Start.");
    return new byte[10];
  }

}
