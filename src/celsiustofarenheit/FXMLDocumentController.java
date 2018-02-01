/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celsiustofarenheit;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author AULA1
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private TextField celsiusField;
    
    @FXML
    private TextField farenField;
   
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        double numer1 = Integer.parseInt(farenField.getText());
       // double numer2 = Integer.parseInt(celsiusField.getText());
        
        double resultado1 = (5.0/9.0);
        double resultado2 = (numer1 - 32);
        double resultado3 = resultado1 * resultado2;
                
        celsiusField.setText(String.valueOf(resultado3));
        
        System.out.println("se convirtio una vez");
        label.setText("¡Convertiste la temperatura!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
