package courseSale.business.abstracts;

import courseSale.entities.concretes.Course;

import java.util.List;

public interface CampaignService {
    void updatePrice(List<Course> courses);
}
