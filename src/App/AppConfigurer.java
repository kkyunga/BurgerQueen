package App;

import App.Product.ProductRepository;
import App.discount.Discount;
import App.discount.discountCondition.CozDiscountCondition;
import App.discount.discountCondition.DiscountCondition;
import App.discount.discountCondition.KidDiscountCondition;
import App.discount.discountPolicy.FixedAmountDiscountPolicy;
import App.discount.discountPolicy.FixedRateDiscountPolicy;

public class AppConfigurer {
    private Cart cart = new Cart(productRepository(), menu());

    public ProductRepository productRepository() {
        return new ProductRepository();
    }
    public Menu menu() {
        return new Menu(productRepository().getAllProducts());
    }
    public Cart cart() {
        return cart;
    }
    public Discount discount() {
        return new Discount(
                new DiscountCondition[]{
                        new CozDiscountCondition(new FixedRateDiscountPolicy(10)),
                        new KidDiscountCondition(new FixedAmountDiscountPolicy(500))
                }
        );
    }
    public Order order() {
        return new Order(cart(), discount());
    }
}
