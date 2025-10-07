# POE-PART-2-IMAD
This report outlines the development requirements and specifications for a native Android flashcard application built using Kotlin within Android Studio. The application serves as an educational tool designed to help users study various subjects through an interactive question-and-answer format, with immediate feedback and score tracking capabilities. 

1. Introduction 

1.1 Background 

Flashcards represent a popular and effective study methodology used to test knowledge across various academic subjects. This application addresses the need for digital learning tools by providing users with an interactive platform to answer flashcard questions in subjects such as mathematics and history, track their responses, and receive comprehensive feedback upon completion of each quiz session. 

1.2 Objective 

The primary objective is to create a native Android application using Kotlin within Android Studio that facilitates user study sessions through flashcards. The application will present questions sequentially, loop through each flashcard in the set, and calculate a score based on user responses. Following the successful implementation of Assignment 1, this project requires the utilization of GitHub for version control and GitHub Actions for continuous integration, ensuring proper code management and automated testing throughout the development lifecycle. 

2. System Requirements 

2.1 User Interface Requirements 

The application's user interface comprises three primary screens, each serving a distinct function in the user experience: 

2.1.1 Welcome Screen 

The Welcome Screen serves as the entry point to the application and must include the following elements: 

A brief description of the application's purpose and functionality 

A clear welcome message to engage users 

A "Start" button that initiates the quiz and navigates users to the Flashcard Question Screen 

2.1.2 Flashcard Question Screen 

The Flashcard Question Screen represents the core interactive component of the application, where users engage with the study material. This screen must incorporate Display of a single question with two selectable answer options (e.g., "True" and "False") 

A "Next" button to progress to the subsequent question after the user submits their answer 

Immediate feedback mechanism for each answer, indicating whether the response is "Correct!" or prompting the user to "Try Again" 

2.1.3 Score Screen 

The Score Screen provides users with performance analytics and review options. 

Display of the total number of correct answers achieved during the session 

Personalized feedback based on the user's score performance 

A "Review" button that allows users to revisit the flashcards and view the correct answers for educational reinforcement 

2.2 Application Logic Requirements 

2.2.1 Welcome Screen Logic 

The Welcome Screen logic is straightforward but critical for user flow. When the user clicks the "Start" button, the application must navigate seamlessly to the Flashcard Question Screen, initializing the quiz session. 

2.2.2 Flashcard Question Logic 

The Flashcard Question Screen implements iterative logic to manage the quiz flow effectively A loop structure iterates through a predefined set of questions 

Each question is displayed on the screen with corresponding answer options 

The application allows users to select an answer and provides immediate feedback indicating correctness 

A score counter increments for correct answers 

The application progresses to the next question in the sequence 

This process continues until all questions have been answered 

2.2.3 Score Screen Logic 

After the final question, the application must: 

Calculate the total score based on correct answers 

Navigate to the Score Screen 

Display feedback based on the total score (e.g., "Great job!" for high scores and "Keep practising!" for lower scores) 

Provide users with the option to review their answers 

3. Development Environment and Tools 

The application must be developed using the following technologies and tools: 

Programming Language: Kotlin 

Development Environment: Android Studio 

Version Control: GitHub 

Continuous Integration: GitHub Actions 

Target Platform: Android (native application) 

4. Conclusion 

This flashcard quiz application represents an effective digital learning tool that combines user-friendly interface design with robust application logic. By implementing the specified requirements, the application will provide students with an engaging platform for knowledge testing and reinforcement across multiple subject areas. The integration of GitHub and GitHub Actions ensures professional development practices, including version control and automated testing, preparing students for industry-standard software development workflows. 

06 October 2025 - YouTube 

https://youtube.com/@wompfunamuthala?si=xywg57aYqAfEQ_Rt 
