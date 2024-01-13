package factory;

public class AndroidButton implements Button{
    @Override
    public void setText(String text) {
        System.out.println(text);
    }

    @Override
    public void changeSize(int size) {
         System.out.println(size);
    }
}
