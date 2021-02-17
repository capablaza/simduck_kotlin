abstract class Duck {

    internal lateinit var flyBehavior: FlyBehavior
    internal lateinit var quackBehavior: QuackBehavior

    fun swim() {
        println("I can swim!")
    }

    fun performQuack() {
        this.quackBehavior.quack()
    }

    fun performFly() {
        this.flyBehavior.fly()
    }

    fun setFlyBehavior(flyBehavior: FlyBehavior) {
        this.flyBehavior = flyBehavior
    }

    fun setQuackBehavior(quackBehavior: QuackBehavior) {
        this.quackBehavior = quackBehavior
    }


    abstract fun display()
}