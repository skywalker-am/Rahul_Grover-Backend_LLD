package factory;

public abstract class Flutter {

    public void setTheme(String themeName) {
        System.out.printf("Set theme as %s", themeName);
    }

    public void setRefreshRate(int freq) {
        System.out.printf("Set refresh rate as %s", freq);
    }

    // Factory method  -> Respo
    abstract public UIFactory createUiFactory();

}
