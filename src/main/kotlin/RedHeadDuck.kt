class RedHeadDuck : Duck(),  Flyable, Quackable {
    override fun display() {
        println("I'm RealHeadDuck")
    }

    override fun fly() {
        println("I can fly")
    }

    override fun quack() {
        println("I can do quack!")
    }
}