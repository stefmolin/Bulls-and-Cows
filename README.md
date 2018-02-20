# Bulls and Cows
Bulls and Cows command line game for guessing a number.

## How to Play
1. The computer will come up with a 4-digit number. 
2. The player guesses a number.
3. The computer will tell the player how many digits were correct *and* in the correct spot (bulls) and
how many digits were correct but in the wrong spot (cows). 
The catch is that the player won't know which digits are bulls, which are cows, and which are entirely wrong.
4. Player keeps guessing until the number is correct (4 bulls).

## Example
- Computer picks: 1234
- Player guesses: 1435
- Computer tells player "1 bull, 2 cows" (1 is a bull, 3 & 4 are cows)
- Player guesses: 1253 (because the player doesn't know that 4 was a cow they remove it)
- Computer tells player "1 bull, 2 cows" (1 is a bull, 2 & 3 are cows)
- ...
- Player guesses: 1234
- Computer tells player he/she is correct.
