package TugasPraktikum2;
public class no2 {
    public static void main(String[] args) {
         double [] data =  { 91.35, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6,7.11, 27,9.53,549,2.23,17.31,4.25,2.13,83,7,102.4, 53.21,3.42,0.21,70.02,819.4,6173,4.25,19.8,17.32,5.768} ;     
        double max = 0; 
        double min = 99999;
        double sum = 0;
        int leng = 0;
        for (int i = 0; i < data.length; i++) {
             if (data[i] > max) {
                 max = data[i] ;}
             
             if(data[i] < min){
                 min = data[i];  }
            leng++;
            sum = sum + data[i];
            
        }
        double avg = sum/leng;
    
        
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
        System.out.println(avg);
        
        
    }
    
}
