fun main(args: Array<String>) {
    val realGreenDuck = RealGreenDuck()
    val redHeadDuck = RedHeadDuck()
    val rubberDuck = RubberDuck()

    printDuck(realGreenDuck)
    printDuck(redHeadDuck)
    printDuck(rubberDuck)
}

fun printDuck(duck : RealGreenDuck){

    duck.display()
    duck.quack()
    duck.swim()
    duck.fly()
    println("--------------------------------")
}

fun printDuck(duck : RedHeadDuck){

    duck.display()
    duck.quack()
    duck.swim()
    duck.fly()
    println("--------------------------------")
}
fun printDuck(duck : RubberDuck){

    duck.display()
    duck.quack()
    duck.swim()
    duck.fly()
    println("--------------------------------")
}
