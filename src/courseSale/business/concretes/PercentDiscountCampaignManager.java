package courseSale.business.concretes;

import courseSale.business.abstracts.CampaignService;
import courseSale.entities.concretes.Course;

import java.util.List;

public class PercentDiscountCampaignManager implements CampaignService {
    @Override
    public void updatePrice(List<Course> courses) {
        for (Course course: courses)
            course.price=course.price-(course.price*getPercentageDiscount());
    }

    private double getPercentageDiscount() {
        return 0.30;
    }
}
