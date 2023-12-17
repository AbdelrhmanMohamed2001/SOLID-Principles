## What is SRP ?

- SRP is an abbreviation for Single Responsibility Principle.

- Each class has only one responsibility/job, only one reason to change.

- It makes code more readable, maintainable, and easy to change.

## What benefits ?

- Testing: A class with only one job has fewer test cases.

- Lower Coupling: We will have fewer dependencies.

- Organization: We will have a well-organized and easier class.

## what about Coupling and Cohesion?

- Coupling means the degree of interdependencies between modules.

- Cohesion means the degree to which elements inside a module belong together.

- Now that we understand the difference between them, it's better to achieve SRP by applying Decoupling with Cohesion.

## Example :

1. Before_SRP Folder Violates the Principle:

   https://github.com/AbdelrhmanMohamed2001/SOLID-Principles/tree/main/Single_Responsibility/Before_SRP

 - Class Book has member variables such as name, author name, price, year, and ISBN, also, we have a parameterized constructor.
 
 - Class Invoice composites a book and has other variables, a parameterized constructor, and three functions:
 
 - calculateTotal(): Returns the total price of the book after adding taxes.
 
 - printInvoice(): Prints all details about the book.
 
 - saveToFile(): Saves all details and price into a file.
 
 - It violates the principle because the Invoice class has three functions, each with a different job (one class with multiple responsibilities).
   

2. After_SRP Folder Adheres to the Principle:

   https://github.com/AbdelrhmanMohamed2001/SOLID-Principles/tree/main/Single_Responsibility/After_SRP

 - Class Invoice now only implements calculateTotal().
 
 - We created two new classes, each responsible for only one job.
 
 - Class InvoicePersistence implements saveToFile().
 
 - Class InvoicePrinter has print() that prints all details about the book.
 
 - It adheres to the principle because we have three classes, each with a single responsibility.
