package factory;

public class Client {
    public static void main(String[] args) {

        Flutter flutter = new FlutterAndroid();
        
        Button b = flutter.createButton();
        b.changeSize(21);
        b.setText("This is Android text update");

        flutter.createDropdown();

        Flutter flutter = new FlutterIos();
        Button b = flutter.createButton();
        b.changeSize(51);
        b.setText("This is Ios text update");   
    }
}
