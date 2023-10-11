public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        System.out.println("Welcome to our shop! There are our products:");
        System.out.println("Standard coffee: " + coffee.getDescription() + ". Cost: $" + coffee.cost());

        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println("Coffee with milk: " + milkCoffee.getDescription() + ". Cost: $" + milkCoffee.cost());

        Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Coffee with milk and sugar: " + sugarMilkCoffee.getDescription() + ". Cost: $" + sugarMilkCoffee.cost());

        Coffee whippedCreamCoffee = new WhippedCreamDecorator(sugarMilkCoffee);
        System.out.println("Coffee with milk, sugar and whipped cream: " + whippedCreamCoffee.getDescription() + ". Cost: $" + whippedCreamCoffee.cost());
    }
}