# What is OCP ?

1. OCP stands for the Open-Closed Principle.

2. Classes/Modules are open for extension but closed for modification.

3. Extension means adding new functionality, while modification involves altering existing, tested, and reliable code.

4. This can be achieved through Interfaces/Abstract classes and Polymorphism.


# What are the benefits?

1. Code becomes more readable, maintainable, and flexible.

2. Code reusability is facilitated through extensions without modifications.

3. Avoiding the risk of modifying existing code.


# Example:

## Before_OCP Folder Violates the Principle:

https://github.com/AbdelrhmanMohamed2001/SOLID-Principles/tree/main/Open-Closed%20Principle/Before_OCP

1. Class Rectangle with variables height and width.

2. Class Square with a side variable.

3. Class ShapePrinter with DrawShape() which draws only Rectangle and Square.

4. It violates the principle as any shape addition other than Rectangle and Square would require a new if-statement (modification).


## After_OCP Folder Adheres to the Principle:

https://github.com/AbdelrhmanMohamed2001/SOLID-Principles/tree/main/Open-Closed%20Principle/After_OCP

1. Shape Interface containing Draw().

2. Any shape will have a new class implementing the Shape interface.

3. Draw() will be overridden to be implemented in any class.

4. Class ShapePrinter has DrawShape() to draw any shape.

5. It adheres to the principle as adding classes (extension) does not require modification in the original code.


