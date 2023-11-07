public class Function {
    public static void main(String[] args){
        String name = "Bidhan";
        System.out.println(name.toLowerCase());
        //changes string to lower case
        System.out.println(name.toUpperCase());
        //changes string to upper case
        System.out.println(name.equals("Bidhan"));
        //checks if given string is equal to required string
        System.out.println(name.equalsIgnoreCase("bidhan"));
        //compares given and required string while ignoring Upper or Lower case
        System.out.println(name.charAt(4));
        //gives the needed character of the string according to the index
        System.out.println(name.indexOf('a'));
        //gives the index of the required character in the string
        System.out.println(name.contains("n"));
        //checks if the given string contains the required character
        System.out.println(name.length());
        //gives the length of the given string
    }
}
