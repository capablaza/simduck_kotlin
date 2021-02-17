abstract class Duck {

    lateinit var flyBehavior: FlyBehavior
    lateinit var quackBehavior: QuackBehavior

    fun swim() {
        println("I can swim!")
    }

    fun performQuack(){
        this.quackBehavior.quack()
    }

    fun performFly(){
        this.flyBehavior.fly()
    }

    abstract fun display()
}