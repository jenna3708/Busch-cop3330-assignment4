module ucf.assignments.assignment40 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires org.testng;

    opens ucf.assignments.assignment40 to javafx.fxml;
    exports ucf.assignments.assignment40;
}