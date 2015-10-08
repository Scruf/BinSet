# BinSet
Lab - Binary Search Based Set
=============================

![Binary search (searched value:
6)](http://en.algoritmy.net/image/id/40163)

Binary Search example from algoritmy.net

* * * * *

Introduction
------------

You want a set data structure, but you have decided that the `HashSet`
and the `TreeSet` are not suitable for your purposes, and so you have
decided to write your own implementation. The collection is represented
as an `ArrayList` and fast access is assured by keeping the elements
sorted and using binary-search. You will have to implement most of the
methods required by the `Set` interface. Fortunately, inheriting from
`AbstractSet` will save you writing a couple of methods. For testing
purposes, you have decided to include both test scaffolding in the main
method of the class itself (storing Integer objects) as well as another
Comparable class (written from scratch) with its own testing code. The
output of the testing code should be:

Example:

    $ java BinSet
    constructor 1 success
    add 1 success
    contains 1 success
    contains 2 success
    contains 3 success
    contains 4 success
    size 1 success
    clear/size success
    clear/isEmpty success
    addAll 1 success
    containsAll 1 success
    containsAll 2 success
    remove 1 success
    iterator 1 success
    iterator 3 success
    retainAll 1 success
    toArray(array) 1 success

* * * * *

Pre-Lab Work
------------

-   Read the Java Tutorial:
    [Collections](http://java.sun.com/docs/books/tutorial/collections/index.html)
-   Read the Wiki page:
    [Binary-Search](http://en.wikipedia.org/wiki/Binary_search_algorithm)

* * * * *

Implementation
--------------

Part 1: BinSet binary-search-based set
--------------------------------------

You will implement a set based on binary search. To get you started,
skeleton code is provided, along with some code that uses Integers to
fully test the BinSet class.

### Java Documentation

You can find the JavaDoc for the `Set` interface
[here](http://docs.oracle.com/javase/8/docs/api/java/util/Set.html). You
will find it quite useful.
[Here](http://docs.oracle.com/javase/8/docs/api/java/util/AbstractSet.html)
is the JavaDoc for `AbstractSet`.

The following javadoc provides you with a definition of the `BinSet`
class that you will be required to implement.

-   [`BinSet`](docs/BinSet.html) class

The jar file: [lab6.jar](lab6.jar). contains a stubbed out version of
the `BinSet` class as a starting point for you. Included in the provided
code is a `main` method that has some simple/incomplete testing code.
For **Part 3** of the lab you will implementing a more complete class to
test you collection.

### Description

There are a number of methods to be written. Take care that the
`contains` method is O(log(*n*)). Otherwise you may implement the other
methods as you see fit - note that many of them can be written in a
single line of code.

Part 2: Writing a Comparable class: Card
----------------------------------------

To further test your binary set, and to give you practice writing a
comparable class, you must also implement a simple Card class. The
following is provided to aid in your implementation.

-   The [`Card`](docs/Card.html) class javadoc
-   The [`Ranks`](docs/Ranks.html) class, source for the Ranks class is
    included in the jar file (Make sure you don't modify `Ranks.java`
    being you are not submitting it).

The `compareTo` method of the Card class should return values such that
when placed in a sorted collection (such as the BinSet) they appear
sorted by suit, and by numeric value within the suit. Recall that the
Rank enumeration has an integer value that will be helpful for this
task. Once you have written the comparator, write testing code in the
main method that creates some Card objects, puts them into a BinSet, and
tests the methods of the BinSet class.

Part 3: Writing a main class: TestBinSet
----------------------------------------

You will also need to write a main program (
[`TestBinSet`](docs/TestBinSet.html) class) that tests the functionality
of the BinSet and the Card classes. You will want to test your BinSet
with other classes besides the Integer class tested inside the BinSet
class itself.

* * * * *

### Commenting

Be sure to fully comment your implementation. This includes:

-   A file comment block that includes the correct CVS tags (`$Id$` and
    `$Log$`).
-   A class JavaDoc comment block that includes a description and an
    `@author` tag (with full name(s) and ID(s)).
-   A JavaDoc comment block for every field and method (whether public
    or private) that includes a description and (for methods) `@param`
    and `@return` tags.
-   For any non-trivial method, sufficient comments to explain its
    implementation.

