fun main() {
    
   //Lists
   val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
   println("list:   ${numbers}")
   println("sorted: ${numbers.sorted()}")
   
   //Sets
   val setOfNumbers = numbers.toSet()
   println("set:    ${setOfNumbers}")
   
   val set1 = setOf(1, 2, 3)
   val set2 = mutableSetOf(3, 2, 1)
   println("$set1 == $set2: ${set1 == set2}")
   
   println("contains 7: ${setOfNumbers.contains(7)}")
   
   //Maps or Dictionary
   val peopleAges = mutableMapOf<String, Int>(
    	"Fred" to 30,
    	"Ann"  to 23
   )
   
   println(peopleAges)
   println()
   peopleAges.put("Barbara", 42)
   println(peopleAges)
   println()
   peopleAges["Joe"]= 51
   println(peopleAges)
   println()
   peopleAges["Fred"]= 31
   println(peopleAges)
   println()
   //forEach()
   peopleAges.forEach{print("${it.key} is ${it.value}, ")} // problem with "," in the end
   println()
   println()
   //map() 
   println(peopleAges.map{"${it.key} is ${it.value}"}.joinToString(", "))
   println()
   //filter()
   val filtredNames = peopleAges.filter {it.key.length < 4}
   println(filtredNames)
}