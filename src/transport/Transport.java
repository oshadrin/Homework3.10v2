package transport;

public abstract class Transport implements Abusers {
    private String brand;
    private String model;

    private int engineCapasity;

    private Integer productionYear;
    private String productionCountry;
    private String color;
    private int maxSpeed;
    private String typeOfFuel;

    public abstract void refill();

    public Transport(
            String brand,
            String model,
            Integer productionYear,
            String productionCountry,
            String color,
            String typeOfFuel
    ) {
                if (brand.isBlank()) {
                    System.out.println("поле не должно быть пустым");
        } else {
                    this.brand = brand;
                }
        if (model.isBlank()) {
            System.out.println("поле не должно быть пустым");
        } else {
            this.model = model;
        }

        this.engineCapasity = engineCapasity;

        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
        this.typeOfFuel = typeOfFuel;
    }

    public abstract void startMovement();

    public abstract void stopMovement();

    public abstract void printType();



    public void setBrand(String brand) {
        if(this.brand == null || this.brand.isEmpty()){
            this.brand = "Должно быть заполнено";
        } else {
            this.brand = brand;
        }
    }

    public void setModel(String model) {
        if(this.model == null || this.model.isEmpty()){
            this.model = "Должно быть заполнено";
        } else {
            this.model = model;
        }
    }
    public void setEngineCapasity(int engineCapasity) {
            this.engineCapasity = engineCapasity;
        }

        public void setColor(String color) {
        if(this.color == null || this.color.isEmpty()){
            this.color = "Должно быть заполнено";
        } else {
            this.color = color;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getEngineCapasity() {
        return engineCapasity;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
