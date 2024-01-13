
package factory;

public class FlutterAndroid extends Flutter{
  public UIFactory createUiFactory() {
    return new AndroidUiFactory();
  }
}
