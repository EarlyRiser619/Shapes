


public class Shape {

    private String name;
    private int numSides;
    private Double area;
    private int interiorAngle;
    private int eachAngle;

    public Shape (String aName, int aNumSides, Double anArea, int anInteriorAngle, int anEachAngle){
        this.name = aName;
        this.numSides = aNumSides;
        this.area = anArea;
        this.interiorAngle = anInteriorAngle;
        this.eachAngle = anEachAngle;
    }

    public Shape (String aname) {
        this.name = aname;
    }

    public Shape (int aNumSides) { this.numSides = aNumSides; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public int getInteriorAngle() {
        return interiorAngle;
    }

    public void setInteriorAngle(int interiorAngle) {
        this.interiorAngle = interiorAngle;
    }

    public int getEachAngle() {
        return eachAngle;
    }

    public void setEachAngle(int eachAngle) {
        this.eachAngle = eachAngle;
    }

    public String findNameFromSides() {
        String shapeName = "This shape is a(n)";
        int totSides = getNumSides();

        if (totSides == 3) {
            return (shapeName + " triangle!");
        } if (totSides == 4) {
            return (shapeName + " quadrilateral!");
        } if (totSides == 5) {
            return (shapeName + " pentagon!");
        } if (totSides == 6) {
            return (shapeName + " hexagon!");
        } else {
            return (shapeName + " polygon!");
        }

    }

    public int findSidesFromAngle() {
        int findSides;
        int totAngle = getInteriorAngle();

        if (totAngle == 180) {
            return findSides = 3;
        } if (totAngle == 360) {
            return findSides = 4;
        } if (totAngle == 540) {
            return findSides = 5;
        } else return findSides = 6;


    }

    //public int findNumSides(String aName) {
        //int numOfSides;
        //String shapeName = getName();

        //if (shapeName == "Triangle") {
            //return 3;
        //} else return 3333333;
    //}

    public String toString() {return "Shape: " + name + " Sides: " + numSides; }
}
