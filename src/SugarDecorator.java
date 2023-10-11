class SugarDecorator extends Coffee {
    Coffee coffee;

    SugarDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    double cost() {
        return coffee.cost() + 0.2;
    }

    @Override
    String getDescription() {
        return coffee.getDescription() + ", with sugar";
    }
}