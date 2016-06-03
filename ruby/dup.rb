#!/usr/bin/env ruby

class Duplicate 
  def dup(arr)
    dup_arr = Array.new
    arr.each do |item|
      x = arr.shift
      if arr.include?(x) 
        dup_arr << x
      end
      arr.delete(x)
    end
    print dup_arr
  end
end

obj = Duplicate.new
obj.dup(["this","this","that","this","that"])
