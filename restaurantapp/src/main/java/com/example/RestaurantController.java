package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RestaurantController {

    @FXML
    private ListView<Food> foodList;  // Ushqime
    @FXML
    private ListView<Food> fishList;  // Peshk
    @FXML
    private ListView<Food> traditionalFoodList;  // Ushqime tradicionale
    @FXML
    private ListView<Drinks> drinkList;  // Pije
    @FXML
    private ListView<Food> breakfastFoodList;  // Mëngjes
    @FXML
    private ListView<IceCream> iceCreamList;  // Embëlsira
    
    @FXML
    private TextField orderTextField;
    @FXML
    private TextArea orderSummary;
    @FXML
    private Label totalPriceLabel;

    private double totalPrice = 0.0;

    @FXML
    public void initialize() {
        // Ushqimet
        foodList.getItems().addAll(
            new Food("Pizza", 10.0),
            new Food("Burger", 5.0),
            new Food("Pasta", 7.0),
            new Food("Sushi", 15.0),
            new Food("Salad", 6.0),
            new Food("Steak", 20.0)
        );
        
        // Peshk
        fishList.getItems().addAll(
            new Food("Peshk i Fërguar", 12.0),
            new Food("Peshk me Oriz dhe Perime", 14.0)
        );

        // Ushqime tradicionale
        traditionalFoodList.getItems().addAll(
            new Food("Flija", 8.0),
            new Food("Tave Kosi", 10.0),
            new Food("Byrek me Mish", 6.0),
            new Food("Kashkavall i Pjekur", 7.0)
        );
        
        // Pije
        drinkList.getItems().addAll(
            new Drinks("Coca Cola", 2.0),
            new Drinks("Pepsi", 2.0),
            new Drinks("Juice", 3.0),
            new Drinks("Water", 1.0),
            new Drinks("Lemonade", 2.5)
        );
        
        // Mëngjes
        breakfastFoodList.getItems().addAll(
            new Food("Buke me Vaj dhe Hudhër", 3.0),
            new Food("Buke e Pjekur me Mjalte", 4.0),
            new Food("Petulla", 5.0)
        );
        
        // Embëlsira
        iceCreamList.getItems().addAll(
            new IceCream("Vanilla", 3.0),
            new IceCream("Chocolate", 3.5),
            new IceCream("Strawberry", 3.2),
            new IceCream("Mint", 3.3),
            new IceCream("Pistachio", 3.8)
        );
    }

    @FXML
    public void handleOrder() {
        // Merrni artikujt e zgjedhur nga përdoruesi
        Food selectedFood = foodList.getSelectionModel().getSelectedItem();
        Food selectedFish = fishList.getSelectionModel().getSelectedItem();
        Food selectedTraditionalFood = traditionalFoodList.getSelectionModel().getSelectedItem();
        Drinks selectedDrink = drinkList.getSelectionModel().getSelectedItem();
        Food selectedBreakfastItem = breakfastFoodList.getSelectionModel().getSelectedItem();
        IceCream selectedIceCream = iceCreamList.getSelectionModel().getSelectedItem();

        // Kontrolloni dhe shtoni çmimin nëse është zgjedhur një artikull
        double orderTotal = 0.0;
        StringBuilder summary = new StringBuilder();

        if (selectedFood != null) {
            orderTotal += selectedFood.getPrice();
            summary.append("Ushqim: " + selectedFood + "\n");
        }
        if (selectedFish != null) {
            orderTotal += selectedFish.getPrice();
            summary.append("Peshk: " + selectedFish + "\n");
        }
        if (selectedTraditionalFood != null) {
            orderTotal += selectedTraditionalFood.getPrice();
            summary.append("Ushqim Tradicional: " + selectedTraditionalFood + "\n");
        }
        if (selectedDrink != null) {
            orderTotal += selectedDrink.getPrice();
            summary.append("Pije: " + selectedDrink + "\n");
        }
        if (selectedBreakfastItem != null) {
            orderTotal += selectedBreakfastItem.getPrice();
            summary.append("Mëngjes: " + selectedBreakfastItem + "\n");
        }
        if (selectedIceCream != null) {
            orderTotal += selectedIceCream.getPrice();
            summary.append("Embëlsirë: " + selectedIceCream + "\n");
        }

        // Shtoni përmbledhjen dhe çmimin total
        orderSummary.setText(summary.toString());
        totalPrice += orderTotal;
        totalPriceLabel.setText("Çmimi Total: $" + totalPrice);
    }

    @FXML
    public void handlePayment() {
        // Paguaj dhe përshtat logjikën përfundimtare të pagesës
        orderSummary.appendText("\nPagesa u krye me sukses!");
        totalPrice = 0.0;
        totalPriceLabel.setText("Çmimi Total: $0.0");
    }
}
