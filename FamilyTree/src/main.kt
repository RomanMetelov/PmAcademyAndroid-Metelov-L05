fun main() {
    val me: Person = getMe()
    me.createListRelativesOf(me)
    println("I have ${me.amountOfAllRelatives} relatives: ${me.listOfRelatives.joinToString(postfix = ".")}")
}

fun getMe(): Person {
    val me: Person = Person("Roma", 23)

    me.mother = Person("Mother", 45)
    me.father = Person("Father", 47)
    me.siblings = arrayOf(Person("Sister", 25))

    me.mother!!.mother = Person("Tetiana", 72)
    me.mother!!.father = Person("Vladlen", 76)
    me.mother!!.siblings = arrayOf(Person("Vasyl", 49))

    me.father!!.mother = Person("Tamara", 74)
    me.father!!.father = Person("Volodymyr", 73)
    me.father!!.siblings = arrayOf(Person("Taras", 49))

    me.mother!!.mother!!.siblings = arrayOf(Person("Viktor", 82))

    me.father!!.mother!!.father = Person("Valentyn", 99)

    me.father!!.father!!.siblings = arrayOf(Person("Toma", 81))

    return me
}