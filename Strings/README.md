## Strings
In java strings are objects that are backed internally by a char array. Since arrays are immutable(cannot grow), Strings are immutable as well.
Whenever a change to a String is made, an entirely new String is created.

<img src= "https://media.geeksforgeeks.org/wp-content/uploads/20210711152428/JVMMemoryArea2.png"></img></br>
source : "Geeks For Geeks"

### Memory allotment of String

Whenever a String Object is created as a literal, the object will be created in String constant pool. This allows JVM to optimize the initialization of String literal.

* For example:
`String str = "hello";`</br>
The string can also be declared using new operator i.e. dynamically allocated. In case of String are dynamically allocated they are assigned a new memory location in heap. This string will not be added to String constant pool.

* For example: 
`String str = new String("Geeks");`
</br>If you want to store this string in the constant pool then you will need to “intern” it.

* For example:
`String internedString = str.intern();` </br>
this will add the string to string constant pool.
