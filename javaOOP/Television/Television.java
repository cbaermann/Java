public class Television {
    public static final int MAX_VOLUME = 100;
    public static final int MIN_VOLUME = 0;
    private static int defaultVolume = 50;
    private static String defaultBrand = "LG";
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};

    public Boolean isMuted = false;
    private String brand = "";
    private Integer volume;
    private Integer storedVolume;
    private DisplayType display = DisplayType.LED;


    public Television(){
        setVolume(defaultVolume);
        setBrand(defaultBrand);
    }

    public Television(String brand){
        setVolume(defaultVolume);
        setBrand(brand);
    }

    public Television(int volume){
        setVolume(volume);
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display){
        this(brand, volume);
        setDisplay(display);
    }


    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public static String getDefaultBrand(){
        return Television.defaultBrand;
    }

    public static void setDefaultBrand(String defaultBrand){
        if(isValidBrand(defaultBrand)){
            Television.defaultBrand = defaultBrand;
        }
        else{
            System.out.println("Invalid brand");
        }

    }

    public static Integer getDefaultVolume(){
        return Television.defaultVolume;
    }

    public static void setDefaultVolume(int defaultVolume){
        if(defaultVolume >= MIN_VOLUME && defaultVolume < MAX_VOLUME){
            Television.defaultVolume = defaultVolume;
        } else {
            System.out.println("Default volume out of range");
        }
    }
    public Integer getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        if(volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
        } else{
            System.out.println("Invalid volume: " + volume + ". Range is between [" + MIN_VOLUME + "," + MAX_VOLUME + "]");
        }
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        if(isValidBrand(brand)){
            this.brand = brand;
        }
        else{
            System.out.println("Invalid brand: must be a Tohiba, Samsung, LG  or Sony");
        }
    }

    private static boolean isValidBrand(String brand) {
        for (String b : VALID_BRANDS) {
            if (brand.equals("Sony") || brand.equals("Toshiba") || brand.equals("Samsung") || brand.equals("LG")) {
                return true;
            }
        }
        return false;
    }


    public void turnOn() {
        System.out.println("Turning on your " + brand + " television to volume " + volume);
    }


    public void turnOff(){
        System.out.println("Turning off your " + brand + " TV.");
    }

    public String toString(){
        if(!this.isMuted) {
            return "Television: Brand = " + getBrand() + ", Volume = " + getVolume() + ", Display Type: " +  getDisplay();
        }
        else {
            return "Television: Brand = " + getBrand() + ", Volume = <muted>";
        }
    }

    public void mute(){
        if(!this.isMuted){
            storedVolume = getVolume();
            setVolume(MIN_VOLUME);
            System.out.println("Your TV is muted and set to volume " + this.volume);
        }
        else  {
            setVolume(storedVolume);
            System.out.println("Your TV is unmuted and set to " + this.volume);
        }
        isMuted = !isMuted;
    }

}
