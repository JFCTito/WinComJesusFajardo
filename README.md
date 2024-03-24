RECRUITMENT EXERCISE FOR WINCOM.

Introduction:

This project represents a recruitment exercise for WinCom, showcasing my Java programming skills and problem-solving abilities.

Exercise Overview:

The task involves creating a Java program that provides auto-complete suggestions based on a list of keywords. The program should take user input and search within the keyword list to find matches, ignoring case sensitivity. It should then display four suggestions in alphabetical order.

Implementation:

I created the keyword list as an array and a user input field to receive a String, so I can do a search within the keywords to find matches and showing 4 of them in screen in alphabetic order.

My program has the logic stored in the src folder with two classes, the class Main in which is the main logic with parameters for the program to work, the class Search that is a method who receives an array(keywords list), a string (user input), and an int (the search matches quantity limit), the method is called searchMatchesFromArray and does the search within the array and find the limit number of possible matches.

Compilation of the program and testing instructions:

Download the Project:

- Download the project from the provided Email or GitHub link. Alternatively, you can clone or fork the project from the GitHub repository since it's public.
- Once the project is downloaded and extracted (in case of downloaded direct from the Email) in a folder. You can compile and interact with the program in 2 possible ways.

1- First scenario (recommended): 
  
- Open your preferred Integrated Development Environment (IDE) such as Visual Studio Code, IntelliJ IDEA, etc. 
- Navigate to the project folder within the IDE. 
- Once the project is open, most IDEs provide a "Play" button or a "Run" option to execute the program. Clicking this button will open a terminal or console tab within the IDE.
- In the terminal tab, you will see the message: "PLEASE, TYPE THE CHARACTERS OF THE KEYWORD YOU'RE LOOKING FOR:". You can now enter the characters and press Enter for the program to perform the search and display the results in the terminal.
 
2- Second scenario: 

- Open your preferred terminal application.
- Navigate to the directory where the project is located using the cd command.
- Use the javac command to compile the project: "javac Main.java Search.java".
- Once the compilation is successful, execute the program using the java command: "java Main".
- You will see the message "PLEASE, TYPE THE CHARACTERS OF THE KEYWORD YOU'RE LOOKING FOR:". Enter the characters and press Enter to initiate the search and view the results in the terminal.

Opinions: 

- What would you change if the list of keywords was large (several millions)?

    I created the method, so it will sort into alphabetical order the list of keywords, this way the search will proceed until finding the first 4 suggestions of auto-complete matches, this way it won't do the search within the entire keywords list, it will only search the list until finding the first 4 suggestions, or the number of limit suggestions indicated.

- What would you change if the requirements were to match any portion of the keywords (example: for string “pro”, code would possibly return “reprobe”)

    My method searchMatchesFromArray does the search into the keywords list by taking the user input and doing the string method .startsWith so it can find the matches based on the first characters of the string user input and the keywords. I would change the string method .startsWith to .contains, this way the search won't be restricted to find the starting characters between the strings, instead it will find character that are contained in the string, and it will work as indicated in the previous example.

I would like to thank WinCom for the opportunity and for assigning this exercise.

Author: 
Jesus Fajardo.
