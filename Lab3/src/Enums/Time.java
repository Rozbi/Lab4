package Enums;

public enum Time {
    MORNING("morning"), DAYTIME("day"), EVENING("evening"), NIGHT("night");
    private String time;
    private Time(String Time){
        this.time = Time;
    }
    public String getTime() {
        return time;
    }
}
