package part11.Packages.firstpackages;

import part11.Packages.firstpackages.mooc.logic.ApplicationLogic;
import part11.Packages.firstpackages.mooc.ui.TextInterface;
import part11.Packages.firstpackages.mooc.ui.UserInterface;

public class Main {
    public static void main(String[] args) {


            UserInterface ui = new TextInterface();
            new ApplicationLogic(ui).execute(3);
    }
}