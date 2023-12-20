module arthur.cezar.projetopoofinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;


    opens arthur.cezar.projetopoofinal to javafx.fxml;
    exports arthur.cezar.projetopoofinal;
}