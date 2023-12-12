package Praktikum6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainPraktikum6 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TableView<Mahasiswa> tableView = new TableView<>();
        TableColumn<Mahasiswa, Integer> idColumn = new TableColumn<>("ID");
        TableColumn<Mahasiswa, String> namaColumn = new TableColumn<>("Nama");
        TableColumn<Mahasiswa, String> nimColumn = new TableColumn<>("NIM");

        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        namaColumn.setCellValueFactory(new PropertyValueFactory<>("nama"));
        nimColumn.setCellValueFactory(new PropertyValueFactory<>("nim"));

        tableView.getColumns().addAll(idColumn, namaColumn, nimColumn);

        tableView.getItems().addAll(
                new Mahasiswa(1, "Mohammad Zaki Firmansah", "2210817110006"),
                new Mahasiswa(2, "Mohammad", "2210817110006"),
                new Mahasiswa(3, "Zaki", "2210817110006"),
                new Mahasiswa(4, "Firmansah", "2210817110006"),
                new Mahasiswa(5, "Zak", "2210817110006"),
                new Mahasiswa(6, "Firm", "2210817110006"),
                new Mahasiswa(7, "Man", "2210817110006"),
                new Mahasiswa(8, "Sah", "2210817110006"),
                new Mahasiswa(9, "Jeki", "2210817110006"),
                new Mahasiswa(10, "Jeky", "2210817110006")
        );

        VBox box = new VBox(tableView);
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
