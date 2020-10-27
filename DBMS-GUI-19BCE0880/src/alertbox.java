import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class alertbox {

    static boolean v=true;

    public static boolean display(String title,String msg)
    {
        Stage window=new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(500);

        Label lable=new Label();
        lable.setText(msg);
        Button ok;
        ok=new Button();
        ok.setText("OK");
        ok.setFont(new Font("Cambria", 20));
        ok.setOnAction(e->{
            v=true;
            window.close();
        });

        VBox layout=new VBox(10);
        layout.setPadding(new Insets(10));
        lable.setPadding(new Insets(10));
        lable.setFont(new Font("Cambria",20));
        layout.getChildren().addAll(lable,ok);
        layout.setAlignment(Pos.CENTER);
        Scene scene=new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        return v;
    }
}
