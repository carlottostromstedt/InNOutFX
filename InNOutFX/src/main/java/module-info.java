module com.example.innoutfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.innoutfx to javafx.fxml;
    exports com.example.innoutfx;
}