import java.util.*;

public class database {
    private ArrayList<plane> fleet;
    private ArrayList<ticket> allTickets;

    public database() {
        fleet = new ArrayList<plane>();
        allTickets = new ArrayList<ticket>();
        loadInitialData();
    }

    private void loadInitialData() {
        // Adding all planes and tickets from the CSV
        addPlaneAndTicket("N101ER", "Cessna 172 Skyhawk", 745, 1, "Engine", true, "Engine blew up from a fuel leak", false);
        addPlaneAndTicket("N102ER", "Cessna 172 Skyhawk", 683, 3, "Propeller", true, "Cracked on all sides", false);
        addPlaneAndTicket("N103ER", "Cessna 172 Skyhawk", 762, 4, "Wings", true, "Large crack at the base from being struck by lightning", false);
        addPlaneAndTicket("N104ER", "Cessna 172 Skyhawk", 710, 5, "Landing Gear", false, "Shock absorbers were worn out and caused rough landings", false);
        addPlaneAndTicket("N105ER", "Cessna 172 Skyhawk", 628, 8, "Brakes", false, "Pads were worn down", false);
        addPlaneAndTicket("N106ER", "Cessna 172 Skyhawk", 756, 11, "Rudder", false, "Small crack off the back from a hail storm; temporarily patched up with duct tape; officially replaced and fixed", false);
        addPlaneAndTicket("N107ER", "Cessna 172 Skyhawk", 715, 12, "Control Cables", false, "Needed lubricated", false);
        addPlaneAndTicket("N108ER", "Cessna 172 Skyhawk", 781, 16, "Fuel Pump", true, "Pump/tube was stuck/clogged", false);
        addPlaneAndTicket("N109ER", "Cessna 172 Skyhawk", 697, 18, "Pitot Tube", false, "Required cleaning; dusty inside", false);
        addPlaneAndTicket("N110ER", "Cessna 172 Skyhawk", 633, 19, "Static Port", false, "Clogged up from dust/dirt and altitude/speed readings were inaccurate", false);
        addPlaneAndTicket("N111ER", "Cessna 172 Skyhawk", 688, 20, "Avionics", false, "Software needed the new update", false);
        addPlaneAndTicket("N112ER", "Cessna 172 Skyhawk", 722, 21, "Altimeter", false, "Needed recalibration; readings didn't change", false);
        addPlaneAndTicket("N113ER", "Cessna 172 Skyhawk", 617, 24, "Gyroscopic Instruments", false, "Recalibrated the artificial horizon instrument; the horizon was vertical", false);
        addPlaneAndTicket("N114ER", "Cessna 172 Skyhawk", 776, 26, "Flaps", true, "Flaps didn't move and needed lubrication immediately", false);
        addPlaneAndTicket("N115ER", "Cessna 172 Skyhawk", 646, 27, "Vacuum System", false, "Replaced pumps because the attitude indication was malfunctioning after someone spilling mustard over the console", false);
        addPlaneAndTicket("N116ER", "Cessna 172 Skyhawk", 670, 29, "Elevators", true, "Large dent in elevator preventing movement due to backing up into a hanger door", false);
        addPlaneAndTicket("N117ER", "Cessna 172 Skyhawk", 775, 32, "Tail", true, "Vertical stabilizer was split in half after a large bird hit it", false);
        addPlaneAndTicket("N118ER", "Cessna 172 Skyhawk", 609, 33, "Fuselage", false, "A bit of corrosion", true);
        addPlaneAndTicket("N119ER", "Cessna 172 Skyhawk", 699, 34, "Landing Lights", false, "Left landing light burnt out and needed the bulb replaced", false);
        addPlaneAndTicket("N120ER", "Cessna 172 Skyhawk", 753, 36, "Anti-ice System", true, "Complete fail; full system needed replaced/re-done after the aircraft froze over on most recent flight", false);
        addPlaneAndTicket("N121ER", "Cessna 172 Skyhawk", 621, 39, "Oil System", false, "Oil needed changed", false);
        addPlaneAndTicket("N122ER", "Cessna 172 Skyhawk", 780, 42, "Seatbelt", true, "Seatbelt was chewed up by a racoon and needed replaced", false);
        addPlaneAndTicket("N123ER", "Cessna 172 Skyhawk", 652, 44, "Tires", true, "All tires were flat from aquiring holes from legos that were left on the runway", false);
        addPlaneAndTicket("N124ER", "Cessna 172 Skyhawk", 742, 45, "Windshield", true, "Large crack in the middle from hitting a tree branch", false);
        addPlaneAndTicket("N125ER", "Cessna 172 Skyhawk", 765, 49, "Ailerons", true, "Right aileron was completely missing after a bear came up to the hanger and ripped it off", false);
        addPlaneAndTicket("N201ER", "Diamond DA42-VI", 489, 2, "Cowling", false, "Cracked and reducing engine cooling", false);
        addPlaneAndTicket("N202ER", "Diamond DA42-VI", 665, 6, "Heating and Ventilation", false, "Ventilation systems had a dead animal smell circulating through them and needed replaced", false);
        addPlaneAndTicket("N203ER", "Diamond DA42-VI", 556, 7, "Windows", true, "Many small cracks and chips from pebbles after emergency landing in a corn field", false);
        addPlaneAndTicket("N204ER", "Diamond DA42-VI", 639, 9, "Landing Gear Struts", true, "Damaged after a kid put Toy Story Woody action figure on it; closed it into the wheel well and damaged the struts", false);
        addPlaneAndTicket("N205ER", "Diamond DA42-VI", 516, 10, "Vacuum System", true, "Serviced as gyroscopic tools malfunctioned", false);
        addPlaneAndTicket("N206ER", "Diamond DA42-VI", 460, 13, "Battery", true, "Died and needed replaced", false);
        addPlaneAndTicket("N207ER", "Diamond DA42-VI", 642, 14, "Fuel Injectors", true, "Needed cleaned and recalibrated", false);
        addPlaneAndTicket("N208ER", "Diamond DA42-VI", 502, 15, "Cooling System", true, "Hole in one of the hoses; coolant wasn't making it all to the engine", false);
        addPlaneAndTicket("N209ER", "Diamond DA42-VI", 563, 17, "Oil System", false, "Oil filter needed replaced", false);
        addPlaneAndTicket("N210ER", "Diamond DA42-VI", 688, 22, "Autopilot System", false, "Not turning on, needed troubleshooted and rewired", false);
        addPlaneAndTicket("N211ER", "Diamond DA42-VI", 478, 23, "Flap System", true, "Motor on flap was not connected nor responding and needed rewired and replaced", false);
        addPlaneAndTicket("N212ER", "Diamond DA42-VI", 512, 25, "Altimeter", false, "Needed recalibrated", false);
        addPlaneAndTicket("N213ER", "Diamond DA42-VI", 574, 28, "Static Ports", false, "Clogged from pieces of bread being stuffed inside", false);
        addPlaneAndTicket("N214ER", "Diamond DA42-VI", 634, 31, "GPS", true, "Malfunctioning and needed an update", true);
        addPlaneAndTicket("N215ER", "Diamond DA42-VI", 459, 35, "Pitot Tube", false, "Needed cleaned because airspeed readings were inaccurate", false);
        addPlaneAndTicket("N216ER", "Diamond DA42-VI", 620, 37, "Radios", true, "Needed replaced after an instructor spilled their coffee onto it", false);
        addPlaneAndTicket("N217ER", "Diamond DA42-VI", 453, 38, "Circuit Breakers and wiring", true, "Breakers shorted and needed replaced", false);
        addPlaneAndTicket("N218ER", "Diamond DA42-VI", 669, 40, "Control Cables and Linkages", true, "Fraying; needed replaced", false);
        addPlaneAndTicket("N219ER", "Diamond DA42-VI", 674, 41, "Rudder", true, "Half of rudder attached to the vertical stabilizer and the other half was dangling off from high winds during a local tornado", false);
        addPlaneAndTicket("N220ER", "Diamond DA42-VI", 543, 43, "Wings", true, "Half of left wing is missing from colliding with the airport fence", false);
        addPlaneAndTicket("N221ER", "Diamond DA42-VI", 505, 46, "Landing Gear", false, "Tires look worn and tread is low; needed replaced", false);
        addPlaneAndTicket("N222ER", "Diamond DA42-VI", 688, 47, "Propeller", false, "Blades were chipped and needed replaced", false);
        addPlaneAndTicket("N223ER", "Diamond DA42-VI", 499, 48, "Engine (AE300)", true, "Mechanical issue", false);
        addPlaneAndTicket("N224ER", "Diamond DA42-VI", 630, 50, "Airspeed indicator", false, "Needed recalibrated", false);
        addPlaneAndTicket("N225ER", "Diamond DA42-VI", 590, 51, "Autopilot", false, "Had a mind of its own, didn't stay on the direct inputted course; required rewiring and inspected", false);
    }

    private void addPlaneAndTicket(String tailNumber, String model, double hours, 
                                 double ticketNum, String part, boolean isCritical, 
                                 String description, boolean isOpen) {
        // Create or find plane
        plane currentPlane = searchByTail(tailNumber);
        if (currentPlane == null) {
            currentPlane = new plane();
            currentPlane.editTailNumber(tailNumber);
            currentPlane.editModel(model);
            currentPlane.addFlightHours(hours);
            fleet.add(currentPlane);
        }

        // Create ticket
        ticket newTicket = new ticket();
        newTicket.setTicketNumber(ticketNum);
        newTicket.setTailNumber(tailNumber);
        newTicket.addProblem(part);
        newTicket.criticalStatus(isCritical);
        newTicket.addDescription(description);
        newTicket.updateStatus(isOpen);

        currentPlane.addTicket(newTicket);
        allTickets.add(newTicket);
    }

    public ArrayList<plane> returnFleet() {
        return fleet;
    }

    public ArrayList<ticket> getAllTickets() {
        return allTickets;
    }

    public ArrayList<ticket> openTickets() {
        ArrayList<ticket> openTk = new ArrayList<ticket>();
        for (ticket t : allTickets) {
            if (t.getStatus()) {
                openTk.add(t);
            }
        }
        return openTk;
    }

    public plane searchByTail(String tailNum) {
        for (plane p : fleet) {
            if (p.getTailNumber().equalsIgnoreCase(tailNum)) {
                return p;
            }
        }
        return null;
    }

    public void addNewTicket(ticket tk) {
        allTickets.add(tk);
        plane aircraft = searchByTail(tk.getTailNumber());
        if (aircraft != null) {
            aircraft.addTicket(tk);
        }
    }

    public double getNextTicketNumber() {
        double maxTicket = 0;
        for (ticket t : allTickets) {
            if (t.getTicketNumber() > maxTicket) {
                maxTicket = t.getTicketNumber();
            }
        }
        return maxTicket + 1;
    }
}