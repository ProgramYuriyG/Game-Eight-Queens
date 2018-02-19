/*  
***7.22
The classic Eight Queens puzzle is to place eight queens on a chessboard such that no two queens can attack each other 
(i.e., no two queens are on the same row, same column, or same diagonal). 
There are many possible solutions. Write a program that displays one such solution.
*/

import java.util.*;
public class EightQueensGame{
//Main Method
public static void main(String[]args){

//set the initial conditions for the loops
int x = 0;
int y = 0;

//array for Down and Side movement
int [] queenMove = new int[8];
//array for Diagonal movement
int [] queenDiagonal = new int[8];

//Loop for the columns
System.out.print(" 0\t 1\t 2\t 3\t 4\t 5\t 6\t 7");
while(y != 8){
//Generate Random Number each time new row is made
int randomQ = (int)(Math.random()*8);

//Generate Random Number, checks to see if the random number has already been stated in that position
while(queenMove[randomQ] > 0){
randomQ = (int)(Math.random()*8);
}
//prints next line
System.out.print("\n");

//Loop for the rows
while(x != 8){
//if the random number is equal to the current square put down a queen
if(x == randomQ){
System.out.print("|Q ");
//adds the random number to the array
queenMove[randomQ] += 1;
}
System.out.print("| \t");
x++;
}
//resets the row loop condition and increases the column condition
x=0;
y++;
}

//prints out the array as a string(all should be 1)
System.out.println("\n"+Arrays.toString(queenMove));

}}





















