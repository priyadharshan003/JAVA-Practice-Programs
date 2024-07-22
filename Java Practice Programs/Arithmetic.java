public class Arithmetic{
   /* int num1 = 5;
    int num2 = 10;*/

    void addition(int num1,int num2,String add){
        System.out.println("result: "+add+num1+num2);
    }
    public static void main(String[] args){
        Arithmetic obje = new Arithmetic();
        for(int i =0;i<4;i++)
        {
            obje.addition(2,3,"addition : ");
        }


    }
}