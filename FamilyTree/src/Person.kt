class Person(
        val name: String, val age: Int,
        var mother: Person? = null, var father: Person? = null,
        var siblings: Array<Person>? = null
        ) {

    fun isAdult(): Boolean {
        if (this.age >= 18) return true
        return false
    }

    fun amountOfRelatives(): Int? {
        return 0
    }

}