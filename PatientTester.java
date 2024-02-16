public class PatientTester{
    public static void main(String[] args){
        PatientManager PM = new PatientManager();
        System.out.println(PM);

        PM.addPatient(new Patient(1, 200));
        PM.addPatient(new Patient(2, 400));
        PM.addPatient(new Patient(3, 600));
        PM.addPatient(new Patient(4, 800));
        System.out.println(PM);

        PM.CaffeineAbsorption();
        PM.CaffeineAbsorption();
        System.out.println(PM);
        
        Patient Removed = PM.removePatient(3);
        System.out.println("Patient removed: " + Removed);
        System.out.println(PM);
    }
}