public class Item {
    private String name;
    private int value;
    private boolean isMagicl;

    public Item() {
        this.name = "Unknown";
        this.value = 0;
        this.isMagicl = false;

    }

    public Item(String name, int value, boolean isMagicl) {
        this.name = name;
        this.value = value;
        this.isMagicl = isMagicl;
    }

    public String toString() {

        String magical;

        if (this.isMagicl) {
            magical = "\nis Magical";
        } else {
            magical = "\nis Not Magical";
        }
        return "Name: " + this.name + "\nValue: " + this.value + magical;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }


    public void setValue(int value) {

        if (value < 0) {
            value = 0;
        }
        this.value = value;
    }

    public boolean getisMagicl() {

        return isMagicl;
    }


    public void setisMagicl() {

        this.isMagicl = isMagicl;

    }

}

