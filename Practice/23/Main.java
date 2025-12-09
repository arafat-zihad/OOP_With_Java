

public class Main{
    public static void main(String[] args) {
    String input = null;
    // Scanner sc = new Scanner(System.in);
    // String input = sc.nextLine();

    WordCount w = new WordCount();

    int len = w.getLen(input);

    if (len != -1) {
            System.out.println("Length: " + len);
    }
    }
    
    
}