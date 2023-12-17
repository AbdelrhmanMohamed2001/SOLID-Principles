# What is ISP?

1. ISP stands for Interface Segregation Principle.

2. Segregation means keeping things separated.

3. So, ISP states that having multiple interfaces is better than one general interface.


## What are the benefits?

1. Code readability and maintainability are enhanced.

2. We don’t need to implement functions that we don’t need when using multiple specific interfaces compared to a single general interface.


# Example:


## Before_ISP Folder Violates the Principle:

https://github.com/AbdelrhmanMohamed2001/SOLID-Principles/tree/main/Interface_Segregation/Before_ISP

1. BearKeeper interface has three functions: washTheBear(), feedTheBear(), and petTheBear().

2. It violates the principle because it contains all three methods in a single interface, forcing classes to implement all methods even if they don't need them.


## After_ISP Folder Adheres to the Principle:

https://github.com/AbdelrhmanMohamed2001/SOLID-Principles/tree/main/Interface_Segregation/Before_ISP

1. BearCleaner, BearFeeder, and BearPetter interfaces contain washTheBear(), feedTheBear(), and petTheBear() methods, respectively.

2. Any class can implement one or more interfaces based on the specific functions it requires.

3. It adheres to ISP because we have segregated the interfaces, allowing classes to implement only the interfaces containing the methods they need, promoting a more focused and flexible design.

