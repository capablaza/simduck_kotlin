class RedHeadDuck : Duck{

    constructor() {
        this.flyBehavior = FlyWithWings()
        this.quackBehavior = Quack()
    }

    override fun display() {
        println("I'm Red Head Duck")
    }

}