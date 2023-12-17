package lab3;

public class Lab3_Program1_Fix {
    public int calcInsurance(boolean sportsEquipment, boolean musicEquipment) {
        //int fee = 25;
        int fee=5;             //wrong initialization

        if (sportsEquipment && musicEquipment)
            fee = 20;
        else if (sportsEquipment || musicEquipment)
            fee = 10;

        return fee;
    }
}
