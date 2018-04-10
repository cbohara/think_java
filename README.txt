public = methods that can be invoked from other classes
void methods don't yield a result
value methods yield a result

main is followed by ( ) 
	contains a list of variables = parameters 
	where the method stores its arguments 
	main has a single parameter = args = type String[]
	whoever invokes main must provide an array of strings

execution always begins at the first line of main

when you use a method you provide the arguments
when you write a method you name the parameters 

overloading = having more than 1 method with the same name
	it is legal as long as each version takes different parameters
	Java will figure out which version to use based on argument provided

all values in java array must be of same type
	int[] counts;
	counts = new int[4];

	//OR in 1 line
	int[] counts = new int[4];

	//OR specify content of array
	int[] a = {1, 2, 3, 4, 5};

size of array must be non-negative

the variable that refers to the array and the array itself are separate
the value of the variable is a reference 

//both a and b point to the same array = alias
//any changes made to 1 with be reflected in the other
double[] a = new double[3];
double[] b = a;

int[] a = {1, 2, 3, 4};
System.out.println(a);
> [I@bf3f7e0
	[ = value is an array
	I = int

java has a for each loop for arrays like python
for (int value : values) {
	System.out.println(value);
}

primitive types != objects
	int
	double
	boolean
	char

primitive values do not provide methods
each primitive type has a corresponding wrapper class
	provides additional methods

strings are objects
	they contain chars
	provide methods for manipulating character data

// string literals are in double quotes
String fruit = "banana";
// chars are in single quotes
char letter = fruit.charAt(0); // 'b'

java uses unicode to rep char
	each char rep by "code unit" (integer number)

strings are immutable
when using methods applied to strings, you get a new string object as the return value
String name = "Alan Turing";
String upperName = name.toUpperCase(); // "ALAN TURING"
// need to invoke string method by using ()
int length = name.length();

substring indexing works like python
String fruit = "banana"
fruit.substring(0, 3); // "ban"
fruit.substring(6, 6); // ""

should not compare strings using ==
	will compare the reference (memory address)
	not the actual value
use equals method
String ada = "Ada Lovelace";
String alan = "Alan Turing";
if ada.equals(alan) {
	System.out.println("Same name");
}

garbage collection

Point blank = new Point(3, 4);
blank = null;

if there is no references to an object, there is no way to access its attributes or invoke a method on it
however, Point(3, 4) is still taking up space in memory

as the program runs the system automatically looks for stranded objects and reclaims them
then space is reused for new objects

attribute = object's data
method = object's code
class = defines which attributes and methods the object will have

java library source code is stored in 
/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/src.zip

classes
	defining a class creates new object type with the same name
	every object belongs to some object type
	a class definition is like a template for objects
		specifies what attributes the objects have
			attributes = instance variables 
		what methods can operate on them

private instance variables 
	help keep classes isolated from each other so that changes in one class won’t require changes in other classes
	simplifies what other programmers need to understand in order to use your classes = information hiding

constructor
	specialized method that initializes instance variables 
	name of constructor = name of class
	have no return type
	keyword static is omitted

this 
	refers to the object we are creating
	can read and write the instance variables of this
	can pass this as an argument to other methods
	cannot declare this
	cannot make an assignment to it
