package util;

import java.io.*;

public class InputTerminal {

  private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

  public static String getInput() throws IOException {
    return reader.readLine();
  }

}
