Recruitment exercise for WinCom.

Introduction
This project represents a recruitment exercise for WinCom, showcasing my Java programming skills and problem-solving abilities.

Exercise Overview:

The task involves creating a Java program that provides auto-complete suggestions based on a list of keywords. The program should take user input and search within the keyword list to find matches, ignoring case sensitivity. It should then display four suggestions in alphabetical order.

Implementation:

I created the keyword list as an array and an user input field to received a String so I can do a search within the keywords to find matches and showing 4 of them in screen in alphabetic order.

My program has the logic storaged in the src folder with two classes, the class Main in which is the main logic with parameters for the program to work, the class Search that is a method who receives an array(keywords list), an string (user input), and a int (the search matches quantity limit), the method is called searchMatchesFromArray and does the search within the array and find the limit number of possible matches.

Compilation of the program and testing instructions:


Opinions: 
- What would you change if the list of keywords was large (several millions)?
    I created the method so it will sort into alphabeticl order the list of keywords, this way the search will proceed until finding the first 4 suggestions of auto-complete matches, this way it won't do the seach within the entire keywords list, it will only search the list until finding the first 4 suggestions, or the nnumber of limit suggestions indicated.

- What would you change if the requirements were to match any portion of the keywords (example: for string “pro”, code would possibly return “reprobe”)
    My method searchMatchesFromArray does the search into the keywords list by taking the user input and doing the string method .startsWith so it can find the matches based on the first characters of the string user input and the keywords. I would change the string method .startsWith to .contains, this way the search won't be restricted to find the starting characters between the strings, insted it will find character that are contained in the string and it will work as indicated in the previous example.

I would like to thank WinCom for the opportunity and for assigning this exercise.

Author: 
Jesus Fajardo.
