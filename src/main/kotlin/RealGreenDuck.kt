class RealGreenDuck : Duck(), Flyable, Quackable {
    override fun display() {
        println("I'm Real Green Duck!")
    }

    override fun fly() {
        println("I can fly")
    }

    override fun quack() {
        println("I can do quack!")
    }
}