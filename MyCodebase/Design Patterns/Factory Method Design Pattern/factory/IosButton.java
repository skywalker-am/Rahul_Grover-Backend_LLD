package factory;

public class IosButton implements Button {
    @Override
    public void setText(String text) {
        System.out.println(text);
    }

    @Override
    public void changeSize(int size) {
         System.out.println(size);
    }
}
