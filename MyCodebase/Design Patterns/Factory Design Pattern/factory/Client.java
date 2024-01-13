package factory;

public class Client {
    public static void main(String[] args) {

        Flutter flutter = new Flutter();

        Button b = flutter.createButton("Android");

        b.changeSize(21);
        b.setText("This is text update");

    }
}
