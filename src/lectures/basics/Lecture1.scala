package lectures.basics

object Lecture1 extends App {
  val x:Double=20*20
  println(s"X = $x")
  println(s"""hello world $x""")
  var _x = 'q'
  println(if(true)  1 else null)
  val t = (_x = 'w')

  def abc(a: Int, b: Int): String =
    a + " " + b

  def helloworld: String=
    "Hello World"
  println(abc(1,2))
  println(helloworld)

  def nameAndAge(name: String, age: Int): String = {
    s"Hi, My name is $name and I am $age years old"
  }

  def factorial(n: Double): Double = {
    println(s"n=$n")
    if(n==1) 1
    else n*factorial(n-1)
  }

  def fibonacci(n: Int): Int = {
    if(n == 0) 0
    else if(n==1) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }

  def isPrimeNumber(n: Int): Boolean = {
    def isPrimeNumberLocal(t: Int, divisor: Int): Boolean = {
      if(n==2) true
      else if( divisor == n) true
      else if(n%divisor == 0) false
      else isPrimeNumberLocal(n, divisor+1)
    }
    isPrimeNumberLocal(n, 2)
  }

  println(nameAndAge("Mohan", 30))
  println(nameAndAge("Gadikota", 30))
  println(s"Factorial of a 4 is ${factorial(100)}")
  println(s"Fibonacci of 10 is ${fibonacci(10)}")
  println(s"2 is a prime number ? ${isPrimeNumber(2)}")
  println(s"11 is a prime number ? ${isPrimeNumber(11)}")
  println(s"15 is a prime number ? ${isPrimeNumber(15)}")
  println(s"9 is a prime number ? ${isPrimeNumber(9)}")
}
