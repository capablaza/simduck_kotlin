class RubberDuck : Duck(), Flyable, Quackable {
    override fun display() {
        println("I'm RubberDuck!")
    }

    override fun fly() {
        println("I can't fly")
    }

    override fun quack() {
        println("I can do quack!")
    }
}