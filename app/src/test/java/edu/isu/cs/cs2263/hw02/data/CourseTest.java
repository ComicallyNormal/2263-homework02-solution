package edu.isu.cs.cs2263.hw02.data;

import edu.isu.cs.cs2263.hw02.data.Course;
import org.junit.jupiter.api.Test;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;

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
