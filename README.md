# Design-Patterns
< A repository of most popular Design Patterns and implementations and my analysis >

What are these?
- These defines the solutions for commonly occuring problems while designing a software.

Design patterns are classified in to 3 categories as below:
1. Creational
2. Structural
3. Behavioural

Let's discuss somethings about _**Creational Design Patterns**_ which essesntially deals with problems of instantiation of classes.
### Singleton
1. What?
    - It allows the class to have atmost one object of it.
2. Why?
    -  To avoid over using the time and resources while creating the multiple objects which are essentially not required.
3. When this is required?
    - When no attributes in  a class
    - When all objects do same work
    - When objects are immutable (attributes are not changeable)
4. How can this be acheived?
    - I considered normal class which has public constructor. Then, Can it become signleton class? No. Why because.! As long as it is there, multiple objects can be created irrespecive of what the context is.
    - Now I made constructor private to acheive this, but now, objects not at all be created. But this can be accessed only inside that class.
    - So, we can think in a way such that having a method which returns the same object based on some check whenever we call this. Which makes this class singleton.
    - So, a class to be eligible to become singleton, a private constructor, the instant variable to hold the object (initially null for lazy loading & an object for eager loading which is not recommended beacause of lack of information which class loading leads to error or application slow) and one public static method is required from that class.
    - Why static? because it can be called before instantiating the class aswell.
> We built what we required, but this has a biggest problem. This creates problem of return two different objects in a multithreaded environment.
Keeping one synchronised block for a object creation line also fails in a scenario when one thread checks the conditions and not initialise the object yet and thread 2 comes in checking true conditions and endup creating two different objects. So, double lock system is required to avoid these problems (as coded).

