package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import static javafx.scene.paint.Color.*;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Création du d-cor
        Group root = new Group();

        // Placement du d-cor dans la scene + taille couleur de fond scene
        Scene scene = new Scene(root,600,300, TRANSPARENT);

        // Titre de la fenetre
        primaryStage.setTitle("Le bô dessin");

        // Création de la pokeball

        // Création d'un effet ombre
        DropShadow ombre = new DropShadow(); // Création d'une ombre
        ombre.setOffsetY(4.0);

        // Création du fond avec un dégradé

        // Dégradé linéeaire
        LinearGradient degrad = new LinearGradient(50, // start X
                50, // start Y
                70, // end X
                70, // end Y
                false, // proportional
                CycleMethod.REFLECT, // cycleMethod
                new Stop(0f, WHITESMOKE), new Stop(1.0f, LIGHTSKYBLUE));

        // Rectangle avec comme couleur le dégradé
        Rectangle fond = new Rectangle();
        fond.setX(0);
        fond.setY(0);
        fond.setWidth(600);
        fond.setHeight(300);
        fond.setFill(degrad);


        // Création du cercle principal
        Circle ball = new Circle(300,135,100);
        ball.setFill(INDIANRED); // Couleur remplissage du cercle
        ball.setStroke(BLACK); // Couleur contour du cercle
        ball.setStrokeWidth(5); // Largeur du contour
        ball.setEffect(ombre); // Ajout de l'effet ombre

        // Création du demi-cercle
        Arc arc = new Arc(); // Création d'un Arc
        arc.setCenterX(300.0f); // Début parametre de l'arc
        arc.setCenterY(135.0f);
        arc.setRadiusX(97.0f);
        arc.setRadiusY(97.0f); // Fin parametre
        arc.setStartAngle(180.0f); // angle de debut
        arc.setLength(180.0f); // angle de fin
        arc.setType(ArcType.ROUND); // Angle
        arc.setFill(WHITE); // Couleur


        // Création de la ligne centrale
        Line ligne = new Line(200,135,400,135);
        ligne.setStrokeWidth(5);


        // Création du deuxieme cercle
        Circle ball2 = new Circle(300,135,20);
        ball2.setFill(WHITE); // Couleur remplissage du cercle
        ball2.setStroke(BLACK); // Couleur contour du cercle
        ball2.setStrokeWidth(5); // Largeur du contour
        ball2.setEffect(ombre); // Ajout de l'effet ombre


        root.getChildren().addAll(fond, ball, arc, ligne, ball2);

        // Placement de la scene dans la fenetre
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
