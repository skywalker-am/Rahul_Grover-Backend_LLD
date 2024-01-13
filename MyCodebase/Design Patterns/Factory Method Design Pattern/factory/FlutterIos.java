package factory;

public class FlutterIos extends Flutter{
  public Button createButton() {
    return new IosButton();
  }
}
