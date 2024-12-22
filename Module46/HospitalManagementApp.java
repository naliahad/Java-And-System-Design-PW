package Module46;
import java.util.*;
class Patient 
{
	private int id;
	private String name;
	private int age;
	private String gender;
	private String contactNumber;
    
	public Patient(int id, String name, int age, String gender, String contactNumber) 
    {
    	this.id = id;
    	this.name = name;
    	this.age = age;
    	this.gender = gender;
    	this.contactNumber = contactNumber;
	}
    
	public int getId() 
    {
    	return id;
	}
    
	public String getName() 
    {
    	return name;
	}
    
	public int getAge() 
    {
    	return age;
	}
    
	public String getGender() 
    {
    	return gender;
	}
    
	public String getContactNumber() 
    {
    	return contactNumber;
	}
    
	@Override
	public String toString() 
    {
    	return "Patient ID: " + id + ", Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Contact: " + contactNumber;
	}
}

// Class to represent a Doctor
class Doctor 
{
	private int id;
	private String name;
	private String specialization;
    
	public Doctor(int id, String name, String specialization) 
    {
    	this.id = id;
    	this.name = name;
    	this.specialization = specialization;
	}
    
	public int getId() 
    {
    	return id;
	}
    
	public String getName() 
    {
    	return name;
	}
    
	public String getSpecialization() 
    {
    	return specialization;
	}
    
	@Override
	public String toString() 
    {
    	return "Doctor ID: " + id + ", Name: " + name + ", Specialization: " + specialization;
	}
}

// Class to represent a Hospital
class Hospital 
{
	private String name;
	private Map<Integer, Doctor> doctors;
	private List<Patient> patients;
    
	public Hospital(String name) 
    {
    	this.name = name;
    	this.doctors = new HashMap<>();
    	this.patients = new ArrayList<>();
	}
    
	public void addDoctor(Doctor doctor) 
    {
    	doctors.put(doctor.getId(), doctor);
	}
    
	public void addPatient(Patient patient) 
    {
    	patients.add(patient);
	}
    
	public Doctor getDoctor(int id) 
    {
    	return doctors.get(id);
	}
    
	public List<Doctor> getAllDoctors() 
    {
    	return new ArrayList<>(doctors.values());
	}
    
	public List<Patient> getAllPatients() 
    {
    	return patients;
	}
    
	@Override
	public String toString() 
    {
    	return "Hospital: " + name;
	}
}

// Main class to run the application
public class HospitalManagementApp 
{
	public static void main(String[] args) 
    {
    	Hospital hospital = new Hospital("XYZ Hospital");
   	 
    	// Adding doctors
    	Doctor doctor1 = new Doctor(101, "Dr. John Doe", "Cardiologist");
    	Doctor doctor2 = new Doctor(102, "Dr. Jane Smith", "Pediatrician");
   	 
    	hospital.addDoctor(doctor1);
    	hospital.addDoctor(doctor2);
   	 
    	// Adding patients
    	Patient patient1 = new Patient(201, "Alice", 30, "Female", "1234567890");
    	Patient patient2 = new Patient(202, "Bob", 40, "Male", "9876543210");
   	 
    	hospital.addPatient(patient1);
    	hospital.addPatient(patient2);
   	 
    	// Displaying hospital details
    	System.out.println(hospital);
    	System.out.println("Doctors:");
    	for (Doctor doctor : hospital.getAllDoctors()) 
        {
        	System.out.println(doctor);
    	}
   	 
    	System.out.println("\nPatients:");
    	for (Patient patient : hospital.getAllPatients()) 
        {
        	System.out.println(patient);
    	}
	}
}

