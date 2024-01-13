package factory;

public abstract class Flutter {

    public void setTheme(String themeName) {
        System.out.printf("Set theme as %s", themeName);
    }

    public void setRefreshRate(int freq) {
        System.out.printf("Set refresh rate as %s", freq);
    }

    // Factory method
    abstract public Button createButton();

    // Factory method
    abstract public Dropdown createDropdown();
}
