public class test{
    public static void main(String args[]){
        String[] password = {"", "", "", "", ""};
        for(int i=0;i<password.length;i++){
            boolean lunghezza;
            boolean carattere;
            String S1;
            int h = 0;
            do{
                if(h != 0){
                    Interazione.output("la password non va bene, dave essere di almeno 8 caratteri i contenere almeno uno tra i caratteri speciali:\n&\t$\t@"); 
                }
                S1 = Interazione.strput("inserisci la "+ (i+1) + " password");
                lunghezza = S1.length() < 8;
                carattere = true;
                for(int j = 0;j < S1.length();j++){
                    if(S1.charAt(j) == '&'){
                        carattere = false;
                    }
                    if(S1.charAt(j) == '$'){
                        carattere = false;
                    }
                    if(S1.charAt(j) == '@'){
                        carattere = false;
                    }
                }
                h++;
            }while(lunghezza || carattere);
            password[i] = S1;
        }
        Interazione.output("le mie password sono:");
        for(int i=0;i<password.length;i++){
            Interazione.output("\t"+(i+1)+"\t"+password[i]);
        }
        Interazione.close();
    }
}