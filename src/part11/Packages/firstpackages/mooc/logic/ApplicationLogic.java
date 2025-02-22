package part11.Packages.firstpackages.mooc.logic;

import part11.Packages.firstpackages.mooc.ui.UserInterface;

public class ApplicationLogic {
    private UserInterface ui;

    public ApplicationLogic(UserInterface ui){
this.ui=ui;
    }
    public void execute(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Application logic is working");
            ui.update();
    }
}
}
