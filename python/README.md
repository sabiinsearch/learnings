
# Learn Python
##  What is Python?
    
    Python is a popular programming language. It was created by Guido van Rossum, and released in 1991.

    It is used for:

        web development (server-side),
        software development,
        mathematics,
        system scripting.
##  What can Python do?
        Python can be used on a server to create web applications.
        Python can be used alongside software to create workflows.
        Python can connect to database systems. It can also read and modify files.
        Python can be used to handle big data and perform complex mathematics.
        Python can be used for rapid prototyping, or for production-ready software development.
##  Why Python?
        Python works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc).
        Python has a simple syntax similar to the English language.
        Python has syntax that allows developers to write programs with fewer lines than some other programming languages.
        Python runs on an interpreter system, meaning that code can be executed as soon as it is written. This means that prototyping can be very quick.
        Python can be treated in a procedural way, an object-oriented way or a functional way.

#   Python Install
    
Many PCs and Macs will have python already installed. To check if you have python installed on a Windows PC, search in the start bar for Python or run the following on the Command Line (cmd.exe):
    
    C:\Users\Your Name>python --version

To check if you have python installed on a Linux or Mac, then on linux open the command line or on Mac open the Terminal and type:

    python --version

If you find that you do not have Python installed on your computer, then you can download it for free from the following website: https://www.python.org/

# Python Quickstart

Python is an interpreted programming language, this means that as a developer you write Python (.py) files in a text editor and then put those files into the python interpreter to be executed.

The way to run a python file is like this on the command line:

    C:\Users\Your Name>python helloworld.py

    Where "helloworld.py" is the name of your python file.

# Key Features

## Indentation

Python uses indentation to indicate a block of code. Python will give you an error if you skip the indentation:

You have to use the same number of spaces in the same block of code, otherwise Python will give you an error:

Comments starts with a #, and Python will ignore them:

## Creating Variables

Python has no command for declaring a variable. A variable is created the moment you first assign a value to it.

## Casting Variable

If you want to specify the data type of a variable, this can be done with casting.

    example  
        x = str(3)    # x will be '3'
        y = int(3)    # y will be 3
        z = float(3)  # z will be 3.0
    
You can get the data type of a variable with the type() function.

Variable names are case-senstive.

## Multi Words Variable Names

Variable names with more than one word can be difficult to read. There are several techniques you can use to make them more readable:

### Camel Case

Each word, except the first, starts with a capital letter:

    myVariableName = "John"

### Pascal Case

Each word starts with a capital letter:

    MyVariableName = "John"

### Snake Case

Each word is separated by an underscore character:

    my_variable_name = "John"

## Many Values to Multiple Variables

Python allows you to assign values to multiple variables in one line

    example  
        x, y, z = "Orange", "Banana", "Cherry"

And you can assign the same value to multiple variables in one line:
    example
        x = y = z = "Orange"
    
