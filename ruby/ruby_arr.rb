#!/usr/bin/env ruby

n = gets.strip.to_i
arr = gets.strip
arr = arr.split(' ').map(&:to_i) # takes all the input at once
a = 0
i = 0
while i<n do
    a+=arr[i]
    i+=1
end

puts a
