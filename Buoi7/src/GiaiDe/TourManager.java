package GiaiDe;

import java.util.ArrayList;

public interface TourManager {
    boolean addTour(Tour t);

    boolean delTour(Tour t);

    ArrayList<Tour> getAll();

    ArrayList<Tour> searchTour(String name);

    ArrayList<Tour> searchTour(double price);

    ArrayList<Tour> sortedTour(boolean isINC);

    double getTotalStorage();
}
