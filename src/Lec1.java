import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lec1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amountLecs = in.nextInt();
        Map<Integer, Integer>lecs = new HashMap<Integer, Integer>();
        String[] masLecs = new String[2];

        for (int i = 0; i < amountLecs+1; i++ ){
            if(i>0) {
                String line = in.nextLine();
                System.out.println(line);
                masLecs = (line.split("\\s"));
                lecs.put(Integer.parseInt(masLecs[0]), Integer.parseInt(masLecs[1]));
                masLecs[0] = "";
                masLecs[1] = "";
            }
        }
        System.out.println(lecs.keySet());
        System.out.println(lecs.values());
        for (int i = 0; i < amountLecs; i++){
        }
    }
}
