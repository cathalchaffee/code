strings = ["leonardo", "donatello", "raphael", "michaelangelo"]

#LAMBDA converts param to symbol
symbolize = lambda { |x| x.to_sym}

# Write your code above this line!
symbols = strings.collect(&symbolize)


# NOTE lambda's return to method, procs do not


odds_n_ends = [:weezard, 42, "Trady Blix", 3, true, 19, 12.345]

is_int = lambda { |x| x.is_a? Integer }

ints = odds_n_ends.select(&is_int)
