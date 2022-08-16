public class StringEquality
{
    public static void main(String[] args)
    {
        String a = "Kalash"; // Makes a string object in string pool in heap
        String b = "Kalash"; // Points to the same string object as a
        String c = new String("Kalash"); // Points to a new string object

        System.out.println(a == b); // As they are pointing to the same object, it returns true
        System.out.println(a.equals(b)); // As they have same content, it returns true
        System.out.println(a == c); // As they are pointing to different string objects, it returns false
        System.out.println(a.equals(c)); // As they have same content, it returns true
    }
}
