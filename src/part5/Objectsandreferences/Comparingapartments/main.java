package part5.Objectsandreferences.Comparingapartments;

public class main {
    public static void main(String[] args) {
        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

        System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));
        System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));

        System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));
        System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));

        System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));
        System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));
    }
}
