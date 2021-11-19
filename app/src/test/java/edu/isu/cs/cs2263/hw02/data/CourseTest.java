package edu.isu.cs.cs2263.hw02;

import edu.isu.cs.cs2263.hw02.data.Course;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CourseTest {


    @Test void test_toString(){
        Course testCourse = new Course();
        Course testCourse2 = new Course("TEST","1234",2263,3);
        String testStr = testCourse2.toString();
        assertNotNull(testStr);

    }

    @Test void failTest(){

        assertTrue(1==1);
    }

}
