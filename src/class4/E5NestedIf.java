package class4;

public class E5NestedIf {
    public static void main(String[] args) {
        double mortgageRate=4.6;
        double mortgagePrice=40000;
        if(mortgageRate>4.5){

            System.out.println("User will not buy a house");

        }else{
            System.out.println("User will consider buying");
            if(mortgagePrice>50000){
                System.out.println("user will take a loan");
            }else{
                System.out.println("user will pay cash");
            }
        }
    }
}
