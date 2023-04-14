package com.example.innoutfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.text.MessageFormat;

import java.lang.*;
import java.util.*;

public class InNOutController {


    final double bun_price = 0.35;

    List<Double> price_array = new ArrayList<Double>();

    @FXML
    Label titleLabel = new Label("Burger");

    @FXML
    Label titleLabel2 = new Label("Burger");
    @FXML
    Image slot1Image = new Image("https://w7.pngwing.com/pngs/369/24/png-transparent-hamburger-chicken-sandwich-veggie-burger-fast-food-burger-king-food-recipe-fast-food-restaurant.png");
    @FXML
    ImageView slot1View = new ImageView(slot1Image);

    @FXML
    Image slot2Image = new Image("https://w7.pngwing.com/pngs/369/24/png-transparent-hamburger-chicken-sandwich-veggie-burger-fast-food-burger-king-food-recipe-fast-food-restaurant.png");
    @FXML
    ImageView slot2View = new ImageView(slot2Image);

    @FXML
    Image slot3Image = new Image("https://w7.pngwing.com/pngs/369/24/png-transparent-hamburger-chicken-sandwich-veggie-burger-fast-food-burger-king-food-recipe-fast-food-restaurant.png");
    @FXML
    ImageView slot3View = new ImageView(slot3Image);

    @FXML
    Image slot4Image = new Image("https://w7.pngwing.com/pngs/369/24/png-transparent-hamburger-chicken-sandwich-veggie-burger-fast-food-burger-king-food-recipe-fast-food-restaurant.png");
    @FXML
    ImageView slot4View = new ImageView(slot4Image);


    @FXML
    Image slot5Image = new Image("https://w7.pngwing.com/pngs/369/24/png-transparent-hamburger-chicken-sandwich-veggie-burger-fast-food-burger-king-food-recipe-fast-food-restaurant.png");
    @FXML
    ImageView slot5View = new ImageView(slot5Image);

    @FXML
    Image slot6Image = new Image("https://w7.pngwing.com/pngs/369/24/png-transparent-hamburger-chicken-sandwich-veggie-burger-fast-food-burger-king-food-recipe-fast-food-restaurant.png");
    @FXML
    ImageView slot6View = new ImageView(slot6Image);

    @FXML
    Image topImage = new Image("https://w7.pngwing.com/pngs/369/24/png-transparent-hamburger-chicken-sandwich-veggie-burger-fast-food-burger-king-food-recipe-fast-food-restaurant.png");
    @FXML
    ImageView topView = new ImageView(slot6Image);


    Burger burger = new BeefBurger();
    Burger veggieBurger = new VeggieBurger();
    Integer count = 0;
    @FXML
    private Label welcomeText;

    @FXML
    public Label burgerText;
    @FXML
    public Button burgerButton;

    @FXML
    private Button veggieBurgerButton;

    @FXML
    private Button chickenBurgerButton;
    @FXML
    public Button resetButton;

    @FXML
    private Button cheesePutterButton;

    @FXML
    private Button baconButton;

    @FXML
    private Button saladButton;

    @FXML
    private Button onionButton;
    @FXML
    private Button extraPattyButton;


    @FXML
    Label preisLabelBun = new Label("0");

    @FXML
    Label preisLabelPatty = new Label("0");
    @FXML
    Label preisLabel1 = new Label("0");

    @FXML
    Label preisLabel2 = new Label("0");

    @FXML
    Label preisLabel3 = new Label("0");

    @FXML
    Label preisLabel4 = new Label("0");

    @FXML
    Label preisLabel5 = new Label("0");

    @FXML
    Label preisLabel6 = new Label("0");

    @FXML
    Label preisLabelTotal = new Label("0");

    @FXML
    Label lineLabel = new Label("-");


    @FXML
    Image bottomImage = new Image("https://w7.pngwing.com/pngs/369/24/png-transparent-hamburger-chicken-sandwich-veggie-burger-fast-food-burger-king-food-recipe-fast-food-restaurant.png");
    @FXML
    ImageView bottomView = new ImageView(bottomImage);

    @FXML
    Image pattyImage = new Image("https://w7.pngwing.com/pngs/369/24/png-transparent-hamburger-chicken-sandwich-veggie-burger-fast-food-burger-king-food-recipe-fast-food-restaurant.png");
    @FXML
    ImageView pattyView = new ImageView(pattyImage);

    @FXML
    Image veggiePattyImage = new Image("https://w7.pngwing.com/pngs/369/24/png-transparent-hamburger-chicken-sandwich-veggie-burger-fast-food-burger-king-food-recipe-fast-food-restaurant.png");
    @FXML
    ImageView veggiePattyView = new ImageView(veggiePattyImage);

    @FXML
    Image chickenPattyImage = new Image("https://w7.pngwing.com/pngs/369/24/png-transparent-hamburger-chicken-sandwich-veggie-burger-fast-food-burger-king-food-recipe-fast-food-restaurant.png");
    @FXML
    ImageView chickenPattyView = new ImageView(chickenPattyImage);

    @FXML
    Image cheeseImage = new Image("https://w7.pngwing.com/pngs/369/24/png-transparent-hamburger-chicken-sandwich-veggie-burger-fast-food-burger-king-food-recipe-fast-food-restaurant.png");
    @FXML
    ImageView cheeseView = new ImageView(cheeseImage);

    @FXML
    Image baconImage = new Image("https://w7.pngwing.com/pngs/369/24/png-transparent-hamburger-chicken-sandwich-veggie-burger-fast-food-burger-king-food-recipe-fast-food-restaurant.png");
    @FXML
    ImageView baconView = new ImageView(baconImage);

    @FXML
    Image saladImage = new Image("https://w7.pngwing.com/pngs/369/24/png-transparent-hamburger-chicken-sandwich-veggie-burger-fast-food-burger-king-food-recipe-fast-food-restaurant.png");
    @FXML
    ImageView saladView = new ImageView(saladImage);

    @FXML
    Image onionImage = new Image("https://w7.pngwing.com/pngs/369/24/png-transparent-hamburger-chicken-sandwich-veggie-burger-fast-food-burger-king-food-recipe-fast-food-restaurant.png");
    @FXML
    ImageView onionView = new ImageView(saladImage);


//    @FXML
//    protected void makeBurgerAppear(){ burgerView.setVisible(false);}
    @FXML
    protected void onResetButtonClick() {
        cheesePutterButton.setDisable(true);
        baconButton.setDisable(true);
        saladButton.setDisable(true);
        onionButton.setDisable(true);
        burgerButton.setDisable(false);
        veggieBurgerButton.setDisable(false);
        chickenBurgerButton.setDisable(false);
        slot1View.setVisible(false);
        slot2View.setVisible(false);
        slot3View.setVisible(false);
        slot4View.setVisible(false);
        slot5View.setVisible(false);
        slot6View.setVisible(false);
        burgerText.setText("");
        bottomView.setVisible(false);
        topView.setVisible(false);
        pattyView.setVisible(false);
        preisLabelPatty.setVisible(false);
        preisLabel1.setVisible(false);
        preisLabel2.setVisible(false);
        preisLabel3.setVisible(false);
        preisLabel4.setVisible(false);
        preisLabel5.setVisible(false);
        preisLabel6.setVisible(false);
        preisLabelTotal.setVisible(false);
        lineLabel.setVisible(false);
        price_array.clear();
        count = 0;
        burger = new BeefBurger();

    }

    @FXML
    protected void onBurgerButtonClick() {
        burgerText.setText(burger.decorate());
        pattyView.setImage(pattyImage);
        bottomView.setVisible(true);
        pattyView.setViewOrder(-1.0);
        pattyView.setVisible(true);
        BeefBurger.price = 1.30;
        preisLabelPatty.setText(MessageFormat.format("Beef Burger:    {0}.-",BeefBurger.price));
        preisLabelPatty.setVisible(true);
        price_array.add(BeefBurger.price);
        price_array.add(bun_price);
        burgerButton.setDisable(true);
        veggieBurgerButton.setDisable(true);
        chickenBurgerButton.setDisable(true);
        cheesePutterButton.setDisable(false);
        extraPattyButton.setDisable(false);
        baconButton.setDisable(false);
        saladButton.setDisable(false);
        onionButton.setDisable(false);
    }

    @FXML
    protected void onVeggieBurgerButtonClick(){
        burgerText.setText(burger.decorate());
        bottomView.setVisible(true);
        pattyView.setImage(veggiePattyImage);
        pattyView.setViewOrder(-1.0);
        pattyView.setVisible(true);
        BeefBurger.price = 2.45;
        preisLabelPatty.setText(MessageFormat.format("Veggie Burger:    {0}.-",BeefBurger.price));
        preisLabelPatty.setVisible(true);
        price_array.add(BeefBurger.price);
        price_array.add(bun_price);
        burgerButton.setDisable(true);
        veggieBurgerButton.setDisable(true);
        chickenBurgerButton.setDisable(true);
        cheesePutterButton.setDisable(false);
        extraPattyButton.setDisable(false);
        baconButton.setDisable(false);
        saladButton.setDisable(false);
        onionButton.setDisable(false);
    }

    @FXML
    protected void onChickenBurgerButtonClick(){
        burgerText.setText(burger.decorate());
        bottomView.setVisible(true);
        pattyView.setImage(chickenPattyImage);
        pattyView.setViewOrder(-1.0);
        pattyView.setVisible(true);
        BeefBurger.price = 1.50;
        preisLabelPatty.setText(MessageFormat.format("Chicken Burger:    {0}.-",BeefBurger.price));
        preisLabelPatty.setVisible(true);
        price_array.add(BeefBurger.price);
        price_array.add(bun_price);
        burgerButton.setDisable(true);
        veggieBurgerButton.setDisable(true);
        chickenBurgerButton.setDisable(true);
        cheesePutterButton.setDisable(false);
        baconButton.setDisable(false);
        saladButton.setDisable(false);
        extraPattyButton.setDisable(false);
        onionButton.setDisable(false);
    }

    @FXML
    protected void onExtraPattyButtonClick( ) throws IOException {
        if (pattyView.getImage() == pattyImage) {
            BeefBurger.price = 1.30;
            ExtraPatty.name = "Extra beef patty";
            decoratorButtonClick(pattyImage, BeefBurger.price, ExtraPatty.name);
            burger = new ExtraPatty(burger);
            burgerText.setText(burger.decorate());
        } else if (pattyView.getImage() == veggiePattyImage) {
            BeefBurger.price = 2.45;
            ExtraPatty.name = "Extra veggie patty";
            decoratorButtonClick(veggiePattyImage,BeefBurger.price, ExtraPatty.name);
            burger = new ExtraPatty(burger);
            burgerText.setText(burger.decorate());
        } else if (pattyView.getImage() == chickenPattyImage) {
            BeefBurger.price = 1.50;
            ExtraPatty.name = "Extra chicken patty";
            decoratorButtonClick(chickenPattyImage, BeefBurger.price, ExtraPatty.name);
            burger = new ExtraPatty(burger);
            burgerText.setText(burger.decorate());
        }
    };

    @FXML
    protected void onCheeseButtonClick( ) throws IOException {
        decoratorButtonClick(cheeseImage, Cheese.price, Cheese.name);
        burger = new Cheese(burger);
        burgerText.setText(burger.decorate());
    };

    @FXML
    protected void onBaconButtonClick( ){
        decoratorButtonClick(baconImage, Bacon.price, Bacon.name);
        burger = new Bacon(burger);
        burgerText.setText(burger.decorate());
    };
    @FXML
    protected void onSaladButtonClick( ){
        decoratorButtonClick(saladImage, Salad.price, Salad.name);
        burger = new Salad(burger);
        burgerText.setText(burger.decorate());
    };

    @FXML
    protected void onOnionButtonClick( ){
        decoratorButtonClick(onionImage, Onion.price, Onion.name);
        burger = new Onion(burger);
        burgerText.setText(burger.decorate());
    };

    protected void decoratorButtonClick(Image image, double price, String name){
        count++;
        switch (count) {
            case 1 -> {
                slot1View.setImage(image);
                slot1View.setViewOrder(-2.0);
                slot1View.setVisible(true);
                preisLabel1.setText(MessageFormat.format("{0}: {1}.-",name, price));
                preisLabel1.setVisible(true);
                price_array.add(price);
            }
            case 2 -> {
                slot2View.setImage(image);
                slot2View.setViewOrder(-3.0);
                slot2View.setVisible(true);
                preisLabel2.setText(MessageFormat.format("{0}: {1}.-",name, price));
                preisLabel2.setVisible(true);
                price_array.add(price);
            }
            case 3 -> {
                slot3View.setImage(image);
                slot3View.setViewOrder(-4.0);
                slot3View.setVisible(true);
                preisLabel3.setText(MessageFormat.format("{0}: {1}.-",name, price));
                preisLabel3.setVisible(true);
                price_array.add(price);
            }
            case 4 -> {
                slot4View.setImage(image);
                slot4View.setViewOrder(-5.0);
                slot4View.setVisible(true);
                preisLabel4.setText(MessageFormat.format("{0}: {1}.-",name, price));
                preisLabel4.setVisible(true);
                price_array.add(price);
            }
            case 5 -> {
                slot5View.setImage(image);
                slot5View.setViewOrder(-6.0);
                slot5View.setVisible(true);
                preisLabel5.setText(MessageFormat.format("{0}: {1}.-",name, price));
                preisLabel5.setVisible(true);
                price_array.add(price);
            }
            case 6 -> {
                slot6View.setImage(image);
                slot6View.setViewOrder(-7.0);
                slot6View.setVisible(true);
                preisLabel6.setText(MessageFormat.format("{0}: {1}.-",name, price));
                preisLabel6.setVisible(true);
                price_array.add(price);
                double sum = price_array.stream()
                        .mapToDouble(a -> a)
                        .sum();
                preisLabelTotal.setText(MessageFormat.format("Total: {0}.-",sum));
                lineLabel.setVisible(true);
                preisLabelTotal.setVisible(true);
                topView.setViewOrder(-8.0);
                topView.setVisible(true);
                burgerButton.setDisable(true);
                cheesePutterButton.setDisable(true);
                baconButton.setDisable(true);
                saladButton.setDisable(true);
                onionButton.setDisable(true);
                extraPattyButton.setDisable(true);
            }
        }
    }

    public List<Double> getPriceArray() {
        return price_array;
    }
}