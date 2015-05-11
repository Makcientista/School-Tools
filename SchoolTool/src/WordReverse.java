import javax.swing.JOptionPane;

public class WordReverse {
   
    String st ;
    char[]  chr ;
    int top ;
 
    public WordReverse(String stg){
        st = stg ;
        chr = new char[stg.length()];
        top=-1;
    }
   
    public void pushChar(char num){
        if(top==st.length()-1){
            System.out.println("NO FREE SPACE ");
            return;
        }
        else
            chr[++top]=num ;
    }
   
    public char popChar(){
        char item ;
        if(top==-1){
            System.out.println("ALREADY Empty");
            return 0 ;
        }
        else
            item = chr[top--];
            return item;  
    }
 
     public char peep(){
        if(top==-1){
            System.out.println("IS EMPTY");
            return 0 ;
        }
        return chr[top];
           
    }
    public void reverseString(){
 String n = "";
        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);
            pushChar(ch);
        }
        for(int i=0;i<st.length();i++){
            n+=popChar();
        }
  
 JOptionPane.showMessageDialog(null, n , " Name reversed", 1); 
    }
 
 
 public static void main(String[] args){
  String firstName = JOptionPane.showInputDialog("INVERT THE NAME ",""
                + "Enter your name " );
  WordReverse stk = new WordReverse(firstName);
  stk.reverseString();
 }
}

