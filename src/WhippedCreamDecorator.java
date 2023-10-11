class WhippedCreamDecorator extends Coffee {
    Coffee coffee;

    WhippedCreamDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    double cost() {
        return coffee.cost() + 0.5;
    }

    @Override
    String getDescription() {
        return coffee.getDescription() + ", with whipped cream";
    }
}