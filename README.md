---

### **README Assignment-1**

---

# Menu Meals
- **Developer**: Sylvester Nyangulu
- **Student Number**: ST10470942
- **Group**: Group 1
- **Course**: Higher Certificate in Mobile Application and Web Development
- **Subject**: Introduction to Mobile Application Development 

## Links
- **GitHub Repository**: https://github.com/VCSTDN2024/imad5112-assignment-1-Sylvester-N.git
- **YouTube Video**: https://www.youtube.com/watch?v=FtQWr5sIzN0



## Project Overview

The Menu Meals is a mobile application developed as part of an assignment in Introduction to Mobile Application Development. This application was put together, utilising the software "Android Studio" and prompted by kotlin, a programming language used in Android Studio. The app's primary purpose is to assist a user who may have a hard time making choices on what types of food to eat based of their work schedule and the specific time of day. The users is allowed to enter the specific/current time of day and the application then opens a menu displaying different types off food a user could have for Breakfast, lunch, dinner or rather if they whish to have a light snack, quick-bite or dessert, depending on the time the user uses the app.

The main interface of the application consists of a functional textviews which displayed an error message whenever a user inserts an input (time) outside of the rage of the possible they can have. An editTexts is also part of the main interface which allows the user to insert the time of the day, a reset button that resets or rather clears the information displayed in the textView and the information typed in the editText, a check button which was code to redirect or rather navigate the user to an interface that will the display the menu. 

The main kotlin file consists of codes (private function, values, variables, if and when statement) the run the application and functionality of the widgets and buttons in the main interface. A private lateinit variable binding code is include to declare an ActivityMainBindng. I opted to use binding reason being  that binding allowing you to reference views directly without calling findViewById(). A binding setOnClickListener to declare the Check button to simultaneously check the time of day and navigate the user the menu interface. A value function to declare an Exit button that will allow the user to exit the application after utilising the application, followed by a setOnClickLister to allow the button to function (clickable) and a finishAfinity() and exit process function that will allow all activity to stop/end and close the all. The two main function are the "isNotEmpty" and "checkTimeAndNavigate()" function. 

The "isNotEmpty" function is a function incorporated to check if user input is empty and if empty, an error message is displayed and the user will not be further permitted to continue to next activity when the text field is empty. Furthermore the "checkTimeAndNavigate()" function is also incoroorated whit an if statement that consist or a range of time that correspond to the meals a use can have during a specific time. The if statement is incorporate with and "intent" and "when" function that allows the navigation to the menu interface when the time is inserted in the "editText", followed by and else statement that is code to display an error message when the user inserts a time that is outside of the time range, and lastly a home button was incorporated in the menu interface, and declare in the kotlin file on the menu with an "intent" function to navigate the user back to the home screen or rather main interface. 

This app was developed to meet the all requirements of the assignment, which includes creating a functional mobile app and utilising GitHub for version control and GitHub Actions for an automated test on the application.


## Purpose and Features

### Purpose:
The main goal of this app is aimed at assist a user who may have a hard time making choices on what types of food to eat based of their work schedule and the specific time of day. 

### Key Features:
- Feature 1: editText - User types the time of the day.
- Feature 2: textView - Displays error message.
- Feature 3: Check button - check the time and navigate user to a menu of different food.
- Feature 4: Reset button - clears the information in the "editText" and "textView"
- Feature 5: Exit button - stops all activity and exits the app 
- Feature 6: Home button - navigates user back to the main interface from any of the menus interface/page


These features aim to provide a beginner friendly app and an easy-to-use platform when attempting the find your desired mean for the day.



## Design Considerations

The design of the Menu Meals was based on the following key considerations:

1. The app was designed with the goal of providing an easy-to-navigate user interface, ensuring a beginner friendly user experience and simplicity.
   
2. The app was built to ensure it performs well as the user is redirected to different interface/pages.
   
3. The design of this app ensure that the user is comfortable and does not experience confusion and difficulties when using the application.
---


## GitHub and GitHub Actions

This project was managed using the platform GitHub for version control, where all code including all changes throughout the duration of building the "Menu Meals" application were committed and pushed regularly. GitHub enabled collaborative coding, allowing me to trace all my changes and maintain project integrity as well as project validity.

### GitHub Actions:
I made use of GitHub and I configured GitHub Actions to automate and test the build and deployment process of my application. 

GitHub Action mainly includes:

- Running automated build.yml tests to ensure the application's functionality.

The workflow ensures that my project is automatically built and tested every time I push changes.




## Screenshots

### App Screenshots:
![Screenshot 2025-04-01 234303](https://github.com/user-attachments/assets/1d0c4394-fcfc-4c44-9b53-e01d00afe2d6)

*Caption for screenshot 1: The main interface*

![Screenshot 2025-04-01 234339](https://github.com/user-attachments/assets/2121280c-2fc3-4b86-807f-34d86f592d8b)

*Caption for screenshot 2: The breakfast menun xml*

![Screenshot 2025-04-01 234357](https://github.com/user-attachments/assets/c8d0c9a0-16da-4009-b68d-39074c5b15da)

*Caption for screenshot 3: The lunch menu xml*

![Screenshot 2025-04-01 234420](https://github.com/user-attachments/assets/87ac9331-8971-4d20-94a3-68dd5c7cc679)

*Caption for screenshot 4: The dinner menu xml*

![Screenshot 2025-04-01 234502](https://github.com/user-attachments/assets/15e70473-4409-4269-b184-34e5728308ac)

*Caption for screenshot 5: Main kotlin file*

![Screenshot 2025-04-01 234519](https://github.com/user-attachments/assets/cea88acf-1749-4f33-bb48-fae337f13e3f)

*Caption for screenshot 6: Main kotlin file with "isNotEmpty" function*




### Video Demo:
A video showcasing the app's functionality can be viewed here: https://www.youtube.com/watch?v=FtQWr5sIzN0




## Challenges and Learnings

During the development of this project, I encountered several challenges, including:

1. **Challenge 1**: Initially I faced challenges when attempting to insert an "isNotEmpty" function, my application would allow users to leave the EditText empty. 
   - **Solution**: I made use of a software provided on android studio, "Gemini". Gemini assisted me by informing me that I had not declared a Boolean function . 
   
2. **Challenge 2**: I encountered challenges when forming my "when" function ranges, initially I had included colons when forming the range for my times (e.g-12:00 instead of 1200).
   - **Solution**: I removed the colons and left the range of my time as integer numbers as I was instructed by my lecture Mr Kincade Garanganga upon asking for assistance.

From these challenges, I learned important lessons in utilising the right commands and functions when coding. 



## Future Enhancements

While the current version of the app provides the core functionality, there are a few more features that could possibly be added in the future, these features including:

1. **Feature 1**: Allow users to mark their favourite meals in the menu interface.
2. **Feature 2**: Allow users to be given option of ingredients, for user to compile their own meal
3. **Feature 3**: Allow user to be able to see calories, fat and etc is in the meal they have chosen. 
4. **Feature 4**: The app should have a separate menu for beverages
5. **Feature 5**: App should categories the beverages as "Hot and cold beverages". 


These enhancements would improve the app’s usability and make it even more flexable for end-users.

---


## References

1. Reference 1: The independent institution of education, 2025, IMAD5112/P/W Module manual (word doc) Available at:https://advtechonline.sharepoint.com/:w:/r/sites/TertiaryStudents/_layouts/15/Doc.aspx?sourcedoc=%7BA1FF62F0-8E1A-47BC-99BD-CA07AE24427D%7D&file=IMAD5112_MM.docx&action=default&mobileredirect=true >[accessed 17 march 2025]
2. Reference 2: Easy Tuto, 2024. ViewBinding | Kotlin | Android Studio App, [online video] Available at:https://youtu.be/By1jrbOTUF8?si=RYz2HWQ0MT_tOqpJ >[accessed 26 march 2025].
3. Reference 3: The institution of education, 2025, Introduction to mobile application and web development [IMAD5112. nt. [online via student intranet] The institution of education. Available at:https://advtechonline.sharepoint.com/:w:/r/sites/TertiaryStudents/_layouts/15/Doc.aspx?sourcedoc=%7BA1FF62F0-8E1A-47BC-99BD-CA07AE24427D%7D&file=IMAD5112_MM.docx&action=default&mobileredirect=true >[accessed 17 march 2025]
4. Reference 4: Gemini:https://developer.android.com/reference/android/widget/TextView
https://velog.io/@sangmoki/%EC%BD%94%ED%8B%80%EB%A6%B0-Firebase%EB%A5%BC-%EC%9D%B4%EC%9A%A9%ED%95%9C-%EC%9D%B5%EB%AA%85-%EC%82%AC%EC%9A%A9%EC%9E%90-%EB%A1%9C%EA%B7%B8%EC%9D%B8
5. Reference 5: Alexandria|The foregin fork, 2024. [online image] Available at:https://pin.it/5o9g0UuxY > [Accessed 17 march 2025]
6. Reference 6: Dana Leigh Smith, 2016. [online image] Available at:https://pin.it/3j9nbitAw > [Accessed 17 march 2025]
7. Reference 7: Richanddelish, 2022. [online image]. Available at:https://pin.it/6ZjiEjnhp > [accessed 19 march 2025]
8. Reference 8: Wonderful Halos, 2013 [online Image]. Available at:https://pin.it/1FDi6Nlsu > [Accessed 19 march 2025]
9. Reference 9: Mary//chattavore, 2020. [online image]. Available at:https://pin.it/3PL71XYwA >[Accessed 23 march 2025]
10. Reference 10: The kitchn, 2015. [online image]. Available at:https://pin.it/4NSapFGbZ >[accessed 23 march 2025]




## List of Figures

- **Figure 1**: ![Screenshot 2025-04-01 234937](https://github.com/user-attachments/assets/edd2d0e8-5e25-42bd-99ca-b1a925672ff8)
*Caption for screenshot 1: Running main interface of the app*

- **Figure 2**: ![Screenshot 2025-04-01 235017](https://github.com/user-attachments/assets/a6f08c62-33d5-45b3-9c12-a653dce3217c)
  *Caption for screenshot 2: Running lunch interface of the app*

- **Figure 3**: ![Screenshot 2025-04-01 235118](https://github.com/user-attachments/assets/41bdec1b-e077-49a0-b618-548238ca9db0)
  *Caption for screenshot 3: Running Dinner interface of the app*

---




## Disclosure of AI Usage in My Assessment

In the development of this project, I have used a software on the android studio platform known as Gemini. Below is a detailed disclosure of where and how these tools were used:

### 1. **Section(s) in which Generative AI was used:**

- Kotlin file in android studio.
 
### 2. **Name of AI Tool(s) Used:**

- **Gemini** (Android studio)


### 3. **Purpose/Intention Behind Use:**

 - **Code Assistance**: assisted by implementing an error that allowed users to leave an EditText empty and allowing access to the next activity.
 

### 4. **Date(s) in Which Generative AI Was Used:**

- **Part 5**: Gemini used on March 23, 2025 for error correction


### 5. **Link to the AI Chat(s) or Screenshots:**
![Screenshot 2025-04-01 234229](https://github.com/user-attachments/assets/e4cd42f0-dbe3-476e-b251-59ff356247cf)
*Caption for screenshot 1: Gemini screenshot*


