package App;

import App.Product.Product;
import App.Product.subProduct.Drink;
import App.Product.subProduct.Hamburger;
import App.Product.subProduct.Side;

public class Menu {
    private Product[] products;

    public Menu(Product[] products) {
        this.products = products;
    }
    public void printMenu() {
        System.out.println("[\uD83D\uDD3B] 메뉴");
        System.out.println("-".repeat(60));

        printHambugers(true);

        printSides(true);

        printDrinks(true);

        System.out.println();
        System.out.println("\uD83E\uDDFA (0) 장바구니");
        System.out.println("\uD83D\uDCE6 (+) 주문하기");
        System.out.println("-".repeat(60));
        System.out.print("[\uD83D\uDCE3] 메뉴를 선택해주세요 : ");
    }

    protected void printDrinks(boolean printPrice) {
        System.out.println("\uD83E\uDD64 음료");
        for (Product product : products) {
            if (product instanceof Drink) {
                printEachMenu(product, printPrice);
            }
        }
        System.out.println();
    }

    protected void printSides(boolean printPrice) {
        System.out.println("\uD83C\uDF5F 사이드");
        for (Product product : products) {
            if (product instanceof Side) {
                printEachMenu(product, printPrice);
            }
        }
        System.out.println();
    }

    private void printHambugers(boolean printPrice) {
        System.out.println("\uD83C\uDF54 햄버거");
        for (Product product : products) {
            if (product instanceof Hamburger) {
                printEachMenu(product, printPrice);
            }
        }
        System.out.println();
    }

    private static void printEachMenu(Product product, boolean printPrice) {
        if (printPrice) System.out.printf("   (%d) %s %5dKcal %5d원\n",
                product.getId(),
                product.getName(),
                product.getKcal(),
                product.getPrice());
        else System.out.printf("   (%d) %s %5dKcal\n",
                product.getId(),
                product.getName(),
                product.getKcal());
    }
}
