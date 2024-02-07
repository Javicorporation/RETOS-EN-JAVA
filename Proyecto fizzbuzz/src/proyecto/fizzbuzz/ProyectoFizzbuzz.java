package proyecto.fizzbuzz;


public class ProyectoFizzbuzz {
    
    public static void main(String[] args) {
        
        int longi = 101;
        
        for(int i =1; i<longi ;i++){
            if(i%3 == 0 && i%5 ==0){
                System.out.println("fizz booz");
            }else if(i%3 == 0){
              System.out.println("fizz");  
            }else if(i%5 ==0){
                System.out.println("booz");
            }else{
                System.out.println(i);
            
            }
            
            
        }
        
        
    }
    
}
