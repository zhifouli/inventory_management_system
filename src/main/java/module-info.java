module top.zhifouli.inventory_management_system {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens top.zhifouli.inventory_management_system to javafx.fxml;
    exports top.zhifouli.inventory_management_system;
}