class MilkDecorator extends Coffee {
    Coffee coffee;

    MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    double cost() {
        return coffee.cost() + 0.5;
    }

    @Override
    String getDescription() {
        return coffee.getDescription() + ", with milk";
    }
}