package vesmirteleso;

public class Planeta extends Vesmirne_teleso {
    private double vaha;
    private double priemer;
    private String name;
    private double gravitacia;
    private boolean weightSet = false;

    public Planeta(double vaha, double priemer, String name) {
        this.setGravitacia(9.81);
        this.setVaha(vaha);
        this.setPriemer(priemer);
        this.setName(name);
    }

    public Planeta(double vaha, double priemer, String name, double gravitacia) {
        this.setGravitacia(gravitacia);
        this.setVaha(vaha);
        this.setPriemer(priemer);
        this.setName(name);
    }

    public Planeta() {
        this.setGravitacia(9.81);
        this.setVaha(4789300);
        this.setPriemer(32981);
        this.setName("NoNamePlanet");
    }

    private double getVaha() {
        return this.vaha;
    }

    private void setVaha(double vaha) {
        if(this.vaha > vaha) {
            if(this.vaha - vaha <= 1000) {
                System.out.println("Ja chudnem");
            } else {
                decreaseGravity(0.1);
                System.out.println("Ja chudnem veľmi");
            }
        } else if(this.vaha < vaha) {
            if(vaha - this.vaha <= 1000) {
                System.out.println("Dokelu, pribrala som");
            } else {
                increaseGravity(0.1);
                System.out.println("Sakra, moooc som pribrala");
            }
        }
        this.vaha = vaha;
    }

    private double getPriemer() {
        return this.priemer;
    }

    private void setPriemer(double priemer) {
        this.priemer = priemer;
    }

    private String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setGravitacia(double gravitacia) {
        this.gravitacia = gravitacia;
    }

    public double getGravitacia() {
        return this.gravitacia;
    }

    public void increaseGravity(double add) {
        this.gravitacia += add;
    }

    public void decreaseGravity(double dec) {
        this.gravitacia -= dec;
    }

    public void setPlanetaryWeight(double vaha) {
        if(!this.weightSet) {
            setVaha(vaha);
            this.weightSet = true;
        }
    }
}
