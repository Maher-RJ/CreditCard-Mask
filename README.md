# Task & Solution

### Task

Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct. However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.

Your task is to write a function maskify, which changes all but the last four characters into '#'.

![challenge1](https://user-images.githubusercontent.com/57875037/76687591-98b45680-6625-11ea-9717-095b98dc1522.png)
![challenge1(2)](https://user-images.githubusercontent.com/57875037/76687629-f183ef00-6625-11ea-8ff8-4a3dc5173e3b.png)

### Solution
First i get the last 4 characters of string using substring fucntion
String lastFour = creditCardNumber.substring(creditCardNumber.length() - 4);
it will return whatever the last 4 characters  are then i pass this lastFour string to my function clFourDgt(lastFour). In the function i checked each character if it is digit, if all are characters then return true yes last four characters are  digt else false.

Now in our maskif function we first check if our string has digits if(creditCardNumber.matches(".*\\d.*")); this regex will confirm us, if it is true, there are some digits, then we check if the first character of the string is digit then we get the digit and check if last 4 are digit  if yes then we get the string between first and last 4 and  replace if there are digits in that string and in the end concatenate creditCardNumber=firstDigit+restString+lastFour
if first is digit and last four are not digit then in the else part i get the remaining string except first and replace all the digits with #
