# Clemi-Grocery-Project
This program creates a new Node list that allows for a grocery list to be created.  
    
Method Reflection:    
     
The method I created takes the users node input and ensures that it is a valid grocery item     
-First i access the file     
-Then i iterates through each item on each line    
-I substringed the item    
-Then i compare each item to the parameter to see if it is in the file  
    -If it is the method returns the item back into the parameters that create the node  
    -If it is not in the method it returns none so the node does not have a value   
I also created a duplicate method that checks that the imputed node is a value  
-It does this by turning each item in the txt file into a node and comparing in with the parameters and if it does not match up then it will return null; otherwise it allows the value to pass  
     
Limitations    
-A limitation of this program is that in order to create a Node or grocery item the user needs to know how to call/ create the node     
-To solve this problem I would create a user interface that allows for the user to input just the items they want to add    
-If this limitation was taken care of then the program would be much more usable to the general user which is what this program would target, and if this wasn't fixed then the program would be a waste of time to use when shopping     



