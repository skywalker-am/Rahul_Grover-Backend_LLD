
package factory;

public class FlutterAndroid extends Flutter{
  public Button createButton() {
    return new AndroidButton();
  }

   public Dropdown createDropdown() {
    return new AndroidDropdown();
  }
}
