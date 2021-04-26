# Project Report

(Jaren Xavier Provost)

## Challenge #1 Complete

The solution for coding challenge one is simple. The description 
for challenge number one specifies that there are no changes
outside of the module configuration. More specifically, no 
changes outside of the `QueryEngineModule`. In the module, the solution 
was obvious, seeing how the QueryEngine class was configured or bound 
to the `FakeQueryEngine`. All the `FakeQueryEngine` does is express that 
"Billy Bologna" is responsible for making all thirty or fewer of the 
most recent revisions on the article found based on the search bar 
input. In summary, the solution for this challenge was to replace 
`FakeQueryEngine` or with an actual query engine, or more specifically, 
the `WikipediaQueryEngine`, which actually searches through the
wikipedia database and finds the names of the 30 or fewer most recent 
people who revised the article found based on the input submitted in the 
search bar. 


## Challenge #2 Incomplete

Coding challenge two was a lot more challenging in comparison to 
coding challenge 1. For my solution for challenge two, I came very 
close. I started working towards my solution for coding challenge two 
by constructing a new `alternativeFormat` using the given format function 
as a reference on how I could set it up. Within my alternativeFormat 
function, I used the `DateTimeFormatter` API that the original format 
function used and used it to begin declaring a dateTime String. Rather 
than using the `ISO_INSTANT` for my `alternativeFunction`, I used `.ofPattern `
to rearrange and set the pattern for how I want the timestamp to be set 
up and provide a more user-friendly display of the date and time. 
( `.ofPattern("MM/dd/yyyy 'at' HH:mm:ss")` ) To summarize the rest of 
the declaration of the string, I continued chaining functions to where 
I chained a piece of code to a zone declaration and set a default zoneId, 
and then lastly finished off the chain with the format utility class 
containing `revision.timestamp`. For the remainder of the function, I set 
up the output String similarly to how the original format output String 
but with a few adjustments to further meet the requirements of providing 
a more user-friendly display of the 30 or fewer most recent revisions. 

After setting up my alternative format function, I added a Formatter 
Interface. In the Formatter interface, I placed and declared both the 
original `format` function and my `alternativeFormat` function. I removed 
the original format from the interface later as it was not being used, 
and I need to follow the clean code principles as much as possible. I 
also constructed a new class to construct a `FormatterModule`. In my 
formatter module, I developed a similar setup with code to the 
`QueryEngineModule` that I had adjusted in challenge 1. For my 
`FormatterModule` I bound the Formatter class with the `RevisionFormatter` 
class. After constructing and developing my new `FormatterModule` I added 
the module to the Guice injector located in the APP class. 

The reason behind why I have not truly completed challenge two is that 
I currently still have both of my format functions placed in the same 
class, which does not follow the rules of object-oriented programming. 
If I attempt to move my alternative format into another class, my code 
comes up with several errors that I am not entirely sure how to fix. 
To my knowledge, the main issue that is causing me to be unable to 
consider this challenge truly completed has something to do with the 
interface I constructed. I do know for a fact that I am very close to 
the solution of challenge 2. Even if it is not 100% completed, I 
still set up the code to run the alternative format I constructed. 


## Challenge #3 Complete

My solution for challenge 3 starts with beginning the declaration of 
the `String stringBuilder` and setting it equal to `response.revision()` 
which then is followed by a chain to `stream()`. I did not originally 
have it set as a String, but it changed as I continued the process 
of using higher-order functions and method chaining. 
(`String stringBuilder = response.revision().stream().`). I started 
the declaration of the string as response.revision is the list that 
is looped for the original for loop, and I called `stream()` as it is 
supposed to call on the list. After calling `stream()`, I continued 
with the process of Higher-Order function and chaining with the 
chaining of a `.map()` to the `stream()`. Within the `map()`, I add the new 
formatter created from the `revisionFormatter` outside of the for loop 
and used the `alternativeFormat` I developed in challenge two. I am 
reconstructing the first line within the for loop but through stream 
processing. I lastly use a collect function to end off the chain of 
functions. Within my collect function, I set up Collectors.joining(), 
and in joining, I  make "\n" the delimiter. The Collectors class 
allows the user the ability to deal with certain elements in this 
case. As I set up `Collectors.joining("\n")` the `.joining("\n")` is 
making it so that when the strings returned from the alternativeFormat 
called within the map function of the stream, the items, after going 
through the stream completely, will not be displayed on a single line. 
I know this, as I myself did not use `.joining("\n")` at first, which 
caused all alternativeFormat output strings to be given and displayed 
on a single line of the display window. Other than that, I managed to 
fix whatever issues and complications I came across and in the end 
found the solution for Challenge three, thus completing it. 



## Reflection Question #1: Functional vs OO

The iterative and functional approaches can both develop code for a 
particular task or objective but complete them in very different ways. 
The iterative approach is known for basically being a recursive process 
that completes or commences the same repetitive sequence. The functional 
approach, in summary, involves the process of using higher-order functions 
and method chaining. The iterative approach to concatenation is simple to 
understand and create, thus making it more comfortable to implement. I 
have had more experience working with the iterative approach as well. I, 
however, prefer the functional application a little bit more over the 
iterative application. The reasoning behind my preference is that I find 
the visual formation and clean setup of the functional approach to be more 
appealing, more satisfying to construct, and more interesting to set up. I 
could still use some more practice working with the functional approach to 
string concatenation and gain more experience with it, but as I said, I 
still partially prefer using it a little more with code. 


## Reflection Question #2: Polymorphism and Dependency Inversion

Polymorphism engendered dependency inversion as I was working on and 
constructing code for challenge two. More specifically, if I am 
understanding the concept correctly, polymorphism is used as I make use 
of the @Override methods in my `FormatterModule`, and my RevisionFormatter 
class contains an @Overide method over my `alternativeFormat` as well. 
The locations I listed are only the times that I have used it, 
polymorphism appears to be used in several classes as the classes 
incorporate the @Overide method. Dependency inversion, specifically 
takes place within my `revisionFormatter` class.


