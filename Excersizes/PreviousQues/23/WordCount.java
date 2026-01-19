public class WordCount{
    int getLen(String word){
        try{
            if(word == null){
                System.out.println("Warning");
                return -1;
            } else{
                return word.length();
            }

        } catch(NullPointerException e){
            System.out.println("Warning");
                return -1;
        }
        // try{
        //     if(word == null){
        //     System.out.println("Warning");
        //     return -1;
        //     }
        // }
        // return word.length();
        // catch(NullPointerException e){
        //     System.out.println("Warning");
        //     return -1;
        // }

    }

   
    
}