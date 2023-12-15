package ProblemSolving;

public class T15_DiscountCalculation {
    public static void main(String[] args) {
        int laptopPrice = 85000;
        int mousePrice = 2500;
        double discountRate = 0.15;

        int totalPrice = laptopPrice + mousePrice;

        double discountAmount = totalPrice * discountRate;

        double finalPrice = totalPrice - discountAmount;

        System.out.println("Total cost after 15% discount: " + finalPrice + " tk");
    }
}

