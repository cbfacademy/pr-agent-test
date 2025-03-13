# Assessment Grading Guide for API Development with Java & Spring Boot

Welcome to the grading guide for the API Development Assessment. This guide has been meticulously designed to ensure a clear, consistent, and comprehensive evaluation of students' projects. As an assessor, you'll find a rubric below that breaks down the evaluation criteria into four distinct sections: 
- Completion
- Functionality
- Code Quality & Structure
- Language Profiency 

Please go through each section methodically, ensuring that you understand the criteria and can confidently attribute a score from 0 to 5 for each student's work based on their performance in the listed areas.

## Table of Contents

1. [Requirements](#requirements)
1. [Completion](#completion)
1. [Functionality](#functionality)
1. [Code Quality & Structure](#code-quality--structure)
1. [Language Proficiency](#language-proficiency)

## Requirements

Assessments will be marked based on the following requirements:

1. At least one filterable endpoint using a Spring Data JPA query method (custom or derived)
2. Unit tests for at least one class
3. Data storage in a MySQL database
4. Exception handling 
5. Evidence of inheritance
6. Good use of HTTP Protocols - methods, request and response, have full CRUD operations supported 
7. Documentation

## Completion

This section gauges the progress of the student in terms of repository management and project submission. It's a reflection of commitment and the timely delivery of the project.

| **Score** | **Caption**                                          | **Details**                                        |
|-----------|------------------------------------------------------|----------------------------------------------------|
| 0         | No repository created                               | Student has not initialised any repository for the project.                                               |
| 1         | Repository created, but has no commit history             | Repository exists but has no commits. This indicates no progress on the project.                           |
| 2         | Completed late without agreed extension             | Project was submitted after the deadline without any prior agreement for extension.                        |
| 3         | Completed within agreed extension                   | Project was submitted late, but within an agreed-upon extension timeframe.                                 |
| 4         | Completed within deadline                           | Project was submitted on time, indicating good time management.                                           |
| 5         | Completed within deadline, with full commit history | Project was submitted on time and showcases a consistent work pattern with a well-maintained commit history.|

### Tips

- **Repository Check**: Verify the existence of the repository and its contents to confirm the student's engagement with the project.
- **Commit Analysis**: Examine the commit history for patterns of work and consistency, reflecting the student's workflow and time management.
- **Deadline Adherence**: Verify whether the project was completed on time or within an agreed deadline.

## Functionality

Functionality pertains to how the API behaves. Does it work? Is it user-friendly? Does it meet all the required technical specifications? This section evaluates the API's ability to function correctly and efficiently, meeting all set criteria.

| **Score** | **Caption**                                                                     | **Details**                                                                                              |
| --------- | ------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| 0         | No working functionality                                                        | The API has no operational endpoints.                                                                    |
| 1         | API is only partially functional                                                | The API has limited functionality and only meets a few requirements.                                     |
| 2         | API is mostly functional, but missing some key requirements                     | For instance, the filtered endpoint might be implemented but no unit testing is done.                            |
| 3         | API is fully functional, but minor improvements needed                          | All criteria are met but some areas, such as documentation or HTTP protocol usage, could use refinement. |
| 4         | API is robust, user-friendly, and meets all requirements                        | All criteria, from endpoint implementation to good documentation, are perfectly executed.               |
| 5         | API fully meets all requirements and also demonstrates additional functionality | All criteria are met and the solution provides extra utility.                                            |

### Tips

- **Endpoint Testing**: Test each API endpoint to ensure they are working as expected and meet the project specifications.
- **User Experience**: Consider the ease of use and whether the API provides helpful feedback during interaction.
- **Technical Requirements**: Check for the implementation of all the technical requirements listed in the project brief.

---

## Solution Quality

This section assesses the integrity and organisation of the code. It evaluates readability, maintainability, efficiency, modularity, and adherence to Java and Spring Boot coding standards.

| **Score** | **Caption**                                                    | **Details**                                                                                                                                            |
| --------- | -------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| 0         | Solution does not compile                                      | Code is missing, incomplete or contains compile-time errors that prevent it from building.                                                             |
| 1         | Solution compiles, but with warnings                           | IDE and/or compiler raises multiple warnings, indicating highly sub-optimal implementation.                                                            |
| 2         | Solution compiles successfully, but is poorly structured       | Code is free of errors or warnings, but is hard to navigate, doesn't use packages effectively, etc.                                                    |
| 3         | Solution is reasonably structured, but in need of refactoring  | Code is fairly organised but has overweight classes/methods, inconsistent/unintuitive naming conventions, etc.                                         |
| 4         | Solution is well structured, but has some room for improvement | Code demonstrates principles like DRY, SRP, encapsulation and clear naming conventions, but could have better testing, formatting, documentation, etc. |
| 5         | Solution consistently demonstrates best practices              | Exemplary code that closely follows recommended Java and Spring Boot conventions, with thorough test coverage and comprehensive documentation.         |

### Tips

- **Readability and Maintainability**: Review the code for clear naming conventions, logical structuring, and the inclusion of comments where necessary.
- **Efficiency**: Evaluate if the code is not only functional but also written in a way that is efficient and optimised for performance.
- **Best Practices**: Ensure that the code adheres to Java and Spring Boot best practices, including the use of proper annotations and dependency management.

---

## Language Proficiency

This section evaluates students' Java coding capabilities, focussing on the robustness of exception handling and the effectiveness of data structure usage.

| **Score** | **Caption**                 | **Details for Assessors**                                                                                                                                                                        |
| --------- | --------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| 0         | No Demonstrable Proficiency | No code has been submitted for evaluation.                                                                                                                                                       |
| 1         | Minimal Proficiency         | Provides no effective exception handling, only basic data structures and control flows used, indicating only a rudimentary understanding.                                      |
| 2         | Basic Proficiency           | Implements basic error handling with simple try-catch blocks and uses standard data structures. However, there's limited usage of built-in Java packages.           |
| 3         | Intermediate Proficiency    | Includes competent error handling, utilises efficient data structures and demonstrates good Java coding practices, making appropriate use of platform packages.         |
| 4         | Advanced Proficiency        | Exhibits advanced exception handling techniques like custom exceptions, with effective use of third-party packages. Demonstrates deep understanding of Java concepts and efficient coding. |
| 5         | Exceptional Proficiency     | Reflects exemplary skill in Java, showcasing an excellent command of advanced Java language features and demonstrable research/practise beyond the scope of course material.                    |

### Tips

- **Code Review**: Evaluate the code for syntactic correctness and logical coherence.
- **Exception Handling**: Look for a comprehensive strategy that covers typical and edge-case scenarios. Assess the clarity of feedback provided to the user.
- **Data Structures**: Evaluate the choice and implementation of data structures for their contribution to code performance and efficiency.
- **Overall Quality**: Consider the maintainability, readability, and scalability of the code. High-quality code should be well-commented, adhere to naming conventions, and be organized for clarity.

---

Happy grading! Remember, while scores are quantitative, the feedback and guidance you provide to students will be invaluable for their learning journey. Let's ensure a constructive and comprehensive assessment process!