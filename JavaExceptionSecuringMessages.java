040. Java Exceptions: Securing Messages
Create an Encrypter class to handle input validation and encryption. It should have the method String getEncryptedName(String name) that performs a simple string manipulation.
The getEncryptedName method must perform the following tasks
-Validate the name by calling the valudate(name) method provided in Validator class
- If name validattion returns true
     - Reverse entire string and convert upper-case letters to lower-case
     - Return modified string
- If name validation returns false
     - Throw an exception of IllegalArgumentException class with the message 'Try again with valid name'
Hints :
1) Check if character is uppercase
2) convert character to upper/lower case
3) throw an exception with message



   public static String getEncryptedName(String name){
        //String manipulation
        Validator validatorObj = new Validator();
        boolean isValid = validatorObj.validate(name);
        int n= name.length();
        String revString="";
        char ch;
        if(isValid == true){
            for(int i=n-1;i>=0;i--){
                if(Character.isUpperCase(name.charAt(i)))
                    ch = Character.toLowerCase(name.charAt(i));
                else
                    ch = Character.toUpperCase(name.charAt(i));
                revString += ch;
            }
        }
        else {
            throw new IllegalArgumentException("Try again with valid name");
        }
        return(revString);
    }

    public static void main(String[] args) {
        System.out.println(getEncryptedName("HeLLo It's Me!"));
    }
}

class  Validator{
    public boolean validate(String name){
        return false;
    }