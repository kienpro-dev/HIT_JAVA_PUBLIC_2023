package GiaiDe;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tour> listTour = new ArrayList<>();
        listTour.add(new Tour("TOUR1", "Ha Long", 1500000, 5, "2N1D", "Thuyen"));
        listTour.add(new Tour("TOUR2", "Sam Son", 1000000, 2, "2N2D", "Oto"));
        listTour.add(new Tour("TOUR3", "Sapa", 2000000, 10, "2N2D", "Oto"));

        output(listTour);

        TourManager tourManager = new TourManagerImpl(listTour);

        // Test add
        if (tourManager.addTour(new Tour("TOUR4", "Hai Phong", 500000, 10, "1N1D", "Oto"))) {
            System.out.println("Them thanh cong");
        } else {
            System.out.println("Them that bai");
        }
        output(tourManager.getAll());

        // Test remove
        if (tourManager.delTour(new Tour("TOUR4", "Hai Phong", 500000, 10, "1N1D", "Oto"))) {
            System.out.println("Xoa thanh cong");
        } else {
            System.out.println("Xoa that bai");
        }
        output(tourManager.getAll());

        // Test search
        ArrayList<Tour> find = tourManager.searchTour("Sam Son");
        System.out.println("Tim kiem tour Sam son");
        output(find);

        // Test sort
        ArrayList<Tour> sortedTour = tourManager.sortedTour(true);
        System.out.println("Tour sap xep tang dan theo gia");
        output(sortedTour);

    }

    private static void output(ArrayList<Tour> listTour) {
        for (Tour t : listTour) {
            System.out.println(t);
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
