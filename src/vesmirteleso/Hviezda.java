package vesmirteleso;

public class Hviezda extends Vesmirne_teleso {
    private double luminosity; // светимость
    private double age; // возраст звезды
    private double surfaceTemperature; // температура на поверхности
    private String name; // название звезды

    private boolean svietim = false;

    public Hviezda(String name) {
        this.setLuminosity(3 * Math.pow(10, 27));
        this.setAge(5 * Math.pow(10, 9));
        this.setSurfaceTemperature(6 * Math.pow(10, 3));
        this.setName(name); // this.name = name
        this.starBirth();
    }

    public Hviezda(double luminosity, double age, double surfaceTemperature, String name) {
        this.setLuminosity(luminosity);
        this.setAge(age);
        this.setSurfaceTemperature(surfaceTemperature);
        this.setName(name);
        this.starBirth();
    }

    public double getLuminosity() {
        return luminosity;
    }

    private void setLuminosity(double luminosity) {
        this.luminosity = luminosity;
    }

    public double getAge() {
        return age;
    }

    private void setAge(double age) {
        this.age = age;
    }

    public double getSurfaceTemperature() {
        return surfaceTemperature;
    }

    private void setSurfaceTemperature(double surfaceTemperature) {
        this.surfaceTemperature = surfaceTemperature;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void starBirth() {
        System.out.println("Star is born");
    }

    public void starExplosion() {
        System.out.println("Star is dead");
    }

    public void light() {
        if(!this.svietim) {
            this.svietim = true;
            setSurfaceTemperature(this.surfaceTemperature + 100);
        }

    }

    public void extinguish() {
        if(this.svietim) {
            this.svietim = false;
            setSurfaceTemperature(this.surfaceTemperature - 100);
        }
    }


}
