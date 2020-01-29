public class Prog7{


    public static void main(String args[]){

        int[] numbers={3,5,7,6,3,2,9};
        int sum=0;

        for(int i: numbers)
            sum += i;
            System.out.println(sum);

        for(int position=0;position<numbers.length;position++){
            if(position==2){
                System.out.println("Hi everyone");
                }
            else{
                System.out.print("number: " + numbers[position]);
                System.out.println();
            }    
                
        }
        

    }

}

