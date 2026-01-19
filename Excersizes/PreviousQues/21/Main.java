public class Main {

	public static void main(String[] args) {
        String input = null;
		
		WordCount w = new WordCount();
        int len = w.getLen(input);
        if(len != -1){
            System.out.println("Lenth: " + len);
        }
	}

}