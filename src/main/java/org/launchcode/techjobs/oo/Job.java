package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

        public Job(){
            id = nextId;
            nextId++;
        }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.


    public String toString() {
//        String totalString= "";
        if(this.getName().equals("") && this.getEmployer().toString().equals("") && this.getLocation().toString().equals("") && this.getPositionType().toString().equals("") && this.getCoreCompetency().toString().equals("")){
                return "OOPS! This job does not seem to exist.";
            }
        if(this.getName().equals("")){
                this.setName("Data not available");
//                return('\n' + "ID: " + this.getId() + "\nName: " + this.getName()  + "\nEmployer: " + this.getEmployer() + "\nLocation: " + this.getLocation() + "\nPosition Type: " + this.getPositionType() + "\nCore Competency: " + this.getCoreCompetency() + '\n');
            }
        if(this.getEmployer().toString().equals("")){
                this.setEmployer(new Employer("Data not available"));
//                return('\n' + "ID: " + this.getId() + "\nName: " + this.getName() + "\nEmployer: " + this.getEmployer() + "\nLocation: " + this.getLocation() + "\nPosition Type: " + this.getPositionType() + "\nCore Competency: " + this.getCoreCompetency() + '\n');
            }
        if(this.getLocation().toString().equals("")){
                this.setLocation(new Location("Data not available"));
//                return('\n' + "ID: " + this.getId() + "\nName: " + this.getName() + "\nEmployer: " + this.getEmployer() + "\nLocation: " + this.getLocation() + "\nPosition Type: " + this.getPositionType() + "\nCore Competency: " + this.getCoreCompetency() + '\n');
            }
        if(this.getPositionType().toString().equals("")){
                this.setPositionType(new PositionType("Data not available"));
//                return('\n' + "ID: " + this.getId() + "\nName: " + this.getName() + "\nEmployer: " + this.getEmployer() + "\nLocation: " + this.getLocation() + "\nPosition Type: " + this.getPositionType() + "\nCore Competency: " + this.getCoreCompetency() + '\n');
            }
        if(this.getCoreCompetency().toString().equals("")){
                this.setCoreCompetency(new CoreCompetency("Data not available"));
                return('\n' + "ID: " + this.getId() + "\nName: " + this.getName() + "\nEmployer: " + this.getEmployer() + "\nLocation: " + this.getLocation() + "\nPosition Type: " + this.getPositionType() + "\nCore Competency: " + this.getCoreCompetency() + '\n');
        }else{
            return('\n' + "ID: " + this.getId() + "\nName: " + this.getName() + "\nEmployer: " + this.getEmployer() + "\nLocation: " + this.getLocation() + "\nPosition Type: " + this.getPositionType() + "\nCore Competency: " + this.getCoreCompetency() + '\n');

        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public static String getJobString(Job job){
        if(job.getName().equals("") && job.getEmployer().toString().equals("") && job.getLocation().toString().equals("") && job.getPositionType().toString().equals("") && job.getCoreCompetency().toString().equals("")){
            return "OOPS! This job does not seem to exist.";
        }
        if(job.getName().equals("")){
            job.setName("Data not available");
//            return('\n' + "ID: " + job.getId() + "\nName: " + job.getName()  + "\nEmployer: " + job.getEmployer() + "\nLocation: " + job.getLocation() + "\nPosition Type: " + job.getPositionType() + "\nCore Competency: " + job.getCoreCompetency() + '\n');
        }
        if(job.getEmployer().toString().equals("")){
            job.setEmployer(new Employer("Data not available"));
//            return('\n' + "ID: " + job.getId() + "\nName: " + job.getName() + "\nEmployer: " + job.getEmployer() + "\nLocation: " + job.getLocation() + "\nPosition Type: " + job.getPositionType() + "\nCore Competency: " + job.getCoreCompetency() + '\n');
        }
        if(job.getLocation().toString().equals("")){
            job.setLocation(new Location("Data not available"));
//            return('\n' + "ID: " + job.getId() + "\nName: " + job.getName() + "\nEmployer: " + job.getEmployer() + "\nLocation: " + job.getLocation() + "\nPosition Type: " + job.getPositionType() + "\nCore Competency: " + job.getCoreCompetency() + '\n');
        }
        if(job.getPositionType().toString().equals("")){
            job.setPositionType(new PositionType("Data not available"));
//            return('\n' + "ID: " + job.getId() + "\nName: " + job.getName() + "\nEmployer: " + job.getEmployer() + "\nLocation: " + job.getLocation() + "\nPosition Type: " + job.getPositionType() + "\nCore Competency: " + job.getCoreCompetency() + '\n');
        }
        if(job.getCoreCompetency().toString().equals("")){
            job.setCoreCompetency(new CoreCompetency("Data not available"));
            return('\n' + "ID: " + job.getId() + "\nName: " + job.getName() + "\nEmployer: " + job.getEmployer() + "\nLocation: " + job.getLocation() + "\nPosition Type: " + job.getPositionType() + "\nCore Competency: " + job.getCoreCompetency() + '\n');
        }else{
            return('\n' + "ID: " + job.getId() + "\nName: " + job.getName() + "\nEmployer: " + job.getEmployer() + "\nLocation: " + job.getLocation() + "\nPosition Type: " + job.getPositionType() + "\nCore Competency: " + job.getCoreCompetency() + '\n');
        }
    }
}
