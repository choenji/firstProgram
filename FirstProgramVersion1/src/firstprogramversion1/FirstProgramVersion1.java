/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprogramversion1;

/**
 *
 * @author Choenji
 */
public class FirstProgramVersion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
         readname("get Header.b CRLF");
    }
    
      private static String readname(String filename){
            String fileNm = "";
            for (int i = 0; i < filename.length(); i++) {
                if (filename.charAt(i) == ' ') {
                    for(int j =i; j<filename.length(); j++){
                      if (filename.charAt(j) != ' ') {  
                        fileNm = fileNm + filename.charAt(i);
                      }else{
                          System.out.println(fileNm);
                          System.out.println("Hello that is me!!");
                          break;
                          
                          
                      }
                    }
                }
            }
            return fileNm;
    }
    
}
