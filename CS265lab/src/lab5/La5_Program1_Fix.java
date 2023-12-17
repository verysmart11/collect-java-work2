package lab5;

public class La5_Program1_Fix {
    public int taxRelief(int age, boolean single) {
        int taxRelief;
        if (age < 18)
            taxRelief = 0;
        else if (single) {
            if (age <= 55)
                taxRelief = 800;
            else
                taxRelief = 1600;
        } else {
            if (age > 55)
                taxRelief = 3200;    //wrong value ,change 1600 to 3200
            else
                taxRelief = 1600;   //wrong value ,change 3200 to 1600
        }
        return taxRelief;
    }
}
