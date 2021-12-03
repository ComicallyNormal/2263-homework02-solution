//package edu.isu.cs.cs2263.hw02;
//
//import javafx.scene.Parent;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.layout.StackPane;
//import javafx.stage.Stage;
//import org.junit.jupiter.api.Test;
//import org.testfx.framework.junit5.ApplicationTest;
//import static org.junit.jupiter.api.Assertions.*;
//
//// Import dependencies
//public class HelloWorldTest extends ApplicationTest {
//    private  App helloWorld;
//    @Override
//    public void start(Stage stage) throws Exception {
//       helloWorld = new App();
//       helloWorld.start(stage);
//        stage.setScene(helloWorld.getScene());
//        stage.show();
//        stage.toFront();
//    }
//
//    @Test
//    public void test_AppHasDepartmentLabel() {
//        Parent rootNode = helloWorld.getScene().getRoot();
//
//        //assertEquals()
//        Label label = from(rootNode).lookup(".label").query();
//       assertEquals("Departments: ", label.getText());
//    }
//}