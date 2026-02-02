# distorted-realities back end

# Coding Standards

- Every file should have the following block documentation, containing the authors name, 
the date the file was created, and a description of the file:
```  
/**
 *
 * Organization: Distorted Realities
 * Author: insert author name
 * Created: Month day, Year
 *
 * Description: __________
 * 
 * 
 * 
 *
 * 
 * 
 */
```
- Every method, controller, etc should have documentation with parameters, return type,
and a brief description to the functions purpose. Todo messages should be added after the comment block.
```
/**
 * Explains what it does
 *
 * @param paramType paramName (optional) brief description.
 * @return returnTypeOne, returnTypeTwo, (optional) brief description.
 */
```
- camelCase is used for variables and methods
- PascalCase is used for class names, controllers, and interfaces
- SCREAMING_CASE is used for final variables, enums.