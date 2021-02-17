fun main(args: Array<String>) {
    val realGreenDuck = RealGreenDuck()
    val redHeadDuck = RedHeadDuck()
    val rubberDuck = RubberDuck()

    printDuck(realGreenDuck)
    printDuck(redHeadDuck)
    printDuck(rubberDuck)
}

fun printDuck(duck : Duck){

    duck.display()
    duck.quack()
    duck.swim()
    println("--------------------------------")
}

