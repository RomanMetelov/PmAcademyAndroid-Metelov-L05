class Person(val name: String, var age: Int,
             val mother: Person, val father: Person,
             val siblings: Array<Person>) {




    fun isAdult(): Boolean {
        return false
    }
}