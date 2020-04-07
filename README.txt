This project gives an idea how to initialize the PageFactory in 5 different ways:

also the scope of this repository is not the design of a framework, just to explain the different ways of initialization.

PAGEFACTORY INTRODUCTION:
--> PageFactory class to make using Page Objects simpler and easier

--> PageFactory is called as Lazy initialization.

--> PageFactory can initialize the page objects which are tagged with annotations like @FindBy;@FindBys & @FindAll.

WAYS TO INITIALIZE THE PAGEFACTORY:

1. Initialize in constructor (refer TestCases.java; Method: initializeUsingConstructor)

2. Initialize when required (refer TestCases.java; Method: initializeWhenRequired) 

3. Initialize by returning the class Obj (refer TestCases.java; Method: initializeUsingClassObj)

4. Custom Global Initialization (refer TestCases.java; Method: customGlobalInitialization)

5. Pre-defined Global Initialization (yet to push the code)
