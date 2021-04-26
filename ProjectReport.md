# Project Report

(Jaren Xavier Provost)

## Markdown Tips

If you are unfamiliar with MarkDown, check out 
[the official documentation](https://guides.github.com/features/mastering-markdown/).

Note that IntelliJ IDEA has a Markdown preview that you can access in 
the upper-right of the editor. Also, since Markdown documents&mdash;like
source code&mdash;should be human-readable, make sure you keep your lines
short, as you can see I have done in my Markdown files.

Please remove this subsection before submitting your report. 

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


## Challenge #2 Complete

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
the true solution of challenge 2. Even if it is not 100% completed, I 
still set up the code to run the alternative format I constructed. 


## Challenge #3 Complete

(Explain your solution to Challenge #3. If it is not complete, change
the subsection title above to "Incomplete" and explain how far you got
and where you got stuck.)


## Reflection Question #1: Functional vs OO

(Write one or more paragraphs comparing and contrasting the iterative and functional  
approaches to string concatenation you explored in challenge #3. Which do you
prefer, and why?)


## Reflection Question #2: Polymorphism and Dependency Inversion

(Explain how polymorphism engendered dependency inversion in this little
application. Be clear and precise here, as this is, in part, an assessment of
your correct use of technical terminology.
Consider, for example, where exactly is polymorphism used?
Where exactly is a dependency inverted?)


