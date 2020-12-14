class Person(
        val name: String, val age: Int,
        var mother: Person? = null, var father: Person? = null,
        var siblings: Array<Person>? = null
        ) {

    fun isAdult(): Boolean {
        if (this.age >= 18) return true
        return false
    }

    var amountOfAllRelatives = 0
    var listOfRelatives: MutableList<Person> = mutableListOf<Person>()

    fun countAmountOfAllRelatives() {
        var total: Int = 0
        this.mother?.let {
            amountOfAllRelatives++
            it.countAmountOfAllRelatives()
        }
        this.father?.let {
            amountOfAllRelatives++
            it.countAmountOfAllRelatives()
        }
        this.siblings?.let {
            it.forEach {
                amountOfAllRelatives++
                it.countAmountOfAllRelatives()
            }
        }
    }
}

