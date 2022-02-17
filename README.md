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

Two permutations exist where no neighbours coincide:
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


## Insight
The function/formula to create the permutations is not yet solved.
So far I can say that for digit 0 (i.e: 1)
For permutations of 1 - 4
- if (x < f(3)) { position = 0 }
- else if (x < f(3)+f(2)) { position = 1 }
- else if (x < f(3)+f(2)+f(1)) { position = 2 }
- else if (x < f(3)+f(2)+f(1)+f(0)) { position = 3 }
- else if (x < f(3)+f(2)+f(1)+f(0)+f(1)) { position = 2 }
- else if (x < f(3)+f(2)+f(1)+f(0)+f(1)+f(0)) { position = 3 }

Meaning that for the first 6 permutaions:  
digit 0 is in column 0  
After which point it follows the column pattern (1,1,2,3,2,3)  

|  | a=0  | a=1    |  
|-----|------|--------|
| x=0 | 1234 | 2134   |
| x=1 | 1243 | 2143   |
| x=2 | 1324 | 2314   |
| x=3 | 1342 | 2341   |
| x=4 | 1423 | *2413* |
| x=5 | 1423 | 2431   |

The formula exists in this pattern, but I have yet to find it.
Rotating the position pattern 180 gives us:

|  | a > 0 | pos | 
|-----|-------|-----|
| x=5 | 1000  | 0   |
| x=4 | 0100  | 1   |
| x=3 | 1000  | 0   |
| x=2 | 0100  | 1   |
| x=1 | 0010  | 2   |
| x=0 | 0010  | 2   |


## Next Steps
- Study differential calculus