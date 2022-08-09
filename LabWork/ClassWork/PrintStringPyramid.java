public class PrintStringPyramid {
    public static void main(String[] args) {
        char[] string = "Programming".toCharArray();
        int spaces = string.length-1;
        
        for(int i = 0; i < string.length; i++){
            for(int k = 0; k < spaces; k++){
                System.out.print(" ");
            }
            spaces--;
            for(int j = 0; j <= i; j++){
                System.out.print(string[j] + " ");
            }
            System.out.println();
        }
    }
}
