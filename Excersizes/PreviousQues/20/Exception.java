public class Exception{
    char getPosition(String s, int index){
        try {
            return s.charAt(index);
            
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Out of bound");
            return 0;
        }
    }
}