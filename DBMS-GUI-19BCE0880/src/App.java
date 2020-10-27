import java.io.FileInputStream;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.collections.FXCollections;

import java.sql.*;

public class App extends Application {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11,
            button12, button13, button14, button15, button16, button17, button18, button19, button20, button21,
            button22, button23, button24, button25, button26, button27, button28, button29, button30, button31,
            button32, button33, button34, button35, button36, button37, button38, button39, button40, button41,
            button42, button43, button44, button45, button46, button47, button48, button49, button50;

    @Override
    public void start(Stage primaryStage) {
        try {

            String url = "jdbc:mysql://127.0.0.1:3306/dalab";
            String un = "root";
            String pwd = "**********";
            try {
                Connection con = DriverManager.getConnection(url, un, pwd);
                System.out.println("Connection Successful");
                Statement st = con.createStatement();

                primaryStage.setTitle("College Management System");
                button1 = new Button();
                button1.setText("View Details");
                button1.setFont(new Font("Arial", 30));
                button2 = new Button();
                button2.setText("Change Details");
                button2.setFont(new Font("Arial", 30));
                button3 = new Button();
                button3.setText("Back");
                button3.setFont(new Font("Arial", 30));
                button4 = new Button();
                button4.setText("Back");
                button4.setFont(new Font("Arial", 30));
                button5 = new Button();
                button5.setText("Student Registration");
                button5.setFont(new Font("Arial", 30));
                button6 = new Button();
                button6.setText("Administration Registration");
                button6.setFont(new Font("Arial", 30));
                button7 = new Button();
                button7.setText("Get Student Details");
                button7.setFont(new Font("Arial", 30));
                button8 = new Button();
                button8.setText("Get College Details");
                button8.setFont(new Font("Arial", 30));
                button9 = new Button();
                button9.setText("Get Administration Board Details");
                button9.setFont(new Font("Arial", 30));
                button10 = new Button();
                button10.setText("Get HOD Details");
                button10.setFont(new Font("Arial", 30));
                button11 = new Button();
                button11.setText("Get Faculty Details");
                button11.setFont(new Font("Arial", 30));
                button12 = new Button();
                button12.setText("Get Maintenance Staff Details");
                button12.setFont(new Font("Arial", 30));
                button13 = new Button();
                button13.setText("Get College Infrastructure Details");
                button13.setFont(new Font("Arial", 30));
                button21 = new Button();
                button21.setText("Get Dean Details");
                button21.setFont(new Font("Arial", 30));
                button22 = new Button();
                button22.setText("Get Courses Available");
                button22.setFont(new Font("Arial", 30));
                button23 = new Button();
                button23.setText("Get Departments Available");
                button23.setFont(new Font("Arial", 30));
                button14 = new Button();
                button14.setText("Back");
                button14.setFont(new Font("Arial", 30));
                button15 = new Button();
                button15.setText("Back");
                button15.setFont(new Font("Arial", 30));
                button16 = new Button();
                button16.setText("Search");
                button16.setFont(new Font("Arial", 30));
                button17 = new Button();
                button17.setText("        Register        ");
                button17.setFont(new Font("Arial", 25));
                button18 = new Button();
                button18.setText("\tBack\t");
                button18.setFont(new Font("Arial", 25));
                button19 = new Button();
                button19.setText("\tLogin\t");
                button19.setFont(new Font("Arial", 30));
                button20 = new Button();
                button20.setText("\tBack\t");
                button20.setFont(new Font("Arial", 30));
                button24 = new Button();
                button24.setText("Administration Board Registration");
                button24.setFont(new Font("Arial", 30));
                button25 = new Button();
                button25.setText("Dean Registration");
                button25.setFont(new Font("Arial", 30));
                button26 = new Button();
                button26.setText("HOD Registration");
                button26.setFont(new Font("Arial", 30));
                button27 = new Button();
                button27.setText("Faculty Registration");
                button27.setFont(new Font("Arial", 30));
                button28 = new Button();
                button28.setText("Add New Department");
                button28.setFont(new Font("Arial", 30));
                button29 = new Button();
                button29.setText("Add New Course");
                button29.setFont(new Font("Arial", 30));
                button30 = new Button();
                button30.setText("Register Maintenance Staff");
                button30.setFont(new Font("Arial", 30));
                button31 = new Button();
                button31.setText("Add Building Detail");
                button31.setFont(new Font("Arial", 30));
                button32 = new Button();
                button32.setText("\tBack\t");
                button32.setFont(new Font("Arial", 30));
                button33 = new Button();
                button33.setText("        Register        ");
                button33.setFont(new Font("Arial", 25));
                button34 = new Button();
                button34.setText("\tBack\t");
                button34.setFont(new Font("Arial", 25));
                button35 = new Button();
                button35.setText("        Register        ");
                button35.setFont(new Font("Arial", 25));
                button36 = new Button();
                button36.setText("\tBack\t");
                button36.setFont(new Font("Arial", 25));
                button37 = new Button();
                button37.setText("        Register        ");
                button37.setFont(new Font("Arial", 25));
                button38 = new Button();
                button38.setText("\tBack\t");
                button38.setFont(new Font("Arial", 25));
                button39 = new Button();
                button39.setText("        Register        ");
                button39.setFont(new Font("Arial", 25));
                button40 = new Button();
                button40.setText("\tBack\t");
                button40.setFont(new Font("Arial", 25));
                button41 = new Button();
                button41.setText("        Register        ");
                button41.setFont(new Font("Arial", 25));
                button42 = new Button();
                button42.setText("\tBack\t");
                button42.setFont(new Font("Arial", 25));
                button43 = new Button();
                button43.setText("        Register        ");
                button43.setFont(new Font("Arial", 25));
                button44 = new Button();
                button44.setText("\tBack\t");
                button44.setFont(new Font("Arial", 25));
                button45 = new Button();
                button45.setText("        Register        ");
                button45.setFont(new Font("Arial", 25));
                button46 = new Button();
                button46.setText("\tBack\t");
                button46.setFont(new Font("Arial", 25));
                button47 = new Button();
                button47.setText("Add New Academic Building");
                button47.setFont(new Font("Arial", 30));
                button48 = new Button();
                button48.setText("Add New Hostel Building");
                button48.setFont(new Font("Arial", 30));
                button49 = new Button();
                button49.setText("Add New Shops");
                button49.setFont(new Font("Arial", 30));
                button50 = new Button();
                button50.setText("\tBack\t");
                button50.setFont(new Font("Arial", 30));

                TextField regno = new TextField();
                regno.setPromptText("Enter Registration number");
                regno.setFont(Font.font("Arial", 30));

                // HOME SCENE1

                VBox layout = new VBox(50);
                FileInputStream input = new FileInputStream(".\\background2.jpg");

                Image image = new Image(input);

                Label lable = new Label("COLLEGE MANAGEMENT SYSTEM");
                lable.setPadding(new Insets(100, 80, 150, 80));
                lable.setFont(new Font("Cambria bold", 50));
                lable.setTextFill(Color.WHITE);
                button1.setMinWidth(250);
                button2.setMinWidth(250);
                layout.getChildren().addAll(lable, button1, button2);

                BackgroundImage backgroundimage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT,
                        BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
                // create Background
                Background background = new Background(backgroundimage);

                // set background
                layout.setBackground(background);
                layout.setAlignment(Pos.TOP_CENTER);

                // VIEWING PART

                // SCENE VIEW CHOICE SCENE2

                VBox layout1 = new VBox(50);
                Label lable1 = new Label("View Details");
                lable1.setPadding(new Insets(50));
                lable1.setFont(new Font("Cambria bold", 50));
                lable1.setTextFill(Color.WHITE);
                button7.setMinWidth(400);
                button8.setMinWidth(400);
                layout1.getChildren().addAll(lable1, button7, button8, button3);
                layout1.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_fill1 = new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background background1 = new Background(background_fill1);

                // set background
                layout1.setBackground(background1);

                // SCENE3 ADMIN LOGIN

                PasswordField adp = new PasswordField();
                adp.setPromptText("Administration PIN");
                adp.setFont(Font.font("Arial", 25));

                BorderPane bp3 = new BorderPane();
                HBox hb1 = new HBox();
                bp3.setTop(hb1);
                GridPane layout6 = new GridPane();
                bp3.setCenter(layout6);
                layout6.setPadding(new Insets(10, 10, 10, 10));
                layout6.setVgap(30);
                layout6.setHgap(30);
                Label lable19 = new Label("Enter 4-digit Administration PIN:");
                lable19.setPadding(new Insets(30));
                lable19.setFont(new Font("Arial", 30));
                lable19.setTextFill(Color.WHITE);
                Label lable18 = new Label("ADMINISTRATOR LOGIN");
                lable18.setPadding(new Insets(50));
                lable18.setFont(new Font("Cambria bold", 50));
                lable18.setTextFill(Color.WHITE);
                GridPane.setConstraints(lable19, 0, 1);
                GridPane.setConstraints(adp, 1, 1);
                GridPane.setConstraints(button19, 1, 3);
                GridPane.setConstraints(button20, 0, 3);
                hb1.setAlignment(Pos.CENTER);
                hb1.getChildren().addAll(lable18);
                layout6.getChildren().addAll(lable19, adp, button19, button20);
                layout6.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_fill6 = new BackgroundFill(Color.GREY, CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background background6 = new Background(background_fill6);

                // set background
                bp3.setBackground(background6);

                // SCENE7 REGISTRATION CHOICE

                VBox layout2 = new VBox(50);
                Label lable2 = new Label("REGISTRATION");
                lable2.setPadding(new Insets(50));
                lable2.setFont(new Font("Cambria bold", 50));
                lable2.setTextFill(Color.WHITE);
                button5.setMinWidth(400);
                button6.setMinWidth(400);
                layout2.getChildren().addAll(lable2, button5, button6, button4);
                layout2.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_fill2 = new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background background2 = new Background(background_fill2);

                // set background
                layout2.setBackground(background2);

                // GET COLLEGE DETAILS SCENE4

                BorderPane bp4 = new BorderPane();
                HBox hb3 = new HBox();
                bp4.setTop(hb3);
                HBox hb4 = new HBox();
                bp4.setBottom(hb4);
                GridPane layout3 = new GridPane();
                bp4.setCenter(layout3);
                layout3.setPadding(new Insets(10));
                layout3.setVgap(70);
                layout3.setHgap(60);
                Label lable3 = new Label("GET COLLEGE DETAILS");
                lable3.setPadding(new Insets(30));
                lable3.setFont(new Font("Cambria bold", 50));
                lable3.setTextFill(Color.WHITE);
                hb3.setAlignment(Pos.CENTER);
                hb3.getChildren().addAll(lable3);
                hb4.setPadding(new Insets(0, 0, 100, 0));
                hb4.setAlignment(Pos.TOP_CENTER);
                hb4.getChildren().addAll(button14);

                button9.setMaxWidth(500);
                button10.setMaxWidth(500);
                button11.setMaxWidth(500);
                button12.setMaxWidth(500);
                button13.setMaxWidth(500);
                button21.setMinWidth(500);
                button22.setMinWidth(500);
                button23.setMinWidth(500);

                GridPane.setConstraints(button9, 0, 0);
                GridPane.setConstraints(button10, 0, 1);
                GridPane.setConstraints(button11, 1, 1);
                GridPane.setConstraints(button12, 0, 3);
                GridPane.setConstraints(button13, 1, 3);
                GridPane.setConstraints(button21, 1, 0);
                GridPane.setConstraints(button22, 1, 2);
                GridPane.setConstraints(button23, 0, 2);

                layout3.getChildren().addAll(button9, button10, button11, button12, button13, button21, button22,
                        button23);
                layout3.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_fill3 = new BackgroundFill(Color.MIDNIGHTBLUE, CornerRadii.EMPTY,
                        Insets.EMPTY);

                // create Background
                Background background3 = new Background(background_fill3);

                // set background
                bp4.setBackground(background3);

// SCENE 5 STUDENT SEARCH

                BorderPane bp = new BorderPane();
                HBox hb = new HBox();
                bp.setTop(hb);
                GridPane layout4 = new GridPane();
                bp.setCenter(layout4);
                layout4.setPadding(new Insets(10, 10, 10, 10));
                layout4.setVgap(30);
                layout4.setHgap(30);
                Label lable4 = new Label("Enter Registration No.");
                lable4.setPadding(new Insets(30));
                lable4.setFont(new Font("Arial", 30));
                lable4.setTextFill(Color.BLACK);
                Label lable5 = new Label("STUDENT DETAILS");
                lable5.setPadding(new Insets(100, 0, 100, 0));
                lable5.setFont(new Font("Cambria bold", 50));
                lable5.setTextFill(Color.WHITE);
                GridPane.setConstraints(lable4, 0, 1);
                GridPane.setConstraints(regno, 1, 1);
                GridPane.setConstraints(button16, 2, 1);
                GridPane.setConstraints(button15, 1, 2);
                hb.setAlignment(Pos.CENTER);
                hb.getChildren().addAll(lable5);
                layout4.getChildren().addAll(lable4, regno, button16, button15);
                layout4.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_fill4 = new BackgroundFill(Color.GREY, CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background background4 = new Background(background_fill4);

                // set background
                bp.setBackground(background4);

                // SCENE 6 STUDENT DETAILS REGISTRATION

                BorderPane bp2 = new BorderPane();
                HBox hb2 = new HBox();
                bp2.setTop(hb2);
                GridPane layout5 = new GridPane();
                bp2.setCenter(layout5);
                layout5.setPadding(new Insets(10));
                layout5.setVgap(30);
                layout5.setHgap(20);
                Label lable6 = new Label("ENTER DETAILS");
                lable6.setPadding(new Insets(40));
                lable6.setFont(new Font("Cambria bold", 50));
                lable6.setTextFill(Color.BLACK);

                Label lable7 = new Label("Name:");
                lable7.setFont(new Font("Arial bold", 25));
                TextField name = new TextField();
                name.setPromptText("Name");
                name.setFont(Font.font("Arial", 25));

                Label lable8 = new Label("Registration Number (yy dept. 4 digits):");
                lable8.setFont(new Font("Arial bold", 25));
                TextField regnum = new TextField();
                regnum.setPromptText("eg. 19BCE0001");
                regnum.setFont(Font.font("Arial", 25));

                Label lable9 = new Label("Age:");
                lable9.setFont(new Font("Arial bold", 25));
                TextField age = new TextField();
                age.setPromptText("Age");
                age.setFont(Font.font("Arial", 25));

                Label lable10 = new Label("Hostel Type (Hosteller/Day Scholar):");
                lable10.setFont(new Font("Arial bold", 25));
                TextField hostp = new TextField();
                hostp.setPromptText("Hostel Type");
                hostp.setFont(Font.font("Arial", 25));

                Label lable11 = new Label("Phone Number:");
                lable11.setFont(new Font("Arial bold", 25));
                TextField phone = new TextField();
                phone.setPromptText("Phone Number");
                phone.setFont(Font.font("Arial", 25));

                Label lable12 = new Label("Department:");
                lable12.setFont(new Font("Arial bold", 25));
                TextField dep = new TextField();
                dep.setPromptText("Department");
                dep.setFont(Font.font("Arial", 25));

                Label lable13 = new Label("Hostel Block:");
                lable13.setFont(new Font("Arial bold", 25));
                TextField hosb = new TextField();
                hosb.setPromptText("Hostel Block");
                hosb.setFont(Font.font("Arial", 25));

                Label lable14 = new Label("Guardian Name:");
                lable14.setFont(new Font("Arial bold", 25));
                TextField gname = new TextField();
                gname.setPromptText("Name");
                gname.setFont(Font.font("Arial", 25));

                Label lable15 = new Label("Guardian Age:");
                lable15.setFont(new Font("Arial bold", 25));
                TextField gage = new TextField();
                gage.setPromptText("Age");
                gage.setFont(Font.font("Arial", 25));

                Label lable16 = new Label("Guardian Phone Number:");
                lable16.setFont(new Font("Arial bold", 25));
                TextField gphone = new TextField();
                gphone.setPromptText("Phone Number");
                gphone.setFont(Font.font("Arial", 25));

                Label lable17 = new Label("Relation with Student:");
                lable17.setFont(new Font("Arial bold", 25));
                TextField rel = new TextField();
                rel.setPromptText("Relation with Student");
                rel.setFont(Font.font("Arial", 25));

                Label lable20 = new Label("Students Email ID:");
                lable20.setFont(new Font("Arial bold", 25));
                Label lable21 = new Label("Auto-Generated");
                lable21.setFont(new Font("Arial bold", 17));

                GridPane.setConstraints(lable7, 0, 0);
                GridPane.setConstraints(name, 1, 0);
                GridPane.setConstraints(lable8, 0, 1);
                GridPane.setConstraints(regnum, 1, 1);
                GridPane.setConstraints(lable9, 0, 2);
                GridPane.setConstraints(age, 1, 2);
                GridPane.setConstraints(lable10, 0, 3);
                GridPane.setConstraints(hostp, 1, 3);
                GridPane.setConstraints(lable11, 0, 4);
                GridPane.setConstraints(phone, 1, 4);
                GridPane.setConstraints(lable12, 0, 5);
                GridPane.setConstraints(dep, 1, 5);
                GridPane.setConstraints(lable13, 2, 0);
                GridPane.setConstraints(hosb, 3, 0);
                GridPane.setConstraints(lable14, 2, 1);
                GridPane.setConstraints(gname, 3, 1);
                GridPane.setConstraints(lable15, 2, 2);
                GridPane.setConstraints(gage, 3, 2);
                GridPane.setConstraints(lable16, 2, 3);
                GridPane.setConstraints(gphone, 3, 3);
                GridPane.setConstraints(lable17, 2, 4);
                GridPane.setConstraints(rel, 3, 4);
                GridPane.setConstraints(lable20, 2, 5);
                GridPane.setConstraints(lable21, 3, 5);
                GridPane.setConstraints(button17, 1, 6);
                GridPane.setConstraints(button18, 2, 6);

                hb2.setAlignment(Pos.CENTER);
                hb2.getChildren().addAll(lable6);
                layout5.getChildren().addAll(lable7, name, lable8, regnum, lable9, age, lable10, hostp, lable11, phone,
                        lable12, dep, lable13, hosb, lable14, gname, lable15, gage, lable16, gphone, lable17, rel,
                        lable20, lable21, button17, button18);
                layout5.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_fill5 = new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background background5 = new Background(background_fill5);

                // set background
                bp2.setBackground(background5);

// SCENE 8 COLLEGE DETAILS CHOICE

                BorderPane bp5 = new BorderPane();
                HBox hb5 = new HBox();
                bp5.setTop(hb5);
                HBox hb6 = new HBox();
                bp5.setBottom(hb6);
                GridPane layout7 = new GridPane();
                bp5.setCenter(layout7);
                layout7.setPadding(new Insets(10));
                layout7.setVgap(70);
                layout7.setHgap(60);
                Label lable22 = new Label("COLLEGE DETAILS REGISTRATION");
                lable22.setPadding(new Insets(30));
                lable22.setFont(new Font("Cambria bold", 50));
                lable22.setTextFill(Color.WHITE);
                hb5.setAlignment(Pos.CENTER);
                hb5.getChildren().addAll(lable22);
                hb6.setPadding(new Insets(0, 0, 100, 0));
                hb6.setAlignment(Pos.TOP_CENTER);
                hb6.getChildren().addAll(button32);

                button24.setMaxWidth(500);
                button25.setMaxWidth(500);
                button26.setMaxWidth(500);
                button27.setMaxWidth(500);
                button28.setMaxWidth(500);
                button29.setMinWidth(500);
                button30.setMinWidth(500);
                button31.setMinWidth(500);

                GridPane.setConstraints(button24, 0, 0);
                GridPane.setConstraints(button25, 1, 0);
                GridPane.setConstraints(button26, 0, 1);
                GridPane.setConstraints(button27, 1, 1);
                GridPane.setConstraints(button28, 0, 2);
                GridPane.setConstraints(button29, 1, 2);
                GridPane.setConstraints(button30, 0, 3);
                GridPane.setConstraints(button31, 1, 3);

                layout7.getChildren().addAll(button24, button25, button26, button27, button28, button29, button30,
                        button31);
                layout7.setAlignment(Pos.TOP_CENTER);

                BackgroundFill background_fill7 = new BackgroundFill(Color.MIDNIGHTBLUE, CornerRadii.EMPTY,
                        Insets.EMPTY);

                // create Background
                Background background7 = new Background(background_fill7);

                // set background
                bp5.setBackground(background7);

                // SCENE AB REG

                BorderPane bp6 = new BorderPane();
                HBox hb7 = new HBox();
                bp6.setTop(hb7);
                GridPane layout8 = new GridPane();
                bp6.setCenter(layout8);
                layout8.setPadding(new Insets(10));
                layout8.setVgap(50);
                layout8.setHgap(50);

                Label lable23 = new Label("Administration Board Member");
                lable23.setPadding(new Insets(40));
                lable23.setFont(new Font("Cambria bold", 50));
                lable23.setTextFill(Color.BLACK);

                Label lable24 = new Label("Name:");
                lable24.setFont(new Font("Arial bold", 25));
                TextField abname = new TextField();
                abname.setPromptText("Name");
                abname.setFont(Font.font("Arial", 25));

                Label lable25 = new Label("Age:");
                lable25.setFont(new Font("Arial bold", 25));
                TextField abage = new TextField();
                abage.setPromptText("Age");
                abage.setFont(Font.font("Arial", 25));

                Label lable26 = new Label("Phone Number:");
                lable26.setFont(new Font("Arial bold", 25));
                TextField abphone = new TextField();
                abphone.setPromptText("Phone Number");
                abphone.setFont(Font.font("Arial", 25));

                Label lable27 = new Label("Designation:");
                lable27.setFont(new Font("Arial bold", 25));
                TextField dsg = new TextField();
                dsg.setPromptText("Designation");
                dsg.setFont(Font.font("Arial", 25));

                Label lable28 = new Label("Adminstrator Email ID:");
                lable28.setFont(new Font("Arial bold", 25));
                Label lable29 = new Label("Auto-Generated");
                lable29.setFont(new Font("Arial bold", 25));

                GridPane.setConstraints(lable24, 0, 0);
                GridPane.setConstraints(abname, 1, 0);
                GridPane.setConstraints(lable25, 0, 1);
                GridPane.setConstraints(abage, 1, 1);
                GridPane.setConstraints(lable26, 0, 2);
                GridPane.setConstraints(abphone, 1, 2);
                GridPane.setConstraints(lable27, 0, 3);
                GridPane.setConstraints(dsg, 1, 3);
                GridPane.setConstraints(lable28, 0, 4);
                GridPane.setConstraints(lable29, 1, 4);
                GridPane.setConstraints(button33, 0, 5);
                GridPane.setConstraints(button34, 1, 5);

                button33.setMinWidth(400);
                button34.setMinWidth(400);

                hb7.setAlignment(Pos.CENTER);
                hb7.getChildren().addAll(lable23);
                layout8.getChildren().addAll(lable24, abname, lable25, abage, lable26, abphone, lable27, dsg, lable28,
                        lable29, button33, button34);
                layout8.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_fill8 = new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background background8 = new Background(background_fill8);

                // set background
                bp6.setBackground(background8);

                
                // SCENE DEAN REG

                BorderPane bp7 = new BorderPane();
                HBox hb8 = new HBox();
                bp7.setTop(hb8);
                GridPane layout9 = new GridPane();
                bp7.setCenter(layout9);
                layout9.setPadding(new Insets(10));
                layout9.setVgap(50);
                layout9.setHgap(50);

                Label lable30 = new Label("Dean Registration");
                lable30.setPadding(new Insets(40));
                lable30.setFont(new Font("Cambria bold", 50));
                lable30.setTextFill(Color.BLACK);

                Label lable31 = new Label("Name:");
                lable31.setFont(new Font("Arial bold", 25));
                TextField dename = new TextField();
                dename.setPromptText("Name");
                dename.setFont(Font.font("Arial", 25));

                Label lable32 = new Label("Age:");
                lable32.setFont(new Font("Arial bold", 25));
                TextField deage = new TextField();
                deage.setPromptText("Age");
                deage.setFont(Font.font("Arial", 25));

                Label lable33 = new Label("Department ID:");
                lable33.setFont(new Font("Arial bold", 25));
                TextField dedep = new TextField();
                dedep.setPromptText("3 Character ID eg.CSE");
                dedep.setFont(Font.font("Arial", 25));

                Label lable34 = new Label("Phone Number:");
                lable34.setFont(new Font("Arial bold", 25));
                TextField dephone = new TextField();
                dephone.setPromptText("Phone Number");
                dephone.setFont(Font.font("Arial", 25));

                Label lable35 = new Label("Dean Email ID:");
                lable35.setFont(new Font("Arial bold", 25));
                Label lable36 = new Label("Auto-Generated");
                lable36.setFont(new Font("Arial bold", 25));

                GridPane.setConstraints(lable31, 0, 0);
                GridPane.setConstraints(dename, 1, 0);
                GridPane.setConstraints(lable32, 0, 1);
                GridPane.setConstraints(deage, 1, 1);
                GridPane.setConstraints(lable33, 0, 2);
                GridPane.setConstraints(dedep, 1, 2);
                GridPane.setConstraints(lable34, 0, 3);
                GridPane.setConstraints(dephone, 1, 3);
                GridPane.setConstraints(lable35, 0, 4);
                GridPane.setConstraints(lable36, 1, 4);
                GridPane.setConstraints(button35, 0, 5);
                GridPane.setConstraints(button36, 1, 5);

                button35.setMinWidth(400);
                button36.setMinWidth(400);

                hb8.setAlignment(Pos.CENTER);
                hb8.getChildren().addAll(lable30);
                layout9.getChildren().addAll(lable31, dename, lable32, deage, lable33, dedep, lable34, dephone, lable35,
                        lable36, button35, button36);
                layout9.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_fill9 = new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background background9 = new Background(background_fill9);

                // set background
                bp7.setBackground(background9);

                

                // SCENE HOD REG

                BorderPane bp8 = new BorderPane();
                HBox hb9 = new HBox();
                bp8.setTop(hb9);
                GridPane layout10 = new GridPane();
                bp8.setCenter(layout10);
                layout10.setPadding(new Insets(10));
                layout10.setVgap(30);
                layout10.setHgap(30);

                Label lable37 = new Label("HOD Registration");
                lable37.setPadding(new Insets(40));
                lable37.setFont(new Font("Cambria bold", 50));
                lable37.setTextFill(Color.BLACK);

                Label lable38 = new Label("Name:");
                lable38.setFont(new Font("Arial bold", 25));
                TextField hodname = new TextField();
                hodname.setPromptText("Name");
                hodname.setFont(Font.font("Arial", 25));

                Label lable39 = new Label("Age:");
                lable39.setFont(new Font("Arial bold", 25));
                TextField hodage = new TextField();
                hodage.setPromptText("Age");
                hodage.setFont(Font.font("Arial", 25));

                Label lable40 = new Label("Course ID:");
                lable40.setFont(new Font("Arial bold", 25));
                TextField hodcrs = new TextField();
                hodcrs.setPromptText("Course ID eg.CSE0001");
                hodcrs.setFont(Font.font("Arial", 25));

                Label lable41 = new Label("Phone Number:");
                lable41.setFont(new Font("Arial bold", 25));
                TextField hodphone = new TextField();
                hodphone.setPromptText("Phone Number");
                hodphone.setFont(Font.font("Arial", 25));

                Label lable42 = new Label("HOD Email ID:");
                lable42.setFont(new Font("Arial bold", 25));
                Label lable43 = new Label("Auto-Generated");
                lable43.setFont(new Font("Arial bold", 25));

                Label lable44 = new Label("Salary:");
                lable44.setFont(new Font("Arial bold", 25));
                Label lable45 = new Label("Auto-Generated");
                lable45.setFont(new Font("Arial bold", 25));

                Label lable56 = new Label("HOD ID:");
                lable56.setFont(new Font("Arial bold", 25));
                Label hodregnum = new Label();
                hodregnum.setText("Auto-Generated");
                hodregnum.setFont(Font.font("Arial Bold", 25));

                GridPane.setConstraints(lable38, 0, 0);
                GridPane.setConstraints(hodname, 1, 0);
                GridPane.setConstraints(lable39, 0, 1);
                GridPane.setConstraints(hodage, 1, 1);
                GridPane.setConstraints(lable40, 0, 2);
                GridPane.setConstraints(hodcrs, 1, 2);
                GridPane.setConstraints(lable41, 0, 3);
                GridPane.setConstraints(hodphone, 1, 3);
                GridPane.setConstraints(lable56, 0, 4);
                GridPane.setConstraints(hodregnum, 1,4);
                GridPane.setConstraints(lable42, 0, 5);
                GridPane.setConstraints(lable43, 1, 5);
                GridPane.setConstraints(lable44, 0, 6);
                GridPane.setConstraints(lable45, 1, 6);
                GridPane.setConstraints(button37, 0, 7);
                GridPane.setConstraints(button38, 1, 7);
                

                button37.setMinWidth(400);
                button38.setMinWidth(400);

                hb9.setAlignment(Pos.CENTER);
                hb9.getChildren().addAll(lable37);
                layout10.getChildren().addAll(lable38, hodname, lable56, hodregnum, lable39, hodage, lable40, hodcrs,
                        lable41, hodphone, lable42, lable43, lable44, lable45, button37, button38);
                layout10.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_fill10 = new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background background10 = new Background(background_fill10);

                // set background
                bp8.setBackground(background10);

                // SCENE FAC REG

                BorderPane bp9 = new BorderPane();
                HBox hb10 = new HBox();
                bp9.setTop(hb10);
                GridPane layout11 = new GridPane();
                bp9.setCenter(layout11);
                layout11.setPadding(new Insets(10));
                layout11.setVgap(25);
                layout11.setHgap(30);

                Label lable46 = new Label("Faculty Registration");
                lable46.setPadding(new Insets(40));
                lable46.setFont(new Font("Cambria bold", 50));
                lable46.setTextFill(Color.BLACK);

                Label lable47 = new Label("Name:");
                lable47.setFont(new Font("Arial bold", 25));
                TextField fname = new TextField();
                fname.setPromptText("Name");
                fname.setFont(Font.font("Arial", 25));

                Label lable48 = new Label("Age:");
                lable48.setFont(new Font("Arial bold", 25));
                TextField fage = new TextField();
                fage.setPromptText("Age");
                fage.setFont(Font.font("Arial", 25));

                Label lable49 = new Label("Department ID:");
                lable49.setFont(new Font("Arial bold", 25));
                TextField fdep = new TextField();
                fdep.setPromptText("Department ID");
                fdep.setFont(Font.font("Arial", 25));

                Label lable50 = new Label("Phone Number:");
                lable50.setFont(new Font("Arial bold", 25));
                TextField fphone = new TextField();
                fphone.setPromptText("Phone Number");
                fphone.setFont(Font.font("Arial", 25));

                Label lable51 = new Label("Faculty Email ID:");
                lable51.setFont(new Font("Arial bold", 25));
                Label lable52 = new Label("Auto-Generated");
                lable52.setFont(new Font("Arial bold", 25));

                Label lable53 = new Label("Salary:");
                lable53.setFont(new Font("Arial bold", 25));
                Label lable54 = new Label("Auto-Generated");
                lable54.setFont(new Font("Arial bold", 25));

                Label lable55 = new Label("Faculty ID (F-4 Digit Number):");
                lable55.setFont(new Font("Arial bold", 25));
                TextField fregnum = new TextField();
                fregnum.setPromptText("(Format F-4 digit no.) eg. F-1234");
                fregnum.setFont(Font.font("Arial", 25));

                Label lable70 = new Label("Designation:");
                lable70.setFont(new Font("Arial bold", 25));
                TextField fdsg = new TextField();
                fdsg.setPromptText("Designation");
                fdsg.setFont(Font.font("Arial", 25));

                GridPane.setConstraints(lable47, 0, 0);
                GridPane.setConstraints(fname, 1, 0);
                GridPane.setConstraints(lable48, 0, 2);
                GridPane.setConstraints(fage, 1, 2);
                GridPane.setConstraints(lable49, 0, 3);
                GridPane.setConstraints(fdep, 1, 3);
                GridPane.setConstraints(lable50, 0, 4);
                GridPane.setConstraints(fphone, 1, 4);
                GridPane.setConstraints(lable51, 0, 6);
                GridPane.setConstraints(lable52, 1, 6);
                GridPane.setConstraints(lable53, 0, 7);
                GridPane.setConstraints(lable54, 1, 7);
                GridPane.setConstraints(lable55, 0, 1);
                GridPane.setConstraints(fregnum, 1, 1);
                GridPane.setConstraints(lable70, 0, 5);
                GridPane.setConstraints(fdsg, 1, 5);
                GridPane.setConstraints(button39, 0, 8);
                GridPane.setConstraints(button40, 1, 8);

                button39.setMinWidth(400);
                button40.setMinWidth(400);

                hb10.setAlignment(Pos.CENTER);
                hb10.getChildren().addAll(lable46);
                layout11.getChildren().addAll(lable47, fname, lable55, fregnum, lable48, fage, lable49, fdep, lable50,
                        fphone, lable51, lable52, lable53, lable54, lable70, fdsg, button39, button40);
                layout11.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_fill11 = new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background background11 = new Background(background_fill11);

                // set background
                bp9.setBackground(background11);

                // SCENE NEW DEP

                BorderPane bp10 = new BorderPane();
                HBox hb11 = new HBox();
                bp10.setTop(hb11);
                GridPane layout12 = new GridPane();
                bp10.setCenter(layout12);
                layout12.setPadding(new Insets(10));
                layout12.setVgap(50);
                layout12.setHgap(50);
                Label lable57 = new Label("New Department");
                lable57.setPadding(new Insets(40));
                lable57.setFont(new Font("Cambria bold", 50));
                lable57.setTextFill(Color.BLACK);

                Label lable58 = new Label("Department Name:");
                lable58.setFont(new Font("Arial bold", 25));
                TextField depname = new TextField();
                depname.setPromptText("Department Name");
                depname.setFont(Font.font("Arial", 25));

                Label lable59 = new Label("Department ID:");
                lable59.setFont(new Font("Arial bold", 25));
                TextField depID = new TextField();
                depID.setPromptText("3 Character ID eg.CSE");
                depID.setFont(Font.font("Arial", 25));

                GridPane.setConstraints(lable58, 0, 0);
                GridPane.setConstraints(depname, 1, 0);
                GridPane.setConstraints(lable59, 0, 1);
                GridPane.setConstraints(depID, 1, 1);
                GridPane.setConstraints(button41, 0, 2);
                GridPane.setConstraints(button42, 1, 2);

                button41.setMinWidth(400);
                button42.setMinWidth(400);

                hb11.setAlignment(Pos.CENTER);
                hb11.getChildren().addAll(lable57);
                layout12.getChildren().addAll(lable58, depname, lable59, depID, button41, button42);
                layout12.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_fill12 = new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background background12 = new Background(background_fill12);

                // set background
                bp10.setBackground(background12);

                // SCENECRS NEW CRS

                BorderPane bp11 = new BorderPane();
                HBox hb12 = new HBox();
                bp11.setTop(hb12);
                GridPane layout13 = new GridPane();
                bp11.setCenter(layout13);
                layout13.setPadding(new Insets(10));
                layout13.setVgap(50);
                layout13.setHgap(50);
                Label lable60 = new Label("New Course");
                lable60.setPadding(new Insets(40));
                lable60.setFont(new Font("Cambria bold", 50));
                lable60.setTextFill(Color.BLACK);

                Label lable61 = new Label("Course Name:");
                lable61.setFont(new Font("Arial bold", 25));
                TextField crsname = new TextField();
                crsname.setPromptText("Course Name");
                crsname.setFont(Font.font("Arial", 25));

                Label lable62 = new Label("Course ID:");
                lable62.setFont(new Font("Arial bold", 25));
                TextField crsID = new TextField();
                crsID.setPromptText("dept.4-digit eg.CSE0001 ");
                crsID.setFont(Font.font("Arial", 25));

                Label lablec = new Label("Course Credits:");
                lablec.setFont(new Font("Arial bold", 25));
                TextField crscdt = new TextField();
                crscdt.setPromptText("Number of Credits");
                crscdt.setFont(Font.font("Arial", 25));

                GridPane.setConstraints(lable61, 0, 0);
                GridPane.setConstraints(crsname, 1, 0);
                GridPane.setConstraints(lable62, 0, 1);
                GridPane.setConstraints(crsID, 1, 1);
                GridPane.setConstraints(lablec, 0, 2);
                GridPane.setConstraints(crscdt, 1, 2);
                GridPane.setConstraints(button43, 0, 3);
                GridPane.setConstraints(button44, 1, 3);

                button43.setMinWidth(400);
                button44.setMinWidth(400);

                hb12.setAlignment(Pos.CENTER);
                hb12.getChildren().addAll(lable60);
                layout13.getChildren().addAll(lable61, crsname, lable62, crsID,lablec,crscdt, button43, button44);
                layout13.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_fill13 = new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background background13 = new Background(background_fill13);

                // set background
                bp11.setBackground(background13);

                // SCENEMTS MTS

                BorderPane bp12 = new BorderPane();
                HBox hb13 = new HBox();
                bp12.setTop(hb13);
                GridPane layout14 = new GridPane();
                bp12.setCenter(layout14);
                layout14.setPadding(new Insets(10));
                layout14.setVgap(30);
                layout14.setHgap(30);

                Label lable63 = new Label("Maintenance Staff Registration");
                lable63.setPadding(new Insets(40));
                lable63.setFont(new Font("Cambria bold", 50));
                lable63.setTextFill(Color.BLACK);

                Label lable64 = new Label("Name:");
                lable64.setFont(new Font("Arial bold", 25));
                TextField mtname = new TextField();
                mtname.setPromptText("Name");
                mtname.setFont(Font.font("Arial", 25));

                Label lable65 = new Label("Employee ID (M-4 Digit Number):");
                lable65.setFont(new Font("Arial bold", 25));
                TextField mtregnum = new TextField();
                mtregnum.setPromptText("Format M-4 digit no. eg. M-1234");
                mtregnum.setFont(Font.font("Arial", 25));

                Label lable66 = new Label("Age:");
                lable66.setFont(new Font("Arial bold", 25));
                TextField mtage = new TextField();
                mtage.setPromptText("Age");
                mtage.setFont(Font.font("Arial", 25));

                Label lable67 = new Label("Workplace:");
                lable67.setFont(new Font("Arial bold", 25));
                TextField mtbul = new TextField();
                mtbul.setPromptText("Academic Building Name");
                mtbul.setFont(Font.font("Arial", 25));

                Label lable68 = new Label("Phone Number:");
                lable68.setFont(new Font("Arial bold", 25));
                TextField mtphone = new TextField();
                mtphone.setPromptText("Phone Number");
                mtphone.setFont(Font.font("Arial", 25));

                Label lable69 = new Label("Salary:");
                lable69.setFont(new Font("Arial bold", 25));
                Label lable71 = new Label("Auto-Generated");
                lable71.setFont(new Font("Arial bold", 25));

                Label lable72 = new Label("Designation:");
                lable72.setFont(new Font("Arial bold", 25));
                TextField mtdsg = new TextField();
                mtdsg.setPromptText("Designation");
                mtdsg.setFont(Font.font("Arial", 25));

                GridPane.setConstraints(lable64, 0, 0);
                GridPane.setConstraints(mtname, 1, 0);
                GridPane.setConstraints(lable65, 0, 1);
                GridPane.setConstraints(mtregnum, 1, 1);
                GridPane.setConstraints(lable66, 0, 2);
                GridPane.setConstraints(mtage, 1, 2);
                GridPane.setConstraints(lable67, 0, 3);
                GridPane.setConstraints(mtbul, 1, 3);
                GridPane.setConstraints(lable68, 0, 4);
                GridPane.setConstraints(mtphone, 1, 4);
                GridPane.setConstraints(lable72, 0, 5);
                GridPane.setConstraints(mtdsg, 1, 5);
                GridPane.setConstraints(lable69, 0, 6);
                GridPane.setConstraints(lable71, 1, 6);
                GridPane.setConstraints(button45, 0, 7);
                GridPane.setConstraints(button46, 1, 7);

                button45.setMinWidth(400);
                button46.setMinWidth(400);

                hb13.setAlignment(Pos.CENTER);
                hb13.getChildren().addAll(lable63);
                layout14.getChildren().addAll(lable64, mtname, lable65, mtregnum, lable66, mtage, lable67, mtbul,
                        lable68, mtphone, lable72, mtdsg, lable69, lable71, button45, button46);
                layout14.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_fill14 = new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background background14 = new Background(background_fill14);

                // set background
                bp12.setBackground(background14);

                // SCENE BUILDING CHOICE

                button47.setMinWidth(500);
                button48.setMinWidth(500);
                button49.setMinWidth(500);

                VBox layout15 = new VBox(50);
                Label lable73 = new Label("Building Details");
                lable73.setPadding(new Insets(50));
                lable73.setFont(new Font("Cambria bold", 50));
                lable73.setTextFill(Color.WHITE);
                layout15.getChildren().addAll(lable73, button47, button48, button49, button50);
                layout15.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_fill15 = new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background background15 = new Background(background_fill15);

                // set background
                layout15.setBackground(background15);

                // SCENEACB REGIS

                BorderPane bp13 = new BorderPane();
                HBox hb14 = new HBox();
                bp13.setTop(hb14);
                GridPane layout16 = new GridPane();
                bp13.setCenter(layout16);
                layout16.setPadding(new Insets(10));
                layout16.setVgap(50);
                layout16.setHgap(50);

                Label lable74 = new Label("Academic Building Details");
                lable74.setPadding(new Insets(40));
                lable74.setFont(new Font("Cambria bold", 50));
                lable74.setTextFill(Color.BLACK);

                Label lable75 = new Label("Building Name:");
                lable75.setFont(new Font("Arial bold", 25));
                TextField bname = new TextField();
                bname.setPromptText("Building Name");
                bname.setFont(Font.font("Arial", 25));

                Label lable76 = new Label("Building ID:");
                lable76.setFont(new Font("Arial bold", 25));
                Label bID = new Label("Auto-Generated");
                bID.setFont(new Font("Arial Bold", 25));

                Label lable77 = new Label("Department Allocated:");
                lable77.setFont(new Font("Arial bold", 25));
                TextField bdep = new TextField();
                bdep.setPromptText("Department Allocated");
                bdep.setFont(Font.font("Arial", 25));

                Label lable78 = new Label("Number of Floors:");
                lable78.setFont(new Font("Arial bold", 25));
                TextField bflr = new TextField();
                bflr.setPromptText("Number of Floors");
                bflr.setFont(Font.font("Arial", 25));
                Button button51, button52;
                button51 = new Button();
                button51.setText("Add Building");
                button51.setFont(new Font("Arial", 30));
                button52 = new Button();
                button52.setText("Back");
                button52.setFont(new Font("Arial", 30));
                GridPane.setConstraints(lable75, 0, 0);
                GridPane.setConstraints(bname, 1, 0);
                GridPane.setConstraints(lable76, 0, 1);
                GridPane.setConstraints(bID, 1, 1);
                GridPane.setConstraints(lable77, 0, 2);
                GridPane.setConstraints(bdep, 1, 2);
                GridPane.setConstraints(lable78, 0, 3);
                GridPane.setConstraints(bflr, 1, 3);
                GridPane.setConstraints(button51, 0, 4);
                GridPane.setConstraints(button52, 1, 4);

                button51.setMinWidth(400);
                button52.setMinWidth(400);

                hb14.setAlignment(Pos.CENTER);
                hb14.getChildren().addAll(lable74);
                layout16.getChildren().addAll(lable75, bname, lable76, bID, lable77, bdep, lable78, bflr, button51,
                        button52);
                layout16.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_fill16 = new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background background16 = new Background(background_fill16);

                // set background
                bp13.setBackground(background16);

                // SCENE HOST REG

                BorderPane bp14 = new BorderPane();
                HBox hb15 = new HBox();
                bp14.setTop(hb15);
                GridPane layout17 = new GridPane();
                bp14.setCenter(layout17);
                layout17.setPadding(new Insets(10));
                layout17.setVgap(50);
                layout17.setHgap(50);

                Label lable79 = new Label("Hostel Building Details");
                lable79.setPadding(new Insets(40));
                lable79.setFont(new Font("Cambria bold", 50));
                lable79.setTextFill(Color.BLACK);

                Label lable80 = new Label("Hostel Name:");
                lable80.setFont(new Font("Arial bold", 25));
                TextField hname = new TextField();
                hname.setPromptText("Hostel Name");
                hname.setFont(Font.font("Arial", 25));

                Label lable81 = new Label("Hostel Block:");
                lable81.setFont(new Font("Arial bold", 25));
                TextField hID = new TextField();
                hID.setPromptText("Hostel Block");
                hID.setFont(new Font("Arial", 25));

                Label lable82 = new Label("Hostel Capacity:");
                lable82.setFont(new Font("Arial bold", 25));
                TextField hcap = new TextField();
                hcap.setPromptText("Hostel Capacity");
                hcap.setFont(Font.font("Arial", 25));

                Button button53, button54;
                button53 = new Button();
                button53.setText("Add Hostel");
                button53.setFont(new Font("Arial", 30));
                button54 = new Button();
                button54.setText("Back");
                button54.setFont(new Font("Arial", 30));
                GridPane.setConstraints(lable80, 0, 0);
                GridPane.setConstraints(hname, 1, 0);
                GridPane.setConstraints(lable81, 0, 1);
                GridPane.setConstraints(hID, 1, 1);
                GridPane.setConstraints(lable82, 0, 2);
                GridPane.setConstraints(hcap, 1, 2);
                GridPane.setConstraints(button53, 0, 3);
                GridPane.setConstraints(button54, 1, 3);

                button53.setMinWidth(400);
                button54.setMinWidth(400);

                hb15.setAlignment(Pos.CENTER);
                hb15.getChildren().addAll(lable79);
                layout17.getChildren().addAll(lable80, hname, lable81, hID, lable82, hcap, button53, button54);
                layout17.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_fill17 = new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background background17 = new Background(background_fill17);

                // set background
                bp14.setBackground(background17);

                // SCENE SHOP REG

                BorderPane bp15 = new BorderPane();
                HBox hb16 = new HBox();
                bp15.setTop(hb16);
                GridPane layout18 = new GridPane();
                bp15.setCenter(layout18);
                layout18.setPadding(new Insets(10));
                layout18.setVgap(50);
                layout18.setHgap(50);

                Label lable83 = new Label("Shop Details");
                lable83.setPadding(new Insets(40));
                lable83.setFont(new Font("Cambria bold", 50));
                lable83.setTextFill(Color.BLACK);

                Label lable84 = new Label("Shop Name:");
                lable84.setFont(new Font("Arial bold", 25));
                TextField sname = new TextField();
                sname.setPromptText("Shop Name");
                sname.setFont(Font.font("Arial", 25));

                Label lable85 = new Label("Building:");
                lable85.setFont(new Font("Arial bold", 25));
                TextField sbul = new TextField();
                sbul.setPromptText("Building");
                sbul.setFont(new Font("Arial", 25));

                Label lable86 = new Label("Open Hours:");
                lable86.setFont(new Font("Arial bold", 25));
                TextField soph = new TextField();
                soph.setPromptText("Open hours");
                soph.setFont(Font.font("Arial", 25));

                Button button55, button56;
                button55 = new Button();
                button55.setText("Add Shop");
                button55.setFont(new Font("Arial", 30));
                button56 = new Button();
                button56.setText("Back");
                button56.setFont(new Font("Arial", 30));

                GridPane.setConstraints(lable84, 0, 0);
                GridPane.setConstraints(sname, 1, 0);
                GridPane.setConstraints(lable85, 0, 1);
                GridPane.setConstraints(sbul, 1, 1);
                GridPane.setConstraints(lable86, 0, 2);
                GridPane.setConstraints(soph, 1, 2);
                GridPane.setConstraints(button55, 0, 3);
                GridPane.setConstraints(button56, 1, 3);

                button55.setMinWidth(400);
                button56.setMinWidth(400);

                hb16.setAlignment(Pos.CENTER);
                hb16.getChildren().addAll(lable83);
                layout18.getChildren().addAll(lable84, sname, lable85, sbul, lable86, soph, button55, button56);
                layout18.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_fill18 = new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background background18 = new Background(background_fill18);

                // set background
                bp15.setBackground(background18);

                // SCENE CHANGE CHOICE

                VBox layout19 = new VBox(50);
                Label lable87 = new Label("Change Details");
                lable87.setPadding(new Insets(50));
                lable87.setFont(new Font("Cambria bold", 50));
                lable87.setTextFill(Color.WHITE);

                Button button57, button58, button59, button60;
                button57 = new Button();
                button57.setText("Register Details");
                button57.setFont(new Font("Arial", 30));
                button58 = new Button();
                button58.setText("Update Details");
                button58.setFont(new Font("Arial", 30));
                button59 = new Button();
                button59.setText("Delete Details");
                button59.setFont(new Font("Arial", 30));
                button60 = new Button();
                button60.setText("Back");
                button60.setFont(new Font("Arial", 30));
                button57.setMinWidth(400);
                button58.setMinWidth(400);
                button59.setMinWidth(400);

                layout19.getChildren().addAll(lable87, button57, button58, button59, button60);
                layout19.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_fill19 = new BackgroundFill(Color.TEAL, CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background background19 = new Background(background_fill19);

                // set background
                layout19.setBackground(background19);

                // UPDATE PART START

// UPDATE CHOICE
                Button buttonu1, buttonu2, buttonu3;
                buttonu1 = new Button();
                buttonu1.setText("Update Student");
                buttonu1.setFont(new Font("Arial", 30));
                buttonu2 = new Button();
                buttonu2.setText("Update Administration");
                buttonu2.setFont(new Font("Arial", 30));
                buttonu3 = new Button();
                buttonu3.setText("Back");
                buttonu3.setFont(new Font("Arial", 30));
                VBox layoutu1 = new VBox(50);
                Label lableu1 = new Label("UPDATE");
                lableu1.setPadding(new Insets(50));
                lableu1.setFont(new Font("Cambria bold", 50));
                lableu1.setTextFill(Color.WHITE);
                buttonu1.setMinWidth(400);
                buttonu2.setMinWidth(400);
                layoutu1.getChildren().addAll(lableu1, buttonu1, buttonu2, buttonu3);
                layoutu1.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_fillu1 = new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background backgroundu1 = new Background(background_fillu1);

                // set background
                layoutu1.setBackground(backgroundu1);

                // UPDATE COLLEGE

                Button buttonu4, buttonu5, buttonu6, buttonu7, buttonu8, buttonu9, buttonu10, buttonu11, buttonu12;
                buttonu4 = new Button();
                buttonu4.setText("Update Administration Board");
                buttonu4.setFont(new Font("Arial", 30));
                buttonu5 = new Button();
                buttonu5.setText("Update Dean");
                buttonu5.setFont(new Font("Arial", 30));
                buttonu6 = new Button();
                buttonu6.setText("Update HOD");
                buttonu6.setFont(new Font("Arial", 30));
                buttonu7 = new Button();
                buttonu7.setText("Update Faculty");
                buttonu7.setFont(new Font("Arial", 30));
                /*buttonu8 = new Button();
                buttonu8.setText("Update Department");
                buttonu8.setFont(new Font("Arial", 30));
                buttonu9 = new Button();
                buttonu9.setText("Update Course");
                buttonu9.setFont(new Font("Arial", 30));*/
                buttonu10 = new Button();
                buttonu10.setText("Update Maintenance Staff");
                buttonu10.setFont(new Font("Arial", 30));
                /*buttonu11 = new Button();
                buttonu11.setText("Update Building Detail");
                buttonu11.setFont(new Font("Arial", 30));*/
                buttonu12 = new Button();
                buttonu12.setText("\tBack\t");
                buttonu12.setFont(new Font("Arial", 30));

                BorderPane bpu1 = new BorderPane();
                HBox hbu1 = new HBox();
                bpu1.setTop(hbu1);
                HBox hbu2 = new HBox();
                bpu1.setBottom(hbu2);
                GridPane layoutu2 = new GridPane();
                bpu1.setCenter(layoutu2);
                layoutu2.setPadding(new Insets(10));
                layoutu2.setVgap(50);
                layoutu2.setHgap(10);
                Label lableu2 = new Label("COLLEGE DETAILS");
                lableu2.setPadding(new Insets(30));
                lableu2.setFont(new Font("Cambria bold", 50));
                lableu2.setTextFill(Color.WHITE);
                hbu1.setAlignment(Pos.CENTER);
                hbu1.getChildren().addAll(lableu2);
                hbu2.setPadding(new Insets(50, 0, 100, 0));
                hbu2.setAlignment(Pos.TOP_CENTER);
                hbu2.getChildren().addAll(buttonu12);

                buttonu4.setMaxWidth(500);
                buttonu5.setMaxWidth(500);
                buttonu6.setMaxWidth(500);
                buttonu7.setMaxWidth(500);
                /*buttonu8.setMaxWidth(500);
                buttonu9.setMinWidth(500);*/
                buttonu10.setMinWidth(500);
                //buttonu11.setMinWidth(500);

                GridPane.setConstraints(buttonu4, 0, 0);
                GridPane.setConstraints(buttonu5, 0, 1);
                GridPane.setConstraints(buttonu6, 0, 2);
                GridPane.setConstraints(buttonu7, 0, 3);
                //GridPane.setConstraints(buttonu8, 0, 2);
                //GridPane.setConstraints(buttonu9, 1, 2);
                GridPane.setConstraints(buttonu10, 0, 4);
                //GridPane.setConstraints(buttonu11, 1, 3);

                layoutu2.getChildren().addAll(buttonu4, buttonu5, buttonu6, buttonu7,buttonu10);
                layoutu2.setAlignment(Pos.TOP_CENTER);

                BackgroundFill background_fillu2 = new BackgroundFill(Color.MIDNIGHTBLUE, CornerRadii.EMPTY,
                        Insets.EMPTY);

                // create Background
                Background backgroundu2 = new Background(background_fillu2);

                // set background
                bpu1.setBackground(backgroundu2);

// update Student Search

                TextField regnou = new TextField();
                regnou.setPromptText("Enter Registration number");
                regnou.setFont(Font.font("Arial", 30));

                Button buttonu13, buttonu14;
                buttonu13 = new Button();
                buttonu13.setText("Search");
                buttonu13.setFont(new Font("Arial", 30));
                buttonu14 = new Button();
                buttonu14.setText("Back");
                buttonu14.setFont(new Font("Arial", 30));

                BorderPane bpu2 = new BorderPane();
                HBox hbu3 = new HBox();
                bpu2.setTop(hbu3);
                GridPane layoutu3 = new GridPane();
                bpu2.setCenter(layoutu3);
                layoutu3.setPadding(new Insets(10));
                layoutu3.setVgap(30);
                layoutu3.setHgap(30);
                Label lableu3 = new Label("Enter Registration No.");
                lableu3.setPadding(new Insets(30));
                lableu3.setFont(new Font("Arial", 30));
                lableu3.setTextFill(Color.BLACK);
                Label lableu4 = new Label("STUDENT UPDATE");
                lableu4.setPadding(new Insets(100, 0, 100, 0));
                lableu4.setFont(new Font("Cambria bold", 50));
                lableu4.setTextFill(Color.WHITE);
                GridPane.setConstraints(lableu3, 0, 1);
                GridPane.setConstraints(regnou, 1, 1);
                GridPane.setConstraints(buttonu13, 2, 1);
                GridPane.setConstraints(buttonu14, 1, 2);
                hbu3.setAlignment(Pos.CENTER);
                hbu3.getChildren().addAll(lableu4);
                layoutu3.getChildren().addAll(lableu3, regnou, buttonu13, buttonu14);
                layoutu3.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_fillu3 = new BackgroundFill(Color.GREY, CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background backgroundu3 = new Background(background_fillu3);

                // set background
                bpu2.setBackground(backgroundu3);

    //UPDATE ADMINISTRATION B SEARCH

                TextField dsgu = new TextField();
                dsgu.setPromptText("Enter Designation");
                dsgu.setFont(Font.font("Arial", 30));

                Button buttonu15, buttonu17;
                buttonu15 = new Button();
                buttonu15.setText("Search");
                buttonu15.setFont(new Font("Arial", 30));
                buttonu17 = new Button();
                buttonu17.setText("Back");
                buttonu17.setFont(new Font("Arial", 30));

                BorderPane bpu4 = new BorderPane();
                HBox hbu5 = new HBox();
                bpu4.setTop(hbu5);
                GridPane layoutu8 = new GridPane();
                bpu4.setCenter(layoutu8);
                layoutu8.setPadding(new Insets(10));
                layoutu8.setVgap(30);
                layoutu8.setHgap(30);
                Label lableu9 = new Label("Enter Designation:");
                lableu9.setPadding(new Insets(30));
                lableu9.setFont(new Font("Arial", 30));
                lableu9.setTextFill(Color.BLACK);
                Label lableu10 = new Label("ADMINISTRATION BOARD UPDATE");
                lableu10.setPadding(new Insets(100, 0, 100, 0));
                lableu10.setFont(new Font("Cambria bold", 50));
                lableu10.setTextFill(Color.WHITE);
                GridPane.setConstraints(lableu9, 0, 1);
                GridPane.setConstraints(dsgu, 1, 1);
                GridPane.setConstraints(buttonu15, 2, 1);
                GridPane.setConstraints(buttonu17, 1, 2);
                hbu5.setAlignment(Pos.CENTER);
                hbu5.getChildren().addAll(lableu10);
                layoutu8.getChildren().addAll(lableu9, dsgu, buttonu15,buttonu17);
                layoutu8.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_fillu5 = new BackgroundFill(Color.GREY, CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background backgroundu5 = new Background(background_fillu5);

                // set background
                bpu4.setBackground(backgroundu5);

    //UPDATE SEARCH DEAN

                TextField deptu = new TextField();
                deptu.setPromptText("Enter Department");
                deptu.setFont(Font.font("Arial", 30));

                Button buttonu18, buttonu19;
                buttonu18 = new Button();
                buttonu18.setText("Search");
                buttonu18.setFont(new Font("Arial", 30));
                buttonu19 = new Button();
                buttonu19.setText("Back");
                buttonu19.setFont(new Font("Arial", 30));

                BorderPane bpu5 = new BorderPane();
                HBox hbu6 = new HBox();
                bpu5.setTop(hbu6);
                GridPane layoutu9 = new GridPane();
                bpu5.setCenter(layoutu9);
                layoutu9.setPadding(new Insets(10));
                layoutu9.setVgap(30);
                layoutu9.setHgap(30);
                Label lableu11 = new Label("Enter Department:");
                lableu11.setPadding(new Insets(30));
                lableu11.setFont(new Font("Arial", 30));
                lableu11.setTextFill(Color.BLACK);
                Label lableu12 = new Label("DEAN UPDATE");
                lableu12.setPadding(new Insets(100, 0, 100, 0));
                lableu12.setFont(new Font("Cambria bold", 50));
                lableu12.setTextFill(Color.WHITE);
                GridPane.setConstraints(lableu11, 0, 1);
                GridPane.setConstraints(deptu, 1, 1);
                GridPane.setConstraints(buttonu18, 2, 1);
                GridPane.setConstraints(buttonu19, 1, 2);
                hbu6.setAlignment(Pos.CENTER);
                hbu6.getChildren().addAll(lableu12);
                layoutu9.getChildren().addAll(lableu11, deptu, buttonu18,buttonu19);
                layoutu9.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_fillu6 = new BackgroundFill(Color.GREY, CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background backgroundu6 = new Background(background_fillu6);

                // set background
                bpu5.setBackground(backgroundu6);

    //UPDATE SEARCH HOD

                TextField hodidu = new TextField();
                hodidu.setPromptText("Enter HOD ID");
                hodidu.setFont(Font.font("Arial", 30));

                Button buttonu20, buttonu21;
                buttonu20 = new Button();
                buttonu20.setText("Search");
                buttonu20.setFont(new Font("Arial", 30));
                buttonu21 = new Button();
                buttonu21.setText("Back");
                buttonu21.setFont(new Font("Arial", 30));

                BorderPane bpu6 = new BorderPane();
                HBox hbu7= new HBox();
                bpu6.setTop(hbu7);
                GridPane layoutu10 = new GridPane();
                bpu6.setCenter(layoutu10);
                layoutu10.setPadding(new Insets(10));
                layoutu10.setVgap(30);
                layoutu10.setHgap(30);
                Label lableu13 = new Label("Enter HOD ID:");
                lableu13.setPadding(new Insets(30));
                lableu13.setFont(new Font("Arial", 30));
                lableu13.setTextFill(Color.BLACK);
                Label lableu14 = new Label("HOD UPDATE");
                lableu14.setPadding(new Insets(100, 0, 100, 0));
                lableu14.setFont(new Font("Cambria bold", 50));
                lableu14.setTextFill(Color.WHITE);
                GridPane.setConstraints(lableu13, 0, 1);
                GridPane.setConstraints(hodidu, 1, 1);
                GridPane.setConstraints(buttonu20, 2, 1);
                GridPane.setConstraints(buttonu21, 1, 2);
                hbu7.setAlignment(Pos.CENTER);
                hbu7.getChildren().addAll(lableu14);
                layoutu10.getChildren().addAll(lableu13, hodidu, buttonu20,buttonu21);
                layoutu10.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_fillu7 = new BackgroundFill(Color.GREY, CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background backgroundu7 = new Background(background_fillu7);

                // set background
                bpu6.setBackground(backgroundu7);
//UPDATE SEARCH FACULTY

                TextField fidu = new TextField();
                fidu.setPromptText("Enter Faculty ID");
                fidu.setFont(Font.font("Arial", 30));

                Button buttonu22, buttonu23;
                buttonu22 = new Button();
                buttonu22.setText("Search");
                buttonu22.setFont(new Font("Arial", 30));
                buttonu23 = new Button();
                buttonu23.setText("Back");
                buttonu23.setFont(new Font("Arial", 30));

                BorderPane bpu7 = new BorderPane();
                HBox hbu8= new HBox();
                bpu7.setTop(hbu8);
                GridPane layoutu11 = new GridPane();
                bpu7.setCenter(layoutu11);
                layoutu11.setPadding(new Insets(10));
                layoutu11.setVgap(30);
                layoutu11.setHgap(30);
                Label lableu15 = new Label("Enter Faculty ID:");
                lableu15.setPadding(new Insets(30));
                lableu15.setFont(new Font("Arial", 30));
                lableu15.setTextFill(Color.BLACK);
                Label lableu16 = new Label("FACULTY UPDATE");
                lableu16.setPadding(new Insets(100, 0, 100, 0));
                lableu16.setFont(new Font("Cambria bold", 50));
                lableu16.setTextFill(Color.WHITE);
                GridPane.setConstraints(lableu15, 0, 1);
                GridPane.setConstraints(fidu, 1, 1);
                GridPane.setConstraints(buttonu22, 2, 1);
                GridPane.setConstraints(buttonu23, 1, 2);
                hbu8.setAlignment(Pos.CENTER);
                hbu8.getChildren().addAll(lableu16);
                layoutu11.getChildren().addAll(lableu15, fidu, buttonu22,buttonu23);
                layoutu11.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_fillu8 = new BackgroundFill(Color.GREY, CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background backgroundu8 = new Background(background_fillu8);

                // set background
                bpu7.setBackground(backgroundu8);

                TextField mtidu = new TextField();
                mtidu.setPromptText("Enter Employee ID");
                mtidu.setFont(Font.font("Arial", 30));

                Button buttonu24, buttonu25;
                buttonu24 = new Button();
                buttonu24.setText("Search");
                buttonu24.setFont(new Font("Arial", 30));
                buttonu25 = new Button();
                buttonu25.setText("Back");
                buttonu25.setFont(new Font("Arial", 30));

                BorderPane bpu8 = new BorderPane();
                HBox hbu9= new HBox();
                bpu8.setTop(hbu9);
                GridPane layoutu12 = new GridPane();
                bpu8.setCenter(layoutu12);
                layoutu12.setPadding(new Insets(10));
                layoutu12.setVgap(30);
                layoutu12.setHgap(30);
                Label lableu17 = new Label("Enter Employee ID:");
                lableu17.setPadding(new Insets(30));
                lableu17.setFont(new Font("Arial", 30));
                lableu17.setTextFill(Color.BLACK);
                Label lableu18 = new Label("MAINTENANCE STAFF UPDATE");
                lableu18.setPadding(new Insets(100, 0, 100, 0));
                lableu18.setFont(new Font("Cambria bold", 50));
                lableu18.setTextFill(Color.WHITE);
                GridPane.setConstraints(lableu17, 0, 1);
                GridPane.setConstraints(mtidu, 1, 1);
                GridPane.setConstraints(buttonu24, 2, 1);
                GridPane.setConstraints(buttonu25, 1, 2);
                hbu9.setAlignment(Pos.CENTER);
                hbu9.getChildren().addAll(lableu18);
                layoutu12.getChildren().addAll(lableu17, mtidu, buttonu24,buttonu25);
                layoutu12.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_fillu9 = new BackgroundFill(Color.GREY, CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background backgroundu9 = new Background(background_fillu9);

                // set background
                bpu8.setBackground(backgroundu9);

//Delete Student Choice

                Button buttond1, buttond2, buttond3, buttond4, buttond5, buttond6, buttond7;
                buttond1 = new Button();
                buttond1.setText("Delete Student");
                buttond1.setFont(new Font("Arial", 30));
                buttond2 = new Button();
                buttond2.setText("Delete Administration Board");
                buttond2.setFont(new Font("Arial", 30));
                buttond3 = new Button();
                buttond3.setText("Delete Dean");
                buttond3.setFont(new Font("Arial", 30));
                buttond4 = new Button();
                buttond4.setText("Delete HOD");
                buttond4.setFont(new Font("Arial", 30));
                buttond5 = new Button();
                buttond5.setText("Delete Faculty");
                buttond5.setFont(new Font("Arial", 30));
                buttond6 = new Button();
                buttond6.setText("Delete Maintenance Staff");
                buttond6.setFont(new Font("Arial", 30));
                buttond7 = new Button();
                buttond7.setText("\tBack\t");
                buttond7.setFont(new Font("Arial", 30));

                BorderPane bpd1 = new BorderPane();
                HBox hbd1 = new HBox();
                bpd1.setTop(hbd1);
                HBox hbd2 = new HBox();
                bpd1.setBottom(hbd2);
                GridPane layoutd1 = new GridPane();
                bpd1.setCenter(layoutd1);
                layoutd1.setPadding(new Insets(10));
                layoutd1.setVgap(80);
                layoutd1.setHgap(70);
                Label labled1 = new Label("DELETE DETAILS");
                labled1.setPadding(new Insets(30));
                labled1.setFont(new Font("Cambria bold", 50));
                labled1.setTextFill(Color.WHITE);
                hbd1.setAlignment(Pos.CENTER);
                hbd1.getChildren().addAll(labled1);
                hbd2.setPadding(new Insets(50, 0, 200, 0));
                hbd2.setAlignment(Pos.TOP_CENTER);
                hbd2.getChildren().addAll(buttond7);

                buttond1.setMaxWidth(500);
                buttond2.setMaxWidth(500);
                buttond3.setMaxWidth(500);
                buttond4.setMaxWidth(500);
                buttond5.setMinWidth(500);
                buttond6.setMinWidth(500);

                GridPane.setConstraints(buttond1, 0, 0);
                GridPane.setConstraints(buttond2, 1, 0);
                GridPane.setConstraints(buttond3, 0, 1);
                GridPane.setConstraints(buttond4, 1, 1);
                GridPane.setConstraints(buttond5, 0, 2);
                GridPane.setConstraints(buttond6, 1, 2);
                
                layoutd1.getChildren().addAll(buttond1, buttond2, buttond3,buttond4,buttond5,buttond6);
                layoutd1.setAlignment(Pos.TOP_CENTER);

                BackgroundFill background_filld1 = new BackgroundFill(Color.MIDNIGHTBLUE, CornerRadii.EMPTY,
                        Insets.EMPTY);

                // create Background
                Background backgroundd1 = new Background(background_filld1);

                // set background
                bpd1.setBackground(backgroundd1);

//Delete Student Search

                TextField regnod = new TextField();
                regnod.setPromptText("Enter Registration number");
                regnod.setFont(Font.font("Arial", 30));

                Button buttond8, buttond9;
                buttond8 = new Button();
                buttond8.setText("Delete");
                buttond8.setFont(new Font("Arial", 30));
                buttond9 = new Button();
                buttond9.setText("Back");
                buttond9.setFont(new Font("Arial", 30));

                BorderPane bpd2 = new BorderPane();
                HBox hbd3 = new HBox();
                bpd2.setTop(hbd3);
                GridPane layoutd2 = new GridPane();
                bpd2.setCenter(layoutd2);
                layoutd2.setPadding(new Insets(10));
                layoutd2.setVgap(30);
                layoutd2.setHgap(10);
                Label labled2 = new Label("Enter Registration No. to be Deleted:");
                labled2.setPadding(new Insets(30));
                labled2.setFont(new Font("Arial", 30));
                labled2.setTextFill(Color.BLACK);
                Label labled3 = new Label("DELETE STUDENT");
                labled3.setPadding(new Insets(100, 0, 100, 0));
                labled3.setFont(new Font("Cambria bold", 50));
                labled3.setTextFill(Color.WHITE);
                GridPane.setConstraints(labled2, 0, 1);
                GridPane.setConstraints(regnod, 1, 1);
                GridPane.setConstraints(buttond8, 2, 1);
                GridPane.setConstraints(buttond9, 1, 2);
                hbd3.setAlignment(Pos.CENTER);
                hbd3.getChildren().addAll(labled3);
                layoutd2.getChildren().addAll(labled2, regnod, buttond8, buttond9);
                layoutd2.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_filld2 = new BackgroundFill(Color.GREY, CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background backgroundd2 = new Background(background_filld2);

                // set background
                bpd2.setBackground(backgroundd2);

//AB delete search
                TextField dsgd = new TextField();
                dsgd.setPromptText("Enter Designation");
                dsgd.setFont(Font.font("Arial", 30));

                Button buttond10, buttond11;
                buttond10 = new Button();
                buttond10.setText("Delete");
                buttond10.setFont(new Font("Arial", 30));
                buttond11 = new Button();
                buttond11.setText("Back");
                buttond11.setFont(new Font("Arial", 30));

                BorderPane bpd3 = new BorderPane();
                HBox hbd4 = new HBox();
                bpd3.setTop(hbd4);
                GridPane layoutd3 = new GridPane();
                bpd3.setCenter(layoutd3);
                layoutd3.setPadding(new Insets(10));
                layoutd3.setVgap(30);
                layoutd3.setHgap(10);
                Label labled4= new Label("Enter Designation of Member to be Deleted:");
                labled4.setPadding(new Insets(30));
                labled4.setFont(new Font("Arial", 30));
                labled4.setTextFill(Color.BLACK);
                Label labled5 = new Label("DELETE ADMINISTRATION MEMBER");
                labled5.setPadding(new Insets(100, 0, 100, 0));
                labled5.setFont(new Font("Cambria bold", 50));
                labled5.setTextFill(Color.WHITE);
                GridPane.setConstraints(labled4, 0, 1);
                GridPane.setConstraints(dsgd, 2, 1);
                GridPane.setConstraints(buttond10, 3, 1);
                GridPane.setConstraints(buttond11, 2, 2);
                hbd4.setAlignment(Pos.CENTER);
                hbd4.getChildren().addAll(labled5);
                layoutd3.getChildren().addAll(labled4, dsgd, buttond10, buttond11);
                layoutd3.setAlignment(Pos.TOP_CENTER);
                BackgroundFill background_filld3 = new BackgroundFill(Color.GREY, CornerRadii.EMPTY, Insets.EMPTY);

                // create Background
                Background backgroundd3 = new Background(background_filld3);

                // set background
                bpd3.setBackground(backgroundd3);

        //Delete Dean Search

        TextField depd = new TextField();
        depd.setPromptText("Enter Department");
        depd.setFont(Font.font("Arial", 30));

        Button buttond12, buttond13;
        buttond12 = new Button();
        buttond12.setText("Delete");
        buttond12.setFont(new Font("Arial", 30));
        buttond13 = new Button();
        buttond13.setText("Back");
        buttond13.setFont(new Font("Arial", 30));

        BorderPane bpd4 = new BorderPane();
        HBox hbd5 = new HBox();
        bpd4.setTop(hbd5);
        GridPane layoutd4 = new GridPane();
        bpd4.setCenter(layoutd4);
        layoutd4.setPadding(new Insets(10));
        layoutd4.setVgap(30);
        layoutd4.setHgap(10);
        Label labled6= new Label("Enter Department of Dean to be Deleted:");
        labled6.setPadding(new Insets(30));
        labled6.setFont(new Font("Arial", 30));
        labled6.setTextFill(Color.BLACK);
        Label labled7 = new Label("DELETE DEAN");
        labled7.setPadding(new Insets(100, 0, 100, 0));
        labled7.setFont(new Font("Cambria bold", 50));
        labled7.setTextFill(Color.WHITE);
        GridPane.setConstraints(labled6, 0, 1);
        GridPane.setConstraints(depd, 2, 1);
        GridPane.setConstraints(buttond12, 3, 1);
        GridPane.setConstraints(buttond13, 2, 2);
        hbd5.setAlignment(Pos.CENTER);
        hbd5.getChildren().addAll(labled7);
        layoutd4.getChildren().addAll(labled6, depd, buttond12, buttond13);
        layoutd4.setAlignment(Pos.TOP_CENTER);
        BackgroundFill background_filld4 = new BackgroundFill(Color.GREY, CornerRadii.EMPTY, Insets.EMPTY);

        // create Background
        Background backgroundd4 = new Background(background_filld4);

        // set background
        bpd4.setBackground(backgroundd4);

//HOD DELETE SEARCH

        TextField hodidd = new TextField();
        hodidd.setPromptText("Enter HOD ID");
        hodidd.setFont(Font.font("Arial", 30));

        Button buttond14, buttond15;
        buttond14 = new Button();
        buttond14.setText("Delete");
        buttond14.setFont(new Font("Arial", 30));
        buttond15 = new Button();
        buttond15.setText("Back");
        buttond15.setFont(new Font("Arial", 30));

        BorderPane bpd5 = new BorderPane();
        HBox hbd6 = new HBox();
        bpd5.setTop(hbd6);
        GridPane layoutd5 = new GridPane();
        bpd5.setCenter(layoutd5);
        layoutd5.setPadding(new Insets(10));
        layoutd5.setVgap(30);
        layoutd5.setHgap(10);
        Label labled8= new Label("Enter HOD ID of HOD to be Deleted:");
        labled8.setPadding(new Insets(30));
        labled8.setFont(new Font("Arial", 30));
        labled8.setTextFill(Color.BLACK);
        Label labled9 = new Label("DELETE HOD");
        labled9.setPadding(new Insets(100, 0, 100, 0));
        labled9.setFont(new Font("Cambria bold", 50));
        labled9.setTextFill(Color.WHITE);
        GridPane.setConstraints(labled8, 0, 1);
        GridPane.setConstraints(hodidd, 2, 1);
        GridPane.setConstraints(buttond14, 3, 1);
        GridPane.setConstraints(buttond15, 2, 2);
        hbd6.setAlignment(Pos.CENTER);
        hbd6.getChildren().addAll(labled9);
        layoutd5.getChildren().addAll(labled8, hodidd, buttond14, buttond15);
        layoutd5.setAlignment(Pos.TOP_CENTER);
        BackgroundFill background_filld5 = new BackgroundFill(Color.GREY, CornerRadii.EMPTY, Insets.EMPTY);

        // create Background
        Background backgroundd5 = new Background(background_filld5);

        // set background
        bpd5.setBackground(backgroundd5);

//FACULTY DELETE SEARCH

        TextField fidd = new TextField();
        fidd.setPromptText("Enter Faculty ID");
        fidd.setFont(Font.font("Arial", 30));

        Button buttond16, buttond17;
        buttond16 = new Button();
        buttond16.setText("Delete");
        buttond16.setFont(new Font("Arial", 30));
        buttond17 = new Button();
        buttond17.setText("Back");
        buttond17.setFont(new Font("Arial", 30));

        BorderPane bpd6 = new BorderPane();
        HBox hbd7 = new HBox();
        bpd6.setTop(hbd7);
        GridPane layoutd6 = new GridPane();
        bpd6.setCenter(layoutd6);
        layoutd6.setPadding(new Insets(10));
        layoutd6.setVgap(30);
        layoutd6.setHgap(10);
        Label labled10= new Label("Enter Faculty ID of Faculty to be Deleted:");
        labled10.setPadding(new Insets(30));
        labled10.setFont(new Font("Arial", 30));
        labled10.setTextFill(Color.BLACK);
        Label labled11 = new Label("DELETE FACULTY");
        labled11.setPadding(new Insets(100, 0, 100, 0));
        labled11.setFont(new Font("Cambria bold", 50));
        labled11.setTextFill(Color.WHITE);
        GridPane.setConstraints(labled10, 0, 1);
        GridPane.setConstraints(fidd, 2, 1);
        GridPane.setConstraints(buttond16, 3, 1);
        GridPane.setConstraints(buttond17, 2, 2);
        hbd7.setAlignment(Pos.CENTER);
        hbd7.getChildren().addAll(labled11);
        layoutd6.getChildren().addAll(labled10, fidd, buttond16, buttond17);
        layoutd6.setAlignment(Pos.TOP_CENTER);
        BackgroundFill background_filld6 = new BackgroundFill(Color.GREY, CornerRadii.EMPTY, Insets.EMPTY);

        // create Background
        Background backgroundd6 = new Background(background_filld6);

        // set background
        bpd6.setBackground(backgroundd6);

//Delete Search Maintenance Staff

        TextField mtidd = new TextField();
        mtidd.setPromptText("Enter Employee ID");
        mtidd.setFont(Font.font("Arial", 30));

        Button buttond18, buttond19;
        buttond18 = new Button();
        buttond18.setText("Delete");
        buttond18.setFont(new Font("Arial", 30));
        buttond19 = new Button();
        buttond19.setText("Back");
        buttond19.setFont(new Font("Arial", 30));

        BorderPane bpd7 = new BorderPane();
        HBox hbd8 = new HBox();
        bpd7.setTop(hbd8);
        GridPane layoutd7 = new GridPane();
        bpd7.setCenter(layoutd7);
        layoutd7.setPadding(new Insets(10));
        layoutd7.setVgap(30);
        layoutd7.setHgap(10);
        Label labled12= new Label("Enter Employee ID of Staff Member to be Deleted:");
        labled12.setPadding(new Insets(30));
        labled12.setFont(new Font("Arial", 30));
        labled12.setTextFill(Color.BLACK);
        Label labled13 = new Label("DELETE MAINTENANCE STAFF");
        labled13.setPadding(new Insets(100, 0, 100, 0));
        labled13.setFont(new Font("Cambria bold", 50));
        labled13.setTextFill(Color.WHITE);
        GridPane.setConstraints(labled12, 0, 1);
        GridPane.setConstraints(mtidd, 1, 1);
        GridPane.setConstraints(buttond18, 2, 1);
        GridPane.setConstraints(buttond19, 1, 2);
        hbd8.setAlignment(Pos.CENTER);
        hbd8.getChildren().addAll(labled13);
        layoutd7.getChildren().addAll(labled12, mtidd, buttond18, buttond19);
        layoutd7.setAlignment(Pos.TOP_CENTER);
        BackgroundFill background_filld7 = new BackgroundFill(Color.GREY, CornerRadii.EMPTY, Insets.EMPTY);

        // create Background
        Background backgroundd7 = new Background(background_filld7);

        // set background
        bpd7.setBackground(backgroundd7);

                Scene scene1 = new Scene(layout, 1520, 800);
                Scene scene2 = new Scene(layout1, 1520, 800);
                Scene scene3 = new Scene(bp3, 1520, 800);
                Scene scene7 = new Scene(layout2, 1520, 800);
                Scene scene4 = new Scene(bp4, 1520, 800);
                Scene scene5 = new Scene(bp, 1520, 800);
                Scene scene6 = new Scene(bp2, 1520, 800);
                Scene scene8 = new Scene(bp5, 1520, 800);
                Scene sceneab = new Scene(bp6, 1520, 800);
                Scene scenede = new Scene(bp7, 1520, 800);
                Scene scenehod = new Scene(bp8, 1520, 800);
                Scene scenefac = new Scene(bp9, 1520, 800);
                Scene scenedep = new Scene(bp10, 1520, 800);
                Scene scenecrs = new Scene(bp11, 1520, 800);
                Scene scenemts = new Scene(bp12, 1520, 800);
                Scene sceneinf = new Scene(layout15, 1520, 800);
                Scene sceneabul = new Scene(bp13, 1520, 800);
                Scene scenehos = new Scene(bp14, 1520, 800);
                Scene sceneshop = new Scene(bp15, 1520, 800);
                Scene scenechange = new Scene(layout19, 1520, 800);
//Delete Scenes
                Scene scenedch = new Scene(bpd1, 1520, 800);
                Scene sceneds = new Scene(bpd2, 1520, 800);
                Scene scenedab = new Scene(bpd3, 1520, 800);
                Scene scenedde = new Scene(bpd4, 1520, 800);
                Scene scenedhod = new Scene(bpd5, 1520, 800);
                Scene scenedf = new Scene(bpd6, 1520, 800);
                Scene scenedmt = new Scene(bpd7, 1520, 800);


// UPDATE SCENES

                Scene sceneuch = new Scene(layoutu1, 1520, 800);
                Scene sceneucd = new Scene(bpu1, 1520, 800);
                Scene sceneusrh = new Scene(bpu2, 1520, 800);
                Scene sceneabsrh = new Scene(bpu4, 1520, 800);
                Scene scenedensrh = new Scene(bpu5, 1520, 800);
                Scene scenehodsrh = new Scene(bpu6, 1520, 800);
                Scene scenefsrh = new Scene(bpu7, 1520, 800);
                Scene scenemtsrh = new Scene(bpu8, 1520, 800);

                primaryStage.setScene(scene1);

                button1.setOnAction(e -> {
                    primaryStage.setScene(scene2);
                });
                button2.setOnAction(e -> {
                    primaryStage.setScene(scene3);
                });

                button3.setOnAction(e -> {
                    primaryStage.setScene(scene1);
                });

                button4.setOnAction(e -> {
                    primaryStage.setScene(scenechange);
                });

                button7.setOnAction(e -> {
                    primaryStage.setScene(scene5);
                });
                button8.setOnAction(e -> {
                    primaryStage.setScene(scene1);
                });
                button8.setOnAction(e -> {
                    primaryStage.setScene(scene4);
                });
                button14.setOnAction(e -> {
                    primaryStage.setScene(scene2);
                });
                button15.setOnAction(e -> {
                    regno.clear();
                    primaryStage.setScene(scene2);
                });

                Button button61;
                button61 = new Button();
                button61.setText("Back");
                button61.setFont(new Font("Arial", 30));
                button61.setMinWidth(400);

                button16.setOnAction(e -> {
                    String man = "select * from studentguardian where `RegistrationNumber`='" + regno.getText() + "'";
                    try {
                        ResultSet rs = st.executeQuery(man);
                        if (rs.next()) {
                            Label lable88 = new Label("Name:");
                            lable88.setFont(new Font("Arial bold", 25));
                            Label lable89 = new Label(rs.getString(1));
                            lable89.setFont(new Font("Arial bold", 25));

                            Label lable90 = new Label("Registration Number:");
                            lable90.setFont(new Font("Arial bold", 25));
                            Label lable91 = new Label(rs.getString(2));
                            lable91.setFont(new Font("Arial bold", 25));

                            Label lable92 = new Label("Age:");
                            lable92.setFont(new Font("Arial bold", 25));
                            Label lable93 = new Label(rs.getString(3));
                            lable93.setFont(new Font("Arial bold", 25));

                            Label lable94 = new Label("Hostel Type:");
                            lable94.setFont(new Font("Arial bold", 25));
                            Label lable95 = new Label(rs.getString(4));
                            lable95.setFont(new Font("Arial bold", 25));

                            Label lable96 = new Label("Phone Number:");
                            lable96.setFont(new Font("Arial bold", 25));
                            Label lable97 = new Label(rs.getString(5));
                            lable97.setFont(new Font("Arial bold", 25));

                            Label lable98 = new Label("Department:");
                            lable98.setFont(new Font("Arial bold", 25));
                            Label lable99 = new Label(rs.getString(6));
                            lable99.setFont(new Font("Arial bold", 25));

                            Label lable100 = new Label("Hostel Block:");
                            lable100.setFont(new Font("Arial bold", 25));
                            Label lable101 = new Label(rs.getString(7));
                            lable101.setFont(new Font("Arial bold", 25));

                            Label lable102 = new Label("Student Email ID:");
                            lable102.setFont(new Font("Arial bold", 25));
                            Label lable103 = new Label(rs.getString(8));
                            lable103.setFont(new Font("Arial bold", 20));

                            Label lable104 = new Label("Guardian Name:");
                            lable104.setFont(new Font("Arial bold", 25));
                            Label lable105 = new Label(rs.getString(9));
                            lable105.setFont(new Font("Arial bold", 25));

                            Label lable106 = new Label("Guardian Age:");
                            lable106.setFont(new Font("Arial bold", 25));
                            Label lable107 = new Label(rs.getString(10));
                            lable107.setFont(new Font("Arial bold", 25));

                            Label lable108 = new Label("Guardian Phone Number:");
                            lable108.setFont(new Font("Arial bold", 25));
                            Label lable109 = new Label(rs.getString(11));
                            lable109.setFont(new Font("Arial bold", 25));

                            Label lable110 = new Label("Relation with Student:");
                            lable110.setFont(new Font("Arial bold", 25));
                            Label lable111 = new Label(rs.getString(12));
                            lable111.setFont(new Font("Arial bold", 25));

                            GridPane.setConstraints(lable88, 0, 0);
                            GridPane.setConstraints(lable89, 1, 0);
                            GridPane.setConstraints(lable90, 0, 1);
                            GridPane.setConstraints(lable91, 1, 1);
                            GridPane.setConstraints(lable92, 0, 2);
                            GridPane.setConstraints(lable93, 1, 2);
                            GridPane.setConstraints(lable94, 0, 3);
                            GridPane.setConstraints(lable95, 1, 3);
                            GridPane.setConstraints(lable96, 0, 4);
                            GridPane.setConstraints(lable97, 1, 4);
                            GridPane.setConstraints(lable98, 0, 5);
                            GridPane.setConstraints(lable99, 1, 5);
                            GridPane.setConstraints(lable100, 3, 0);
                            GridPane.setConstraints(lable101, 4, 0);
                            GridPane.setConstraints(lable102, 3, 1);
                            GridPane.setConstraints(lable103, 4, 1);
                            GridPane.setConstraints(lable104, 3, 2);
                            GridPane.setConstraints(lable105, 4, 2);
                            GridPane.setConstraints(lable106, 3, 3);
                            GridPane.setConstraints(lable107, 4, 3);
                            GridPane.setConstraints(lable108, 3, 4);
                            GridPane.setConstraints(lable109, 4, 4);
                            GridPane.setConstraints(lable110, 3, 5);
                            GridPane.setConstraints(lable111, 4, 5);

                            BorderPane bp16 = new BorderPane();
                            HBox hb17 = new HBox();
                            bp16.setTop(hb17);
                            HBox hb18 = new HBox();
                            bp16.setBottom(hb18);
                            GridPane layout20 = new GridPane();
                            bp16.setCenter(layout20);
                            layout20.setPadding(new Insets(10));
                            layout20.setVgap(40);
                            layout20.setHgap(40);
                            Label lable112 = new Label("Student Details");
                            lable112.setPadding(new Insets(50));
                            lable112.setFont(new Font("Cambria bold", 50));
                            lable112.setTextFill(Color.BLACK);

                            hb17.setAlignment(Pos.CENTER);
                            hb17.getChildren().addAll(lable112);
                            hb18.setAlignment(Pos.TOP_CENTER);
                            hb18.getChildren().addAll(button61);
                            hb18.setPadding(new Insets(0, 0, 100, 0));
                            layout20.getChildren().addAll(lable88, lable89, lable90, lable91, lable92, lable93, lable94,
                                    lable95, lable96, lable97, lable98, lable99, lable100, lable101, lable102, lable103,
                                    lable104, lable105, lable106, lable107, lable108, lable109, lable110, lable111);
                            layout20.setAlignment(Pos.TOP_CENTER);
                            BackgroundFill background_fill20 = new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY,
                                    Insets.EMPTY);

                            // create Background
                            Background background20 = new Background(background_fill20);

                            // set background
                            bp16.setBackground(background20);

                            Scene scenesd = new Scene(bp16, 1520, 800);
                            primaryStage.setScene(scenesd);

                        } else {
                            boolean v = alertbox.display("Student Details", "No Such Student Registered");
                            System.out.println(regno.getText() + v);
                        }
                    } catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                });
                button5.setOnAction(e -> {
                    primaryStage.setScene(scene6);
                });
                button17.setOnAction(e -> {
                    String na[] = name.getText().split(" ");
                    String ena = "";
                    System.out.println(name.getText());
                    String rn = regnum.getText();
                    for (int i = 0; i < na.length; i++)
                        ena += na[i].toLowerCase();

                    String man = "select * from studentguardian where `RegistrationNumber`='" + regnum.getText() + "'";
                    String man2 = "insert into `studentguardian` (`Name`, `RegistrationNumber`, `Age`, `HostelType`, `MobileNumber`, `Department`, `HostelBlock`, `Email_ID`, `GuardianName`, `GuardianAge`, `GMobile`, `GuardianRelation`) values ('"
                            + name.getText() + "','" + regnum.getText() + "','"+ age.getText() + "','"+ hostp.getText() + "','" 
                            + phone.getText() +"','"+ dep.getText()+ "','" + hosb.getText()+ "','" +(ena + (rn.toLowerCase()) + "@myvit.ac.in")+"','"+gname.getText()+"','"+gage.getText()+"','"+gphone.getText()+"','"+rel.getText()+ "');";
                    try {
                        ResultSet rs = st.executeQuery(man);
                        if ((!rs.next()) && (regnum.getText().length() != 0) && (regnum.getText().length() == 9)) {
                            st.executeUpdate(man2);
                            lable21.setText((ena + (rn.toLowerCase()) + "@myvit.ac.in"));
                            alertbox.display("Student Registration", "Student Successfully Registered");
                        } else if ((regnum.getText().length() == 0) || (regnum.getText().length() != 9)) {
                            boolean v = alertbox.display("Student Registration", "Invalid Registration Number");
                            System.out.println(regnou.getText() + v);
                        } else {
                            boolean v = alertbox.display("Student Registration", "Registration Number Already exists");
                            System.out.println(regnou.getText() + v);
                        }
                    } catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }

                });

                button18.setOnAction(e -> {
                    regnum.clear();
                    name.clear();
                    age.clear();
                    gname.clear();
                    phone.clear();
                    gphone.clear();
                    hostp.clear();
                    dep.clear();
                    hosb.clear();
                    gage.clear();
                    rel.clear();
                    lable21.setText("Auto-Generated");
                    primaryStage.setScene(scene7);
                });
                button19.setOnAction(e -> {
                    String pass = adp.getText();
                    System.out.println();
                    if (pass.equals("0880")) {
                        primaryStage.setScene(scenechange);
                        adp.clear();
                    } else
                        alertbox.display("Login", "Invaild 4-Digit PIN");
                });
                button20.setOnAction(e -> {
                    primaryStage.setScene(scene1);
                });

                button6.setOnAction(e -> {
                    primaryStage.setScene(scene8);
                });

                button32.setOnAction(e -> {
                    primaryStage.setScene(scene7);
                });

                button24.setOnAction(e -> {
                    primaryStage.setScene(sceneab);
                });
                button33.setOnAction(e -> {
                    
                    String dg[] = dsg.getText().split(" ");
                    String de = "";
                    for (int i = 0; i < dg.length; i++)
                        de += dg[i].toLowerCase();
                        
                    String man = "select * from `administration board` where `Designation`='" + dsg.getText() + "'";
                    String man2 = "insert into `administration board` (`Name`, `Age`, `PhoneNumber`, `Designation`, `Email_ID`) values ('"
                            + abname.getText() + "','" + abage.getText() + "','"+ abphone.getText() + "','"+ dsg.getText() + "','" +(de + "@myvit.ac.in")+ "');";
                    try {
                        ResultSet rs = st.executeQuery(man);
                            if ((!rs.next()) && (dsg.getText().length() != 0)) {
                                st.executeUpdate(man2);
                                lable29.setText((de + "@myvit.ac.in"));
                                boolean v = alertbox.display("Administrator Registration", "Member Successfully Registered");
                                System.out.println(dsg.getText() + v);
                            } else if ((dsg.getText().length() == 0)) {
                                boolean v = alertbox.display("Admin Registration", "Invalid Designation");
                                System.out.println(dsg.getText() + v);
                            } else {
                                boolean v = alertbox.display("Admin Registration", "Member on Designation Already exists");
                                System.out.println(dsg.getText() + v);
                            }
                        } catch (SQLException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }
                
                });

                button34.setOnAction(e -> {
                    abname.clear();
                    abage.clear();
                    abphone.clear();
                    dsg.clear();
                    lable29.setText("Auto-Generated");
                    primaryStage.setScene(scene8);
                });

                button25.setOnAction(e -> {
                    primaryStage.setScene(scenede);
                });
//DEAN REGISTRATION
                button35.setOnAction(e -> {
                    String dg[] = dedep.getText().split(" ");
                    String de = "";
                    for (int i = 0; i < dg.length; i++)
                        de += dg[i].toLowerCase();

                    String man = "select * from `dean` where `Department`='" + dedep.getText() + "'";
                    String man2 = "INSERT INTO `dean` (`Name`, `Age`, `Department`, `PhoneNumber`, `Email_ID`) VALUES ('"
                            + dename.getText() + "','" + deage.getText() + "','"+ dedep.getText() + "','"+ dephone.getText() + "','" +("dean"+de + "@myvit.ac.in")+ "');";
                    try {
                        ResultSet rs = st.executeQuery(man);
                            if ((!rs.next()) && (dedep.getText().length() != 0)&&(dedep.getText().length() ==3)) {
                                st.executeUpdate(man2);
                                lable36.setText(("dean" + de + "@myvit.ac.in"));
                                boolean v = alertbox.display("Dean Registration", "Dean Successfully Registered");
                                System.out.println(dedep.getText() + v);
                                System.out.println(dename.getText() + v);
                            } else if ((dedep.getText().length() == 0)||(dedep.getText().length() != 3)) {
                                boolean v = alertbox.display("Dean Registration", "Invalid Department ID");
                                System.out.println(dedep.getText() + v);
                            } else {
                                boolean v = alertbox.display("Dean Registration", "Dean Already exists");
                                System.out.println(dedep.getText() + v);
                            }
                        } catch (SQLException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }

                });
                button36.setOnAction(e -> {
                    dename.clear();
                    deage.clear();
                    dephone.clear();
                    dedep.clear();
                    lable36.setText("Auto-Generated");
                    primaryStage.setScene(scene8);
                });

                button26.setOnAction(e -> {
                    primaryStage.setScene(scenehod);
                });
//HOD REGISTRATION
                button37.setOnAction(e -> {
                    
                    String man = "select * from `hod` where `Course_ID`='" +hodcrs.getText() + "'";
                    String man2 = "INSERT INTO `hod` (`Name`, `HOD_ID`, `Age`, `Course_ID`, `PhoneNumber`,`Salary`, `Email_ID`) VALUES ('"
                            + hodname.getText() + "','" +("HOD-"+hodcrs.getText())+"','"+ hodage.getText() + "','"+hodcrs.getText()+"','"
                            + hodphone.getText() + "','"+"Rs.90,000"+ "','" +("hod" + hodcrs.getText().toLowerCase() + "@myvit.ac.in")+ "');";
                    try {
                        ResultSet rs = st.executeQuery(man);
                            if ((!rs.next()) && (hodcrs.getText().length() != 0)) {
                                st.executeUpdate(man2);
                                boolean v = alertbox.display("HOD Registration", "HOD Successfully Registered");
                                System.out.println(hodcrs.getText() + v);
                                 lable43.setText(("hod" + hodcrs.getText().toLowerCase() + "@myvit.ac.in"));
                                lable45.setText("Rs.90,000");
                                hodregnum.setText(("HOD-"+hodcrs.getText()));
                            } else if ((hodcrs.getText().length() == 0)) {
                                boolean v = alertbox.display("HOD Registration", "Invalid Course ID");
                                System.out.println(hodname.getText() + v);
                            } else {
                                boolean v = alertbox.display("HOD Registration", "HOD Already exists");
                                System.out.println(hodname.getText() + v);
                            }
                        } catch (SQLException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }
                });
                button38.setOnAction(e -> {
                    hodregnum.setText("Auto-Generated");
                    hodname.clear();
                    hodage.clear();
                    hodphone.clear();
                    hodcrs.clear();
                    lable43.setText("Auto-Generated");
                    lable45.setText("Auto-Generated");
                    primaryStage.setScene(scene8);
                });

                button27.setOnAction(e -> {
                    primaryStage.setScene(scenefac);
                });
                button39.setOnAction(e -> {
                    
                    String na[] = fname.getText().split(" ");
                    String ena = "";
                    String rn = fregnum.getText();
                    for (int i = 0; i < na.length; i++)
                        ena += na[i].toLowerCase();
                    

                    String man = "select * from `faculty` where `FacultiID`='" +fregnum.getText() + "'";
                    String man2 = "INSERT INTO `faculty` (`Name`, `FacultiID`, `Age`, `PhoneNumber`,`Designation`, `Email_ID`, `Salary`, `Department_ID`) VALUES ('"
                            + fname.getText() + "','" +fregnum.getText()+"','"+ fage.getText() + "','"+ fphone.getText()+"','" +fdsg.getText()+"','"
                            +(ena + (rn.toLowerCase()) + "@myvit.ac.in")+ "','"+"Rs.70,000"+"','"+fdep.getText()+ "');";
                    try {
                        ResultSet rs = st.executeQuery(man);
                        if ((!rs.next()) && (fregnum.getText().length() != 0) && (fregnum.getText().length() == 6)) {
                                st.executeUpdate(man2);
                                boolean v = alertbox.display("Faculty Registration", "Faculty Successfully Registered");
                                System.out.println(fregnum.getText() + v);
                                lable52.setText((ena + (rn.toLowerCase()) + "@myvit.ac.in"));
                                lable54.setText("Rs.70,000");
                            } else if ((fregnum.getText().length() == 0)|| (fregnum.getText().length() != 6)) {
                                boolean v = alertbox.display("Faculty Registration", "Invalid Faculty ID");
                                System.out.println(fregnum.getText() + v);
                            } else {
                                boolean v = alertbox.display("Faculty Registration", "Faculty Already exists");
                                System.out.println(fregnum.getText() + v);
                            }
                        } catch (SQLException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }

                });
                button40.setOnAction(e -> {
                    fname.clear();
                    fage.clear();
                    fphone.clear();
                    fdep.clear();
                    fregnum.clear();
                    fdsg.clear();
                    lable52.setText("Auto-Generated");
                    lable54.setText("Auto-Generated");
                    primaryStage.setScene(scene8);
                });

                button28.setOnAction(e -> {
                    primaryStage.setScene(scenedep);
                });
                button41.setOnAction(e -> {

                    String man = "select * from `department` where `DepartmentID`='" +depID.getText() + "'";
                    String man2 = "INSERT INTO `department` (`DepartmentName`, `DepartmentID`,`DeanDepartment`) VALUES ('"
                            + depname.getText() + "','" +depID.getText()+ "','" +depID.getText()+ "');";
                    try {
                        ResultSet rs = st.executeQuery(man);
                        if ((!rs.next()) && (depID.getText().length() != 0) && (depID.getText().length() == 3)) {
                                st.executeUpdate(man2);
                                boolean v = alertbox.display("Department Registration", "Department Successfully Added");
                                System.out.println(depname.getText() + v);
                            } else if ((depID.getText().length() == 0)|| (depID.getText().length() != 3)) {
                                boolean v = alertbox.display("Department Registration", "Invalid Department ID");
                                System.out.println(depID.getText() + v);
                            } else {
                                boolean v = alertbox.display("Department Registration", "Department Already exists");
                                System.out.println(depID.getText() + v);
                            }
                        } catch (SQLException e1) {
                            // TODO Auto-generated catch block
                            if(e1.getErrorCode()==1452)
                            {
                                boolean v = alertbox.display("Department Registration", "No Dean for Entered Department exists");
                                System.out.println(depID.getText() + v);
                                System.out.println(e1.getErrorCode());
                            }
                            else
                            e1.printStackTrace();
                        }
                });
                button42.setOnAction(e -> {
                    depname.clear();
                    depID.clear();
                    primaryStage.setScene(scene8);
                });

                button29.setOnAction(e -> {
                    primaryStage.setScene(scenecrs);
                });
                button43.setOnAction(e -> {

                    String man = "select * from `course` where `CourseID`='" +crsID.getText() + "'";
                    String man2 = "INSERT INTO `course` (`CourseName`, `CourseID`, `Credits`, `HOD_ID`) VALUES ('"
                            + crsname.getText() + "','" +crsID.getText()+ "','" +crscdt.getText()+"','"+("HOD-"+crsID.getText())+ "');";
                    try {
                        ResultSet rs = st.executeQuery(man);
                        if ((!rs.next()) && (crsID.getText().length() != 0) && (crsID.getText().length() == 7)) {
                                st.executeUpdate(man2);
                                boolean v = alertbox.display("Course Registration", "Course Successfully Added");
                                System.out.println(crsname.getText() + v);
                            } else if ((crsID.getText().length() == 0)|| (crsID.getText().length() != 7)) {
                                boolean v = alertbox.display("Course Registration", "Invalid Course ID");
                                System.out.println(depID.getText() + v);
                            } else {
                                boolean v = alertbox.display("Course Registration", "Course Already exists");
                                System.out.println(depID.getText() + v);
                            }
                        } catch (SQLException e1) {
                            // TODO Auto-generated catch block
                            if(e1.getErrorCode()==1452)
                            {
                                boolean v = alertbox.display("Course Registration", "No HOD for Entered Course ID exists");
                                System.out.println(crsID.getText() + v);
                                System.out.println(e1.getErrorCode());
                            }
                            else
                            e1.printStackTrace();
                        }

                });
                button44.setOnAction(e -> {
                    crsname.clear();
                    crsID.clear();
                    crscdt.clear();
                    primaryStage.setScene(scene8);
                });

                button30.setOnAction(e -> {
                    primaryStage.setScene(scenemts);
                });
                button45.setOnAction(e -> {

                    String man = "select * from `maintainence staff` where `Employee_ID`='" +mtregnum.getText() + "'";
                    String man2 = "INSERT INTO `maintainence staff` (`Name`, `Employee_ID`, `Age`, `Workplace`, `PhoneNumber`,`Designation`, `Salary`) VALUES ('"
                            + mtname.getText() + "','" +mtregnum.getText()+"','"+ mtage.getText() + "','"+mtbul.getText()+ "','"+ mtphone.getText()+"','" +mtdsg.getText()+"','"
                            +"Rs.30,000"+ "');";
                    try {
                        ResultSet rs = st.executeQuery(man);
                        if ((!rs.next()) && (mtregnum.getText().length() != 0) && (mtregnum.getText().length() == 6)) {
                                st.executeUpdate(man2);
                                boolean v = alertbox.display("Maintenance Staff Registration","Maintenance Staff Member Successfully Added");
                    System.out.println(mtname.getText() + v);
                                lable71.setText("Rs.30,000");
                            } else if ((mtregnum.getText().length() == 0)|| (mtregnum.getText().length() != 6)) {
                                boolean v = alertbox.display("Maintenance Registration", "Invalid Employee ID");
                                System.out.println(mtregnum.getText() + v);
                            } else {
                                boolean v = alertbox.display("Maintenance Registration", "Maintenance Staff Member Already exists");
                                System.out.println(mtregnum.getText() + v);
                            }
                        } catch (SQLException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }

                });
                button46.setOnAction(e -> {
                    mtregnum.clear();
                    mtname.clear();
                    mtage.clear();
                    mtphone.clear();
                    mtbul.clear();
                    mtdsg.clear();
                    lable71.setText("Auto-Generated");
                    primaryStage.setScene(scene8);
                });
                button31.setOnAction(e -> {
                    primaryStage.setScene(sceneinf);
                });
                button30.setOnAction(e -> {
                    primaryStage.setScene(scenemts);
                });
                button50.setOnAction(e -> {
                    primaryStage.setScene(scene8);
                });

                button47.setOnAction(e -> {
                    primaryStage.setScene(sceneabul);
                });
                button51.setOnAction(e -> {
                    String na[] = bname.getText().split(" ");
                    String ena = "";
                    for (int i = 0; i < na.length; i++)
                        ena += Character.toUpperCase(na[i].charAt(0));

                    String man = "select * from `academic building` where `BuildingID`='" +ena + "'";
                    String man2 = "INSERT INTO `academic building` (`BuildingName`, `BuildingID`, `Departmentallotted`, `No_of_floors`) VALUES ('"
                            + bname.getText() + "','" +ena+ "','" +bdep.getText()+"','"+bflr.getText()+ "');";
                    try {
                        ResultSet rs = st.executeQuery(man);
                        if ((!rs.next()) && (bname.getText().length() != 0)) {
                                st.executeUpdate(man2);
                                boolean v = alertbox.display("Academic Building Registration", "Building Successfully Added");
                                System.out.println(bname.getText() + v);
                                bID.setText(ena);
                            } else if (bname.getText().length() == 0) {
                                boolean v = alertbox.display("Academic Building Registration", "Invalid Academic Building Name");
                                System.out.println(depID.getText() + v);
                            } else {
                                boolean v = alertbox.display("Academic Building Registration", "Academic Building Already exists");
                                System.out.println(depID.getText() + v);
                            }
                        } catch (SQLException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }



                });
                button52.setOnAction(e -> {
                    bID.setText("Auto-Generated");;
                    bname.clear();
                    bdep.clear();
                    bflr.clear();
                    primaryStage.setScene(sceneinf);
                });
                button48.setOnAction(e -> {
                    primaryStage.setScene(scenehos);
                });
                button53.setOnAction(e -> {
                    
                    String man = "select * from `hostel` where `Block`='" +hID.getText() + "'";
                    String man2 = "INSERT INTO `hostel` (`Name`, `Block`, `Capacity`) VALUES ('"
                            + hname.getText() + "','" +hID.getText()+ "','" +hcap.getText()+ "');";
                    try {
                        ResultSet rs = st.executeQuery(man);
                        if ((!rs.next()) && (hID.getText().length() != 0)&&(hID.getText().length() == 1)) {
                                st.executeUpdate(man2);
                                boolean v = alertbox.display("Hostel Registration", "Hostel Successfully Added");
                                System.out.println(hname.getText() + v);
                            } else if ((hID.getText().length() == 0)||(hID.getText().length() != 1)) {
                                boolean v = alertbox.display("Hostel Registration", "Invalid Block");
                                System.out.println(depID.getText() + v);
                            } else {
                                boolean v = alertbox.display("Hostel Registration", "Hostel Already exists");
                                System.out.println(depID.getText() + v);
                            }
                        } catch (SQLException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }

                });
                button54.setOnAction(e -> {
                    hID.clear();
                    hname.clear();
                    hcap.clear();
                    primaryStage.setScene(sceneinf);
                });

                button49.setOnAction(e -> {
                    primaryStage.setScene(sceneshop);
                });
                button55.setOnAction(e -> {
                    
                    String man = "select * from `shop` where `ShopName`='" +sname.getText() + "'";
                    String man2 = "INSERT INTO `shop` (`ShopName`, `Building`, `OpenHours`) VALUES ('"
                            + sname.getText() + "','" +sbul.getText()+ "','" +soph.getText()+ "');";
                    try {
                        ResultSet rs = st.executeQuery(man);
                        if ((!rs.next()) && (sname.getText().length() != 0)) {
                                st.executeUpdate(man2);
                                boolean v = alertbox.display("Shop Registration", "Shop Successfully Added");
                                System.out.println(sname.getText() + v);

                            } else if (sname.getText().length() == 0) {
                                boolean v = alertbox.display("Shop Registration", "Invalid Shop Name");
                                System.out.println(sname.getText() + v);
                            } else {
                                boolean v = alertbox.display("Shop Registration", "Shop Already exists");
                                System.out.println(sname.getText() + v);
                            }
                        } catch (SQLException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }

                });
                button56.setOnAction(e -> {
                    sbul.clear();
                    sname.clear();
                    soph.clear();
                    primaryStage.setScene(sceneinf);
                });
                button57.setOnAction(e -> {
                    primaryStage.setScene(scene7);
                });
                button60.setOnAction(e -> {
                    primaryStage.setScene(scene1);
                });

//TABLE VIEW

                Button buttontb;
                buttontb = new Button();
                buttontb.setText("\tBack\t");
                buttontb.setFont(new Font("Arial", 30));

                button9.setOnAction(e -> {
                    String man = "select * from `administration board`;";
                    TableView<getTable> table = new TableView<getTable>();
                    table.setEditable(true);

        
                    try {
                        ResultSet rs = st.executeQuery(man);
                        rs=st.executeQuery(man);

                        TableColumn<getTable, String> tname=new TableColumn<>("Name");
                        TableColumn<getTable,String> tage=new TableColumn<>("Age") ;
                        TableColumn<getTable,String> tmob=new TableColumn<>("Phone Number"); 
                        TableColumn<getTable,String> tdsg=new TableColumn<>("Designation");
                        TableColumn<getTable,String> teid =new TableColumn<>("Email ID");
                        ObservableList<getTable> list=FXCollections.observableArrayList();
                        while(rs.next())
                        {
                            list.add(new getTable(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), 
                            rs.getString(5)));
                        }
                        tname.setCellValueFactory(new PropertyValueFactory<getTable,String>(rs.getMetaData().getColumnName(1)));
                        tage.setCellValueFactory(new PropertyValueFactory<getTable,String>(rs.getMetaData().getColumnName(2)));
                        tmob.setCellValueFactory(new PropertyValueFactory<getTable,String>(rs.getMetaData().getColumnName(3)));
                        tdsg.setCellValueFactory(new PropertyValueFactory<getTable,String>(rs.getMetaData().getColumnName(4)));
                        teid.setCellValueFactory(new PropertyValueFactory<getTable,String>(rs.getMetaData().getColumnName(5)));
                        
                        tname.setMinWidth(250);
                        tage.setMinWidth(50);
                        tmob.setMinWidth(100);
                        tdsg.setMinWidth(150);
                        teid.setMinWidth(250);
                        table.setItems(list);
                        table.getColumns().addAll(tname,tage,tmob,tdsg,teid);
                        }
                     catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    BorderPane bpt1 = new BorderPane();
                            HBox hbt1 = new HBox();
                            bpt1.setTop(hbt1);
                            HBox hbt2 = new HBox();
                            bpt1.setBottom(hbt2);
                            bpt1.setCenter(table);
                            Label lablet = new Label("Administration Board Details");
                            lablet.setPadding(new Insets(50));
                            lablet.setFont(new Font("Cambria bold", 50));
                            lablet.setTextFill(Color.BLACK);

                            hbt1.setAlignment(Pos.CENTER);
                            hbt1.getChildren().addAll(lablet);
                            hbt2.setAlignment(Pos.TOP_CENTER);
                            hbt2.getChildren().addAll(buttontb);
                            hbt2.setPadding(new Insets(20, 0, 300, 0));
                            bpt1.setPadding(new Insets(0,350,0,350));
                            BackgroundFill background_fillt = new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,
                                    Insets.EMPTY);

                            // create Background
                            Background backgroundt = new Background(background_fillt);

                            // set background
                            bpt1.setBackground(backgroundt);
                    Scene scenevab = new Scene(bpt1,1520,800);        

                    primaryStage.setScene(scenevab);
                }); 
                button21.setOnAction(e -> {
                    String man = "select * from `dean`;";
                    TableView<getDean> table = new TableView<getDean>();
                    table.setEditable(true);

        
                    try {
                        ResultSet rs = st.executeQuery(man);
                        rs=st.executeQuery(man);

                        TableColumn<getDean, String> tname=new TableColumn<>("Name");
                        TableColumn<getDean,String> tage=new TableColumn<>("Age") ;
                        TableColumn<getDean,String> tmob=new TableColumn<>("Phone Number"); 
                        TableColumn<getDean,String> tdsg=new TableColumn<>("Department");
                        TableColumn<getDean,String> teid =new TableColumn<>("Email ID");
                        ObservableList<getDean> list=FXCollections.observableArrayList();
                        while(rs.next())
                        {
                            list.add(new getDean(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), 
                            rs.getString(5)));
                        }
                        tname.setCellValueFactory(new PropertyValueFactory<getDean,String>(rs.getMetaData().getColumnName(1)));
                        tage.setCellValueFactory(new PropertyValueFactory<getDean,String>(rs.getMetaData().getColumnName(2)));
                        tmob.setCellValueFactory(new PropertyValueFactory<getDean,String>(rs.getMetaData().getColumnName(3)));
                        tdsg.setCellValueFactory(new PropertyValueFactory<getDean,String>(rs.getMetaData().getColumnName(4)));
                        teid.setCellValueFactory(new PropertyValueFactory<getDean,String>(rs.getMetaData().getColumnName(5)));
                        
                        tname.setMinWidth(250);
                        tage.setMinWidth(50);
                        tmob.setMinWidth(100);
                        tdsg.setMinWidth(150);
                        teid.setMinWidth(250);
                        table.setItems(list);
                        table.getColumns().addAll(tname,tage,tmob,tdsg,teid);
                        }
                     catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    BorderPane bpt1 = new BorderPane();
                            HBox hbt1 = new HBox();
                            bpt1.setTop(hbt1);
                            HBox hbt2 = new HBox();
                            bpt1.setBottom(hbt2);
                            bpt1.setCenter(table);
                            Label lablet = new Label("Dean Details");
                            lablet.setPadding(new Insets(50));
                            lablet.setFont(new Font("Cambria bold", 50));
                            lablet.setTextFill(Color.BLACK);

                            hbt1.setAlignment(Pos.CENTER);
                            hbt1.getChildren().addAll(lablet);
                            hbt2.setAlignment(Pos.TOP_CENTER);
                            hbt2.getChildren().addAll(buttontb);
                            hbt2.setPadding(new Insets(20, 0, 250, 0));
                            bpt1.setPadding(new Insets(0,350,0,350));
                            BackgroundFill background_fillt = new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,
                                    Insets.EMPTY);

                            // create Background
                            Background backgroundt = new Background(background_fillt);

                            // set background
                            bpt1.setBackground(backgroundt);
                    Scene scenevab = new Scene(bpt1,1520,800);        

                    primaryStage.setScene(scenevab);
                }); 

                button10.setOnAction(e -> {
                    String man = "select * from `hod`;";
                    TableView<gethod> table = new TableView<gethod>();
                    table.setEditable(true);

        
                    try {
                        ResultSet rs = st.executeQuery(man);
                        rs=st.executeQuery(man);

                        TableColumn<gethod, String> tname=new TableColumn<>("Name");
                        TableColumn<gethod,String> tage=new TableColumn<>("Age") ;
                        TableColumn<gethod,String> tmob=new TableColumn<>("Phone Number"); 
                        TableColumn<gethod,String> tdsg=new TableColumn<>("Course_ID");
                        TableColumn<gethod,String> teid =new TableColumn<>("Email ID");
                        TableColumn<gethod,String> thodid=new TableColumn<>("HOD_ID");
                        TableColumn<gethod,String> tsal =new TableColumn<>("Salary");
                        ObservableList<gethod> list=FXCollections.observableArrayList();
                        while(rs.next())
                        {
                            list.add(new gethod(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), 
                            rs.getString(5),rs.getString(6), rs.getString(7)));
                        }
                        tname.setCellValueFactory(new PropertyValueFactory<gethod,String>(rs.getMetaData().getColumnName(1)));
                        tage.setCellValueFactory(new PropertyValueFactory<gethod,String>(rs.getMetaData().getColumnName(3)));
                        tmob.setCellValueFactory(new PropertyValueFactory<gethod,String>(rs.getMetaData().getColumnName(5)));
                        tdsg.setCellValueFactory(new PropertyValueFactory<gethod,String>(rs.getMetaData().getColumnName(4)));
                        teid.setCellValueFactory(new PropertyValueFactory<gethod,String>(rs.getMetaData().getColumnName(7)));
                        thodid.setCellValueFactory(new PropertyValueFactory<gethod,String>(rs.getMetaData().getColumnName(2)));
                        tsal.setCellValueFactory(new PropertyValueFactory<gethod,String>(rs.getMetaData().getColumnName(6)));

                        tname.setMinWidth(250);
                        tage.setMinWidth(50);
                        tmob.setMinWidth(100);
                        tdsg.setMinWidth(100);
                        teid.setMinWidth(250);
                        tsal.setMinWidth(100);
                        thodid.setMinWidth(100);
                        table.setItems(list);
                        table.getColumns().addAll(tname,thodid,tage,tdsg,tmob,tsal,teid);
                        }
                     catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    BorderPane bpt1 = new BorderPane();
                            HBox hbt1 = new HBox();
                            bpt1.setTop(hbt1);
                            HBox hbt2 = new HBox();
                            bpt1.setBottom(hbt2);
                            bpt1.setCenter(table);
                            Label lablet = new Label("HOD Details");
                            lablet.setPadding(new Insets(50));
                            lablet.setFont(new Font("Cambria bold", 50));
                            lablet.setTextFill(Color.BLACK);

                            hbt1.setAlignment(Pos.CENTER);
                            hbt1.getChildren().addAll(lablet);
                            hbt2.setAlignment(Pos.TOP_CENTER);
                            hbt2.getChildren().addAll(buttontb);
                            hbt2.setPadding(new Insets(20, 0, 200, 0));
                            bpt1.setPadding(new Insets(0,280,0,280));
                            BackgroundFill background_fillt = new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,
                                    Insets.EMPTY);

                            // create Background
                            Background backgroundt = new Background(background_fillt);

                            // set background
                            bpt1.setBackground(backgroundt);
                    Scene scenevab = new Scene(bpt1,1520,800);        

                    primaryStage.setScene(scenevab);
                }); 

                button11.setOnAction(e -> {
                    String man = "select * from `faculty`;";
                    TableView<getFaculty> table = new TableView<getFaculty>();
                    table.setEditable(true);

        
                    try {
                        ResultSet rs = st.executeQuery(man);
                        rs=st.executeQuery(man);

                        TableColumn<getFaculty, String> tname=new TableColumn<>("Name");
                        TableColumn<getFaculty,String> tage=new TableColumn<>("Age") ;
                        TableColumn<getFaculty,String> tfid=new TableColumn<>("Faculty ID");
                        TableColumn<getFaculty,String> tmob=new TableColumn<>("Phone Number");
                        TableColumn<getFaculty,String> tdsg=new TableColumn<>("Designation"); 
                        TableColumn<getFaculty,String> teid =new TableColumn<>("Email ID");
                        TableColumn<getFaculty,String> tsal =new TableColumn<>("Salary");
                        TableColumn<getFaculty,String> tdep=new TableColumn<>("Department ID");
                        ObservableList<getFaculty> list=FXCollections.observableArrayList();
                        while(rs.next())
                        {
                            list.add(new getFaculty(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), 
                            rs.getString(5),rs.getString(6), rs.getString(7),rs.getString(8)));
                        }
                        tname.setCellValueFactory(new PropertyValueFactory<getFaculty,String>(rs.getMetaData().getColumnName(1)));
                        tage.setCellValueFactory(new PropertyValueFactory<getFaculty,String>(rs.getMetaData().getColumnName(3)));
                        tmob.setCellValueFactory(new PropertyValueFactory<getFaculty,String>(rs.getMetaData().getColumnName(4)));
                        tdsg.setCellValueFactory(new PropertyValueFactory<getFaculty,String>(rs.getMetaData().getColumnName(5)));
                        teid.setCellValueFactory(new PropertyValueFactory<getFaculty,String>(rs.getMetaData().getColumnName(6)));
                        tfid.setCellValueFactory(new PropertyValueFactory<getFaculty,String>(rs.getMetaData().getColumnName(2)));
                        tsal.setCellValueFactory(new PropertyValueFactory<getFaculty,String>(rs.getMetaData().getColumnName(7)));
                        tdep.setCellValueFactory(new PropertyValueFactory<getFaculty,String>(rs.getMetaData().getColumnName(8)));

                        tname.setMinWidth(250);
                        tage.setMinWidth(50);
                        tmob.setMinWidth(100);
                        tdsg.setMinWidth(150);
                        tdep.setMinWidth(100);
                        teid.setMinWidth(250);
                        tsal.setMinWidth(100);
                        tfid.setMinWidth(100);
                        table.setItems(list);
                        table.getColumns().addAll(tname,tfid,tage,tmob,tdsg,teid,tsal,tdep);
                        }
                     catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    BorderPane bpt1 = new BorderPane();
                            HBox hbt1 = new HBox();
                            bpt1.setTop(hbt1);
                            HBox hbt2 = new HBox();
                            bpt1.setBottom(hbt2);
                            bpt1.setCenter(table);
                            Label lablet = new Label("Faculty Details");
                            lablet.setPadding(new Insets(50));
                            lablet.setFont(new Font("Cambria bold", 50));
                            lablet.setTextFill(Color.BLACK);

                            hbt1.setAlignment(Pos.CENTER);
                            hbt1.getChildren().addAll(lablet);
                            hbt2.setAlignment(Pos.TOP_CENTER);
                            hbt2.getChildren().addAll(buttontb);
                            hbt2.setPadding(new Insets(20, 0, 150, 0));
                            bpt1.setPadding(new Insets(0,200,0,200));
                            BackgroundFill background_fillt = new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,
                                    Insets.EMPTY);

                            // create Background
                            Background backgroundt = new Background(background_fillt);

                            // set background
                            bpt1.setBackground(backgroundt);
                    Scene scenevab = new Scene(bpt1,1520,800);        

                    primaryStage.setScene(scenevab);
                }); 

                button12.setOnAction(e -> {
                    String man = "select * from `maintainence staff`;";
                    TableView<getMainSt> table = new TableView<getMainSt>();
                    table.setEditable(true);

        
                    try {
                        ResultSet rs = st.executeQuery(man);
                        rs=st.executeQuery(man);

                        TableColumn<getMainSt, String> tname=new TableColumn<>("Name");
                        TableColumn<getMainSt,String> tage=new TableColumn<>("Age") ;
                        TableColumn<getMainSt,String> teid=new TableColumn<>("Employee ID");
                        TableColumn<getMainSt,String> tmob=new TableColumn<>("Phone Number");
                        TableColumn<getMainSt,String> tdsg=new TableColumn<>("Designation"); 
                        TableColumn<getMainSt,String> tsal =new TableColumn<>("Salary");
                        TableColumn<getMainSt,String> tdep=new TableColumn<>("Workplace");
                        ObservableList<getMainSt> list=FXCollections.observableArrayList();
                        while(rs.next())
                        {
                            list.add(new getMainSt(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), 
                            rs.getString(5),rs.getString(6), rs.getString(7)));
                        }
                        tname.setCellValueFactory(new PropertyValueFactory<getMainSt,String>(rs.getMetaData().getColumnName(1)));
                        tage.setCellValueFactory(new PropertyValueFactory<getMainSt,String>(rs.getMetaData().getColumnName(3)));
                        tmob.setCellValueFactory(new PropertyValueFactory<getMainSt,String>(rs.getMetaData().getColumnName(5)));
                        tdsg.setCellValueFactory(new PropertyValueFactory<getMainSt,String>(rs.getMetaData().getColumnName(6)));
                        teid.setCellValueFactory(new PropertyValueFactory<getMainSt,String>(rs.getMetaData().getColumnName(2)));
                        tsal.setCellValueFactory(new PropertyValueFactory<getMainSt,String>(rs.getMetaData().getColumnName(7)));
                        tdep.setCellValueFactory(new PropertyValueFactory<getMainSt,String>(rs.getMetaData().getColumnName(4)));

                        tname.setMinWidth(250);
                        tage.setMinWidth(50);
                        tmob.setMinWidth(100);
                        tdsg.setMinWidth(200);
                        tdep.setMinWidth(150);
                        tsal.setMinWidth(100);
                        teid.setMinWidth(100);
                        table.setItems(list);
                        table.getColumns().addAll(tname,teid,tage,tdsg,tmob,tdep,tsal);
                        }
                     catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    BorderPane bpt1 = new BorderPane();
                            HBox hbt1 = new HBox();
                            bpt1.setTop(hbt1);
                            HBox hbt2 = new HBox();
                            bpt1.setBottom(hbt2);
                            bpt1.setCenter(table);
                            Label lablet = new Label("Maintenance Staff Details");
                            lablet.setPadding(new Insets(50));
                            lablet.setFont(new Font("Cambria bold", 50));
                            lablet.setTextFill(Color.BLACK);

                            hbt1.setAlignment(Pos.CENTER);
                            hbt1.getChildren().addAll(lablet);
                            hbt2.setAlignment(Pos.TOP_CENTER);
                            hbt2.getChildren().addAll(buttontb);
                            hbt2.setPadding(new Insets(20, 0, 150, 0));
                            bpt1.setPadding(new Insets(0,280,0,280));
                            BackgroundFill background_fillt = new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,
                                    Insets.EMPTY);

                            // create Background
                            Background backgroundt = new Background(background_fillt);

                            // set background
                            bpt1.setBackground(backgroundt);
                    Scene scenevab = new Scene(bpt1,1520,800);        

                    primaryStage.setScene(scenevab);
                }); 

                button23.setOnAction(e -> {
                    String man = "select * from `department`;";
                    TableView<getDep> table = new TableView<getDep>();
                    table.setEditable(true);

        
                    try {
                        ResultSet rs = st.executeQuery(man);
                        rs=st.executeQuery(man);

                        TableColumn<getDep, String> tname=new TableColumn<>("Department Name");
                        TableColumn<getDep,String> tdep=new TableColumn<>("Department ID") ;
                        TableColumn<getDep,String> teid=new TableColumn<>("Dean of Department ID");
                        ObservableList<getDep> list=FXCollections.observableArrayList();
                        while(rs.next())
                        {
                            list.add(new getDep(rs.getString(1), rs.getString(2), rs.getString(3)));
                        }
                        tname.setCellValueFactory(new PropertyValueFactory<getDep,String>(rs.getMetaData().getColumnName(1)));
                        tdep.setCellValueFactory(new PropertyValueFactory<getDep,String>(rs.getMetaData().getColumnName(2)));
                        teid.setCellValueFactory(new PropertyValueFactory<getDep,String>(rs.getMetaData().getColumnName(3)));

                        tname.setMinWidth(250);
                        tdep.setMinWidth(200);
                        teid.setMinWidth(200);
                        table.setItems(list);
                        table.getColumns().addAll(tname,tdep,teid);
                        }
                     catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    BorderPane bpt1 = new BorderPane();
                            HBox hbt1 = new HBox();
                            bpt1.setTop(hbt1);
                            HBox hbt2 = new HBox();
                            bpt1.setBottom(hbt2);
                            bpt1.setCenter(table);
                            Label lablet = new Label("Department Details");
                            lablet.setPadding(new Insets(50));
                            lablet.setFont(new Font("Cambria bold", 50));
                            lablet.setTextFill(Color.BLACK);

                            hbt1.setAlignment(Pos.CENTER);
                            hbt1.getChildren().addAll(lablet);
                            hbt2.setAlignment(Pos.TOP_CENTER);
                            hbt2.getChildren().addAll(buttontb);
                            hbt2.setPadding(new Insets(20, 0, 200, 0));
                            bpt1.setPadding(new Insets(0,430,0,430));
                            BackgroundFill background_fillt = new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,
                                    Insets.EMPTY);

                            // create Background
                            Background backgroundt = new Background(background_fillt);

                            // set background
                            bpt1.setBackground(backgroundt);
                    Scene scenevab = new Scene(bpt1,1520,800);        

                    primaryStage.setScene(scenevab);
                }); 

                button22.setOnAction(e -> {
                    String man = "select * from `course`;";
                    TableView<getCrs> table = new TableView<getCrs>();
                    table.setEditable(true);

        
                    try {
                        ResultSet rs = st.executeQuery(man);
                        rs=st.executeQuery(man);

                        TableColumn<getCrs, String> tname=new TableColumn<>("Course Name");
                        TableColumn<getCrs,String> tcid =new TableColumn<>("Course ID") ;
                        TableColumn<getCrs,String> tcdt =new TableColumn<>("Course Credits") ;
                        TableColumn<getCrs,String> teid=new TableColumn<>("Course HOD ID");
                        ObservableList<getCrs> list=FXCollections.observableArrayList();
                        while(rs.next())
                        {
                            list.add(new getCrs(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4)));
                        }
                        tname.setCellValueFactory(new PropertyValueFactory<getCrs,String>(rs.getMetaData().getColumnName(1)));
                        tcid.setCellValueFactory(new PropertyValueFactory<getCrs,String>(rs.getMetaData().getColumnName(2)));
                        tcdt.setCellValueFactory(new PropertyValueFactory<getCrs,String>(rs.getMetaData().getColumnName(3)));
                        teid.setCellValueFactory(new PropertyValueFactory<getCrs,String>(rs.getMetaData().getColumnName(4)));

                        tname.setMinWidth(250);
                        tcid.setMinWidth(150);
                        tcdt.setMinWidth(100);
                        teid.setMinWidth(150);
                        table.setItems(list);
                        table.getColumns().addAll(tname,tcid,tcdt,teid);
                        }
                     catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    BorderPane bpt1 = new BorderPane();
                            HBox hbt1 = new HBox();
                            bpt1.setTop(hbt1);
                            HBox hbt2 = new HBox();
                            bpt1.setBottom(hbt2);
                            bpt1.setCenter(table);
                            Label lablet = new Label("Course Details");
                            lablet.setPadding(new Insets(50));
                            lablet.setFont(new Font("Cambria bold", 50));
                            lablet.setTextFill(Color.BLACK);

                            hbt1.setAlignment(Pos.CENTER);
                            hbt1.getChildren().addAll(lablet);
                            hbt2.setAlignment(Pos.TOP_CENTER);
                            hbt2.getChildren().addAll(buttontb);
                            hbt2.setPadding(new Insets(20, 0, 200, 0));
                            bpt1.setPadding(new Insets(0,430,0,430));
                            BackgroundFill background_fillt = new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,
                                    Insets.EMPTY);

                            // create Background
                            Background backgroundt = new Background(background_fillt);

                            // set background
                            bpt1.setBackground(backgroundt);
                    Scene scenevab = new Scene(bpt1,1520,800);        

                    primaryStage.setScene(scenevab);
                }); 

                button13.setOnAction(e -> {
                    String man = "select * from `academic building`;";
                    TableView<getAcad> table1 = new TableView<getAcad>();
                    table1.setEditable(true);
                    table1.setMaxWidth(555);
        
                    try {
                        ResultSet rs = st.executeQuery(man);
                        rs=st.executeQuery(man);

                        TableColumn<getAcad, String> tname=new TableColumn<>("Academic Building Name");
                        TableColumn<getAcad,String> tcid =new TableColumn<>("Building ID") ;
                        TableColumn<getAcad,String> tcdt =new TableColumn<>("Department Alloted") ;
                        TableColumn<getAcad,String> teid=new TableColumn<>("No. of Floors");
                        ObservableList<getAcad> list=FXCollections.observableArrayList();
                        while(rs.next())
                        {
                            list.add(new getAcad(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4)));
                        }
                        tname.setCellValueFactory(new PropertyValueFactory<getAcad,String>(rs.getMetaData().getColumnName(1)));
                        tcid.setCellValueFactory(new PropertyValueFactory<getAcad,String>(rs.getMetaData().getColumnName(2)));
                        tcdt.setCellValueFactory(new PropertyValueFactory<getAcad,String>(rs.getMetaData().getColumnName(3)));
                        teid.setCellValueFactory(new PropertyValueFactory<getAcad,String>(rs.getMetaData().getColumnName(4)));

                        tname.setMinWidth(200);
                        tcid.setMinWidth(100);
                        tcdt.setMinWidth(150);
                        teid.setMinWidth(100);
                        table1.setItems(list);
                        table1.getColumns().addAll(tname,tcid,tcdt,teid);
                        }
                     catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    String man1 = "select * from `hostel`;";
                    TableView<getHost> table2 = new TableView<getHost>();
                    table2.setEditable(true);
                    table2.setMaxWidth(405);

        
                    try {
                        ResultSet rs = st.executeQuery(man1);
                        rs=st.executeQuery(man1);

                        TableColumn<getHost, String> tname=new TableColumn<>("Hostel Name");
                        TableColumn<getHost,String> tcid =new TableColumn<>("Hostel Block") ;
                        TableColumn<getHost,String> teid=new TableColumn<>("Hostel Capacity");
                        ObservableList<getHost> list=FXCollections.observableArrayList();
                        while(rs.next())
                        {
                            list.add(new getHost(rs.getString(1), rs.getString(2), rs.getString(3)));
                        }
                        tname.setCellValueFactory(new PropertyValueFactory<getHost,String>(rs.getMetaData().getColumnName(1)));
                        tcid.setCellValueFactory(new PropertyValueFactory<getHost,String>(rs.getMetaData().getColumnName(2)));
                        teid.setCellValueFactory(new PropertyValueFactory<getHost,String>(rs.getMetaData().getColumnName(3)));

                        tname.setMinWidth(200);
                        tcid.setMinWidth(100);
                        teid.setMinWidth(100);
                        table2.setItems(list);
                        table2.getColumns().addAll(tname,tcid,teid);
                        }
                     catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }

                    String man2 = "select * from `shop`;";
                    TableView<getShop> table3 = new TableView<getShop>();
                    table3.setEditable(true);
                    table3.setMaxWidth(455);
        
                    try {
                        ResultSet rs = st.executeQuery(man2);
                        rs=st.executeQuery(man2);

                        TableColumn<getShop, String> tname=new TableColumn<>("Shop Name");
                        TableColumn<getShop,String> tcid =new TableColumn<>("Building") ;
                        TableColumn<getShop,String> teid =new TableColumn<>("Open Hours") ;
                        ObservableList<getShop> list=FXCollections.observableArrayList();
                        while(rs.next())
                        {
                            list.add(new getShop(rs.getString(1), rs.getString(2), rs.getString(3)));
                        }
                        tname.setCellValueFactory(new PropertyValueFactory<getShop,String>(rs.getMetaData().getColumnName(1)));
                        tcid.setCellValueFactory(new PropertyValueFactory<getShop,String>(rs.getMetaData().getColumnName(2)));
                        teid.setCellValueFactory(new PropertyValueFactory<getShop,String>(rs.getMetaData().getColumnName(3)));

                        tname.setMinWidth(200);
                        tcid.setMinWidth(150);
                        teid.setMinWidth(100);
                        table3.setItems(list);
                        table3.getColumns().addAll(tname,tcid,teid);
                        }
                     catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }

                    BorderPane bpt1 = new BorderPane();
                            HBox hbt1 = new HBox();
                            bpt1.setTop(hbt1);
                            HBox hbt2 = new HBox();
                            bpt1.setBottom(hbt2);
                            bpt1.setLeft(table1);
                            bpt1.setCenter(table2);
                            bpt1.setRight(table3);
                            Label lablet = new Label("Infrastructure Details");
                            lablet.setPadding(new Insets(50));
                            lablet.setFont(new Font("Cambria bold", 50));
                            lablet.setTextFill(Color.BLACK);

                            hbt1.setAlignment(Pos.CENTER);
                            hbt1.getChildren().addAll(lablet);
                            hbt2.setAlignment(Pos.TOP_CENTER);
                            hbt2.getChildren().addAll(buttontb);
                            hbt2.setPadding(new Insets(20, 0, 150, 0));
                            bpt1.setPadding(new Insets(0,20,0,20));
                            BackgroundFill background_fillt = new BackgroundFill(Color.GRAY,CornerRadii.EMPTY,
                                    Insets.EMPTY);

                            // create Background
                            Background backgroundt = new Background(background_fillt);

                            // set background
                            bpt1.setBackground(backgroundt);
                    Scene scenevab = new Scene(bpt1,1520,800);        

                    primaryStage.setScene(scenevab);
                }); 


                buttontb.setOnAction(e -> {
                    primaryStage.setScene(scene4);
                });

// UPDATE BUTTONS
                button58.setOnAction(e -> {
                    primaryStage.setScene(sceneuch);
                });
                buttonu1.setOnAction(e -> {
                    primaryStage.setScene(sceneusrh);
                });
                buttonu2.setOnAction(e -> {
                    primaryStage.setScene(sceneucd);
                });
                buttonu3.setOnAction(e -> {
                    primaryStage.setScene(scenechange);
                });
                buttonu12.setOnAction(e -> {
                    primaryStage.setScene(sceneuch);
                });

                Button button15u, button16u,button17u;
                button15u = new Button();
                button15u.setText("Update");
                button15u.setFont(new Font("Arial", 25));
                button16u = new Button();
                button16u.setText("\tBack\t");
                button16u.setFont(new Font("Arial", 25));
                button17u = new Button();
                button17u.setText("\tBack\t");
                button17u.setFont(new Font("Arial", 25));
                TextField nameu = new TextField();
                TextField ageu = new TextField();
                TextField hostpu = new TextField();
                TextField phoneu = new TextField();
                TextField depu = new TextField();
                TextField hosbu = new TextField();
                TextField gnameu = new TextField();
                TextField gageu = new TextField();
                TextField gphoneu = new TextField();
                TextField relu = new TextField();
                TextField disgu = new TextField();

                buttonu13.setOnAction(e -> {

                    // UPDATE student

                    String man = "select * from studentguardian where `RegistrationNumber`='" + regnou.getText() + "'";
                    try {
                        ResultSet rs = st.executeQuery(man);
                        if (rs.next()) {
                            BorderPane bpu3 = new BorderPane();
                            HBox hbu4 = new HBox();
                            bpu3.setTop(hbu4);
                            GridPane layoutu4 = new GridPane();
                            bpu3.setCenter(layoutu4);
                            layoutu4.setPadding(new Insets(10));
                            layoutu4.setVgap(30);
                            layoutu4.setHgap(30);
                            Label lableu5 = new Label("UPDATE DETAILS");
                            lableu5.setPadding(new Insets(40));
                            lableu5.setFont(new Font("Cambria bold", 50));
                            lableu5.setTextFill(Color.BLACK);

                            Label lableu6 = new Label("Name:");
                            lableu6.setFont(new Font("Arial bold", 25));
                            nameu.setText(rs.getString(1));
                            nameu.setFont(Font.font("Arial", 25));

                            Label lableu7 = new Label("Age:");
                            lableu7.setFont(new Font("Arial bold", 25));
                            ageu.setText(rs.getString(3));
                            ageu.setFont(Font.font("Arial", 25));

                            Label lable8u = new Label("Hostel Type (Hosteller/Day Scholar):");
                            lable8u.setFont(new Font("Arial bold", 25));
                            hostpu.setText(rs.getString(4));
                            hostpu.setFont(Font.font("Arial", 25));

                            Label lable9u = new Label("Phone Number:");
                            lable9u.setFont(new Font("Arial bold", 25));
                            phoneu.setText(rs.getString(5));
                            phoneu.setFont(Font.font("Arial", 25));

                            Label lable10u = new Label("Department:");
                            lable10u.setFont(new Font("Arial bold", 25));
                            depu.setText(rs.getString(6));
                            depu.setFont(Font.font("Arial", 25));

                            Label lable11u = new Label("Hostel Block:");
                            lable11u.setFont(new Font("Arial bold", 25));
                            hosbu.setText(rs.getString(7));
                            hosbu.setFont(Font.font("Arial", 25));

                            Label lable12u = new Label("Guardian Name:");
                            lable12u.setFont(new Font("Arial bold", 25));
                            gnameu.setText(rs.getString(9));
                            gnameu.setFont(Font.font("Arial", 25));

                            Label lable13u = new Label("Guardian Age:");
                            lable13u.setFont(new Font("Arial bold", 25));
                            gageu.setText(rs.getString(10));
                            gageu.setFont(Font.font("Arial", 25));

                            Label lable14u = new Label("Guardian Phone Number:");
                            lable14u.setFont(new Font("Arial bold", 25));
                            gphoneu.setText(rs.getString(11));
                            gphoneu.setFont(Font.font("Arial", 25));

                            Label lable15u = new Label("Relation with Student:");
                            lable15u.setFont(new Font("Arial bold", 25));
                            relu.setText(rs.getString(12));
                            relu.setFont(Font.font("Arial", 25));

                            Label lable16u = new Label("Students Email ID:");
                            lable16u.setFont(new Font("Arial bold", 25));
                            Label lable17u = new Label(rs.getString(8));
                            lable17u.setFont(new Font("Arial bold", 20));

                            GridPane.setConstraints(lableu6, 0, 0);
                            GridPane.setConstraints(nameu, 1, 0);
                            GridPane.setConstraints(lableu7, 0, 1);
                            GridPane.setConstraints(ageu, 1, 1);
                            GridPane.setConstraints(lable8u, 0, 2);
                            GridPane.setConstraints(hostpu, 1, 2);
                            GridPane.setConstraints(lable9u, 0, 3);
                            GridPane.setConstraints(phoneu, 1, 3);
                            GridPane.setConstraints(lable10u, 0, 4);
                            GridPane.setConstraints(depu, 1, 4);
                            GridPane.setConstraints(lable11u, 0, 5);
                            GridPane.setConstraints(hosbu, 1, 5);
                            GridPane.setConstraints(lable12u, 2, 0);
                            GridPane.setConstraints(gnameu, 3, 0);
                            GridPane.setConstraints(lable13u, 2, 1);
                            GridPane.setConstraints(gageu, 3, 1);
                            GridPane.setConstraints(lable14u, 2, 2);
                            GridPane.setConstraints(gphoneu, 3, 2);
                            GridPane.setConstraints(lable15u, 2, 3);
                            GridPane.setConstraints(relu, 3, 3);
                            GridPane.setConstraints(lable16u, 2, 4);
                            GridPane.setConstraints(lable17u, 3, 4);
                            GridPane.setConstraints(button15u, 1, 6);
                            GridPane.setConstraints(button16u, 2, 6);

                            button15u.setMinWidth(250);
                            button16u.setMinWidth(250);

                            hbu4.setAlignment(Pos.CENTER);
                            hbu4.getChildren().addAll(lableu5);
                            layoutu4.getChildren().addAll(lableu6, nameu, lableu7, ageu, lable8u, hostpu, lable9u,
                                    phoneu, lable10u, depu, lable11u, hosbu, lable12u, gnameu, lable13u, gageu,
                                    lable14u, gphoneu, lable15u, relu, lable16u, lable17u, button15u, button16u);
                            layoutu4.setAlignment(Pos.TOP_CENTER);
                            BackgroundFill background_fillu4 = new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY,
                                    Insets.EMPTY);

                            // create Background
                            Background backgroundu4 = new Background(background_fillu4);

                            // set background
                            bpu3.setBackground(backgroundu4);
                            Scene sceneups = new Scene(bpu3, 1520, 800);
                            primaryStage.setScene(sceneups);

                            button15u.setOnAction(e0 -> {
                                
                                String rn=regnou.getText();
                                String na[] = nameu.getText().split(" ");
                                String ena = "";
                                System.out.println(name.getText());
                                for (int i = 0; i < na.length; i++)
                                    ena += na[i].toLowerCase();
                                lable17u.setText(ena + (rn.toLowerCase() + "@myvit.ac.in"));
                                String man2 = "update `studentguardian` set `Name`='"+nameu.getText()+"',`Age`='"+ ageu.getText()+"',`HostelType`='"+
                                hostpu.getText()+"',`MobileNumber`='"+phoneu.getText()+"',`Email_ID`='"+(ena + (rn.toLowerCase() + "@myvit.ac.in"))+
                                "',`HostelBlock`='"+hosbu.getText()+"',`Department`='"+depu.getText()+"',`GuardianName`='"+gnameu.getText()
                                +"',`GuardianAge`='"+gageu.getText()+"',`GMobile`='"+gphoneu.getText()+"',`GuardianRelation`='"+relu.getText()
                                +"' where `RegistrationNumber`='"+rn+"';";
                                try {
                                    st.executeUpdate(man2);
                                } catch (SQLException e1) {
                                    // TODO Auto-generated catch block
                                    e1.printStackTrace();
                                }
                        boolean v = alertbox.display("Update", "Student Details Successfully Updated");
                        System.out.println(regnou.getText() + v);
                    });


                        } else {
                            boolean v = alertbox.display("Student Details", "No Such Student Registered");
                            System.out.println(regnou.getText() + v);
                        }
                    } catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }

                });
                buttonu14.setOnAction(e -> {
                    regnou.clear();
                    primaryStage.setScene(sceneuch);
                });
//UPDATE ADMIN BOARD

                buttonu15.setOnAction(e -> {
                     // UPDATE ADMIN

                     String man = "select * from `administration board` where `Designation`='" + dsgu.getText() + "'";
                     try {
                         ResultSet rs = st.executeQuery(man);
                         if (rs.next()) {
                             BorderPane bpu3 = new BorderPane();
                             HBox hbu4 = new HBox();
                             bpu3.setTop(hbu4);
                             GridPane layoutu4 = new GridPane();
                             bpu3.setCenter(layoutu4);
                             layoutu4.setPadding(new Insets(10));
                             layoutu4.setVgap(30);
                             layoutu4.setHgap(30);
                             Label lableu5 = new Label("UPDATE DETAILS");
                             lableu5.setPadding(new Insets(40));
                             lableu5.setFont(new Font("Cambria bold", 50));
                             lableu5.setTextFill(Color.BLACK);
 
                             Label lableu6 = new Label("Name:");
                             lableu6.setFont(new Font("Arial bold", 25));
                             nameu.setText(rs.getString(1));
                             nameu.setFont(Font.font("Arial", 25));
 
                             Label lableu7 = new Label("Age:");
                             lableu7.setFont(new Font("Arial bold", 25));
                             ageu.setText(rs.getString(2));
                             ageu.setFont(Font.font("Arial", 25));
 
                             Label lable8u = new Label("Phone Number:");
                             lable8u.setFont(new Font("Arial bold", 25));
                             phoneu.setText(rs.getString(3));
                             phoneu.setFont(Font.font("Arial", 25));
 
                             Label lable9u = new Label("Email ID:");
                             lable9u.setFont(new Font("Arial bold", 25));
                             Label lable10u = new Label(rs.getString(5));
                             lable10u.setFont(new Font("Arial bold", 25));
 
                             GridPane.setConstraints(lableu6, 0, 0);
                             GridPane.setConstraints(nameu, 1, 0);
                             GridPane.setConstraints(lableu7, 0, 1);
                             GridPane.setConstraints(ageu, 1, 1);
                             GridPane.setConstraints(lable8u, 0, 2);
                             GridPane.setConstraints(phoneu, 1, 2);
                             GridPane.setConstraints(lable9u, 0, 3);
                             GridPane.setConstraints(lable10u, 1, 3);
                             GridPane.setConstraints(button15u, 0, 6);
                             GridPane.setConstraints(button17u, 1, 6);
 
                             button15u.setMinWidth(250);
                             button17u.setMinWidth(250);
 
                             hbu4.setAlignment(Pos.CENTER);
                             hbu4.getChildren().addAll(lableu5);
                             layoutu4.getChildren().addAll(lableu6, nameu, lableu7, ageu, lable8u, phoneu, lable9u,
                             lable10u,button15u, button17u);
                             layoutu4.setAlignment(Pos.TOP_CENTER);
                             BackgroundFill background_fillu4 = new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY,
                                     Insets.EMPTY);
 
                             // create Background
                             Background backgroundu4 = new Background(background_fillu4);
 
                             // set background
                             bpu3.setBackground(backgroundu4);
                             Scene sceneups = new Scene(bpu3, 1520, 800);
                             primaryStage.setScene(sceneups);
 
                             button15u.setOnAction(e0 -> {
                                 
                                 String man2 = "update `administration board` set `Name`='"+nameu.getText()+"',`Age`='"
                                 + ageu.getText()+"',`PhoneNumber`='"+phoneu.getText()+"' where `Designation`='"+dsgu.getText()+"';";
                                 try {
                                     st.executeUpdate(man2);
                                 } catch (SQLException e1) {
                                     // TODO Auto-generated catch block
                                     e1.printStackTrace();
                                 }
                         boolean v = alertbox.display("Update", "Administration Board Details Successfully Updated");
                         System.out.println(regnou.getText() + v);
                     });
 
 
                         } else {
                             boolean v = alertbox.display("Admin Board update", "Adminstration Member not Registered");
                             System.out.println(dsgu.getText() + v);
                         }
                     } catch (SQLException e1) {
                         // TODO Auto-generated catch block
                         e1.printStackTrace();
                     }
 
                });
                buttonu4.setOnAction(e -> {
                    dsgu.clear();
                    primaryStage.setScene(sceneabsrh);
                });


                buttonu17.setOnAction(e -> {
                    regnou.clear();
                    primaryStage.setScene(sceneucd);
                });


            button16u.setOnAction(e->{
                primaryStage.setScene(sceneuch);
                regnou.clear();
            });
            button17u.setOnAction(e->{
                primaryStage.setScene(sceneucd);
                dsgu.clear();
            });
            button59.setOnAction(e->{
                primaryStage.setScene(scenedch);
            });
            button61.setOnAction(e->{
                primaryStage.setScene(scene5);
            });

            buttonu5.setOnAction(e -> {
                deptu.clear();
                primaryStage.setScene(scenedensrh);
            });
            buttonu18.setOnAction(e -> {
// UPDATE DEAN

                String man = "select * from `dean` where `Department`='" + deptu.getText() + "'";
                try {
                    ResultSet rs = st.executeQuery(man);
                    if (rs.next()) {
                        BorderPane bpu3 = new BorderPane();
                        HBox hbu4 = new HBox();
                        bpu3.setTop(hbu4);
                        GridPane layoutu4 = new GridPane();
                        bpu3.setCenter(layoutu4);
                        layoutu4.setPadding(new Insets(10));
                        layoutu4.setVgap(30);
                        layoutu4.setHgap(30);
                        Label lableu5 = new Label("UPDATE DEAN");
                        lableu5.setPadding(new Insets(40));
                        lableu5.setFont(new Font("Cambria bold", 50));
                        lableu5.setTextFill(Color.BLACK);

                        Label lableu6 = new Label("Name:");
                        lableu6.setFont(new Font("Arial bold", 25));
                        nameu.setText(rs.getString(1));
                        nameu.setFont(Font.font("Arial", 25));

                        Label lableu7 = new Label("Age:");
                        lableu7.setFont(new Font("Arial bold", 25));
                        ageu.setText(rs.getString(2));
                        ageu.setFont(Font.font("Arial", 25));

                        Label lable8u = new Label("Phone Number:");
                        lable8u.setFont(new Font("Arial bold", 25));
                        phoneu.setText(rs.getString(4));
                        phoneu.setFont(Font.font("Arial", 25));

                        Label lable9u = new Label("Email ID:");
                        lable9u.setFont(new Font("Arial bold", 25));
                        Label lable10u = new Label(rs.getString(5));
                        lable10u.setFont(new Font("Arial bold", 25));

                        GridPane.setConstraints(lableu6, 0, 0);
                        GridPane.setConstraints(nameu, 1, 0);
                        GridPane.setConstraints(lableu7, 0, 1);
                        GridPane.setConstraints(ageu, 1, 1);
                        GridPane.setConstraints(lable8u, 0, 2);
                        GridPane.setConstraints(phoneu, 1, 2);
                        GridPane.setConstraints(lable9u, 0, 3);
                        GridPane.setConstraints(lable10u, 1, 3);
                        GridPane.setConstraints(button15u, 0, 6);
                        GridPane.setConstraints(button17u, 1, 6);

                        button15u.setMinWidth(250);
                        button17u.setMinWidth(250);

                        hbu4.setAlignment(Pos.CENTER);
                        hbu4.getChildren().addAll(lableu5);
                        layoutu4.getChildren().addAll(lableu6, nameu, lableu7, ageu, lable8u, phoneu, lable9u,
                        lable10u,button15u, button17u);
                        layoutu4.setAlignment(Pos.TOP_CENTER);
                        BackgroundFill background_fillu4 = new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY,
                                Insets.EMPTY);

                        // create Background
                        Background backgroundu4 = new Background(background_fillu4);

                        // set background
                        bpu3.setBackground(backgroundu4);
                        Scene sceneups = new Scene(bpu3, 1520, 800);
                        primaryStage.setScene(sceneups);

                        button15u.setOnAction(e0 -> {
                            
                            String man2 = "update `dean` set `Name`='"+nameu.getText()+"',`Age`='"
                            + ageu.getText()+"',`PhoneNumber`='"+phoneu.getText()+"' where `Department`='"+deptu.getText()+"';";
                            try {
                                st.executeUpdate(man2);
                            } catch (SQLException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                            }
                    boolean v = alertbox.display("Update", "Dean Details Successfully Updated");
                    System.out.println(regnou.getText() + v);
                });


                    } else {
                        boolean v = alertbox.display("Dean Details", "Dean Not Registered");
                        System.out.println(dsgu.getText() + v);
                    }
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

           });
            buttonu19.setOnAction(e->{
                primaryStage.setScene(sceneucd);
            });
            buttonu6.setOnAction(e->{
                hodidu.clear();
                primaryStage.setScene(scenehodsrh);
            });
            buttonu20.setOnAction(e->{
// UPDATE HOD

                 String man = "select * from `hod` where `HOD_ID`='" + hodidu.getText() + "'";
                 try {
                     ResultSet rs = st.executeQuery(man);
                     if (rs.next()) {
                         BorderPane bpu3 = new BorderPane();
                         HBox hbu4 = new HBox();
                         bpu3.setTop(hbu4);
                         GridPane layoutu4 = new GridPane();
                         bpu3.setCenter(layoutu4);
                         layoutu4.setPadding(new Insets(10));
                         layoutu4.setVgap(30);
                         layoutu4.setHgap(30);
                         Label lableu5 = new Label("UPDATE HOD");
                         lableu5.setPadding(new Insets(40));
                         lableu5.setFont(new Font("Cambria bold", 50));
                         lableu5.setTextFill(Color.BLACK);
 
                         Label lableu6 = new Label("Name:");
                         lableu6.setFont(new Font("Arial bold", 25));
                         nameu.setText(rs.getString(1));
                         nameu.setFont(Font.font("Arial", 25));
 
                         Label lableu7 = new Label("Age:");
                         lableu7.setFont(new Font("Arial bold", 25));
                         ageu.setText(rs.getString(3));
                         ageu.setFont(Font.font("Arial", 25));
 
                         Label lable8u = new Label("Phone Number:");
                         lable8u.setFont(new Font("Arial bold", 25));
                         phoneu.setText(rs.getString(5));
                         phoneu.setFont(Font.font("Arial", 25));
 
                         Label lable9u = new Label("Email ID:");
                         lable9u.setFont(new Font("Arial bold", 25));
                         Label lable10u = new Label(rs.getString(7));
                         lable10u.setFont(new Font("Arial bold", 25));
 
                         GridPane.setConstraints(lableu6, 0, 0);
                         GridPane.setConstraints(nameu, 1, 0);
                         GridPane.setConstraints(lableu7, 0, 1);
                         GridPane.setConstraints(ageu, 1, 1);
                         GridPane.setConstraints(lable8u, 0, 2);
                         GridPane.setConstraints(phoneu, 1, 2);
                         GridPane.setConstraints(lable9u, 0, 3);
                         GridPane.setConstraints(lable10u, 1, 3);
                         GridPane.setConstraints(button15u, 0, 6);
                         GridPane.setConstraints(button17u, 1, 6);
 
                         button15u.setMinWidth(250);
                         button17u.setMinWidth(250);
 
                         hbu4.setAlignment(Pos.CENTER);
                         hbu4.getChildren().addAll(lableu5);
                         layoutu4.getChildren().addAll(lableu6, nameu, lableu7, ageu, lable8u, phoneu, lable9u,
                         lable10u,button15u, button17u);
                         layoutu4.setAlignment(Pos.TOP_CENTER);
                         BackgroundFill background_fillu4 = new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY,
                                 Insets.EMPTY);
 
                         // create Background
                         Background backgroundu4 = new Background(background_fillu4);
 
                         // set background
                         bpu3.setBackground(backgroundu4);
                         Scene sceneups = new Scene(bpu3, 1520, 800);
                         primaryStage.setScene(sceneups);
 
                         button15u.setOnAction(e0 -> {
                             
                             String man2 = "update `hod` set `Name`='"+nameu.getText()+"',`Age`='"
                             + ageu.getText()+"',`PhoneNumber`='"+phoneu.getText()+"' where `HOD_ID`='"+hodidu.getText()+"';";
                             try {
                                 st.executeUpdate(man2);
                             } catch (SQLException e1) {
                                 // TODO Auto-generated catch block
                                 e1.printStackTrace();
                             }
                     boolean v = alertbox.display("Update", "HOD Details Successfully Updated");
                     System.out.println(nameu.getText() + v);
                 });
 
 
                     } else {
                         boolean v = alertbox.display("HOD Details", "HOD Not Registered");
                         System.out.println(dsgu.getText() + v);
                     }
                 } catch (SQLException e1) {
                     // TODO Auto-generated catch block
                     e1.printStackTrace();
                 }
            });
            buttonu21.setOnAction(e->{
                primaryStage.setScene(sceneucd);
            });

            buttonu7.setOnAction(e->{
                fidu.clear();
                primaryStage.setScene(scenefsrh);
            });
            buttonu22.setOnAction(e->{
// UPDATE FACULTY

                 String man = "select * from `faculty` where `FacultiID`='" + fidu.getText() + "'";
                 try {
                     ResultSet rs = st.executeQuery(man);
                     if (rs.next()) {
                         BorderPane bpu3 = new BorderPane();
                         HBox hbu4 = new HBox();
                         bpu3.setTop(hbu4);
                         GridPane layoutu4 = new GridPane();
                         bpu3.setCenter(layoutu4);
                         layoutu4.setPadding(new Insets(10));
                         layoutu4.setVgap(30);
                         layoutu4.setHgap(30);
                         Label lableu5 = new Label("UPDATE FACULTY");
                         lableu5.setPadding(new Insets(40));
                         lableu5.setFont(new Font("Cambria bold", 50));
                         lableu5.setTextFill(Color.BLACK);
 
                         Label lableu6 = new Label("Name:");
                         lableu6.setFont(new Font("Arial bold", 25));
                         nameu.setText(rs.getString(1));
                         nameu.setFont(Font.font("Arial", 25));
 
                         Label lableu7 = new Label("Age:");
                         lableu7.setFont(new Font("Arial bold", 25));
                         ageu.setText(rs.getString(3));
                         ageu.setFont(Font.font("Arial", 25));
 
                         Label lable8u = new Label("Phone Number:");
                         lable8u.setFont(new Font("Arial bold", 25));
                         phoneu.setText(rs.getString(4));
                         phoneu.setFont(Font.font("Arial", 25));
 
                         Label lable9u = new Label("Email ID:");
                         lable9u.setFont(new Font("Arial bold", 25));
                         Label lable10u = new Label(rs.getString(6));
                         lable10u.setFont(new Font("Arial bold", 25));

                         Label lable12u = new Label("Designation:");
                         lable12u.setFont(new Font("Arial bold", 25));
                         disgu.setText(rs.getString(5));
                         disgu.setFont(Font.font("Arial", 25));

                         Label lable13u = new Label("Department ID:");
                         lable13u.setFont(new Font("Arial bold", 25));
                         depu.setText(rs.getString(8));
                         depu.setFont(Font.font("Arial", 25));
 
                         GridPane.setConstraints(lableu6, 0, 0);
                         GridPane.setConstraints(nameu, 1, 0);
                         GridPane.setConstraints(lableu7, 0, 1);
                         GridPane.setConstraints(ageu, 1, 1);
                         GridPane.setConstraints(lable8u, 0, 2);
                         GridPane.setConstraints(phoneu, 1, 2);
                         GridPane.setConstraints(lable12u, 0, 3);
                         GridPane.setConstraints(disgu, 1, 3);
                         GridPane.setConstraints(lable13u, 0, 4);
                         GridPane.setConstraints(depu, 1, 4);
                         GridPane.setConstraints(lable9u, 0, 5);
                         GridPane.setConstraints(lable10u, 1, 5);
                         GridPane.setConstraints(button15u, 0, 7);
                         GridPane.setConstraints(button17u, 1, 7);
 
                         button15u.setMinWidth(250);
                         button17u.setMinWidth(250);
 
                         hbu4.setAlignment(Pos.CENTER);
                         hbu4.getChildren().addAll(lableu5);
                         layoutu4.getChildren().addAll(lableu6, nameu, lableu7, ageu, lable8u, phoneu,lable12u, disgu,lable13u, depu, lable9u,
                         lable10u,button15u, button17u);
                         layoutu4.setAlignment(Pos.TOP_CENTER);
                         BackgroundFill background_fillu4 = new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY,
                                 Insets.EMPTY);
 
                         // create Background
                         Background backgroundu4 = new Background(background_fillu4);
 
                         // set background
                         bpu3.setBackground(backgroundu4);
                         Scene sceneups = new Scene(bpu3, 1520, 800);
                         primaryStage.setScene(sceneups);
 
                         button15u.setOnAction(e0 -> {
                             
                             String man2 = "update `faculty` set `Name`='"+nameu.getText()+"',`Age`='"
                             + ageu.getText()+"',`PhoneNumber`='"+phoneu.getText()+"',`Designation`='"+disgu.getText()+"',`Department_ID`='"+depu.getText()+"' where `FacultiID`='"+fidu.getText()+"';";
                             try {
                                 st.executeUpdate(man2);
                             } catch (SQLException e1) {
                                 // TODO Auto-generated catch block
                                 e1.printStackTrace();
                             }
                     boolean v = alertbox.display("Update", "Faculty Details Successfully Updated");
                     System.out.println(nameu.getText() + v);
                 });
 
 
                     } else {
                         boolean v = alertbox.display("Faculty Details", "Faculty Not Registered");
                         System.out.println(disgu.getText() + v);
                     }
                 } catch (SQLException e1) {
                     // TODO Auto-generated catch block
                     e1.printStackTrace();
                 }
            });

            buttonu23.setOnAction(e->{
                primaryStage.setScene(sceneucd);
            });

            buttonu10.setOnAction(e->{
                mtidu.clear();
                primaryStage.setScene(scenemtsrh);
            });
            buttonu24.setOnAction(e->{
// UPDATE Maintenance Staff

                 String man = "select * from `maintainence staff` where `Employee_ID`='" + mtidu.getText() + "'";
                 try {
                     ResultSet rs = st.executeQuery(man);
                     if (rs.next()) {
                         BorderPane bpu3 = new BorderPane();
                         HBox hbu4 = new HBox();
                         bpu3.setTop(hbu4);
                         GridPane layoutu4 = new GridPane();
                         bpu3.setCenter(layoutu4);
                         layoutu4.setPadding(new Insets(10));
                         layoutu4.setVgap(30);
                         layoutu4.setHgap(30);
                         Label lableu5 = new Label("UPDATE MAINTENANCE");
                         lableu5.setPadding(new Insets(40));
                         lableu5.setFont(new Font("Cambria bold", 50));
                         lableu5.setTextFill(Color.BLACK);
 
                         Label lableu6 = new Label("Name:");
                         lableu6.setFont(new Font("Arial bold", 25));
                         nameu.setText(rs.getString(1));
                         nameu.setFont(Font.font("Arial", 25));
 
                         Label lableu7 = new Label("Age:");
                         lableu7.setFont(new Font("Arial bold", 25));
                         ageu.setText(rs.getString(3));
                         ageu.setFont(Font.font("Arial", 25));
 
                         Label lable8u = new Label("Phone Number:");
                         lable8u.setFont(new Font("Arial bold", 25));
                         phoneu.setText(rs.getString(5));
                         phoneu.setFont(Font.font("Arial", 25));
 
                         Label lable9u = new Label("Employee ID:");
                         lable9u.setFont(new Font("Arial bold", 25));
                         Label lable10u = new Label(rs.getString(2));
                         lable10u.setFont(new Font("Arial bold", 25));

                         Label lable12u = new Label("Designation:");
                         lable12u.setFont(new Font("Arial bold", 25));
                         disgu.setText(rs.getString(6));
                         disgu.setFont(Font.font("Arial", 25));

                         Label lable13u = new Label("Workplace:");
                         lable13u.setFont(new Font("Arial bold", 25));
                         depu.setText(rs.getString(4));
                         depu.setFont(Font.font("Arial", 25));
 
                         GridPane.setConstraints(lableu6, 0, 0);
                         GridPane.setConstraints(nameu, 1, 0);
                         GridPane.setConstraints(lableu7, 0, 1);
                         GridPane.setConstraints(ageu, 1, 1);
                         GridPane.setConstraints(lable8u, 0, 2);
                         GridPane.setConstraints(phoneu, 1, 2);
                         GridPane.setConstraints(lable12u, 0, 3);
                         GridPane.setConstraints(disgu, 1, 3);
                         GridPane.setConstraints(lable13u, 0, 4);
                         GridPane.setConstraints(depu, 1, 4);
                         GridPane.setConstraints(lable9u, 0, 5);
                         GridPane.setConstraints(lable10u, 1, 5);
                         GridPane.setConstraints(button15u, 0, 7);
                         GridPane.setConstraints(button17u, 1, 7);
 
                         button15u.setMinWidth(250);
                         button17u.setMinWidth(250);
 
                         hbu4.setAlignment(Pos.CENTER);
                         hbu4.getChildren().addAll(lableu5);
                         layoutu4.getChildren().addAll(lableu6, nameu, lableu7, ageu, lable8u, phoneu,lable12u, disgu,lable13u, depu, lable9u,
                         lable10u,button15u, button17u);
                         layoutu4.setAlignment(Pos.TOP_CENTER);
                         BackgroundFill background_fillu4 = new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY,
                                 Insets.EMPTY);
 
                         // create Background
                         Background backgroundu4 = new Background(background_fillu4);
 
                         // set background
                         bpu3.setBackground(backgroundu4);
                         Scene sceneups = new Scene(bpu3, 1520, 800);
                         primaryStage.setScene(sceneups);
 
                         button15u.setOnAction(e0 -> {
                             
                             String man2 = "update `maintainence staff` set `Name`='"+nameu.getText()+"',`Age`='"
                             + ageu.getText()+"',`PhoneNumber`='"+phoneu.getText()+"',`Designation`='"+disgu.getText()+"',`Workplace`='"+depu.getText()+"' where `Employee_ID`='"+mtidu.getText()+"';";
                             try {
                                 st.executeUpdate(man2);
                             } catch (SQLException e1) {
                                 // TODO Auto-generated catch block
                                 e1.printStackTrace();
                             }
                     boolean v = alertbox.display("Update", "Maintenace Staff Member Successfully Updated");
                     System.out.println(nameu.getText() + v);
                 });
 
 
                     } else {
                         boolean v = alertbox.display("Maintenance Details", "Maintenance Staff Member Not Registered");
                         System.out.println(disgu.getText() + v);
                     }
                 } catch (SQLException e1) {
                     // TODO Auto-generated catch block
                     e1.printStackTrace();
                 }
            });

            buttonu25.setOnAction(e->{
                primaryStage.setScene(sceneucd);
            });


            buttond7.setOnAction(e->{
                primaryStage.setScene(scenechange);
            });

//DELETE BUTTONS

            buttond1.setOnAction(e->{
                primaryStage.setScene(sceneds);
            });
            
            buttond8.setOnAction(e->{
                String man = "select * from studentguardian where `RegistrationNumber`='" + regnod.getText() + "'";
                    try {
                        ResultSet rs = st.executeQuery(man);
                        if (rs.next()) {

                            String man2="DELETE FROM `studentguardian` WHERE (`RegistrationNumber` = '"+regnod.getText()+"');";
                            try {
                                st.executeUpdate(man2);
                            } catch (SQLException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                            }
                            boolean v = alertbox.display("Delete", "Student Details Successfully Deleted");
                        System.out.println(regnou.getText() + v);
                        } 
                        else {
                            boolean v = alertbox.display("Student Details", "No Such Student Registered");
                            System.out.println(regnou.getText() + v);
                        }
                    } catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
            });
            buttond9.setOnAction(e->{
                dsgd.clear();
                primaryStage.setScene(scenedch);
            });
            buttond2.setOnAction(e->{
                primaryStage.setScene(scenedab);
            });

            buttond10.setOnAction(e->{
                String man = "select * from `administration board` where `Designation`='" + dsgd.getText() + "'";
                    try {
                        ResultSet rs = st.executeQuery(man);
                        if (rs.next()) {

                            String man2="DELETE FROM `administration board` WHERE (`Designation` = '"+dsgd.getText()+"');";
                            try {
                                st.executeUpdate(man2);
                            } catch (SQLException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                            }
                            boolean v = alertbox.display("Delete", "Admin Board Member Successfully Deleted");
                        System.out.println(regnou.getText() + v);
                        } 
                        else {
                            boolean v = alertbox.display("Admin Delete", "No Such Admin Board Member Registered");
                            System.out.println(regnou.getText() + v);
                        }
                    } catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
            });
            buttond11.setOnAction(e->{
                depd.clear();
                primaryStage.setScene(scenedch);
            });

            buttond3.setOnAction(e->{
                primaryStage.setScene(scenedde);
            });
        
            buttond12.setOnAction(e->{
                String man = "select * from `dean` where `Department`='" + depd.getText() + "'";
                    try {
                        ResultSet rs = st.executeQuery(man);
                        if (rs.next()) {

                            String man2="DELETE FROM `dean` WHERE (`Department` = '"+depd.getText()+"');";
                            try {
                                st.executeUpdate(man2);
                            } catch (SQLException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                            }
                            boolean v = alertbox.display("Delete", "Dean Successfully Deleted");
                        System.out.println(regnou.getText() + v);
                        } 
                        else {
                            boolean v = alertbox.display("Delete", "No Such Dean Registered");
                            System.out.println(regnou.getText() + v);
                        }
                    } catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
            });

            buttond13.setOnAction(e->{
                depd.clear();
                primaryStage.setScene(scenedch);
            });

            buttond4.setOnAction(e->{
                primaryStage.setScene(scenedhod);
            });
            buttond14.setOnAction(e->{
                String man = "select * from `hod` where `HOD_ID`='" + hodidd.getText() + "'";
                    try {
                        ResultSet rs = st.executeQuery(man);
                        if (rs.next()) {

                            String man2="DELETE FROM `hod` WHERE (`HOD_ID` = '"+hodidd.getText()+"');";
                            try {
                                st.executeUpdate(man2);
                            } catch (SQLException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                            }
                            boolean v = alertbox.display("Delete", "HOD Successfully Deleted");
                        System.out.println(hodidd.getText() + v);
                        } 
                        else {
                            boolean v = alertbox.display("Delete", "No Such HOD Registered");
                            System.out.println(regnou.getText() + v);
                        }
                    } catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
            });
            buttond15.setOnAction(e->{
                hodidd.clear();
                primaryStage.setScene(scenedch);
            });


            buttond5.setOnAction(e->{
                primaryStage.setScene(scenedf);
            });
            buttond16.setOnAction(e->{
                String man = "select * from `faculty` where `FacultiID`='" + fidd.getText() + "'";
                    try {
                        ResultSet rs = st.executeQuery(man);
                        if (rs.next()) {

                            String man2="DELETE FROM `faculty` WHERE (`FacultiID` = '"+fidd.getText()+"');";
                            try {
                                st.executeUpdate(man2);
                            } catch (SQLException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                            }
                            boolean v = alertbox.display("Delete", "Faculty Successfully Deleted");
                        System.out.println(hodidd.getText() + v);
                        } 
                        else {
                            boolean v = alertbox.display("Delete", "No Such Faculty Registered");
                            System.out.println(regnou.getText() + v);
                        }
                    } catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
            });
            buttond17.setOnAction(e->{
                fidd.clear();
                primaryStage.setScene(scenedch);
            });

            buttond6.setOnAction(e->{
                primaryStage.setScene(scenedmt);
            });
            buttond18.setOnAction(e->{
                String man = "select * from `maintainence staff` where `Employee_ID`='" + mtidd.getText() + "'";
                    try {
                        ResultSet rs = st.executeQuery(man);
                        if (rs.next()) {

                            String man2="DELETE FROM `maintainence staff` WHERE (`Employee_ID` = '"+mtidd.getText()+"');";
                            try {
                                st.executeUpdate(man2);
                            } catch (SQLException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                            }
                            boolean v = alertbox.display("Delete", "Maintenance Staff Member Successfully Deleted");
                        System.out.println(hodidd.getText() + v);
                        } 
                        else {
                            boolean v = alertbox.display("Delete", "No Such Maintenance staff Member Registered");
                            System.out.println(regnou.getText() + v);
                        }
                    } catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
            });
            buttond19.setOnAction(e->{
                mtidd.clear();
                primaryStage.setScene(scenedch);
            });


			primaryStage.show();
        }
        catch(SQLException e)
        {
            e.printStackTrace();;
        }
        
    }catch(Exception e) {
			e.printStackTrace();
        }
    }
    
	public static void main(String[] args) {
		launch(args);
    }  
}