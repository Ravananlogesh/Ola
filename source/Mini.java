package source;

class Mini extends Ola{
    
     Mini(String name,String cartype,int amount) 
     {
        super(name,cartype,amount);
      
     }   
     void Miniprice()
     {
        
		
       System.out.println("The Distance Price in  1Km : "+super.amount+" Rs");
	   
	   System.out.println("Driver Arriving to Your Location");
     }
     void Details(){
      System.out.println("The Car Type is :"+super.name);
      System.out.println("The Car Seat Size :"+super.cartype);
      System.out.println("The car Price Per Km :"+super.amount);
     }
}
