package com.company.space;

public class Vesmir {
    private boolean state;
    private long size;
    private String creatorName;

    public Vesmir() {
        this.state = false;
        this.size = 0;
    }

    public void startVesmir() { // старт вселенной
        this.state = true;
        increaseSize();
        System.out.println("Vesmir nastartovany.");
    }

    public void stopVesmir() { // стоп вселенной
        this.state = false;
        System.out.println("Vesmir stopped");
    }

    private void increaseSize() { // увеличение размера
        while(this.size <= 999) {
            this.size++;
        }
    }

    private void decreaseSize(long desiredSize) { // уменьшение размера
        while(this.size != desiredSize) {
            this.size--;
        }
    }

}
