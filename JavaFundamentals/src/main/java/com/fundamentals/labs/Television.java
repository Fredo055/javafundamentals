package com.fundamentals.labs;

public class  Television  {

    private int screenSize;
    private double price;
    private int numPorts;
    private boolean isMountable;




    public Television(int screenSize, double price,
                      int numPorts, Boolean isMountable) {
        this.screenSize = screenSize;
        this.price = price;
        this.numPorts = numPorts;
        this.isMountable = isMountable;
    }

    public Television(int screenSize, double price) {
        this(screenSize, price,3,false);
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice() {
        setPrice(0.0);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumPorts() {
        return numPorts;
    }

    public void setNumPorts(int numPorts) {
        this.numPorts = numPorts;
    }

    public boolean isMountable() {
        return isMountable;
    }

    public void setMountable(boolean  mountable) {
         isMountable = mountable;
     }

    public void turnOn() {
        System.out.println("The" +  "screenSize"  + "TV is on.");
    }

    public class SmartTelevison extends Television {
        private String operatingSystem;


        public SmartTelevison(int screenSize, double price, int numPorts, Boolean isMountable) {
            super(screenSize, price, numPorts, isMountable);

        }


        public String getOperatingSystem() {
            return operatingSystem;
        }

        public void setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
        }


        public void browseInternet() {
            System.out.println("Browsing the internet on the Smart TV.");
        }


        @Override
        public void turnOn() {
            System.out.println("The " + getScreenSize() + " Smart TV with " + operatingSystem + " is on.");
        }
    }
    public class ThreeDTelevision extends Television {
        private boolean has3D;


        public ThreeDTelevision(int screenSize, double price, int numPorts, boolean isMountable, boolean has3D) {
            super(screenSize, price, numPorts, isMountable);
            this.has3D = has3D;
        }


        public boolean has3D() {
            return has3D;
        }

        public void setHas3D(boolean has3D) {
            this.has3D = has3D;
        }


        public void play3DMovie() {
            System.out.println("Playing a 3D movie on the TV.");
        }


        @Override
        public void turnOn() {
            System.out.println("The " + getScreenSize() + " 3D TV is on.");
        }
    }


    public void turnOn(boolean withSound) {
        System.out.println("The TV is on with sound:");


    }

}
