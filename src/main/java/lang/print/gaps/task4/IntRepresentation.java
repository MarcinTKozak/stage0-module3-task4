package lang.print.gaps.task4;

public class IntRepresentation {
    public static void main(String[] args) {

        char c = 'c';
        char h = 'h';
        char a = 'a';
        char r = 'r';


        char[] chars = {c, h, a, r};
        for (char o : chars) {
            int intValue = (int) o;
            System.out.println(intValue);
        }
    }
}
