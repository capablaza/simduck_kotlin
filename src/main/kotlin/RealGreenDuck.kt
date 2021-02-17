class RealGreenDuck : Duck{

    constructor() {
        this.flyBehavior = FlyWithWings()
        this.quackBehavior = Quack()
    }

    override fun display() {
        println("I'm Real Green Duck!")
    }

}