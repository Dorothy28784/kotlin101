//task 1

    
// var studentName:String ="Alex Morgan" //mutable
//  val studentId:Int = 2024001  //immutable
//  var gpa:Double = 3.75    //mutable
//  val isEnrolled:Boolean = true    //immutable
//  val middleInitial:Char ='j' //immutable
 

   
//  //task 1.2
//  val output = "student: $studentName $middleInitial. (ID: $studentId) has GPA $gpa and is enrolled: $isEnrolled"


//  //task 1.3
//  var phoneNumber:String? = null 

//  fun main() {
//  print(output)

//  }









//  //task2.1(non-parameterized function)
 
//  fun displayMenu() {
//     println("1.Menu")
//      println("2.View Profile")
//      println("3.Edit settings")
//      println("4.Logout")
   
//  }
 
  
  
// fun main(){
//     displayMenu()
// }

 
//  //task 2.2(parameterized function)
//   fun calculateDiscount(price: Double, discountPercent: Double): Double{
//       return price - (price * discountPercent/ 100)
      
//   }
  
//   fun main(){
//       val originalprice = 100.0
//       val discount = 10.0
//       val discountprice = calculateDiscount(originalprice, discount)
      
//       println("discountprice : $discount")
//   }
 
  //task2.3(getgrade)
  
  
//  fun getGrade(score: Int): String{
//      return when (score) {
//           in 80..100 -> "A"
//           in 65..79 -> "B"
//           in 50..64 -> "C"
//           in 35..49 -> "D"
//          else -> "F"
//      }
//  }
 
 
//   fun main() {
//       val grade = getGrade(90)
//       println("score 90 gives grade: $grade")
//   } 
   
     
 
 
 
//task 2.4 (single expression)
fun isEven(number: Int): Boolean = number % 2 == 0

fun main(){
    val score = 60
    val number = 4
   
    println("the grade for $score is: {getGrade(score)}")
    println("")
    
    
}



//task3(conditioanl statements)

 //task 3.1(if else)
//  The main function - the entry point of the program
fun main() {
    println("--- Temperature Checker ---")
    
    // Testing different scenarios
    print("Testing 35 degrees: ")
    checkTemperature(35)
    
    print("Testing 25 degrees: ")
    checkTemperature(25)
    
    print("Testing 15 degrees: ")
    checkTemperature(15)
}

/**
 * Evaluates the temperature and prints a descriptive message.
 */
fun checkTemperature(temp: Int) {
    when {
        temp >= 30 -> println("hot day!")
        temp >= 20 -> println("perfect weather .")
        temp >= 10 -> println("cold weather.")
        else -> println("It's quite cold!")
    }
}
 