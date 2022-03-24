# ArrayLists Part 2

### Setting a value to a certain index in an Arraylist
For Arrays:
```java
array[0] = 2;//{2}
array[0] = 4;//{4}
```

For ArrayLists:  
**Note:** If you want to set a value at a certain index, you need to make sure that the index is less than or equal to the current size of the ArrayList.

The format for setting a value at a certain index is as follows:
We want to add the integer 10 at index 3 of our ArrayList called data

```java
data.set(3, 10)
```

**data** = calling our arraylist  
**.** = using the dot operator to call a method or variable from the ArrayList class  
**set** = the method in the ArrayList class to set a value  
**(int index, value)** = the index to set value at in the ArrayList

### Getting a certain value in the ArrayList
Accessing a certain value from an ArrayList is VERY important! Using the **get()** method, you are able to access a value in an ArrayList

**Note:** in order to get a certain value from an ArrayList, we need to know its index. To find the index of a value, we need to use the indexOf() method.

The layout of the get() method for an ArrayList is as follows:  
If we want to get the value 2 from the ArrayList:
```java
int index = data.indexOf(2); // returns the index of 2 in data
int two = data.get(index);// returns the value at index in data
```



