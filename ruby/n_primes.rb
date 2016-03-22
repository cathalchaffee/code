#Takes in integer n and returns the first n primes


$VERBOSE = nil    # Uses older Ruby version
require 'prime'   # This is a module. We'll cover these soon!

def first_n_primes(n)

 return "n must be an integer." unless n.is_a? Integer

 return "n must be greater than 0." if n <= 0
  
  prime_array ||= []
  
  prime = Prime.new
  n.times { prime_array << prime.next }
  prime_array
end

puts first_n_primes(20)
