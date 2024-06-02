module org.example.codelab_modul_6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.codelab_modul_6 to javafx.fxml;
    exports org.example.codelab_modul_6;
}