# Card Test
Investigation of mathematical pattern.

Given integer n  
For unique digits (1 - n)  
How many permutations exist where
sequential digits (i.e 1 & 2) are not neighbours.  
(n is not considered sequential to n, for now)

## Example:   
Given n = 4  
Digit range is 1, 2, 3, 4  
Permutations = 1 * 2 * 3 * 4 = 24  

| 1234 | 2134   | 3124   | 4123 |  
|------|--------|--------|------|
| 1243 | 2143   | *3142* | 4132 |
| 1324 | 2314   | 3214   | 4213 |
| 1342 | 2341   | 3241   | 4231 |
| 1423 | *2413* | 3412   | 4312 |
| 1423 | 2431   | 3421   | 4321 |

Two permutations exist where no neghbours coincide:
- 2413
- 3142

probability = (number solutions / number permutations)  
0.083 = 2/24 = 1/12

## Desired outcomes:
- Memory efficient factorial function
- Memory efficient permutation function
- Output probability for each possible n
- Find a formula to calculate outcome
- Explore alternatives, i.e:
    - 1 and n are considered sequential

## Current state
- Required: Formula to generate permutations
  - It would be possible for low value n to generate the permutations manually
  - It is better if possible to generate a single value for each permutation column from the following values:
    - Permutation index (a.n + x)
    - a = (int) index / n
    - x = index % n
