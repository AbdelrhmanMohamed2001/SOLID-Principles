# What is LSP ?

1. LSP stands for the Liskov Substitution Principle.

2. It states that objects of superclasses should be replaceable or substitutable with objects of subclasses.


# What are the benefits?

1. Code Maintainability and Reusability: Through substitution, reusing code in all parts becomes easier.

2. It contributes to creating more flexible, maintainable, and robust object-oriented designs by promoting consistent and predictable behavior of objects within an inheritance hierarchy.


# Example:

## Before_LSP Folder Violates the Principle:

https://github.com/AbdelrhmanMohamed2001/SOLID-Principles/tree/main/Liskov_Substitution/Before_LSP

1. Class Rectangle with variables height and width and calculateArea().

2. Class Square with side variable extends Rectangle, assigning side = height = width.

3. Must look at Main.

4. It violates the principle because it changes the behavior of setWidth and setHeight methods.


## After_LSP Folder Adheres to the Principle:

https://github.com/AbdelrhmanMohamed2001/SOLID-Principles/tree/main/Liskov_Substitution/After_LSP

1. Shape Class that has calculateArea().

2. Rectangle and Square classes inherit from the Shape Class.

3. calculateArea() will be overridden to be implemented in classes.

4. Must look at Main.

5. It adheres to LSP because both Rectangle and Square inherit from the common superclass Shape. Each subclass provides its own implementation of the calculateArea() method without altering the behavior of the superclass or violating the expectations of their respective shapes.



   
