package courseSale.dataAccess.concretes;

import courseSale.dataAccess.abstracts.CourseDao;
import courseSale.entities.concretes.Course;

import java.util.ArrayList;
import java.util.List;

public class NhCourseDao implements CourseDao {
    List<Course> courses = new ArrayList<>();

    @Override
    public void add(Course course) {
        courses.add(course);

    }

    @Override
    public List<Course> getCourse() {
        return courses;
    }
}
