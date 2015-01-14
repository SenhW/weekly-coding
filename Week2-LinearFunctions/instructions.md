# Instructions

Taken from: https://rk8790.wordpress.com/2015/01/10/weekly-coding-2-oo-modelling-of-linear-functions-in-c/

## Background

To keep it simple (this is not a mathematics blog ;)), linear functions look like this:

    f(x) = 5x + 3
    f(x) = 2x + 7
    f(x) = -2x
    f(x) = 4

In general:

    f(x) = ax + b

You can see that objects of linear functions just differ by the values of a and b. Points of the form (x | f(x)) can be obtained by calculating the f(x) to a given x.

## Functionality

There are a some interesting ways how to interact with a linear function:

* Calculate f(x) to x
* Calculate x to f(x)
* Calculate the root (x where the function intersects with the horizontal axis)
* Check, if a point (x | f(x)) is part of the linear function
* Check if 2 linear functions are parallel
* Calculate the point (x | f(x)) where 2 linear functions intersect
* Plotting the graph