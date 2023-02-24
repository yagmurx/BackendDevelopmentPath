package Modifiers;

public class modifiers {
    private String str; //This modifier make this variable un-accessible.

    modifiers(String str) {
        this.str = str;
    }
    private void showStr() {
        System.out.println(this.str);
    }

    void show() {
        this.showStr();
    }
}
