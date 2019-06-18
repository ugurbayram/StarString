# StarString

Write a method starString that takes an integer ‘n’ as an argument and returns a string of stars (asterisks) 2^n long (i.e., 2 to the nth power). 

Task is solved in two ways: 1- for loop, 2- recursive

Performance of recursive increases for higher power of 2. 
StringBuilder is prefered as multiple string concatination is required. Since single thread is running, StringBuffer is not prefered. 
  
Requirement: 
    Java 1.8+,
    Maven 3.2.5+