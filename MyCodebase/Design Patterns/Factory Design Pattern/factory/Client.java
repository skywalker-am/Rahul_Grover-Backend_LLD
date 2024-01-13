package factory;

public class Client {
    public static void main(String[] args) {

        Flutter flutter = new FlutterAndroid();

        Button b = flutter.createButton();

        b.changeSize(21);
        b.setText("This is text update");
    }
}
