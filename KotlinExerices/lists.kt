fun main() {
   //Creat a list
   val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6)
   //List informations
   println("List: $numbers ")
   println("Size: ${numbers.size}")
   //Access to list elements
   println("First element:" + numbers[0]) //First method to access element in list
   println("Second element:" + numbers.get(1)) //Second method to access element in list
   println("Last element:" + numbers.get(numbers.size - 1))
   println("First: ${numbers.first()}")
   println("Last: ${numbers.last()}")
   //verify if an element exists in list
   println("Is 4 in the list ?  response:" + numbers.contains(4))
   println("Is 7 in the list ?  response:" + numbers.contains(7))
   
   val colors = listOf("green", "orange", "blue")
   //Reverse a list 
   println("Reversed list: ${colors.reversed()}")
   println("Original list: $colors")
   //Sort a list
   println("Sorted list: ${colors.sorted()}")
   
   //Creat MutableList
   val entrees = mutableListOf<String>()
   println("Entrees: $entrees")
   //Add individual items using add()
   println("Add noodles: ${entrees.add("noodles")}")
   println("Entrees: $entrees")
   entrees.add("spaghetti")
   println("Entrees: $entrees")
   //Add list of items using addAll()
   val moreItems = listOf("ravioli", "lasagna", "fettuccine")
   println("Add list: ${entrees.addAll(moreItems)}")
   println("Entrees: $entrees")
   //Remove an Item using remove()
   println("Remove spaghetti: ${entrees.remove("spaghetti")}")
   println("Entrees: $entrees")
   println("Remove item doesn't exist: ${entrees.remove("rice")}")
   println("Entrees: $entrees")
   //Remove an item using removeAt()
   println("Remove first element: ${entrees.removeAt(0)}")
   println("Entrees: $entrees")
   //check if the list is empty an clear out the list
   println("does the list empty ?  Response: ${entrees.isEmpty()}")
   entrees.clear()
   println("Entrees: $entrees")
   println("does the list empty ?  Response: ${entrees.isEmpty()}")
   
   //Looping throuth a list using while loop
   val guestsPerFamily = listOf(2, 4, 1, 3)
   var totalGuests = 0
   var index = 0
    
   while (index< guestsPerFamily.size){
       totalGuests += guestsPerFamily[index]
       index++
   }
   println("Total guests Count: $totalGuests")
   
   //Looping throuth a list using For Loop
   val names = listOf("Jessica", "Henry", "Alicia", "Jose")
   for (name in names){
       println("$name, Number of characters: ${name.length}")
   }
}