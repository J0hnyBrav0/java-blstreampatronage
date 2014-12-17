
/**
 *
 * @author michaljankowski
 */
public class BLStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        if (args.length == 1){
            sb.append(args[0]);
            sb.reverse();
            System.out.println(sb.toString());
        }
        else{
            System.out.println("Provide one, and only one argument.");
        }
    }
    
}
