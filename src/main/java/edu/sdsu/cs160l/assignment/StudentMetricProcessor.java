package edu.sdsu.cs160l.assignment;

import edu.sdsu.cs160l.assignment.model.Student;

import java.util.List;

/**
 * TODO complete all TODOs below
 * TODO for your LabReports explain the following (3 points,1 for each question)
 *  1) what is functional interface
 *  2) how would your convert a class implementing functional interface to a lambda function
 *  3) for loops vs data processing pipelines
 */
public class StudentMetricProcessor {
  private final List<Student> students;

  public StudentMetricProcessor(List<Student> students) {
    this.students = students;
  }

  /**
   * TODO (carries 1 point)
   *
   * @return a list of student whose gpa is 4.0
   */
  public List<Student> studentsWithPerfectGpa() {
    return null;
  }

  /**
   * TODO (carries 1 point)
   *
   * @return a list of student whose gpa is < 2.85
   */
  public List<Student> studentWithGpaBelow2point85() {
    return null;
  }

  /**
   * TODO (carries 1 point)
   *
   * @return a list of all student names hint use map and s->s.getName()
   */
  public List<String> studentNames() {
    return null;
  }

  /**
   * TODO (carries 2 point)
   *
   * @return a list of redIds for all students whose gpa >= 3.0 && gpa <=3.5
   */
  public List<Long> studentRedIdsWithScoreBetweenAndInclusiveOf3point0and3point5() {
    return null;
  }

  /**
   * TODO (carries 2 point)
   *
   * @return a count of students whose gpa >=2.85 && gpa <=3.0, hit use the count method at end of stream instead of collect
   */
  public long countOfStudentsWithGpaBetweenAndInclusiveOf2point85and3point0() {
    return 0L;
  }
}
