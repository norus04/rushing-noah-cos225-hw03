// Looked up how to do toString()

public class PatientManager{
    public Patient[] Patients = new Patient[10];

    public int addPatient(Patient PatientIndex){
        for (int i=0; i<Patients.length; i++){
            if (Patients[i] == null){
                Patients[i] = PatientIndex;
                return i;
            }
        }
        return -1;
    }
    public Patient removePatient(int Index){
        Patient Removed = Patients[Index];
        Patients[Index] = null;
        return Removed;
    }
    public void CaffeineAbsorption(){
        for (int i = 0; i < Patients.length; i++){
            Patients[i].setCaffeineLevel(Patients[i].getCaffeineLevel() - 130);
                if (Patients[i].getCaffeineLevel() <= 0){
                    Patients[i] = null;
            }
        }
    }
    public String toString(){
        StringBuilder S = new StringBuilder();
        boolean isEmpty = true;
        for (Patient Patient : Patients){
            if (Patient != null){
                S.append(Patient.toString()).append("\n");
                isEmpty = false;
            }
        }
        if (isEmpty){
            return "Empty";
        }
        return S.toString();
    }
}