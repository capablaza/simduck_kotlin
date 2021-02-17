class RubberDuck : Duck {

    constructor() {
        this.flyBehavior = FlyNoWay()
        this.quackBehavior = Squeak()
    }

    override fun display() {
        println("I'm Rubber Duck!")
    }

}