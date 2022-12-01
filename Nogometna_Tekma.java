
import java.util.Scanner;


class Nogometna_Tekma{
    public static void main (String []args){

        Scanner sc = new Scanner(System.in);
    
        for(;;){
            
            System.out.println("Enter and event.");

            String vnos1 = sc.nextLine();
            
            String dogodek;
            dogodek = vnos1;
            String[] skupaj ={};


            if (vnos1.equalsIgnoreCase("konec")){
                skupaj = dogodek.split("-");
                System.out.println(skupaj);
            }
            
            //String [] dogodek = vnos1.split("-");
                    // String dogodek;
                    // dogodek.append((vnos1.split("-"))[0]);
                    // String skupaj = new String (dogodek[0]+"("+dogodek[1]+"')");   
                    // System.out.println(skupaj);              
            
            // if(vnos1.equalsIgnoreCase("konec")){
                //for (int i = 0; i<= skupaj.length; i++){
                   // System.out.println();
                //break();                //apperantly not in a loop 
            }
                    
            }  

    }
