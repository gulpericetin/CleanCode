package courseSale.business.abstracts;

import courseSale.entities.concretes.Course;

import java.util.List;

public interface CourseService {
    void add(Course course);
    List<Course> getAll();
    List<Course> getAllWithCampaign();
}
