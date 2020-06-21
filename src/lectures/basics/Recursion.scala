package lectures.basics

object Recursion extends App {
  def fibonacci(n: Int): Int = {
    if(n == 0) 0
    else if(n==1) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }
  def bestFibonacci(n: Int): BigInt = {
    def localFibonacci(n: Int, acc: BigInt): BigInt = {
      if(n==1) acc
      else localFibonacci(n-1, n*acc)
    }

    localFibonacci(n, 1)
  }

  println(s"Fibonacci of 10 is ${bestFibonacci(10)}")

}
