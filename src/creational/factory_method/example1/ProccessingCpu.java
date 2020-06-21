package creational.factory_method.example1;

import util.Log;

public abstract class ProccessingCpu {

    private byte[] inputBytes = new byte[2];

    public void proccess() {
      Log.d("Proccess is Starting ... ");

      Proccess proccess = getProccess();
      byte[] outputBytes = proccess.result(inputBytes);

      Log.d("Size Bytes is : " + outputBytes.length);
    }

    // Notice: this is FactoryMethod . And Using OCP : [Open Closed Principle] SOLID .
    protected abstract Proccess getProccess();
}
