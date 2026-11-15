import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Car{
    private String modelNumber;
    private String carName;
    private LocalDate manufactureDate;

    private static final DateTimeFormatter FORMATTER = 
        DateTimeFormatter.ofPattern("dd/MM/yyyy"); 

    public Car(String modelNumber, String carName){
        setModelNumber(modelNumber);
        setCarName(carName);
    }
    public Car(String modelNumber, String carName, LocalDate manufactureDate){
        setModelNumber(modelNumber);
        setCarName(carName);
        setManufactureDetails(manufactureDate);
    }

    public void setModelNumber(String modelNumber){
        this.modelNumber = modelNumber;
    }
    public void setCarName(String carName){
        this.carName = carName;
    }
    public void setManufactureDetails(LocalDate manufactureDate){
        this.manufactureDate = manufactureDate;
    }
    
    public String getCarDetails(){
        return "Model Number :"+modelNumber
                +"\tCar Name : "+carName
                +"\tManufacturing Date : "+(manufactureDate != null ? manufactureDate.format(FORMATTER) : "N/A");
    }
}