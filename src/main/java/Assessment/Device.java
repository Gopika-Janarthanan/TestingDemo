package Assessment;

public class Device {
    private String brandname;

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }
    public void switchOn(){
        System.out.println("Device on");
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setBrandname("HP");
        laptop.switchOn();
        System.out.println("Laptop name : "+laptop.getBrandname());
        Mobile mobile= new Mobile();
        mobile.setBrandname("Samsung");
        mobile.switchOn();
        System.out.println("Mobile name : " + mobile.getBrandname());
    }}

    class Laptop extends Device{
        @Override
        public void switchOn() {
            System.out.println("Laptop on");
        }
    }
 class Mobile extends Device{
        @Override
        public void switchOn() {
            System.out.println("Mobile on");
        }
    }


