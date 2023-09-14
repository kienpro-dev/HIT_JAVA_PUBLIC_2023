package GiaiDe;

import java.util.ArrayList;
import java.util.Comparator;

public class TourManagerImpl implements TourManager{
    ArrayList<Tour> listTour;

    public TourManagerImpl() {
        this.listTour = new ArrayList<>();
    }

    public TourManagerImpl(ArrayList<Tour> listTour) {
        this.listTour = new ArrayList<>(listTour);
    }

    @Override
    public boolean addTour(Tour t) {
        try {
            boolean check = false;
			for(Tour tour : listTour) {
                if(tour.getProduct_id().equals(t.getProduct_id())) {
                    tour.setProduct_total(tour.getProduct_total() + t.getProduct_total());
                    check = true;
                    break;
                }
            }
            if(!check) {
                listTour.add(t);
            }
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
    }

    @Override
    public boolean delTour(Tour t) {
        try {
            for(Tour tour : listTour) {
                if(tour.getProduct_id().equals(t.getProduct_id())) {
                    listTour.remove(tour);
                    return true;
                }
            }
            return false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
    }

    @Override
    public ArrayList<Tour> getAll() {
        return listTour;
    }

    @Override
    public ArrayList<Tour> searchTour(String name) {
        ArrayList<Tour> res = new ArrayList<>();
        for (Tour tour : listTour) {
            if(tour.getProduct_name().equals(name)) {
                res.add(tour);
            }
        }
        return res;
    }

    @Override
    public ArrayList<Tour> searchTour(double price) {
        ArrayList<Tour> res = new ArrayList<>();
        for (Tour tour : listTour) {
            if(tour.getProduct_price() == price) {
                res.add(tour);
            }
        }
        return res;
    }

    @Override
    public ArrayList<Tour> sortedTour(boolean isINC) {
		ArrayList<Tour> sortedList = new ArrayList<>(listTour);
		if (isINC) {
			sortedList.sort(new sortedByPrice());
		}
		else {
			sortedList.sort(new sortedByPrice().reversed());
		}
		return sortedList;
    }

    @Override
    public double getTotalStorage() {
        double res = 0;
        for (Tour tour : listTour) {
            res += tour.getTotalPrice();
        }
        return res;
    }
}

class sortedByPrice implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return (int)(p1.getProduct_price() - p2.getProduct_price());
	}

}
