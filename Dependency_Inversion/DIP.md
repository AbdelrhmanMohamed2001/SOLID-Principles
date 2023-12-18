# What is DIP?

1. DIP stands for the Dependency Inversion Principle.

2. It states that high-level modules should not depend on low-level modules, but both should depend on Abstraction.


# What are the benefits?

1. Code Maintainability and Readability.

2. Hides the actual implementation from classes and others.

3. Applies Decoupling.


# Example:

## Before_DIP Folder Violates the Principle:

https://github.com/AbdelrhmanMohamed2001/SOLID-Principles/tree/main/Dependency_Inversion/Before_DIP

1. Class NotificationService (high-level) is dependent on class EmailSender(low-level).


## After_DIP Folder Violates the Principle :

https://github.com/AbdelrhmanMohamed2001/SOLID-Principles/tree/main/Dependency_Inversion/After_DIP

1. Creation of the NotificationSender Interface.

2. class NotificationService (high-level) and class EmailSender (low-level) now implement the interface.

