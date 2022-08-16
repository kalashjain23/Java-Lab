public class SortingString
{
    public static void main(String[] args)
    {
        StringBuilder str = new StringBuilder("kalash");
        for(int i = 0; i < str.length() - 1; i++){ // Bubble Sort
            for(int j = i + 1; j < str.length(); j++){
                if(str.charAt(j-1) > str.charAt(j)){
                    swap(str, j-1, j);
                }
            }
        }
        System.out.println(str); // Output: aahkls
    }

    static void swap(StringBuilder str, int i, int j){ // Swapping function
        char temp = str.charAt(i);
        str.setCharAt(i, str.charAt(j));
        str.setCharAt(j ,temp);
    }
}
