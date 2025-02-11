package academy.javapro;

public class Tesla extends Vehicle implements Electric, Autonomous {
    private boolean autopilotEnabled;
    private boolean charging;

    // Constructor that takes model and year, sets make to tesla, and initializes autopilotEnabled and charging to false
    public Tesla(String model, int year) {
        super("Tesla", model, year);
        this.autopilotEnabled = false;
        this.charging = false;
    }

    // Vehicle abstract implementation
   
    public void startEngine() {
        if (!isRunning) {
            isRunning = true;
            System.out.println(make + " " + model + " started");
        }
    }

   
    public void stopEngine() {
        if (isRunning) {
            isRunning = false;
            System.out.println(make + " " + model + " stopped");
        }
    }

 
    public void accelerate() {
        if (isRunning) {
            System.out.println(make + " " + model + " is accelerating...");
        } else {
            System.out.println("Cannot accelerate; the engine is off.");
        }
    }


    public void brake() {
        if (isRunning) {
            System.out.println(make + " " + model + " is braking...");
        } else {
            System.out.println("Car is already stationary.");
        }
    }

    // Electric interface implementation
   
    public void charge() {
        if (!charging) {
            charging = true;
            System.out.println(make + " " + model + " is now charging");
        }
    }

  
    public boolean isCharging() {
        return charging;
    }

    // Autonomous interface implementation
   
    public void enableAutopilot() {
        if (isRunning && !autopilotEnabled) {
            autopilotEnabled = true;
            System.out.println("Autopilot enabled");
        } else if (!isRunning) {
            System.out.println("Cannot enable autopilot when the engine is off.");
        }
    }

    
    public void disableAutopilot() {
        if (autopilotEnabled) {
            autopilotEnabled = false;
            System.out.println("Autopilot disabled");
        }
    }


    public boolean isAutopilotEnabled() {
        return autopilotEnabled;
    }

   
    public String toString() {
        return make + " " + model + " " + year + "\n" +
               "Running: " + isRunning + "\n" +
               "Autopilot: " + autopilotEnabled + "\n" +
               "Charging: " + charging;
    }
}
