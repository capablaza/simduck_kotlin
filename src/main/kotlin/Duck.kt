abstract class Duck {

    fun quack() {
        println("I can do quack!")
    }

    fun swim() {
        println("I can swim!")
    }

    open fun fly() {
        println("I can fly")
    }

    abstract fun display()
}