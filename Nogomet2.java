import java.util.Scanner;
import java.util.Arrays;

//Dve stvari ne delata tako kot bi morali (komentarja)

public class Nogomet2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int i = 0;
        String[] skupaj = new String[15];   //nevem kako bi naredu, da bi bil array size variable, v loopu se reseta
        double[] skupajCas = new double[15];
        String [] vse = new String[15];

        while(true){

            System.out.println("Enter an event.");
            String vnos = sc.nextLine();
            

            if (vnos.equalsIgnoreCase("konec")){
                for(int j=1;j<=vse.length;j++){
                    System.out.println(vse[j-1]);
                    System.out.println();
                }

                
                

                System.exit(0);
            }

            
            
            String dogodek = vnos.split("-")[0];
            float cas = Float.parseFloat(vnos.split("-")[1]);

            skupajCas[i] = (cas);
            skupaj[i] = (dogodek);
            
            
            if (Math.floor(cas)!=45.0||Math.floor(cas)!=90.0){          //tole tud ne dela pa ne vem zakaj (input 45.5)
                if (cas % 1 == 0){  //celo stevilo

                    vse[i] = ((i+1)+"."+skupaj[i]+"("+skupajCas[i]+"')");
                    i++;
                    continue;
                    
                }
                else{
                    
                    System.out.println("Invalid input");
                    
                }
            }
            else{
                if (cas % 1 == 0){
                    vse[i] = ((i+1)+"."+skupaj[i]+"("+skupajCas[i]+"')");
                    i++;
                    continue;
                }
                else{
                    System.out.println(skupajCas[i] =cas + Float.parseFloat((String.valueOf(cas).split(".")[0])));
                    //skupajCas[i] =cas + Float.parseFloat((String.valueOf(cas).split(".")[0]));
                    vse[i] = ((i+1)+"."+skupaj[i]+"("+skupajCas[i]+"')");
                }
            }
            
            
        }


    }
}
