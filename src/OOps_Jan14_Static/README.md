### Static Keyword
## Types  & Uses:
1.Variable  (EX: static int a =10;)

2.Method    (Ex: static void main ())

3.Block     (Ex: static {System.out.println("SIB")})

4.Nested Class (Ex: Class A
{
Static B{}
}
)

## Notes:
### Static : It's visible to all, Class level
-> Something that common for all Object
->It's not available outside the class.

## Notes:
1. When a member (Data Variable) declared static. It can access before any Object  of it's class created. without reference  any object.
2. #### Static Block executed only once,
when the class first loaded.

3. ### Static Variable:
When variable is declared as static , then Single copy of a variable is created (means Kind of acting like a Global Variable)and share among all Object with class level.