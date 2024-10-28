package com.example;

import javafx.collections.ObservableList;

public class PrintHandler {
    public static void printoutValues(){
    //System.out.println("Test123");
    String productType = UIComponents.productComboBox.getValue();

    System.out.println("Lloji i produktit: "+ productType);
    
    String extraTypes = "";
    if(UIComponents.virtualCheckBox.isSelected()){
        extraType += "Virtual";
    }

    if(UIComponents.downloadableCheckBox.isSelected()){
        extraType += "Downloadable";
    }
    
    ObservableList<String> selectedAttributed = UIComponents.
    attributeListView.getSelectionModel.getSelectedItems();

    String attributes = String.join( ",",Selected attributes);
    System.out.println("Product Type: " + productType);
    System.out.println("Extra Type: " + extraType);
    System.out.println("Attributes" + attributes);
 
    }
}
