import java.util.Scanner;

public class greatDalmuti {
    
    
  public static void shuffleCards()  {
        
        
        
    String[]cardName = new String[80]; 
    
    Scanner scnr = new Scanner(System.in);
    
    

    cardName[0] = "1: Dalmuti";
    cardName[1] = "2: Archbishop";
    cardName[2] = "2: Archbishop";
    cardName[3] = "3: Earl Marshal";
    cardName[4] = "3: Earl Marshal";
    cardName[5] = "3: Earl Marshal";
    cardName[6] = "4: Baroness";
    cardName[7] = "4: Baroness";
    cardName[8] = "4: Baroness";
    cardName[9] = "4: Baroness";
    cardName[10] = "5: Abbess";
    cardName[11] = "5: Abbess";
    cardName[12] = "5: Abbess";
    cardName[13] = "5: Abbess";
    cardName[14] = "5: Abbess";
    cardName[15] = "6: Knight";
    cardName[16] = "6: Knight";
    cardName[17] = "6: Knight";
    cardName[18] = "6: Knight";
    cardName[19] = "6: Knight";
    cardName[20] = "6: Knight";    
    cardName[21] = "7: Seamstress";
    cardName[22] = "7: Seamstress";
    cardName[23] = "7: Seamstress";
    cardName[24] = "7: Seamstress";
    cardName[25] = "7: Seamstress";
    cardName[26] = "7: Seamstress";
    cardName[27] = "7: Seamstress";    
    cardName[28] = "8: Mason";
    cardName[29] = "8: Mason";
    cardName[30] = "8: Mason";
    cardName[31] = "8: Mason";
    cardName[32] = "8: Mason";
    cardName[33] = "8: Mason";
    cardName[34] = "8: Mason";
    cardName[35] = "8: Mason";    
    cardName[36] = "9: Cook";
    cardName[37] = "9: Cook";
    cardName[38] = "9: Cook";
    cardName[39] = "9: Cook";
    cardName[40] = "9: Cook";
    cardName[41] = "9: Cook";
    cardName[42] = "9: Cook";
    cardName[43] = "9: Cook";
    cardName[44] = "9: Cook";   
    cardName[45] = "10: Shepherdess";
    cardName[46] = "10: Shepherdess";
    cardName[47] = "10: Shepherdess";
    cardName[48] = "10: Shepherdess";
    cardName[49] = "10: Shepherdess";
    cardName[50] = "10: Shepherdess";
    cardName[51] = "10: Shepherdess";
    cardName[52] = "10: Shepherdess";
    cardName[53] = "10: Shepherdess";
    cardName[54] = "10: Shepherdess";    
    cardName[55] = "11: Stonecutter";
    cardName[56] = "11: Stonecutter";
    cardName[57] = "11: Stonecutter";
    cardName[58] = "11: Stonecutter";
    cardName[59] = "11: Stonecutter";
    cardName[60] = "11: Stonecutter";
    cardName[61] = "11: Stonecutter";
    cardName[62] = "11: Stonecutter";
    cardName[63] = "11: Stonecutter";
    cardName[64] = "11: Stonecutter";
    cardName[65] = "11: Stonecutter";    
    cardName[66] = "12: Peasant";
    cardName[67] = "12: Peasant";
    cardName[68] = "12: Peasant";
    cardName[69] = "12: Peasant";
    cardName[70] = "12: Peasant";
    cardName[71] = "12: Peasant";
    cardName[72] = "12: Peasant";
    cardName[73] = "12: Peasant";
    cardName[74] = "12: Peasant";
    cardName[75] = "12: Peasant";
    cardName[76] = "12: Peasant";
    cardName[77] = "12: Peasant";    
    cardName[78] = "13: Jester";
    cardName[79] = "13: Jester";

    
    
    
    for(int i = 0; i < cardName.length; i++) {
            
        
    }
        
    
    
    
 
    for (int i = 0; i < cardName.length; i++) {
        int k = i + (int) (Math.random() * (cardName.length-i));
        String temp = cardName[k];
        cardName[k] = cardName[i];
        cardName[i] = temp;
        
        
        System.out.println(cardName[i]);
      }


    }
    
    
   
   

    
 
      
  public static void main(String[] args) {
          shuffleCards();
          
          
         
     }
}

  



   


    