/* If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

def problem001: Int = {
  var answer: Int = 0

  for (i <- 1 to 1000) {
    if (i % 3 == 0 | i % 5 == 0) {
      answer += i
    }
  }

  answer
}

// Compute the answer
println(problem001)
