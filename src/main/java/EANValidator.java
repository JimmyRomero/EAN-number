/**
 * Created by JimmyRomero on 8/26/2016.
 */
public class EANValidator {

    String numberEAN;

    int arrayOddPosition[];

    int arrayEvenPosition[];

    int result[];

    public EANValidator(String numberEAN){
        this.numberEAN = numberEAN;
    }


    public boolean validate(String numberEAN) {
        boolean flag = true;

        int number;

        number = Integer.parseInt(numberEAN);


        for(int i = 0; i< numberEAN.length(); i++ ){

            if(i % 2 ==0){
                arrayEvenPosition[i] = (number%10)*1;
            }
            else{
                arrayOddPosition[i] = (number%10)*3;
            }
        }

        for(int i=0; i < arrayOddPosition.length; i++){
            result[0] = arrayEvenPosition[i]+arrayOddPosition[i];
        }

        if (result[0] == arrayOddPosition.length-1) {
                flag = true;
        }
        else {
            flag = false;
        }


        return flag;
    }


}
