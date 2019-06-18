package sample;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;

public class Main extends Application {


    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("gitar hero");

        final Circle circ = new Circle(40, 40, 30);
        final Group root = new Group(circ);

        Scene scene = new Scene(root, 800, 400, Color.BEIGE);
        Canvas canvas = new Canvas(800, 400);
        scene.setFill(Color.BLACK);

        canvas.setOnMouseClicked(clickEvent -> {

            scene.setFill(Color.BLUE);
            });




        root.getChildren().add(canvas);


        primaryStage.setScene(scene);
        primaryStage.show();


    }


}