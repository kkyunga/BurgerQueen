package App.discount;

import App.discount.discountCondition.DiscountCondition;

public class Discount {
    private DiscountCondition[] discountConditions;

    public Discount(DiscountCondition[] discountConditions) {
        this.discountConditions = discountConditions;
    }
    public void checkAllDiscountCondition() {
        for (DiscountCondition discountCondition : discountConditions) {
            discountCondition.checkDiscountCondition();
        }
    }
    public int discount(int price) {
        int discountedPrice = price;
        for (DiscountCondition discountCondition : discountConditions) {
            if (discountCondition.isSatisfied()) discountedPrice = discountCondition.applyDiscount(discountedPrice);
        }
        return discountedPrice;
    }
}
