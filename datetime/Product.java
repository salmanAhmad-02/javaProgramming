import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Product {
    private String productID;
    private String productName;
    private String category;
    private  String brandName;
    private BigDecimal mrp;
    private LocalDate mfgDate;
    private Period shelfLifePeriod;
    private  LocalDate expDate;

    // Not allowing not information product 
    // public Product(){}
    
    public Product(String productID, String productName){
        this.productID = productID;
        setProductName(productName);
    }

    public Product(String productName, LocalDate mfgDate, Period shelfLifePeriod){
        setProductName(productName);
        setManufacturedDate(mfgDate);
        setShelfLifePriod(shelfLifePeriod);
    }

    public Product(String productName, LocalDate mfgDate, Period shelfLifePeriod,BigDecimal mrp){
        setProductName(productName);
        setManufacturedDate(mfgDate);
        setShelfLifePriod(shelfLifePeriod);
        setMrp(mrp);
    } 

    public Product( String productID,String productName, String category,String brandName,BigDecimal mrp,LocalDate mfgDate, Period shelfLifePeriod){
        this.productID = productID;
        setProductName(productName);
        setProductCategory(category);
        setBrandName(brandName);
        setMrp(mrp);
        setManufacturedDate(mfgDate);
        setShelfLifePriod(shelfLifePeriod);
    }

    public void setProductName(String productName){
        this.productName = productName;
    }
    public void setProductCategory(String category){
        this.category = category;
    }
    public void setBrandName(String brandName){
        this.brandName = brandName;
    }
    public void setMrp(BigDecimal mrp){
        this.mrp = mrp;
    }
    public void setManufacturedDate(LocalDate mfgDate){
        this.mfgDate = mfgDate;
    }
    public void setShelfLifePriod(Period shelfLifePeriod){
        this.shelfLifePeriod=shelfLifePeriod;
        calculateExpiryDate();
    }
    private void calculateExpiryDate(){
        if(this.mfgDate != null && this.shelfLifePeriod != null){
            this.expDate = this.mfgDate.plus(shelfLifePeriod);
        }
    }
    public String getProductDetails(){
        return "ID :" + productID
            + "\tName : " + productName
            + "\tCategory : " + category
            + "\tBrand : " + brandName
            + "\tMRP : " + mrp
            + "\tMFG : " + mfgDate
            + "\tEXP : " + expDate;
    }
}
