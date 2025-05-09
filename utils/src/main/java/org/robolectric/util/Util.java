package org.robolectric.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

/** Generic collection of utility methods. */
public class Util {

  /**
   * Returns the Java version as an int value.
   *
   * @return the Java version as an int value (8, 9, etc.)
   */
  public static int getJavaVersion() {
    String version = System.getProperty("java.version");
    assert version != null;
    if (version.startsWith("1.")) {
      version = version.substring(2);
    }
    // Allow these formats:
    // 1.8.0_72-ea
    // 9-ea
    // 9
    // 9.0.1
    int dotPos = version.indexOf('.');
    int dashPos = version.indexOf('-');
    return Integer.parseInt(
        version.substring(0, dotPos > -1 ? dotPos : dashPos > -1 ? dashPos : version.length()));
  }

  @SuppressWarnings({"AndroidJdkLibsChecker", "NewApi"}) // not relevant, always runs on JVM
  public static void copy(InputStream in, OutputStream out) throws IOException {
    try {
      in.transferTo(out);
    } finally {
      in.close();
    }
  }

  /**
   * This method consumes an input stream and returns its content, and closes it.
   *
   * @param is The input stream to read from.
   * @return The bytes read from the stream.
   * @throws IOException Error reading from stream.
   */
  @SuppressWarnings({"AndroidJdkLibsChecker", "NewApi"}) // not relevant, always runs on JVM
  public static byte[] readBytes(InputStream is) throws IOException {
    try {
      return is.readAllBytes();
    } finally {
      is.close();
    }
  }

  public static <T> T[] reverse(T[] array) {
    for (int i = 0; i < array.length / 2; i++) {
      int destI = array.length - i - 1;
      T o = array[destI];
      array[destI] = array[i];
      array[i] = o;
    }
    return array;
  }

  @SuppressWarnings("NewApi")
  public static Path pathFrom(URL localArtifactUrl) {
    try {
      return Paths.get(localArtifactUrl.toURI());
    } catch (URISyntaxException e) {
      throw new RuntimeException("huh? " + localArtifactUrl, e);
    }
  }

  /**
   * Re-throw {@code t} (even if it's a checked exception) without requiring a {@code throws}
   * declaration.
   *
   * <p>This function declares a return type of {@link RuntimeException} but will never actually
   * return a value. This allows you to use it with a {@code throw} statement to convince the
   * compiler that the current branch will not complete.
   *
   * <pre>{@code
   * throw Util.sneakyThrow(new IOException());
   * }</pre>
   *
   * <p>Adapted from https://www.mail-archive.com/javaposse@googlegroups.com/msg05984.html
   */
  @SuppressWarnings("unchecked")
  public static <T extends Throwable> RuntimeException sneakyThrow(Throwable t) throws T {
    throw (T) t;
  }
}
