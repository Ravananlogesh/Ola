class xuv extends Ola {
    String cooler;
    xuv(String name,String cartype,int amount,String cooler){
        super(name, cartype, amount);
        this.cooler=cooler;
       
    }
    void xuvprice()
     {
       System.out.println("The Distance Price in  1Km : "+super.amount+" Rs");
	   System.out.println("Driver Arriving to Your Location");
       
     }
    void Details(){
        System.out.println("The Car Type is :"+super.name);
        System.out.println("The Car Seat Size :"+super.cartype);
        System.out.println("The Car with :"+cooler);
        System.out.println("The car Price Per Km :"+super.amount);
       }
}
