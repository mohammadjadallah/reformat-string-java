package reformatstring;

import java.util.Scanner;

public class ReformatString {
    
    private final String str;
    
    public ReformatString(String str){
        this.str = str;
    }
    
    public void reformatString(){
        String reformat_str = "";
        int count = 0;
        
        try{
                // for each, convert string toCharArray()
                for(char chr: this.str.toCharArray()){
                    count += 1;
                    if(chr == ' ' && this.str.charAt(count) == ' ') continue;

                    else if(chr == ' ' && this.str.charAt(count) != ' ') reformat_str += " ";

                    else reformat_str += chr;

                } // end of for each
        
                System.out.println(reformat_str);

        } // end try, begin catch
        
        catch(StringIndexOutOfBoundsException ex){
          
                System.out.println(reformat_str);
            
         } // end of catch error

      } // end of constructor
        
    
    // main method
    public static void main(String[] args) {
        
        // get input from user
        Scanner input_user_string = new Scanner(System.in);
        String str = input_user_string.nextLine();
        
        // get the constructor
        ReformatString reformat = new ReformatString(str);
        reformat.reformatString();
        
        
    } // end of main
    
} // end of the class ReformatString
