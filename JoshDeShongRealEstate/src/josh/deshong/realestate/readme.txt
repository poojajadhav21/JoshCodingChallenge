Libraries used: 
1.java.io.* - used to read input character stream and output messages
2.java.util.regex.Pattern - used to determine whether the input pattern contains 10 digits

Algorithm:
1. Define a function E164Format which takes phone_number as input of type string.
2. Check if the length of the string is 10.
3. If length is 10, then using pattern match and compile methods determine if the 10 characters in the string are digits.
4. Once determined that the string characters are digits, calculate the E.164 format by appending "+1" to the phone_number.
5. Display the result. 

References:
1. https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
2. Java in a nutshell- A Desktop Quick Reference - David Flanagan
3. https://www.twilio.com/docs/glossary/what-e164