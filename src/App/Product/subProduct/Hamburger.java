package App.Product.subProduct;

import App.Product.Product;

public class Hamburger extends Product {
    private boolean isBurgerSet;
    private int burgerSetPrice;

    public Hamburger(int id, String name, int price, int kcal, boolean isBurgerSet, int burgerSetprice) {
        super(id, name, price, kcal);
        this.isBurgerSet = isBurgerSet;
        this.burgerSetPrice = burgerSetprice;
    }
    public Hamburger(Hamburger hamburger) {
        super(hamburger.getName(), hamburger.getPrice(), hamburger.getKcal());
        this.isBurgerSet = hamburger.isBurgerSet();
        this.burgerSetPrice = hamburger.getBurgerSetprice();
    }

    public boolean isBurgerSet() {
        return isBurgerSet;
    }

    public void setBurgerSet(boolean burgerSet) {
        isBurgerSet = burgerSet;
    }

    public int getBurgerSetprice() {
        return burgerSetPrice;
    }

    public void setBurgerSetprice(int burgerSetprice) {
        this.burgerSetPrice = burgerSetprice;
    }
}
