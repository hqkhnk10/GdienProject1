package Tuan33;

public class ThiSinh {
    protected int id;
    protected String name;
    protected String address;
    protected int priority;
    private static int count;

    public ThiSinh() {
        count++;
        id = count;
    }

    public ThiSinh(int id, String name, String address, int priority) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}