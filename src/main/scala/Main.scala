object Main {
  def main(args: Array[String]): Unit = {
    var s = "Hello, Scala!"
    println(s) // задача 2.
    println(reverseString(s))  //вывод результата задачи 3_a_1
    println(s.toLowerCase()) // задача  3_a_2
    println(s.replace("!","")) // задача  3_a_3
    println(s.replace("!","").concat(" and goodbye python!")) // задача  3_a_4
  }

  // задача  3_a_1
  def reverseString(inputString: String): String = {
    val stringLength = inputString.length
    var result = ""
    for (i <- 0 until stringLength) {
      result = inputString.charAt(i) + result
    }
    result
  }


}