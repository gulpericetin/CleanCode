package courseSale.business.concretes;

import courseSale.business.abstracts.CampaignService;
import courseSale.entities.concretes.Course;

import java.util.List;

public class StandartPriceCampaignManager implements CampaignService {
    @Override
    public void updatePrice(List<Course> courses) {
        for (Course course: courses)
            course.price=getCurrentBasePrice();
    }

    private double getCurrentBasePrice() {
        return 45;
    }
}
