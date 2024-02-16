public class Patient{
    public int IDnumber;
    public double CaffeineLevel;

    public Patient(int IDnumber, double CaffeineLevel){
        this.IDnumber = IDnumber;
        this.CaffeineLevel = CaffeineLevel;
    }
    public int getIDnumber(){
        return IDnumber;
    }
    public double getCaffeineLevel(){
        return CaffeineLevel;
    }
    public void setCaffeineLevel(double CaffeineLevel){
        this.CaffeineLevel = CaffeineLevel;
    }
}